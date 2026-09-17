package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2016.ExperimentalKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class kcy {
    public static final CaptureRequest.Key a;
    public static final CaptureResult.Key b;
    private static final boolean c;
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;
    private static final boolean g;
    private static final boolean h;
    private static final boolean i;
    private static final boolean j;

    static {
        CaptureRequest.Key key;
        boolean zE = kde.e(1);
        c = zE;
        boolean zE2 = kde.e(2);
        d = zE2;
        boolean zE3 = kde.e(3);
        e = zE3;
        boolean zE4 = kde.e(4);
        f = zE4;
        boolean zE5 = kde.e(5);
        g = zE5;
        boolean zE6 = kde.e(6);
        h = zE6;
        boolean zE7 = kde.e(7);
        i = zE7;
        j = true;
        if (zE) {
            key = ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (zE2) {
            key = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (zE3) {
            key = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        } else if (zE4) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else if (zE5) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else if (zE6) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        } else {
            key = zE7 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : null;
        }
        a = key;
        if (zE) {
            CaptureResult.Key key2 = ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zE2) {
            CaptureResult.Key key3 = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zE3) {
            CaptureResult.Key key4 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zE4) {
            CaptureResult.Key key5 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zE5) {
            CaptureResult.Key key6 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zE6) {
            CaptureResult.Key key7 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zE7) {
            CaptureResult.Key key8 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        b = CaptureResult.CONTROL_AF_SCENE_CHANGE;
    }
}
