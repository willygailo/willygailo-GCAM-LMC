package defpackage;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: loaded from: classes2.dex */
public final class lux {
    private final CaptureFailure a;

    public lux(CaptureFailure captureFailure) {
        this.a = captureFailure;
    }

    public final int a() {
        return this.a.getReason();
    }

    public final long b() {
        return this.a.getFrameNumber();
    }

    public final boolean c() {
        return this.a.wasImageCaptured();
    }

    public final String toString() {
        return "frame number=" + b() + ", reason=" + a() + ", wasImageCaptured=" + c() + ", sequenceId=" + this.a.getSequenceId();
    }
}
