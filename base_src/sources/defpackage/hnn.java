package defpackage;

import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class hnn implements hnm {
    private final /* synthetic */ int a;

    public hnn(int i) {
        this.a = i;
    }

    @Override // defpackage.hnm
    public final lic a(hin hinVar) {
        switch (this.a) {
            case 0:
                return hinVar.b;
            default:
                return lic.CLOCKWISE_0;
        }
    }

    @Override // defpackage.hnm
    public final int b(hin hinVar, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                return JpegUtilNative.a(hinVar.a, byteBuffer.duplicate(), hinVar.e, lic.CLOCKWISE_0);
            default:
                return JpegUtilNative.a(hinVar.a, byteBuffer.duplicate(), hinVar.e, hinVar.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "exifRotatingCompressor";
            default:
                return "byteRotatingCompressor";
        }
    }
}
