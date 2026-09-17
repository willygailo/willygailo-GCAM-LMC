package defpackage;

import android.content.Intent;
import com.google.android.apps.camera.sideline.SidelineInstallerService;

/* JADX INFO: loaded from: classes2.dex */
final class hwf implements phh {
    final /* synthetic */ hwh a;
    private final /* synthetic */ int b;

    public hwf(hwh hwhVar, int i) {
        this.b = i;
        this.a = hwhVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ouj oujVar = hwh.a;
                this.a.k.a(4);
                this.a.m.b(-1, 9);
                break;
            default:
                ((oug) ((oug) ((oug) hwh.a.b()).h(th)).G((char) 2668)).o("shouldStartUpdate threw an exception!");
                this.a.k.a(4);
                this.a.c();
                break;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ((oug) ((oug) hwh.a.c()).G(2670)).q("Not all cameras are available after waiting for %dms. Scheduling update later.", 60000L);
                    this.a.k.a(4);
                    this.a.m.b(0, 9);
                    this.a.b();
                } else {
                    ouj oujVar = hwh.a;
                    Intent intent = new Intent(this.a.b, (Class<?>) SidelineInstallerService.class);
                    intent.setAction("com.google.android.apps.camera.sideline.START_UPDATE");
                    this.a.b.startForegroundService(intent);
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    this.a.k.a(4);
                    this.a.c();
                } else {
                    hwh hwhVar = this.a;
                    plk.af(((hvy) hwhVar.p.get()).a(), new hwf(hwhVar, 0), hwhVar.h);
                }
                break;
        }
    }
}
