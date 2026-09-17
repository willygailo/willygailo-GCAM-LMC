package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: loaded from: classes.dex */
final class euk implements jkb {
    final /* synthetic */ eur a;

    public euk(eur eurVar) {
        this.a = eurVar;
    }

    @Override // defpackage.jkb
    public final void a() {
        this.a.f.j(ijf.ACTIVITY_SHUTTER_BUTTON_DRAWN, CameraActivityTiming.a);
    }

    @Override // defpackage.jkb
    public final void b() {
        eur eurVar = this.a;
        CameraActivityTiming cameraActivityTiming = eurVar.f;
        if (!cameraActivityTiming.l(ijf.ACTIVITY_SHUTTER_BUTTON_DRAWN) || cameraActivityTiming.l(ijf.ACTIVITY_SHUTTER_BUTTON_ENABLED)) {
            return;
        }
        cameraActivityTiming.j(ijf.ACTIVITY_SHUTTER_BUTTON_ENABLED, CameraActivityTiming.a);
        cameraActivityTiming.h.a();
        cameraActivityTiming.h = lji.b;
        eurVar.R.o(bxt.a);
    }
}
