package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2020.ExperimentalKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class kdc {
    public static final CaptureRequest.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureRequest.Key c;
    public static final CameraCharacteristics.Key d;
    public static final CaptureRequest.Key e;
    public static final CaptureResult.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureRequest.Key i;
    public static final CaptureResult.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureRequest.Key m;
    public static final CaptureResult.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureRequest.Key q;
    public static final CaptureRequest.Key r;
    public static final CaptureResult.Key s;
    private static final boolean t;
    private static final boolean u;

    static {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        CaptureRequest.Key key3;
        CameraCharacteristics.Key key4;
        CaptureRequest.Key key5;
        CaptureResult.Key key6;
        CaptureResult.Key key7;
        CaptureResult.Key key8;
        CaptureRequest.Key key9;
        CaptureResult.Key key10;
        CaptureResult.Key key11;
        CaptureResult.Key key12;
        CaptureRequest.Key key13;
        CaptureResult.Key key14;
        CaptureResult.Key key15;
        CaptureResult.Key key16;
        CaptureRequest.Key key17;
        CaptureRequest.Key key18;
        kde.e(5);
        t = kde.e(6);
        boolean zE = kde.e(7);
        u = zE;
        if (a(1)) {
            CaptureRequest.Key key19 = ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zE) {
            CaptureRequest.Key key20 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        }
        if (a(1)) {
            CaptureResult.Key key21 = ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zE) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        }
        CaptureResult.Key key23 = null;
        if (a(1)) {
            key = ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED;
        } else {
            key = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : null;
        }
        a = key;
        if (a(1)) {
            CaptureResult.Key key24 = ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zE) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        }
        if (a(2)) {
            key2 = ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS;
        } else {
            key2 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : null;
        }
        b = key2;
        if (a(2)) {
            CaptureResult.Key key26 = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        } else if (zE) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        }
        if (a(2)) {
            key3 = ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else {
            key3 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : null;
        }
        c = key3;
        if (a(2)) {
            CaptureResult.Key key28 = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zE) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        if (a(2)) {
            key4 = ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX;
        } else {
            key4 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : null;
        }
        d = key4;
        if (a(4)) {
            key5 = ExperimentalKeys.REQUEST_SMOOTHY_MODE;
        } else {
            key5 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SMOOTHY_MODE : null;
        }
        e = key5;
        if (a(4)) {
            CaptureResult.Key key30 = ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zE) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        }
        if (a(5)) {
            key6 = ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP;
        } else {
            key6 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : null;
        }
        f = key6;
        if (a(7)) {
            CameraCharacteristics.Key key32 = ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zE) {
            CameraCharacteristics.Key key33 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        }
        if (a(7)) {
            CaptureResult.Key key34 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zE) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        }
        if (a(7)) {
            CaptureResult.Key key36 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zE) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        }
        if (a(7)) {
            CaptureResult.Key key38 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zE) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        }
        if (a(7)) {
            CaptureResult.Key key40 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zE) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        }
        if (a(6)) {
            CaptureResult.Key key42 = ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zE) {
            CaptureResult.Key key43 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key44 = ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zE) {
            CaptureResult.Key key45 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key46 = ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zE) {
            CaptureResult.Key key47 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key48 = ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zE) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key50 = ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zE) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        if (a(8)) {
            key7 = ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES;
        } else {
            key7 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : null;
        }
        g = key7;
        if (a(8)) {
            key8 = ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES;
        } else {
            key8 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : null;
        }
        h = key8;
        if (a(9)) {
            key9 = ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED;
        } else {
            key9 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : null;
        }
        i = key9;
        if (a(9)) {
            CaptureResult.Key key52 = ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zE) {
            CaptureResult.Key key53 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        }
        if (a(9)) {
            key10 = ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB;
        } else {
            key10 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : null;
        }
        j = key10;
        if (a(9)) {
            key11 = ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB;
        } else {
            key11 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : null;
        }
        k = key11;
        if (a(9)) {
            key12 = ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB;
        } else {
            key12 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : null;
        }
        l = key12;
        if (a(9)) {
            key13 = ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED;
        } else {
            key13 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : null;
        }
        m = key13;
        if (a(9)) {
            CaptureResult.Key key54 = ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zE) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        }
        if (a(9)) {
            key14 = ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB;
        } else {
            key14 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : null;
        }
        n = key14;
        if (a(9)) {
            key15 = ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB;
        } else {
            key15 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : null;
        }
        o = key15;
        if (a(9)) {
            key16 = ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB;
        } else {
            key16 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : null;
        }
        p = key16;
        if (a(10)) {
            CaptureResult.Key key56 = ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zE) {
            CaptureResult.Key key57 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        }
        if (a(11)) {
            key17 = ExperimentalKeys.REQUEST_EIS_MODE;
        } else {
            key17 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_EIS_MODE : null;
        }
        q = key17;
        if (a(11)) {
            CaptureResult.Key key58 = ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zE) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_EIS_MODE;
        }
        if (a(12)) {
            key18 = ExperimentalKeys.REQUEST_SKIP_3A_PROCESS;
        } else {
            key18 = zE ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : null;
        }
        r = key18;
        if (a(12)) {
            CaptureResult.Key key60 = ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zE) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        }
        if (a(13)) {
            key23 = ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zE) {
            key23 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        }
        s = key23;
    }

    public static boolean a(int i2) {
        if (!t) {
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
