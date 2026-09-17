package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dbk implements Runnable {
    public final /* synthetic */ dbl a;
    private final /* synthetic */ int b;

    public /* synthetic */ dbk(dbl dblVar, int i) {
        this.b = i;
        this.a = dblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                dbl dblVar = this.a;
                dblVar.g();
                dblVar.c();
                break;
            case 1:
                dbl dblVar2 = this.a;
                dblVar2.d.g();
                dblVar2.e.b();
                dblVar2.c();
                dblVar2.m = SystemClock.uptimeMillis() + 1000;
                break;
            case 2:
                dbl dblVar3 = this.a;
                if (((dqx) ((ojj) dblVar3.c).a).e()) {
                    ((oug) ((oug) dbl.a.c()).G((char) 675)).o("Can not update pitch roll indicator because camera orientation feature is empty.");
                    break;
                } else {
                    ftm ftmVarA = ftm.a(((dqx) ((ojj) dblVar3.c).a).d());
                    float radians = (float) Math.toRadians(ftmVarA.b);
                    float radians2 = (float) Math.toRadians(ftmVarA.c);
                    dblVar3.l = ojc.i(ftmVarA);
                    if (!dblVar3.n) {
                        ((oug) ((oug) dbl.a.c()).G(679)).A("Can not update PitchRollIndicator: cameraCoachHudController = %s, inAppNotificationController = %s, isHintEnabled = %s", true, true, Boolean.valueOf(dblVar3.n));
                        break;
                    } else {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        if (jUptimeMillis >= dblVar3.m) {
                            dblVar3.m = jUptimeMillis + dbl.b;
                            dblVar3.d.f();
                            dblVar3.e.a(radians, radians2, SystemClock.uptimeMillis());
                            if (!dblVar3.e.b.c()) {
                                dblVar3.d.g();
                                dblVar3.c();
                            } else {
                                dah dahVar = (dah) ((ojj) dblVar3.g).a;
                                if (dahVar.b && dahVar.c && dahVar.d.g()) {
                                    CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                                    cameraCoachHudView.post(new daj(cameraCoachHudView, radians2, radians, 0));
                                }
                                boolean z = Math.toDegrees((double) Math.abs(radians2)) < 1.0d || Math.toDegrees((double) Math.abs(radians)) < 1.0d;
                                dblVar3.k = z;
                                if (z && dblVar3.i) {
                                    if (!dblVar3.j) {
                                        dblVar3.d.d();
                                    }
                                    dblVar3.j = true;
                                } else {
                                    dblVar3.j = false;
                                }
                                if (!dblVar3.i) {
                                    ((dah) ((ojj) dblVar3.g).a).c();
                                    ((elw) ((ojj) dblVar3.h).a).j(elx.SECOND_RUN_TOAST);
                                    dblVar3.i = true;
                                    dblVar3.d.e(dblVar3.l);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                this.a.e();
                break;
        }
    }
}
