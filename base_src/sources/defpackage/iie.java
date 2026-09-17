package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: loaded from: classes2.dex */
public final class iie implements pys {
    private final iid a;

    public iie(iid iidVar) {
        this.a = iidVar;
    }

    @Override // defpackage.qkg
    public final /* bridge */ /* synthetic */ Object get() {
        CameraActivityTiming cameraActivityTiming = this.a.a;
        qmd.ae(cameraActivityTiming);
        return cameraActivityTiming;
    }
}
