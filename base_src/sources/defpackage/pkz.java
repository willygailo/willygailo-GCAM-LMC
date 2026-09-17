package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.hdrplus.ManagedImageCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class pkz {
    public final HdrPlusInterface a;

    public pkz(HdrPlusInterface hdrPlusInterface) {
        this.a = hdrPlusInterface;
    }

    public static ManagedImageCallback a(final pky pkyVar) {
        return new ManagedImageCallback() { // from class: pkw
            @Override // com.google.googlex.gcam.hdrplus.ManagedImageCallback
            public final void accept(int i, long j, long j2, int i2) {
                pkyVar.a(i, j, new ShotMetadata(j2), i2);
            }
        };
    }
}
