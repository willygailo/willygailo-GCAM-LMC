package defpackage;

import com.google.android.apps.camera.async.tt.CpuSets;
import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.android.apps.camera.jni.eis.EisNative;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import com.google.android.apps.camera.jni.faceobfuscation.GpuRedactorNative;
import com.google.android.apps.camera.jni.federatedphoto.ModeSuggestionClient;
import com.google.android.apps.camera.jni.gyro.GyroQueueNative;
import com.google.android.apps.camera.jni.lensoffset.LensOffsetQueueNative;
import com.google.android.apps.camera.jni.mallopt.Mallopt;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.android.apps.camera.processing.imagebackend.FaceUtilNative;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import com.google.android.libraries.camera.jni.surface.SurfaceNative;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger;

/* JADX INFO: loaded from: classes.dex */
public final class ent {
    public static final oom a = oom.r(BufferFlinger.class, dae.class, CpuSets.class, dkr.class, EisNative.class, FaceBeautificationNative.class, FaceUtilNative.class, FaceMetadataNative.class, FastMomentsHdrImpl.class, FrameUtilNative.class, enl.class, GpuRetoucherNative.class, GpuRedactorNative.class, GyroQueueNative.class, HardwareBuffers.class, ImgUtilNative.class, JpegUtilNative.class, LensOffsetQueueNative.class, Mallopt.class, MicrovideoToneMapNative.class, ModeSuggestionClient.class, ReadHardwareBufferJniFunctions.class, hls.class, RoiTrackerNative.class, SurfaceNative.class, YuvUtilNative.class);
}
