package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class ecd implements lij {
    public volatile lzv a;
    private final gig b;

    public ecd(gig gigVar) {
        this.b = gigVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        lzv lzvVar = (lzv) obj;
        if (lzvVar.d(CaptureResult.COLOR_CORRECTION_GAINS) == null || lzvVar.d(CaptureResult.COLOR_CORRECTION_TRANSFORM) == null || lzvVar.d(CaptureResult.CONTROL_AE_REGIONS) == null || !this.b.a(lzvVar)) {
            return;
        }
        this.a = lzvVar;
    }
}
