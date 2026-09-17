package defpackage;

import android.content.Intent;
import j$.util.Collection;

/* JADX INFO: loaded from: classes.dex */
final class cfd implements phh {
    final /* synthetic */ pht a;
    final /* synthetic */ cfe b;
    final /* synthetic */ int c;

    public cfd(cfe cfeVar, int i, pht phtVar) {
        this.b = cfeVar;
        this.c = i;
        this.a = phtVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        synchronized (this.b.w) {
            this.b.e.f();
            this.b.q = null;
            if (!this.a.isCancelled()) {
                ((oug) ((oug) ((oug) cfe.a.b()).h(th)).G(304)).o("Failed to create capture session.");
                this.b.r.a(cjr.ERROR);
                cvf cvfVar = this.b.u;
                cvfVar.getClass();
                cvfVar.e = 3;
            }
            if (th instanceof dlu) {
                dlu dluVar = (dlu) th;
                long j = dluVar.c;
                long jP = this.b.A.p();
                if (!lju.e(dluVar.a) || j >= jP || !this.b.A.s() || this.b.b.a() == jrl.SLOW_MOTION) {
                    this.b.k.f(dluVar);
                } else {
                    cfe cfeVar = this.b;
                    cfeVar.l.h(cfeVar.d.d());
                    this.b.c.execute(new cfc(this, 0));
                }
            }
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        cfy cfyVar = (cfy) obj;
        synchronized (this.b.w) {
            this.b.e.f();
            int i = cfyVar.w;
            cfe cfeVar = this.b;
            if (i != cfeVar.v) {
                ((oug) ((oug) cfe.a.c()).G(307)).s("Capture session %d doesn't match expected session %d", cfyVar.w, this.b.v);
                return;
            }
            if (((lce) cfeVar.r.f).d != cjr.INITIATING) {
                ((oug) ((oug) cfe.a.c()).G(306)).y("Expecting %s but got %s", cjr.INITIATING, ((lce) this.b.r.f).d);
                return;
            }
            int i2 = 2;
            if (this.c == 7) {
                cfe cfeVar2 = this.b;
                cfeVar2.x.a(cfeVar2.d.d() == lwd.BACK ? lwd.FRONT : lwd.BACK, 2, 3);
            }
            cfe cfeVar3 = this.b;
            cfeVar3.q = cfyVar;
            cfy cfyVar2 = cfeVar3.q;
            if (cfyVar2 != null) {
                cfyVar2.g.addAll(cfeVar3.f);
            }
            cfe cfeVar4 = this.b;
            cfeVar4.q.C = cfeVar4.y;
            Collection.EL.stream(cfeVar4.f).forEach(cez.c);
            this.b.r.a(cjr.CAPTURE_SESSION_ACTIVE);
            this.b.j.i(ijt.CAPTURE_SESSION_STARTED);
            cfe cfeVar5 = this.b;
            cvf cvfVar = cfeVar5.u;
            cvfVar.getClass();
            cvfVar.e = 2;
            cvfVar.b(cfeVar5.j.c(ijt.CAPTURE_SESSION_STARTING, ijt.CAPTURE_SESSION_STARTED));
            cfe cfeVar6 = this.b;
            cfeVar6.s = bqe.w(cfeVar6.z);
            cfe cfeVar7 = this.b;
            if ((cfeVar7.t || cfeVar7.s) && !((Boolean) ((lce) cfeVar7.r.h).d).booleanValue()) {
                Intent intentA = this.b.z.a();
                if (intentA != null) {
                    bqe.f(intentA);
                }
                this.b.c.execute(new cfc(this, i2));
            }
        }
    }
}
