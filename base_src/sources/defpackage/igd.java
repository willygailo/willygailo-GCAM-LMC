package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class igd implements iha {
    final /* synthetic */ ige a;

    public igd(ige igeVar) {
        this.a = igeVar;
    }

    @Override // defpackage.iha
    public final void a(byte[] bArr) {
        int length;
        ige igeVar = this.a;
        if (igeVar.e == null || (length = bArr.length) == 0) {
            return;
        }
        final lgp lgpVar = new lgp(mro.a(ByteBuffer.wrap(bArr), length, igeVar.a.a(length)));
        final ciy ciyVar = igeVar.e;
        final cja cjaVar = ciyVar.a;
        if (lgpVar.a() != 0) {
            if (cjaVar.c.isShutdown()) {
                ((oug) ((oug) cja.a.c()).G((char) 437)).o("Output executor is shutdown.");
            }
            cja.d(new Runnable() { // from class: ciw
                @Override // java.lang.Runnable
                public final void run() {
                    cja cjaVar2 = cjaVar;
                    lgp lgpVar2 = lgpVar;
                    synchronized (cjaVar2.d) {
                        try {
                            cir cirVar = cjaVar2.g;
                            if (!lgpVar2.c().hasArray()) {
                                throw new UnsupportedOperationException("Provided bytebuffer unsupported.");
                            }
                            try {
                                ciq ciqVar = cirVar.c;
                                if (ciqVar.a == null) {
                                    throw new IOException("Pipe not connected");
                                }
                                if (!lgpVar2.c().hasArray()) {
                                    throw new UnsupportedOperationException("Provided byte buffer unsupported.");
                                }
                                ciqVar.a.b(lgpVar2);
                                cirVar.a();
                            } catch (IOException e) {
                                throw new IOException("Failed to write audio packet into audio piped output stream.", e);
                            }
                        } catch (IOException e2) {
                            ((oug) ((oug) ((oug) cja.a.b()).h(e2)).G(436)).o("Failed to write to piped audio buffer.");
                        }
                    }
                }
            }, cjaVar.c);
        }
        cja cjaVar2 = ciyVar.a;
        cja.d(new Runnable() { // from class: cix
            @Override // java.lang.Runnable
            public final void run() {
                ciyVar.a.b(lgpVar.a());
            }
        }, ciyVar.a.b);
    }

    @Override // defpackage.iha
    public final void b() {
        ciy ciyVar = this.a.e;
        if (ciyVar != null) {
            ouj oujVar = cja.a;
            ciyVar.a.e.o(true);
        }
    }

    @Override // defpackage.iha
    public final /* synthetic */ void c(int i) {
    }
}
