package defpackage;

import android.os.CountDownTimer;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class exw extends gfx {
    final /* synthetic */ eyg a;

    public exw(eyg eygVar) {
        this.a = eygVar;
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void A() {
        this.a.F.a();
        this.a.v(false);
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void D(float f) {
        if (f == 0.0f) {
            this.a.B(false);
            this.a.v.Q();
        }
        this.a.O.b(f);
        this.a.v.D((int) (100.0f * f));
        this.a.h.b();
        if (f == 1.0f) {
            this.a.E(false);
            this.a.v.m();
            CountDownTimer countDownTimer = this.a.M;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
            }
        }
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void E(float f, int i) {
        if (f == 0.0f) {
            this.a.B(true);
            this.a.O.c();
        }
        fwl fwlVar = this.a.o;
        int i2 = (int) (100.0f * f);
        jom jomVar = fwlVar.b;
        jomVar.i = i;
        jomVar.b(i2);
        if (i2 >= 100) {
            fwlVar.a.c = true;
        } else {
            fwlVar.a.c = false;
        }
        this.a.v.D(i2);
        this.a.h.b();
        if (f == 1.0f) {
            this.a.O.a();
            this.a.E(true);
        }
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void F(float f, long j) {
        boolean zN = this.a.z.n();
        if (f == 0.0f) {
            this.a.B(zN);
            if (zN) {
                dah dahVar = this.a.F;
                dahVar.c = false;
                if (dahVar.d.g()) {
                    CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                    if (cameraCoachHudView.b.g()) {
                        cameraCoachHudView.post(new dai(cameraCoachHudView, 1));
                    }
                    if (cameraCoachHudView.c.g()) {
                        cameraCoachHudView.post(new dai(cameraCoachHudView, 0));
                    }
                    if (cameraCoachHudView.d.g()) {
                        cameraCoachHudView.post(new dai(cameraCoachHudView, 2));
                    }
                }
                this.a.O.c();
                j += 500;
                this.a.M = new exv(this, j, TimeUnit.SECONDS.toMillis(1L), f);
                this.a.M.start();
            } else {
                this.a.v.Q();
                if (f == 0.0f) {
                    this.a.D.f(new daz() { // from class: exu
                        @Override // defpackage.daz
                        public final void a() {
                            this.a.a.O.b(0.0f);
                        }
                    });
                }
            }
        }
        if (zN) {
            this.a.o.f((int) (f * 100.0f));
        } else if (this.a.D.k()) {
            this.a.O.b(f);
        }
        this.a.v.E((int) (100.0f * f), j, zN);
        this.a.h.b();
        if (f == 1.0f) {
            this.a.E(zN);
            if (zN) {
                this.a.F.a();
                this.a.O.a();
            } else {
                this.a.P.a(j);
                this.a.v.m();
                this.a.D.e();
            }
            CountDownTimer countDownTimer = this.a.M;
            if (countDownTimer != null) {
                countDownTimer.onFinish();
            }
        }
    }
}
