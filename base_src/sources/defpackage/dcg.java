package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dcg implements Runnable {
    public final /* synthetic */ dch a;
    private final /* synthetic */ int b;

    public /* synthetic */ dcg(dch dchVar, int i) {
        this.b = i;
        this.a = dchVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                dch dchVar = this.a;
                if (!((dqx) ((ojj) dchVar.a).a).e()) {
                    Pair pairC = bkh.c(new fto(((dqx) ((ojj) dchVar.a).a).d().a));
                    float fFloatValue = ((Float) pairC.first).floatValue();
                    float fFloatValue2 = ((Float) pairC.second).floatValue();
                    if (dchVar.e.g() && dchVar.f.g() && dchVar.j) {
                        dchVar.c.a(fFloatValue, fFloatValue2, SystemClock.uptimeMillis());
                        dchVar.d.f();
                        dcj dcjVar = dchVar.c;
                        if (dcjVar.f.g() && ((dcr) dcjVar.f.c()).c()) {
                            dah dahVar = (dah) dchVar.f.c();
                            if (dahVar.b && dahVar.c && dahVar.d.g()) {
                                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dahVar.d.c();
                                cameraCoachHudView.post(new daj(cameraCoachHudView, fFloatValue, fFloatValue2, 2));
                            }
                            if (!dchVar.g) {
                                ((dah) dchVar.f.c()).c();
                                ((elw) dchVar.e.c()).j(elx.SECOND_RUN_TOAST);
                                dchVar.g = true;
                                dchVar.d.e(oih.a);
                            }
                        } else {
                            dchVar.c();
                        }
                        if (dchVar.g) {
                            if (!dch.i(fFloatValue, fFloatValue2)) {
                                dchVar.i = false;
                            } else if (!dchVar.i) {
                                dchVar.d.d();
                                dchVar.i = true;
                            }
                        }
                    }
                    dchVar.h = dch.i(((Float) pairC.first).floatValue(), ((Float) pairC.second).floatValue());
                    break;
                }
                break;
            case 1:
                dch dchVar2 = this.a;
                dchVar2.c.b();
                dchVar2.c();
                break;
            case 2:
                this.a.g();
                break;
            default:
                this.a.e();
                break;
        }
    }
}
