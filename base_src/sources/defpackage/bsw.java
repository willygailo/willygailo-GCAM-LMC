package defpackage;

import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: loaded from: classes.dex */
public final class bsw implements pys {
    private final qkg a;

    public bsw(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsx get() {
        bsx bsxVar = new bsx();
        DirtyLensHistory dirtyLensHistory = bsxVar.a;
        GcamModuleJNI.DirtyLensHistory_max_photo_count__set(dirtyLensHistory.a, dirtyLensHistory, 32);
        DirtyLensHistory dirtyLensHistory2 = bsxVar.a;
        GcamModuleJNI.DirtyLensHistory_weighted_score_threshold__set(dirtyLensHistory2.a, dirtyLensHistory2, 0.5f);
        DirtyLensHistory dirtyLensHistory3 = bsxVar.a;
        GcamModuleJNI.DirtyLensHistory_initial_score__set(dirtyLensHistory3.a, dirtyLensHistory3, -17.0f);
        DirtyLensHistory dirtyLensHistory4 = bsxVar.a;
        GcamModuleJNI.DirtyLensHistory_frame_influence_decay_rate__set(dirtyLensHistory4.a, dirtyLensHistory4, 0.29f);
        return bsxVar;
    }
}
