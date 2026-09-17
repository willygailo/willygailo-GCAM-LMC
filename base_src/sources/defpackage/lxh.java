package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;

/* JADX INFO: loaded from: classes2.dex */
public final class lxh {
    public final HardwareBuffer a;

    public lxh(HardwareBuffer hardwareBuffer) {
        this.a = hardwareBuffer;
    }

    public final void a() {
        this.a.close();
    }

    public final void b(byte[] bArr, int i, int i2, int i3) {
        ReadHardwareBufferJniFunctions.readHardwareBuffer(this.a, bArr, i, i2, i3);
    }
}
