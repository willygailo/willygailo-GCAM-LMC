package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dbl implements lyy, iat, ian {
    public static final ouj a = ouj.h("com/google/android/apps/camera/coach/PitchRollIndicator");
    public static final long b;
    public final ojc c;
    public final dcl d;
    public final dbo e;
    public final gvb f;
    public ojc g;
    public ojc h;
    public long m;
    private final ScheduledExecutorService o;
    private final lda p;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public ojc l = oih.a;
    private ojc q = oih.a;
    public boolean n = false;

    static {
        double millis = TimeUnit.SECONDS.toMillis(1L);
        Double.isNaN(millis);
        b = (long) (millis / 30.0d);
    }

    public dbl(ojc ojcVar, dbo dboVar, gvb gvbVar, lda ldaVar, ScheduledExecutorService scheduledExecutorService, fjs fjsVar) {
        this.o = scheduledExecutorService;
        this.c = ojcVar;
        this.e = dboVar;
        this.p = ldaVar;
        this.f = gvbVar;
        this.d = new dcn(3, fjsVar);
    }

    @Override // defpackage.iat
    public final void a() {
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
    }

    public final synchronized void c() {
        this.j = false;
        this.k = false;
        if (this.i) {
            dah dahVar = (dah) ((ojj) this.g).a;
            if (dahVar.d.g()) {
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                if (cameraCoachHudView.b.g()) {
                    cameraCoachHudView.post(new dai(cameraCoachHudView, 4));
                }
            }
            ((elw) ((ojj) this.h).a).m(elx.SECOND_RUN_TOAST);
            this.i = false;
        }
    }

    @Override // defpackage.ian
    public final void d() {
        if (this.i) {
            if (this.k) {
                this.d.c(pbq.HEEDED);
            } else {
                this.d.c(pbq.NOT_HEEDED);
            }
        }
    }

    final synchronized void e() {
        obr.aQ(true);
        if (this.q.g()) {
            ((lap) this.q.c()).close();
        }
        lap lapVar = new lap();
        lapVar.c(dah.d(new dbk(this, 2), this.o));
        lapVar.c(this.p.a(new lij() { // from class: dbj
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.c();
            }
        }, this.o));
        this.f.g(this);
        lapVar.c(new lie() { // from class: dbi
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                dbl dblVar = this.a;
                dblVar.f.h(dblVar);
            }
        });
        this.d.a();
        this.q = ojc.i(lapVar);
        this.e.b();
    }

    public final void f(boolean z) {
        this.n = z;
        if (z) {
            return;
        }
        c();
    }

    public final synchronized void g() {
        c();
        if (this.q.g()) {
            ((lap) this.q.c()).close();
            this.q = oih.a;
        }
        this.d.b();
        this.e.b();
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        this.o.execute(new dbk(this, 1));
    }

    @Override // defpackage.iat
    public final void u() {
        f(false);
        this.o.execute(new dbk(this, 0));
    }

    @Override // defpackage.iat
    public final void v() {
        f(true);
        this.o.execute(new dbk(this, 3));
    }
}
