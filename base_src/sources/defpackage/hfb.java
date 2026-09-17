package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class hfb implements gig {
    private final CaptureResult.Key a;
    private final long b;

    public hfb(CaptureResult.Key key, long j) {
        this.a = key;
        this.b = j;
    }

    @Override // defpackage.gig
    public final boolean a(lzv lzvVar) {
        Long l;
        return (lzvVar == null || (l = (Long) lzvVar.d(this.a)) == null || l.longValue() <= this.b) ? false : true;
    }
}
