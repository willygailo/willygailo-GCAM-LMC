package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class cpv implements phh {
    final /* synthetic */ lwd a;
    final /* synthetic */ hsq b;
    final /* synthetic */ cpw c;

    public cpv(cpw cpwVar, lwd lwdVar, hsq hsqVar) {
        this.c = cpwVar;
        this.a = lwdVar;
        this.b = hsqVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.c.c(this.b, th);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        mad madVar = (mad) obj;
        try {
            cpw cpwVar = this.c;
            pih pihVar = cpwVar.g;
            cqc cqcVar = cpwVar.c;
            lic licVar = (lic) ((lce) cpwVar.a.n).d;
            lwd lwdVar = this.a;
            try {
                ByteBuffer buffer = ((mac) madVar.g().get(0)).getBuffer();
                byte[] bArr = new byte[buffer.capacity()];
                buffer.get(bArr);
                madVar.close();
                cku ckuVarA = cqcVar.a(bArr, licVar, lwdVar);
                ckuVarA.c(this.c.e);
                ckuVarA.b(System.currentTimeMillis() - this.c.f);
                ckuVarA.j = this.b;
                pihVar.o(ckuVarA.a());
            } catch (Throwable th) {
                madVar.close();
                throw th;
            }
        } catch (Exception e) {
            this.c.c(this.b, e);
        }
    }
}
