package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2021.ExperimentalKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class kdd {
    public static final CaptureRequest.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureRequest.Key d;
    public static final CaptureResult.Key e;
    public static final CaptureRequest.Key f;
    public static final CaptureRequest.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureRequest.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureResult.Key k;
    public static final CameraCharacteristics.Key l;
    public static final CameraCharacteristics.Key m;
    public static final CaptureRequest.Key n;
    public static final CaptureRequest.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureResult.Key r;
    public static final CaptureResult.Key s;
    public static final CaptureRequest.Key t;
    private static final boolean u = kde.e(7);

    static {
        a = a(1) ? ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : null;
        if (a(1)) {
            CaptureResult.Key key = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        }
        b = a(1) ? ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : null;
        if (a(1)) {
            CaptureResult.Key key2 = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS;
        }
        if (a(2)) {
            CaptureResult.Key key3 = ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        }
        if (a(3)) {
            CaptureRequest.Key key4 = ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key5 = ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        }
        if (!a(19) && a(4)) {
            CaptureRequest.Key key6 = ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
        }
        if (!a(19) && a(4)) {
            CaptureResult.Key key7 = ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
        }
        c = a(4) ? ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : null;
        if (a(5)) {
            CaptureRequest.Key key8 = ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (a(6)) {
            CaptureResult.Key key9 = ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (a(7)) {
            CaptureRequest.Key key10 = ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        }
        if (a(7)) {
            CaptureResult.Key key11 = ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        }
        if (a(7)) {
            CaptureRequest.Key key12 = ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        }
        if (a(7)) {
            CaptureResult.Key key13 = ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        }
        d = a(8) ? ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : null;
        e = a(8) ? ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : null;
        f = a(9) ? ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : null;
        if (a(9)) {
            CaptureResult.Key key14 = ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        }
        g = a(10) ? ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : null;
        if (a(10)) {
            CaptureResult.Key key15 = ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        }
        if (a(11)) {
            CaptureRequest.Key key16 = ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
        }
        if (a(11)) {
            CaptureResult.Key key17 = ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
        }
        h = a(11) ? ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB : null;
        i = a(12) ? ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : null;
        if (a(12)) {
            CaptureResult.Key key18 = ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        }
        if (a(13)) {
            CaptureRequest.Key key19 = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS;
        }
        if (a(13)) {
            CaptureResult.Key key20 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        }
        j = a(14) ? ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : null;
        if (a(14)) {
            CaptureResult.Key key21 = ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        }
        k = a(14) ? ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : null;
        l = a(15) ? ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : null;
        m = a(15) ? ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : null;
        n = a(16) ? ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : null;
        if (a(16)) {
            CaptureResult.Key key22 = ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        }
        if (a(17)) {
            CaptureRequest.Key key23 = ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        }
        if (a(17)) {
            CaptureResult.Key key24 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        }
        if (a(17)) {
            CaptureResult.Key key25 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        }
        if (a(17)) {
            CaptureResult.Key key26 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        }
        if (a(17)) {
            CaptureResult.Key key27 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        }
        if (a(20)) {
            CaptureResult.Key key28 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        }
        if (a(18)) {
            CaptureResult.Key key29 = ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        }
        o = a(19) ? ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : null;
        p = a(19) ? ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : null;
        if (a(21)) {
            CaptureRequest.Key key30 = ExperimentalKeys.REQUEST_PD_DUMP_START;
        }
        if (a(21)) {
            CaptureResult.Key key31 = ExperimentalKeys.RESULT_PD_DUMP_START;
        }
        q = a(22) ? ExperimentalKeys.RESULT_OIS_TIMESTAMPS : null;
        r = a(22) ? ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : null;
        s = a(22) ? ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : null;
        t = a(23) ? ExperimentalKeys.REQUEST_CAPTURE_STATUS : null;
        if (a(23)) {
            CaptureResult.Key key32 = ExperimentalKeys.RESULT_CAPTURE_STATUS;
        }
    }

    public static boolean a(int i2) {
        if (!u) {
            return false;
        }
        try {
            return i2 <= ExperimentalKeys.getLibraryVersion();
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }
}
