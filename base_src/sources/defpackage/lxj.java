package defpackage;

import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class lxj implements mac {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ HardwarePixels c;

    public lxj(HardwarePixels hardwarePixels, int i, int i2) {
        this.c = hardwarePixels;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.mac
    public final ByteBuffer getBuffer() {
        obr.aR(!this.c.c.get(), "Accessing data after close!");
        HardwarePixels hardwarePixels = this.c;
        long j = hardwarePixels.b;
        int i = this.a;
        int i2 = this.b;
        boolean z = i == 0 || hardwarePixels.a.getFormat() == 35;
        obr.aR(z, "Internal error: Expect planes 1 and 2 to only appear in YUV420 formats");
        return HardwarePixels.nativeGetData(j, i, i2, i != 0 ? 2 : 1);
    }

    @Override // defpackage.mac
    public final int getPixelStride() {
        return HardwarePixels.nativePixelStride(this.c.b, this.a);
    }

    @Override // defpackage.mac
    public final int getRowStride() {
        return HardwarePixels.nativeRowStride(this.c.b, this.a);
    }
}
