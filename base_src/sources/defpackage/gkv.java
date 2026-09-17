package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
final class gkv implements Runnable {
    final /* synthetic */ gkw a;
    private final hin b;
    private final pih c;

    public gkv(gkw gkwVar, hin hinVar, pih pihVar) {
        this.a = gkwVar;
        this.b = hinVar;
        this.c = pihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pih pihVar;
        RuntimeException runtimeException;
        try {
            try {
                gkw gkwVar = this.a;
                hin hinVar = this.b;
                gkwVar.e.e("allocateAndCompressJpeg");
                int iWidth = ((hinVar.e.width() * 3) * hinVar.e.height()) / 2;
                int i = iWidth / 2;
                hjg hjgVarC = gkwVar.b.c(Integer.valueOf(i));
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) hjgVarC.a();
                    if (byteBuffer == null) {
                        StringBuilder sb = new StringBuilder(53);
                        sb.append("Failed to allocate buffer for JPEG: ");
                        sb.append(i);
                        sb.append(" bytes");
                        throw new RuntimeException(sb.toString());
                    }
                    int iB = gkwVar.d.b(hinVar, byteBuffer.duplicate());
                    if (iB > i) {
                        hjgVarC.close();
                        hjgVarC = gkwVar.b.c(Integer.valueOf(iWidth));
                        try {
                            byteBuffer = (ByteBuffer) hjgVarC.a();
                            if (byteBuffer == null) {
                                StringBuilder sb2 = new StringBuilder(53);
                                sb2.append("Failed to allocate buffer for JPEG: ");
                                sb2.append(iWidth);
                                sb2.append(" bytes");
                                throw new RuntimeException(sb2.toString());
                            }
                            iB = gkwVar.d.b(hinVar, byteBuffer.duplicate());
                        } catch (Throwable th) {
                            th = th;
                            hjgVarC.close();
                            throw th;
                        }
                    }
                    if (iB <= 0) {
                        StringBuilder sb3 = new StringBuilder(57);
                        sb3.append("Error compressing jpeg: num bytes written was ");
                        sb3.append(iB);
                        throw new RuntimeException(sb3.toString());
                    }
                    byteBuffer.order(ByteOrder.nativeOrder());
                    byte[] bArr = new byte[iB];
                    byteBuffer.get(bArr);
                    gkwVar.e.f();
                    hjgVarC.close();
                    lmi lmiVarB = lmi.b();
                    pht phtVar = this.b.c;
                    phtVar.getClass();
                    lzv lzvVar = (lzv) phtVar.get();
                    lig ligVarG = lig.g(this.b.e);
                    lic licVarA = this.a.d.a(this.b);
                    lmiVarB.f(ligVarG.a, ligVarG.b, licVarA, ojc.i(lzvVar));
                    lmiVarB.g(this.b.k);
                    this.c.o(gjx.a(this.b.a.d(), bArr, ligVarG, licVarA.e, lmiVarB.a, this.a.c));
                    if (this.c.isDone() || this.c.isCancelled()) {
                        return;
                    }
                    pihVar = this.c;
                    runtimeException = new RuntimeException("Unknown error while encoding imageToProcess");
                    pihVar.a(runtimeException);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                this.c.a(e);
                if (this.c.isDone() || this.c.isCancelled()) {
                    return;
                }
                pihVar = this.c;
                runtimeException = new RuntimeException("Unknown error while encoding imageToProcess");
            }
        } catch (Throwable th3) {
            if (!this.c.isDone() && !this.c.isCancelled()) {
                this.c.a(new RuntimeException("Unknown error while encoding imageToProcess"));
            }
            throw th3;
        }
    }
}
