package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dch implements lyy, iat, ian {
    public final ojc a;
    public final gvb b;
    public final dcj c;
    public final dcl d;
    private final ScheduledExecutorService k;
    private final lda l;
    public ojc e = oih.a;
    public ojc f = oih.a;
    private ojc m = oih.a;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public dch(ojc ojcVar, dcj dcjVar, gvb gvbVar, lda ldaVar, ScheduledExecutorService scheduledExecutorService, fjs fjsVar) {
        this.a = ojcVar;
        this.k = scheduledExecutorService;
        this.b = gvbVar;
        this.c = dcjVar;
        this.l = ldaVar;
        this.d = new dcn(4, fjsVar);
    }

    public static final boolean i(float f, float f2) {
        return Math.toDegrees((double) Math.abs(f)) < 0.5d && Math.toDegrees((double) Math.abs(f2)) < 0.5d;
    }

    @Override // defpackage.iat
    public final void a() {
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
    }

    public final void c() {
        if (this.g) {
            dah dahVar = (dah) this.f.c();
            if (dahVar.d.g()) {
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                if (cameraCoachHudView.c.g()) {
                    cameraCoachHudView.post(new dai(cameraCoachHudView, 5));
                }
            }
            ((elw) this.e.c()).m(elx.SECOND_RUN_TOAST);
            this.g = false;
            this.h = false;
            this.i = false;
            this.d.g();
        }
    }

    @Override // defpackage.ian
    public final void d() {
        if (this.g) {
            if (this.h) {
                this.d.c(pbq.HEEDED);
            } else {
                this.d.c(pbq.NOT_HEEDED);
            }
        }
    }

    public final synchronized void e() {
        if (this.m.g()) {
            ((lap) this.m.c()).close();
        }
        lap lapVar = new lap();
        int i = 0;
        if (this.f.g()) {
            lapVar.c(dah.d(new dcg(this, i), this.k));
        }
        lapVar.c(this.l.a(new lij() { // from class: dcf
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.c();
            }
        }, this.k));
        this.b.g(this);
        lapVar.c(new lie() { // from class: dcd
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                dch dchVar = this.a;
                dchVar.b.h(dchVar);
            }
        });
        this.d.a();
        lapVar.c(new dce(this.d, 0));
        this.m = ojc.i(lapVar);
        this.c.b();
    }

    public final void f(boolean z) {
        this.j = z;
        if (z) {
            return;
        }
        c();
    }

    public final synchronized void g() {
        c();
        if (this.m.g()) {
            ((lap) this.m.c()).close();
            this.m = oih.a;
        }
        this.c.b();
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        this.k.execute(new dcg(this, 1));
    }

    @Override // defpackage.iat
    public final void u() {
        f(false);
        this.k.execute(new dcg(this, 2));
    }

    @Override // defpackage.iat
    public final void v() {
        f(true);
        this.k.execute(new dcg(this, 3));
    }
}
