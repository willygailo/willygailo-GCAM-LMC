package defpackage;

import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: loaded from: classes.dex */
public final class bsx {
    public final DirtyLensHistory a = new DirtyLensHistory();

    public final bsy a() {
        DirtyLensHistory dirtyLensHistory = this.a;
        long jDirtyLensHistory_raw_score_history__get = GcamModuleJNI.DirtyLensHistory_raw_score_history__get(dirtyLensHistory.a, dirtyLensHistory);
        return new bsy(jDirtyLensHistory_raw_score_history__get == 0 ? null : new FloatDeque(jDirtyLensHistory_raw_score_history__get, false));
    }
}
