package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bth implements iho {
    private static final ouj a = ouj.h("com/google/android/apps/camera/app/CacheCameraInfoBehavior");
    private final ljf b;
    private final dkm c;
    private final ddf d;
    private final lwf e;

    public bth(lwf lwfVar, ljf ljfVar, dkm dkmVar, ddf ddfVar) {
        this.e = lwfVar;
        this.b = ljfVar;
        this.c = dkmVar;
        this.d = ddfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e("#cacheDeviceInfo");
        lvs lvsVarB = this.c.b(this.e, this.d, lwd.BACK);
        if (lvsVarB != null) {
            ghx ghxVarF = this.e.f(lvsVarB);
            ghxVarF.y();
            Iterator it = ghxVarF.B().iterator();
            while (it.hasNext()) {
                this.e.f((lvs) it.next()).y();
            }
            ghxVarF.z();
            ghxVarF.A();
        } else {
            ((oug) ((oug) a.c()).G('L')).o("No back-facing camera found.");
        }
        this.b.f();
    }
}
