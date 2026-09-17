package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dai implements Runnable {
    public final /* synthetic */ CameraCoachHudView a;
    private final /* synthetic */ int b;

    public /* synthetic */ dai(CameraCoachHudView cameraCoachHudView, int i) {
        this.b = i;
        this.a = cameraCoachHudView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((dck) this.a.c.c()).b();
                break;
            case 1:
                ((dbq) this.a.b.c()).a();
                break;
            case 2:
                ((dbc) this.a.d.c()).a();
                break;
            case 3:
                ((dbc) this.a.d.c()).a();
                break;
            case 4:
                ((dbq) this.a.b.c()).a();
                break;
            default:
                ((dck) this.a.c.c()).b();
                break;
        }
    }
}
