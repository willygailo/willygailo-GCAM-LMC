package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class daj implements Runnable {
    public final /* synthetic */ CameraCoachHudView a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    private final /* synthetic */ int d;

    public /* synthetic */ daj(CameraCoachHudView cameraCoachHudView, float f, float f2, int i) {
        this.d = i;
        this.a = cameraCoachHudView;
        this.b = f;
        this.c = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                CameraCoachHudView cameraCoachHudView = this.a;
                float f = this.b;
                float f2 = this.c;
                if (cameraCoachHudView.b.g()) {
                    dbq dbqVar = (dbq) cameraCoachHudView.b.c();
                    dbqVar.l = true;
                    dbqVar.o = new fqk(f, f2, SystemClock.uptimeMillis());
                    fqk fqkVar = dbqVar.p;
                    if (fqkVar == null) {
                        dbqVar.j.invalidate();
                    } else if (bkh.d(f, fqkVar.c) || bkh.d(f2, fqkVar.b)) {
                        dbqVar.j.invalidate();
                    }
                }
                break;
            case 1:
                CameraCoachHudView cameraCoachHudView2 = this.a;
                float f3 = this.b;
                float f4 = this.c;
                if (cameraCoachHudView2.d.g()) {
                    dbc dbcVar = (dbc) cameraCoachHudView2.d.c();
                    dbcVar.h = true;
                    dbcVar.i = f4;
                    dbcVar.j = f3;
                    if (bkh.d(dbcVar.k, f4) || bkh.d(dbcVar.l, f3)) {
                        dbcVar.d.invalidate();
                        dbcVar.l = f3;
                        dbcVar.k = f4;
                    }
                }
                break;
            default:
                CameraCoachHudView cameraCoachHudView3 = this.a;
                float f5 = this.b;
                float f6 = this.c;
                if (cameraCoachHudView3.c.g()) {
                    dck dckVar = (dck) cameraCoachHudView3.c.c();
                    dckVar.h = true;
                    dckVar.i = f6;
                    dckVar.j = f5;
                    if (bkh.d(dckVar.k, f6) || bkh.d(dckVar.l, f5)) {
                        dckVar.a.invalidate();
                        dckVar.l = f5;
                        dckVar.k = f6;
                    }
                }
                break;
        }
    }
}
