package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: loaded from: classes.dex */
public final class brb implements bvv {
    public final CameraActivityTiming a;
    private final bqs b;

    public brb(bqs bqsVar, CameraActivityTiming cameraActivityTiming) {
        this.b = bqsVar;
        this.a = cameraActivityTiming;
    }

    @Override // defpackage.bvv
    public final /* synthetic */ String c() {
        return aas.g(this);
    }

    @Override // defpackage.bvv
    public final pht fz() {
        this.a.j(ijf.PERMISSIONS_STARTUP_TASK_START, CameraActivityTiming.b);
        return pgb.h(this.b.a(), new oiu() { // from class: bra
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                Boolean bool = (Boolean) obj;
                this.a.a.j(ijf.PERMISSIONS_STARTUP_TASK_END, CameraActivityTiming.b);
                return bool;
            }
        }, pgr.INSTANCE);
    }
}
