package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class ipe implements phh {
    final /* synthetic */ ipf a;
    private final /* synthetic */ int b;

    public ipe(ipf ipfVar, int i) {
        this.b = i;
        this.a = ipfVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((oug) ((oug) ipf.a.b()).G((char) 3076)).r("CamcorderSnapshot is not available: %s", th);
                this.a.E.d();
                ipf ipfVar = this.a;
                ipfVar.I.a(th, ipfVar.g.d());
                break;
            default:
                this.a.F.f();
                break;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                ckv ckvVar = (ckv) obj;
                File file = ckvVar.b;
                this.a.f.b(ckvVar);
                this.a.E.d();
                ipf ipfVar = this.a;
                ipfVar.I.b(ckvVar, ipfVar.g.d());
                break;
            default:
                lnx lnxVar = this.a.B.T;
                lnxVar.getClass();
                lnxVar.d(((jnj) obj).a);
                this.a.F.f();
                break;
        }
    }
}
