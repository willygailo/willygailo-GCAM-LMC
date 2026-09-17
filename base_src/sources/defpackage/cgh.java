package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class cgh implements phh {
    final /* synthetic */ lfj a;
    final /* synthetic */ cgl b;

    public cgh(cgl cglVar, lfj lfjVar) {
        this.b = cglVar;
        this.a = lfjVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        synchronized (this.b.f) {
            if (this.b.K == 6) {
                return;
            }
            cgl cglVar = this.b;
            cglVar.e();
            cglVar.E = cglVar.A.scheduleAtFixedRate(new cge(cglVar, 0), dhy.a.getSeconds(), dhy.a.getSeconds(), TimeUnit.SECONDS);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.b.q);
            cgl cglVar2 = this.b;
            if (cglVar2.l.B) {
                if (cglVar2.j.k(dcu.P)) {
                    arrayList.add(new cmk(this.a));
                }
                if (this.b.l.d == ldz.FPS_AUTO) {
                    lfj lfjVar = this.a;
                    lfjVar.getClass();
                    arrayList.add(new cmi(lfjVar));
                    if (this.b.u.g()) {
                        arrayList.add((mip) this.b.u.c());
                    }
                }
                if (this.b.l.z == hsr.CINEMATIC) {
                    this.a.o(dxh.CINEMATIC.c());
                }
            }
            this.b.o.f(arrayList);
        }
    }
}
