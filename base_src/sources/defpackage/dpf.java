package defpackage;

import android.hardware.HardwareBuffer;

/* JADX INFO: loaded from: classes.dex */
final class dpf implements dpw {
    private final HardwareBuffer a;
    private final /* synthetic */ int b;

    public dpf(HardwareBuffer hardwareBuffer, int i) {
        this.b = i;
        this.a = hardwareBuffer;
    }

    public dpf(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, int i) {
        this.b = i;
        if (!hardwareBuffer.isClosed()) {
            hardwareBuffer.close();
        }
        this.a = hardwareBuffer2;
    }

    @Override // defpackage.dpw
    public final HardwareBuffer a() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.a;
    }

    @Override // defpackage.dpw
    public final boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.dpw
    public final void c() {
        int i = this.b;
    }
}
