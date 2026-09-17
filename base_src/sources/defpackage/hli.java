package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes2.dex */
public interface hli extends AutoCloseable {
    hlr a();

    InterleavedImageU8 b(HardwareBuffer hardwareBuffer);

    void c(Bitmap bitmap, ShotMetadata shotMetadata);

    void d();

    boolean e(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, ShotMetadata shotMetadata);

    boolean f();

    void g(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, boolean z, String str, hlr hlrVar, iij iijVar, Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback);

    void h(InterleavedWriteViewU8 interleavedWriteViewU8, ShotMetadata shotMetadata, boolean z, String str, hlr hlrVar, iij iijVar, Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback);
}
