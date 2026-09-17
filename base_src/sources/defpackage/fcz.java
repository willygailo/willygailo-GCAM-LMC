package defpackage;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle$LightCycleProgressCallback;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fcz {
    public static final Object a = new Object();
    public static Boolean b = false;
    public static final Map c = new HashMap();
    public static final LightCycle$LightCycleProgressCallback d = new LightCycle$LightCycleProgressCallback(null);

    public static float a(String str) {
        return LightCycleNative.CalibrateFieldOfViewDeg(str);
    }

    public static int b() {
        return LightCycleNative.CreateNewStitchingSession();
    }

    public static int c() {
        int iDeviceOrientationStatus;
        synchronized (a) {
            if (!b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            iDeviceOrientationStatus = LightCycleNative.DeviceOrientationStatus();
        }
        return iDeviceOrientationStatus;
    }

    public static int d() {
        return LightCycleNative.GetNumCapturedTargets();
    }

    public static int e() {
        return LightCycleNative.GetNumTotalTargets();
    }

    public static int f() {
        return LightCycleNative.GetTargetInRange();
    }

    public static void g() {
        LightCycleNative.AlignNextImage();
    }

    public static void h(int i) {
        LightCycleNative.CreateFrameTexture(i);
    }

    public static void i(int i, int i2, int i3) {
        LightCycleNative.InitFrameTexture(i, i2, i3);
    }

    public static void j(String str, float f) {
        synchronized (a) {
            LightCycleNative.ResetForPhotoSphereCapture(str, f);
            b = true;
        }
    }

    public static void k() {
        LightCycleNative.ResetTargets();
    }

    public static void l(String str) {
        LightCycleNative.SetAppVersion(str);
    }

    public static void m(float[] fArr) {
        LightCycleNative.SetFilteredRotation(fArr);
    }

    public static void n() {
        LightCycleNative.SetOutputResolutionLarge();
    }

    public static void o(boolean z) {
        LightCycleNative.SetSensorMovementTooFast(z);
    }

    public static void p(float f) {
        LightCycleNative.StartGyroCalibration(f);
    }

    public static void q(int i) {
        LightCycleNative.UpdateFrameTexture(i);
    }

    public static boolean r() {
        return LightCycleNative.CanUndo();
    }

    public static boolean s() {
        return LightCycleNative.MovingTooFast();
    }

    public static boolean t() {
        return LightCycleNative.PhotoSkippedTooFast();
    }

    public static boolean u() {
        return LightCycleNative.TakeNewPhoto();
    }

    public static boolean v() {
        return LightCycleNative.TargetHit();
    }

    public static float[] w(float[] fArr, int i, int i2) {
        return LightCycleNative.EndGyroCalibration(fArr, i, i2);
    }

    public static void x(int i) {
        LightCycleNative.RenderNextSession(i);
    }
}
