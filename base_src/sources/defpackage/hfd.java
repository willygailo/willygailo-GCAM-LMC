package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class hfd implements gig {
    private final CaptureResult.Key a;

    public hfd(CaptureResult.Key key) {
        this.a = key;
    }

    @Override // defpackage.gig
    public final boolean a(lzv lzvVar) {
        return (lzvVar == null || lzvVar.d(this.a) == null) ? false : true;
    }
}
