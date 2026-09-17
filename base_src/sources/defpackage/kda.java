package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2018.ExperimentalKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class kda {
    public static final CaptureResult.Key a;
    public static final CameraCharacteristics.Key b;
    public static final CameraCharacteristics.Key c;
    public static final CameraCharacteristics.Key d;
    public static final CameraCharacteristics.Key e;
    public static final CameraCharacteristics.Key f;
    public static final CaptureRequest.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureResult.Key j;
    public static final CameraCharacteristics.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureResult.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureRequest.Key r;
    public static final CaptureRequest.Key s;
    public static final CaptureResult.Key t;
    private static final boolean u = kde.e(3);
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;
    private static final boolean y;

    static {
        CaptureResult.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        CameraCharacteristics.Key key4;
        CameraCharacteristics.Key key5;
        CameraCharacteristics.Key key6;
        CaptureRequest.Key key7;
        CaptureResult.Key key8;
        CaptureResult.Key key9;
        CaptureResult.Key key10;
        CameraCharacteristics.Key key11;
        CaptureResult.Key key12;
        CaptureResult.Key key13;
        CaptureResult.Key key14;
        CaptureResult.Key key15;
        CaptureResult.Key key16;
        CaptureResult.Key key17;
        CaptureRequest.Key key18;
        boolean zE = kde.e(4);
        v = zE;
        boolean zE2 = kde.e(5);
        w = zE2;
        boolean zE3 = kde.e(6);
        x = zE3;
        boolean zE4 = kde.e(7);
        y = zE4;
        CaptureResult.Key key19 = null;
        if (a(2)) {
            key = ExperimentalKeys.EXPERIMENTAL_FOCUS_OBJ_TOO_CLOSE;
        } else if (zE) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else if (zE2) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else if (zE3) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        } else {
            key = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : null;
        }
        a = key;
        if (a(5)) {
            CaptureResult.Key key20 = ExperimentalKeys.EXPERIMENTAL_3A_SPECTRAL_DATA;
        }
        if (a(6)) {
            key2 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (kdc.a(6)) {
            key2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else {
            key2 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : null;
        }
        b = key2;
        if (a(6)) {
            key3 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (kdc.a(6)) {
            key3 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else {
            key3 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : null;
        }
        c = key3;
        if (a(6)) {
            key4 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (kdc.a(6)) {
            key4 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else {
            key4 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : null;
        }
        d = key4;
        if (a(6)) {
            key5 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (kdc.a(6)) {
            key5 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else {
            key5 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : null;
        }
        e = key5;
        if (a(6)) {
            key6 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (kdc.a(6)) {
            key6 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else {
            key6 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : null;
        }
        f = key6;
        if (a(13)) {
            CameraCharacteristics.Key key21 = ExperimentalKeys.NEXUS_EXPERIMENTAL_FRONT_STEREO_CAL;
        }
        if (a(7)) {
            CaptureRequest.Key key22 = ExperimentalKeys.EXPERIMENTAL_REQUEST_BAYER_GRID_STATS;
        }
        if (a(7)) {
            CaptureResult.Key key23 = ExperimentalKeys.EXPERIMENTAL_BAYER_GRID_STATS;
        }
        if (a(8)) {
            CaptureResult.Key key24 = ExperimentalKeys.EXPERIMENTAL_THERMAL_INFO;
        }
        if (a(9)) {
            key7 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_ENABLED;
        } else if (zE) {
            key7 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else if (zE2) {
            key7 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else if (zE3) {
            key7 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        } else {
            key7 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : null;
        }
        g = key7;
        if (a(9)) {
            key8 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AEC;
        } else if (zE) {
            key8 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else if (zE2) {
            key8 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else if (zE3) {
            key8 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        } else {
            key8 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AEC : null;
        }
        h = key8;
        if (a(9)) {
            key9 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AF;
        } else if (zE) {
            key9 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else if (zE2) {
            key9 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else if (zE3) {
            key9 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AF;
        } else {
            key9 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AF : null;
        }
        i = key9;
        if (a(9)) {
            key10 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AWB;
        } else if (zE) {
            key10 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else if (zE2) {
            key10 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else if (zE3) {
            key10 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        } else {
            key10 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AWB : null;
        }
        j = key10;
        if (a(12)) {
            key11 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zE) {
            key11 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zE2) {
            key11 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else if (zE3) {
            key11 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        } else {
            key11 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : null;
        }
        k = key11;
        if (a(12)) {
            key12 = ExperimentalKeys.EXPERIMENTAL_FACE_SKIPFRAME;
        } else if (zE) {
            key12 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else if (zE2) {
            key12 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else if (zE3) {
            key12 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        } else {
            key12 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_SKIPFRAME : null;
        }
        l = key12;
        if (a(12)) {
            key13 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_COUNT;
        } else if (zE) {
            key13 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else if (zE2) {
            key13 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else if (zE3) {
            key13 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        } else {
            key13 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : null;
        }
        m = key13;
        if (a(12)) {
            key14 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_IDS;
        } else if (zE) {
            key14 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else if (zE2) {
            key14 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else if (zE3) {
            key14 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        } else {
            key14 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : null;
        }
        n = key14;
        if (a(12)) {
            key15 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_XY;
        } else if (zE) {
            key15 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else if (zE2) {
            key15 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else if (zE3) {
            key15 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        } else {
            key15 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : null;
        }
        o = key15;
        if (a(12)) {
            key16 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_DEPTH;
        } else if (zE) {
            key16 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else if (zE2) {
            key16 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else if (zE3) {
            key16 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        } else {
            key16 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : null;
        }
        p = key16;
        if (a(12)) {
            key17 = ExperimentalKeys.EXPERIMENTAL_FACE_ORIENTATION;
        } else if (zE) {
            key17 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else if (zE2) {
            key17 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else if (zE3) {
            key17 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        } else {
            key17 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ORIENTATION : null;
        }
        q = key17;
        r = a(11) ? ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_INDEX : null;
        if (a(11)) {
            CaptureResult.Key key25 = ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_DATA;
        }
        if (a(16)) {
            key18 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB_ENABLED;
        } else if (zE) {
            key18 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else if (zE2) {
            key18 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else if (zE3) {
            key18 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        } else {
            key18 = zE4 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : null;
        }
        s = key18;
        if (a(16)) {
            key19 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB;
        } else if (zE) {
            key19 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zE2) {
            key19 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zE3) {
            key19 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zE4) {
            key19 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        t = key19;
        if (a(16)) {
            CaptureRequest.Key key26 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE_ENABLED;
        } else if (zE) {
            CaptureRequest.Key key27 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zE2) {
            CaptureRequest.Key key28 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zE3) {
            CaptureRequest.Key key29 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zE4) {
            CaptureRequest.Key key30 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        if (a(16)) {
            CaptureResult.Key key31 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE;
            return;
        }
        if (zE) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zE2) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AE;
        } else if (zE3) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AE;
        } else if (zE4) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AE;
        }
    }

    private static boolean a(int i2) {
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
