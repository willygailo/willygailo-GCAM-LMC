package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gns extends mip {
    private final lij a;

    public gns(lij lijVar) {
        this.a = lijVar;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        this.a.fB(gnt.a((Float) lzvVar.d(CaptureResult.LENS_FOCUS_DISTANCE), (Pair) lzvVar.d(CaptureResult.LENS_FOCUS_RANGE)));
    }
}
