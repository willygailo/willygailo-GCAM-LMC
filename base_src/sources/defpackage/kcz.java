package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2017.ExperimentalKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class kcz {
    public static final CameraCharacteristics.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureResult.Key d;

    @Deprecated
    public static final CaptureResult.Key e;

    @Deprecated
    public static final CaptureResult.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureRequest.Key k;
    public static final CameraCharacteristics.Key l;
    public static final CameraCharacteristics.Key m;
    public static final CameraCharacteristics.Key n;
    public static final CameraCharacteristics.Key o;
    public static final CaptureRequest.Key p;
    public static final Integer q;
    public static final CaptureResult.Key r;
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;

    static {
        CaptureRequest.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        CameraCharacteristics.Key key4;
        CameraCharacteristics.Key key5;
        CaptureRequest.Key key6;
        boolean zE = kde.e(2);
        s = zE;
        boolean zE2 = kde.e(3);
        t = zE2;
        boolean zE3 = kde.e(4);
        u = zE3;
        boolean zE4 = kde.e(5);
        v = zE4;
        boolean zE5 = kde.e(6);
        w = zE5;
        boolean zE6 = kde.e(7);
        x = zE6;
        if (zE) {
            CaptureRequest.Key key7 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM_MODE;
        }
        if (zE) {
            CameraCharacteristics.Key key8 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_AVAILABLE_HISTOGRAM_BUCKET_COUNTS;
        }
        if (zE) {
            CaptureRequest.Key key9 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_BUCKET_COUNT;
        }
        if (zE) {
            CaptureResult.Key key10 = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM;
        }
        CaptureResult.Key key11 = null;
        a = zE ? ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION : null;
        if (zE && g()) {
            CameraCharacteristics.Key key12 = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_DIMENSIONS;
        }
        b = (zE && g()) ? ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE : null;
        if (zE) {
            CaptureRequest.Key key13 = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        }
        if (zE) {
            CaptureResult.Key key14 = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        }
        if (zE) {
            CaptureResult.Key key15 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_VSYNC;
        }
        c = zE ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME : null;
        d = zE ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME : null;
        e = zE ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X : null;
        f = zE ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y : null;
        g = (zE && e()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X : null;
        h = (zE && e()) ? ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y : null;
        i = (zE && a()) ? ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST : null;
        if (c()) {
            CaptureResult.Key key16 = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        }
        if (c()) {
            CaptureRequest.Key key17 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        }
        if (c()) {
            CaptureResult.Key key18 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        }
        if (c()) {
            CaptureResult.Key key19 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        }
        j = c() ? ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE : null;
        if (zE && b()) {
            key = ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        } else if (zE2 && b()) {
            key = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        } else if (zE3) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else if (zE4) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else if (zE5) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        } else {
            key = zE6 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS : null;
        }
        k = key;
        if (h()) {
            CaptureResult.Key key20 = ExperimentalKeys.EXPERIMENTAL_CONTROL_SCENE_DISTANCE;
        }
        if (zE && f()) {
            CameraCharacteristics.Key key21 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_RIGHT_GAIN_MAP;
        }
        if (zE && f()) {
            CameraCharacteristics.Key key22 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_LEFT_GAIN_MAP;
        }
        if (zE && f()) {
            CameraCharacteristics.Key key23 = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_DCC;
        }
        if (zE && i()) {
            key2 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zE2 && i()) {
            key2 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zE3) {
            key2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zE4) {
            key2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else if (zE5) {
            key2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else {
            key2 = zE6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS : null;
        }
        l = key2;
        if (zE && i()) {
            key3 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zE2 && i()) {
            key3 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zE3) {
            key3 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zE4) {
            key3 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else if (zE5) {
            key3 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else {
            key3 = zE6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS : null;
        }
        m = key3;
        if (zE && i()) {
            key4 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zE2 && i()) {
            key4 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zE3) {
            key4 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zE4) {
            key4 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else if (zE5) {
            key4 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else {
            key4 = zE6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS : null;
        }
        n = key4;
        if (zE && i()) {
            key5 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zE2 && i()) {
            key5 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zE3) {
            key5 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zE4) {
            key5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else if (zE5) {
            key5 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else {
            key5 = zE6 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO : null;
        }
        o = key5;
        if (zE && d()) {
            key6 = ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        } else if (zE2 && d()) {
            key6 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        } else if (zE3) {
            key6 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else if (zE4) {
            key6 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else if (zE5) {
            key6 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        } else {
            key6 = zE6 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE : null;
        }
        p = key6;
        q = 1;
        if (zE && d()) {
            CaptureResult.Key key24 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        } else if (zE2 && d()) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        } else if (zE3) {
            CaptureResult.Key key26 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zE4) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zE5) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        } else if (zE6) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        if (zE && d()) {
            CaptureResult.Key key30 = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        } else if (zE2 && d()) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        } else if (zE3) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zE4) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zE5) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        } else if (zE6) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        if (zE && d()) {
            key11 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        } else if (zE2 && d()) {
            key11 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        } else if (zE3) {
            key11 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zE4) {
            key11 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zE5) {
            key11 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        } else if (zE6) {
            key11 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        r = key11;
    }

    private static boolean a() {
        if (!s) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 2;
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0020 -> B:21:0x0021). Please report as a decompilation issue!!! */
    private static boolean b() {
        boolean z = true;
        try {
            if (s) {
                if (ExperimentalKeys.getLibraryVersion() < 5) {
                    z = false;
                }
            } else if (!t || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() < 3) {
                z = false;
            }
        } catch (NoSuchFieldError e2) {
        } catch (NoSuchMethodError e3) {
        }
        return z;
    }

    private static boolean c() {
        if (!s) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 4;
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0021 -> B:21:0x0022). Please report as a decompilation issue!!! */
    private static boolean d() {
        boolean z = true;
        try {
            if (s) {
                if (ExperimentalKeys.getLibraryVersion() < 9) {
                    z = false;
                }
            } else if (!t || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() < 4) {
                z = false;
            }
        } catch (NoSuchFieldError e2) {
        } catch (NoSuchMethodError e3) {
        }
        return z;
    }

    private static boolean e() {
        if (!s) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 3;
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }

    private static boolean f() {
        if (!s) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 7;
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }

    private static boolean g() {
        if (!s) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() > 0;
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }

    private static boolean h() {
        if (!s) {
            return false;
        }
        try {
            return ExperimentalKeys.getLibraryVersion() >= 6;
        } catch (NoSuchFieldError e2) {
            return false;
        } catch (NoSuchMethodError e3) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0020 -> B:20:0x0021). Please report as a decompilation issue!!! */
    private static boolean i() {
        boolean z = true;
        try {
            if (s) {
                if (ExperimentalKeys.getLibraryVersion() < 10) {
                    z = false;
                }
            } else if (!t || com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() <= 0) {
                z = false;
            }
        } catch (NoSuchFieldError e2) {
        } catch (NoSuchMethodError e3) {
        }
        return z;
    }
}
