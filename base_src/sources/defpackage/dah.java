package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dah implements lyy {
    public final gvb a;
    public boolean b = false;
    public boolean c = true;
    public ojc d = oih.a;
    public final bqg e;

    public dah(gvb gvbVar, bqg bqgVar) {
        this.e = bqgVar;
        this.a = gvbVar;
    }

    static final lie d(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        return new chl(scheduledExecutorService.scheduleAtFixedRate(runnable, 0L, 33L, TimeUnit.MILLISECONDS), 2);
    }

    public final void a() {
        this.c = true;
    }

    public final void b(boolean z) {
        if (this.d.g()) {
            ((CameraCoachHudView) this.d.c()).e = z;
        }
    }

    public final void c() {
        this.b = true;
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        if (this.d.g()) {
            ((CameraCoachHudView) this.d.c()).a = licVar.e;
        }
    }
}
