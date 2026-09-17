package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
final class lva {
    public static final Object a = new Object();
    public final CaptureResult b;
    public final CaptureResult.Key c;
    public volatile Object d = a;

    public lva(CaptureResult captureResult, CaptureResult.Key key) {
        this.b = captureResult;
        this.c = key;
    }
}
