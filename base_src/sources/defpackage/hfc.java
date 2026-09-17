package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class hfc implements gig {
    private final CaptureResult.Key a;
    private final Object b;

    public hfc(CaptureResult.Key key, Object obj) {
        this.a = key;
        this.b = obj;
    }

    @Override // defpackage.gig
    public final boolean a(lzv lzvVar) {
        if (lzvVar == null) {
            return false;
        }
        return obr.bc(lzvVar.d(this.a), this.b);
    }
}
