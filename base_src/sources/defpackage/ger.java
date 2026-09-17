package defpackage;

import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;

/* JADX INFO: loaded from: classes.dex */
public final class ger {
    public final ShotMetadata a;
    public final int b;
    public final AeShotParams c;
    private final SpatialGainMap d;

    public ger(ShotMetadata shotMetadata, int i, AeShotParams aeShotParams, SpatialGainMap spatialGainMap) {
        this.a = shotMetadata;
        this.b = i;
        this.c = aeShotParams;
        this.d = spatialGainMap;
    }
}
