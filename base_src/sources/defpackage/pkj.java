package defpackage;

import com.google.googlex.gcam.creativecamera.skysegmentation.SkySegmenterManager;

/* JADX INFO: loaded from: classes2.dex */
public final class pkj implements lie {
    private long a;

    public pkj(String str) {
        this.a = SkySegmenterManager.getReservation(str);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            SkySegmenterManager.releaseReservation(j);
            this.a = 0L;
        }
    }
}
