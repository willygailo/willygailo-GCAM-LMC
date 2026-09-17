package com;

import android.app.Activity;
import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.view.Display;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.Fix.IsoTime;
import com.Fix.Lens;
import com.Fix.Pref;
import com.SDE.Awb;
import com.SDE.LensValue;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.hdrindicator.HDRProgress;
import defpackage.jrl;
import defpackage.lvp;
import defpackage.lzr;
import defpackage.lzv;
import defpackage.pkr;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.regex.Pattern;
import sgcam.Shamim;

/* JADX INFO: loaded from: classes2.dex */
public class Helper {
    public static float DistanceFar;
    public static float DistanceInfinity;
    public static float DistanceNear;
    public static int Exynos;
    public static int GeometricCalibration;
    public static int GetISO;
    public static int GetISOsystem;
    public static int GetMode;
    public static int IsMode;
    public static int NeedRestart;
    public static int TrFocusStateInv;
    public static int getSunlightFix;
    public static int getVFDenoise;
    public static int mv_h;
    public static int mv_w;
    public static String sAppsPhotosGallery;
    public static int sAutoNS;
    public static int sC2API;
    public static int sC2APIl;
    public static int sCam;
    public static int sColorTransform;
    public static int sColorTransformFront;
    public static int sFront;
    public static float sGetMaxISO;
    private static long sHdrProcessTime;
    public static int sHdr_process;
    public static int sImg;
    public static int sModeExperimental;
    public static int sModeMORE_MODES;
    public static int sModeNS;
    public static int sModePhoto;
    public static int sModePortrait;
    public static int sModeSlowMotion;
    public static int sModeTIME_LAPSE;
    public static jrl sModeTo;
    public static int sModeUninitialized;
    public static int sModeVideo;
    public static float sZoom;
    public static int sams;
    public static int samsu;

    public Helper() {
        getApplicationContext();
        setKeyOnStart();
        c2a();
        c2aa();
        setMVresolution();
        setColorTransform();
        c2aaa();
        Exynos();
        createAutoPath();
        new NoiseModels();
        LogDirsReady();
    }

    public static void Exynos() {
        int iMenuValue = Pref.MenuValue(LensValue.SetLensValue("pref_exynosfix_key"));
        if (iMenuValue < 0 || (iMenuValue <= 0 && Pattern.matches(".*EXYNOS.*", Build.HARDWARE.toUpperCase()))) {
            Exynos = 1;
        } else {
            Exynos = 0;
        }
    }

    /* JADX INFO: renamed from: Exynos, reason: collision with other method in class */
    public static boolean m1Exynos() {
        boolean zMatches = Pattern.matches(".*EXYNOS.*", Build.HARDWARE.toUpperCase());
        if (zMatches || !(zMatches = Build.MODEL.toUpperCase(Locale.US).equals("VIVO 1901"))) {
        }
        return zMatches;
    }

    public static int GetAeCompension(int i) {
        String str;
        if (Pref.MenuValue("auto_exp_key") == 0) {
            return i;
        }
        if (sModeTo == jrl.PORTRAIT) {
            str = "pref_exposure_portrait_option_available_key";
        } else if (sModeTo == jrl.LONG_EXPOSURE) {
            str = "pref_exposure_ns_option_available_key";
        } else if (sFront != 0) {
            str = "pref_exposure_front_option_available_key";
        } else {
            int iMenuValue = Pref.MenuValue("pref_aux_key");
            if (iMenuValue == 1) {
                str = "pref_exposure_tele_key";
            } else if (iMenuValue == 2) {
                str = "pref_exposure_wide_key";
            } else if (iMenuValue != 3) {
                str = iMenuValue != 4 ? "pref_exposure_option_available_key" : "pref_exposure_5th_key";
            } else {
                str = "pref_exposure_4th_key";
            }
        }
        return Pref.MenuValue(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessInstructionsVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Payload for fill-array not found at 0x016c
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:112)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    public static float[] GetBlackLevel(defpackage.lvp r10, defpackage.lzv r11) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Helper.GetBlackLevel(lvp, lzv):float[]");
    }

    public static String GetCameraStamp() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("Camera Lens:- ");
        if (sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str = "Main";
                    i = Lens.sAuxMain;
                    break;
                case 1:
                    str = "Telephoto";
                    i = Lens.sAuxTele;
                    break;
                case 2:
                    str = "Ultra wide";
                    i = Lens.sAuxWide;
                    break;
                case 3:
                    str = "Camera 4";
                    i = Lens.sAuxInfinity;
                    break;
                case 4:
                    str = "Camera 5";
                    i = Lens.sAux5;
                    break;
            }
        } else {
            str = "Front";
            i = Lens.sAuxSwitchMain;
        }
        sb.append(str);
        sb.append(" (ID= ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public static float[] GetCorrectionDBL(float[] fArr, float[] fArr2) {
        int i = 4;
        float floatValue = Pref.getFloatValue(LensValue.SetLensValueWithFront("pref_dbl_key")) / 1000.0f;
        float[] fArr3 = new float[4];
        while (true) {
            i--;
            if (i < 0) {
                return fArr3;
            }
            fArr3[i] = fArr[i] - ((fArr[i] - fArr2[i]) * floatValue);
        }
    }

    public static void GetEachModeIndividually(Intent intent) {
        switch (GetMode) {
            case 1:
                intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
                break;
            case 2:
                intent.setAction("android.media.action.VIDEO_CAMERA");
                break;
            case 6:
                intent.setAction("android.media.action.PORTRAIT");
                break;
            case 12:
                intent.setAction("android.media.action.NIGHTSIGHT");
                break;
            case 13:
                intent.setAction("android.media.action.TIME_LAPSE");
                break;
            default:
                intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
                break;
        }
    }

    public static int GetIdFromResources(String str, int i) {
        String str2;
        Context applicationContext = AppGlobals.getInitialApplication().getApplicationContext();
        switch (i) {
            case 0:
            default:
                str2 = "drawable";
                break;
            case 1:
                str2 = "layout";
                break;
            case 2:
                str2 = "array";
                break;
            case 3:
                str2 = "color";
                break;
            case 4:
                str2 = "id";
                break;
            case 5:
                str2 = "raw";
                break;
            case 6:
                str2 = "string";
                break;
        }
        return applicationContext.getResources().getIdentifier(str, str2, applicationContext.getPackageName());
    }

    public static void GetLens(lvp lvpVar) {
        int iIntValue;
        int iIntValue2 = ((Integer) ((Range) lvpVar.n(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue();
        try {
            iIntValue = ((Integer) lvpVar.n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        } catch (Throwable th) {
            iIntValue = 388;
        }
        IsoTime.shotMaxISO = iIntValue / iIntValue2;
        sCam = ((Integer) lvpVar.n(CameraCharacteristics.LENS_FACING)).intValue();
    }

    public static int[] GetRawFormatFix() {
        String str;
        if (sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str = "pref_raw_key_main";
                    break;
                case 1:
                    str = "pref_raw_key_tele";
                    break;
                case 2:
                    str = "pref_raw_key_wide";
                    break;
                case 3:
                    str = "pref_raw_key_id4";
                    break;
                case 4:
                    str = "pref_raw_key_id5";
                    break;
            }
        } else {
            str = "pref_raw_key_front";
        }
        int iMenuValue = Pref.MenuValue(str);
        if (iMenuValue != 1) {
            return iMenuValue == 2 ? new int[]{32} : new int[]{37, 38, 32};
        }
        return new int[]{37};
    }

    public static void GetRestartMethodFront() throws InterruptedException {
        if (sHdr_process == 0) {
            Thread.sleep(500L);
            Application initialApplication = AppGlobals.getInitialApplication();
            Context contextCreatePackageContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 0);
            Intent intent = new Intent(contextCreatePackageContext, (Class<?>) CameraActivity.class);
            intent.addFlags(32768);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            if (sCam != 0) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            GetEachModeIndividually(intent);
            contextCreatePackageContext.startActivity(intent);
            System.exit(0);
        }
        Toast(R.string.hsl_hdrprocess);
    }

    public static void IsMode(Intent intent, int i) {
        if (i != 0) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        int i2 = Visibility.IsMode;
        if (i2 == 1) {
            intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
            return;
        }
        if (i2 == 2) {
            intent.setAction("android.media.action.VIDEO_CAMERA");
            return;
        }
        if (i2 == 6) {
            intent.setAction("android.media.action.PORTRAIT");
        } else if (i2 == 12) {
            intent.setAction("android.media.action.NIGHTSIGHT");
        } else {
            if (i2 != 13) {
                return;
            }
            intent.setAction("android.media.action.TIME_LAPSE");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 6, instructions: 8 */
    public static void IsMode(jrl jrlVar) {
        sModeTo = jrlVar;
        sModeVideo = 0;
        sModeSlowMotion = 0;
        sModeNS = 0;
        sModePortrait = 0;
        sModeTIME_LAPSE = 0;
        sModeMORE_MODES = 0;
        sModePhoto = 0;
        sModeExperimental = 0;
        if (jrlVar == jrl.VIDEO) {
            sModeVideo = 1;
            return;
        }
        if (jrlVar == jrl.SLOW_MOTION) {
            sModeSlowMotion = 1;
            return;
        }
        if (jrlVar == jrl.LONG_EXPOSURE) {
            sModeNS = 1;
            return;
        }
        if (jrlVar == jrl.PORTRAIT) {
            sModePortrait = 1;
        } else if (jrlVar == jrl.TIME_LAPSE) {
            sModeTIME_LAPSE = 1;
        } else if (jrlVar == jrl.MORE_MODES) {
            sModeMORE_MODES = 1;
        }
    }

    public static void LogDirsReady() {
        File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/patchedlibs/");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/libs/");
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    public static void LogWriteToFile(String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/files/");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(file, str)));
            outputStreamWriter.write(str2);
            outputStreamWriter.close();
        } catch (IOException e) {
        }
    }

    public static float MenuValueFloat2(String str) {
        return Float.parseFloat(MenuValueString(str));
    }

    public static String MenuValueString(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        boolean zContains = PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str);
        return !zContains ? Integer.toString(zContains ? 1 : 0) : PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null);
    }

    public static boolean MnFix() {
        boolean zEquals = Build.VERSION.SDK.equals("27");
        if (zEquals || (zEquals = Build.VERSION.SDK.equals("28")) || (zEquals = Build.VERSION.SDK.equals("29")) || !(zEquals = Build.VERSION.SDK.equals("30"))) {
        }
        return zEquals;
    }

    public static int SelectTint() {
        String str;
        if (sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str = "pref_fix_awbgains_key_0";
                    break;
                case 1:
                    str = "pref_fix_awbgains_key_2";
                    break;
                case 2:
                    str = "pref_fix_awbgains_key_3";
                    break;
                case 3:
                    str = "pref_fix_awbgains_key_4";
                    break;
                case 4:
                    str = "pref_fix_awbgains_key_5";
                    break;
            }
        } else {
            str = "pref_fix_awbgains_key_1";
        }
        return Pref.MenuValue(str);
    }

    public static String SetDevice(String str) {
        switch (Pref.MenuValue(str)) {
            case 0:
                return "taimen";
            case 1:
                return "marlin";
            case 2:
                return "walleye";
            case 3:
                return "sailfish";
            case 4:
                return "blueline";
            case 5:
                return "crosshatch";
            case 6:
                return "sargo";
            case 7:
                return "bonito";
            case 8:
                return "flame";
            case 9:
                return "coral";
            case 10:
                return "sunfish";
            case 11:
                return "bramble";
            case 12:
                return "redfin";
            case 13:
                return "barbet";
            case 14:
                return "oriole";
            case 15:
                return "raven";
            case 16:
                return "bluejay";
            case 17:
                return "cloudripper";
            case 18:
                return "pipit";
            case 19:
                return Build.DEVICE;
            default:
                return "taimen";
        }
    }

    public static String SetDevice1(String str) {
        switch (Pref.MenuValue(str)) {
            case 0:
                return "taimen";
            case 1:
                return "marlin";
            case 2:
                return "walleye";
            case 3:
                return "sailfish";
            case 4:
                return "blueline";
            case 5:
                return "crosshatch";
            case 6:
                return "sargo";
            case 7:
                return "bonito";
            case 8:
                return "flame";
            case 9:
                return "coral";
            case 10:
                return "sunfish";
            case 11:
                return "bramble";
            case 12:
                return "redfin";
            case 13:
                return "barbet";
            case 14:
                return "oriole";
            case 15:
                return "raven";
            case 16:
                return "bluejay";
            case 17:
                return "cloudripper";
            case 18:
                return "pipit";
            case 19:
                return Build.DEVICE;
            default:
                return "raven";
        }
    }

    public static String SetHDRInterface() {
        String str;
        if (Pref.MenuValue("pref_frontcam_value_restart_key") == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                    str = "pref_model_key";
                    break;
                case 1:
                    str = "pref_model_key_tele";
                    break;
                case 2:
                    str = "pref_model_key_wide";
                    break;
                case 3:
                    str = "pref_model_key_id4";
                    break;
                case 4:
                    str = "pref_model_key_id5";
                    break;
                default:
                    str = "pref_model_key";
                    break;
            }
        } else {
            str = "pref_model_key_front";
        }
        return SetDevice1(str);
    }

    public static String SetInterface() {
        String str;
        if (Pref.MenuValue("pref_frontcam_value_restart_key") == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                    str = "pref_device_key";
                    break;
                case 1:
                    str = "pref_device_key_tele";
                    break;
                case 2:
                    str = "pref_device_key_wide";
                    break;
                case 3:
                    str = "pref_device_key_id4";
                    break;
                case 4:
                    str = "pref_device_key_id5";
                    break;
                default:
                    str = "pref_device_key";
                    break;
            }
        } else {
            str = "pref_device_key_front";
        }
        return SetDevice(str);
    }

    public static void ShowToastDirect(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Toast.makeText(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext(), str, 1).show();
    }

    public static void Toast(int i) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        Toast toastMakeText = Toast.makeText(applicationContext, i, 1);
        toastMakeText.setGravity(17, 0, 0);
        LinearLayout linearLayout = (LinearLayout) toastMakeText.getView();
        ImageView imageView = new ImageView(applicationContext);
        imageView.setImageResource(R.drawable.error);
        linearLayout.addView(imageView, 0);
        toastMakeText.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0.equals("SDM712") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c2a() {
        /*
            java.lang.String r0 = "pref_c2a_key"
            java.lang.String r0 = com.SDE.LensValue.SetLensValue(r0)
            int r0 = com.Fix.Pref.MenuValue(r0)
            if (r0 < 0) goto L35
            if (r0 > 0) goto L2e
            java.lang.String r0 = android.os.Build.BOARD
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "SDM845"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L35
            java.lang.String r1 = "SDM710"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L35
            java.lang.String r1 = "SDM712"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L35
        L2e:
            r0 = 1
            com.Helper.sC2API = r0
            r0 = 0
            com.Helper.sC2APIl = r0
            return
        L35:
            r0 = 0
            com.Helper.sC2API = r0
            r0 = 1
            com.Helper.sC2APIl = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Helper.c2a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0.equals("SDM712") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c2aa() {
        /*
            java.lang.String r0 = "pref_img_key"
            java.lang.String r0 = com.SDE.LensValue.SetLensValue(r0)
            int r0 = com.Fix.Pref.MenuValue(r0)
            if (r0 < 0) goto L33
            if (r0 > 0) goto L2e
            java.lang.String r0 = android.os.Build.BOARD
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "SDM845"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = "SDM710"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = "SDM712"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L33
        L2e:
            r0 = 35
            com.Helper.sImg = r0
            return
        L33:
            r0 = 256(0x100, float:3.59E-43)
            com.Helper.sImg = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Helper.c2aa():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r0.equals("OPPO") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c2aaa() {
        /*
            java.lang.String r0 = "pref_samsungfix_key"
            java.lang.String r0 = com.SDE.LensValue.SetLensValue(r0)
            int r0 = com.Fix.Pref.MenuValue(r0)
            if (r0 < 0) goto L47
            if (r0 > 0) goto L3e
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "SAMSUNG"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            java.lang.String r1 = "ULEFONE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            java.lang.String r1 = "TECNO MOBILE LIMITED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            java.lang.String r1 = "VIVO"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            java.lang.String r1 = "OPPO"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
        L3e:
            r0 = 38
            com.Helper.samsu = r0
            r0 = 32
            com.Helper.sams = r0
            return
        L47:
            r0 = 32
            com.Helper.samsu = r0
            r0 = 35
            com.Helper.sams = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Helper.c2aaa():void");
    }

    public static void createAutoPath() {
        File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/AWB/");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/NOISE MODELER/");
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    public static void execCommands(Context context) throws IOException {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            identifier = system.getDimensionPixelSize(identifier);
        }
        int i3 = i / 2;
        int i4 = i2 / 2;
        StringBuilder sb = new StringBuilder();
        sb.append("input tap ");
        if (rotation == 0) {
            sb.append(i3);
            sb.append(" ");
            sb.append(i4 - identifier);
        } else {
            sb.append(3 != rotation ? i3 - identifier : i3 + identifier);
            sb.append(" ");
            sb.append(i4);
        }
        String string = sb.toString();
        Log.d("TouchPoint", string);
        DataOutputStream dataOutputStream = new DataOutputStream(Runtime.getRuntime().exec("sh").getOutputStream());
        dataOutputStream.writeBytes(string + "\n");
        dataOutputStream.flush();
    }

    public static Context getApplicationContext() {
        Application initialApplication = AppGlobals.getInitialApplication();
        return initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
    }

    public static void getAwbLog(float[] fArr, float[] fArr2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n");
        sb.append(Shamim.GetCameraStamp());
        sb.append("\n\nArray length= ");
        sb.append(i);
        sb.append("\n\nR_G=\n");
        int i2 = 0;
        while (i2 < i) {
            sb.append(fArr[i2]);
            i2++;
            if (i2 >= i) {
                break;
            } else {
                sb.append("\n");
            }
        }
        sb.append("\n\n\nArray length= ");
        sb.append(i);
        sb.append("\n\nB_G=\n");
        int i3 = 0;
        while (i3 < i) {
            sb.append(fArr2[i3]);
            i3++;
            if (i3 >= i) {
                break;
            } else {
                sb.append("\n");
            }
        }
        sb.append("\n\nGB/GR= ");
        sb.append(Awb.awbArr_GR_GB);
        LogWriteToFile(LensValue.SetLensValueLog("AWB"), sb.toString());
    }

    public static int getISONm(lzr lzrVar) {
        switch (Pref.MenuValue(LensValue.SetLensValue("pref_iso_noise_key"))) {
            case 0:
                return ((Integer) lzrVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
            case 1:
                return 100;
            case 2:
                return 200;
            case 3:
                return 300;
            case 4:
                return (int) (((((Integer) lzrVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue() - 50.0f) * Pref.getFloatValue(LensValue.SetLensValue("pref_iso_noise_coeff_key"))) + 50.0f);
            case 5:
                return Pref.MenuValue(LensValue.SetLensValue("pref_manual_iso_noise_key"));
            default:
                return ((Integer) lzrVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        }
    }

    public static int getJPGQuality() {
        int iMenuValue = Pref.MenuValue("pref_qjpg_key");
        if (iMenuValue != 0) {
            return iMenuValue;
        }
        return 95;
    }

    public static int getMerge() {
        String str;
        if (sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str = "pref_merge_key_main";
                    break;
                case 1:
                    str = "pref_merge_key_tele";
                    break;
                case 2:
                    str = "pref_merge_key_wide";
                    break;
                case 3:
                    str = "pref_merge_key_id4";
                    break;
                case 4:
                    str = "pref_merge_key_id5";
                    break;
            }
        } else {
            str = "pref_merge_key_front";
        }
        return Pref.MenuValue(str);
    }

    public static void getNoiseModelerLog(Pair[] pairArr, lzv lzvVar) {
        int length;
        int length2;
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("\n");
        sb.append(GetCameraStamp());
        sb.append("\n\n");
        Pair[] pairArr2 = (Pair[]) lzvVar.d(CaptureResult.SENSOR_NOISE_PROFILE);
        sb.append("System Noise modeler:-");
        sb.append("\n\n\n");
        sb.append("First Pair values:- \n\n");
        int i = 0;
        while (i < 4) {
            sb.append(pairArr2[i].first);
            i++;
            if (i >= 4) {
                break;
            } else {
                sb.append("\n");
            }
        }
        sb.append("\n\nSecond Pair values:- \n\n");
        int i2 = 0;
        while (i2 < 4) {
            sb.append(pairArr2[i2].second);
            i2++;
            if (i2 >= 4) {
                break;
            } else {
                sb.append("\n");
            }
        }
        sb.append("\n\n");
        sb.append("System ISO:- ");
        sb.append(GetISOsystem);
        sb.append("\n\n\n\n");
        sb.append("Working Noise modeler:-");
        sb.append("\n\n\n");
        sb.append("First Pair values:- \n\n");
        int i3 = 0;
        while (i3 < 4) {
            sb.append(pairArr[i3].first);
            i3++;
            if (i3 >= 4) {
                break;
            } else {
                sb.append("\n");
            }
        }
        Pair[] pairArr3 = NoiseModels.NM_SC;
        if (pairArr3 != null && (length2 = pairArr3.length) != 0) {
            sb.append("\n\nArray length = ");
            sb.append(length2);
            sb.append("\n\n");
            int i4 = 0;
            while (i4 < length2) {
                sb.append(pairArr3[i4]);
                i4++;
                if (i4 >= length2) {
                    break;
                } else {
                    sb.append("\n");
                }
            }
        }
        sb.append("\n\nSecond Pair values:- \n\n");
        int i5 = 0;
        while (i5 < 4) {
            sb.append(pairArr[i5].second);
            i5++;
            if (i5 >= 4) {
                break;
            } else {
                sb.append("\n");
            }
        }
        Pair[] pairArr4 = NoiseModels.NM_OFF;
        if (pairArr4 != null && (length = pairArr4.length) != 0) {
            sb.append("\n\nArray length = ");
            sb.append(length);
            sb.append("\n\n");
            int i6 = 0;
            while (i6 < length) {
                sb.append(pairArr4[i6]);
                i6++;
                if (i6 >= length) {
                    break;
                } else {
                    sb.append("\n");
                }
            }
        }
        sb.append("\n\n");
        sb.append("Working ISO:- ");
        sb.append(GetISO);
        LogWriteToFile(LensValue.SetLensValueLog("NOISE_MODELER"), sb.toString());
    }

    public static int getUpscale() {
        return Pref.MenuValue(LensValue.SetLensValue("pref_upscale_key"));
    }

    public static int getValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        boolean zContains = PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str);
        return zContains ? Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null)) : zContains ? 1 : 0;
    }

    public static int getizoom() {
        String str;
        if (Pref.MenuValue("pref_frontcam_value_restart_key") == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                    str = "pref_izoom_key_main";
                    break;
                case 1:
                    str = "pref_izoom_key_tele";
                    break;
                case 2:
                    str = "pref_izoom_key_wide";
                    break;
                case 3:
                    str = "pref_izoom_key_id4";
                    break;
                case 4:
                    str = "pref_izoom_key_id5";
                    break;
                default:
                    str = "pref_izoom_key_main";
                    break;
            }
        } else {
            str = "pref_izoom_key_front";
        }
        return Pref.MenuValue(str);
    }

    public static float getizoomv(int i) {
        switch (i) {
            case 0:
            default:
                return 2.0f;
            case 1:
                return 1.09375f;
            case 2:
                return 1.1953125f;
            case 3:
                return 1.296875f;
            case 4:
                return 1.3984375f;
            case 5:
                return 1.5f;
            case 6:
                return 1.59375f;
            case 7:
                return 1.6953125f;
            case 8:
                return 1.796875f;
            case 9:
                return 1.8984375f;
            case 10:
                return 2.09375f;
            case 11:
                return 2.1875f;
            case 12:
                return 2.296875f;
            case 13:
                return 2.390625f;
            case 14:
                return 2.5f;
            case 15:
                return 2.59375f;
            case 16:
                return 2.6875f;
            case 17:
                return 2.796875f;
            case 18:
                return 2.890625f;
            case 19:
                return 3.0f;
        }
    }

    public static void intentMode(Intent intent) {
        int i = IsMode;
        if (i == 1) {
            intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
            return;
        }
        if (i == 2) {
            intent.setAction("android.media.action.VIDEO_CAMERA");
        } else if (i == 6) {
            intent.setAction("android.media.action.PORTRAIT");
        } else {
            if (i != 12) {
                return;
            }
            intent.setAction("android.media.action.NIGHTSIGHT");
        }
    }

    public static void loadDistances() {
        Application initialApplication = AppGlobals.getInitialApplication();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext());
        if (Pref.MenuValue("pref_macro_ns_key") != 0) {
            DistanceNear = ((Float) pkr.k.n(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
        } else {
            String string = defaultSharedPreferences.getString("pref_mf_near_key", "");
            if (TextUtils.isEmpty(string)) {
                string = "14.29";
            }
            DistanceNear = Float.valueOf(string).floatValue();
        }
        String string2 = defaultSharedPreferences.getString("pref_mf_far_key", "");
        if (TextUtils.isEmpty(string2)) {
            string2 = "1.52";
        }
        DistanceFar = Float.valueOf(string2).floatValue();
        if (Pref.MenuValue("pref_hyperfocal_ns_key") != 0) {
            DistanceInfinity = ((Float) pkr.k.n(CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE)).floatValue();
            return;
        }
        String string3 = defaultSharedPreferences.getString("pref_mf_infinity_key", "");
        if (TextUtils.isEmpty(string3)) {
            string3 = "0.45";
        }
        DistanceInfinity = Float.valueOf(string3).floatValue();
    }

    public static void onRestart() throws InterruptedException {
        if (sHdr_process == 0) {
            Thread.sleep(500L);
            AppGlobals.getInitialApplication();
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent(applicationContext, (Class<?>) CameraActivity.class);
            intent.addFlags(32768);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            GetEachModeIndividually(intent);
            applicationContext.startActivity(intent);
            System.exit(0);
        }
        Toast(R.string.hsl_hdrprocess);
    }

    public static void sHdrProcessTime(int i) {
        if (i == 1) {
            if (sHdrProcessTime == 0) {
                sHdrProcessTime = SystemClock.elapsedRealtime();
            }
        } else {
            SystemClock.elapsedRealtime();
            sHdrProcessTime = 0L;
            HDRProgress.updateProgress(0.0f);
        }
    }

    public static float setAperture() {
        return Pref.MenuValue("pref_aperture_key") == 0 ? 1.5f : 2.4f;
    }

    public static void setColorTransform() {
        String str;
        sColorTransformFront = Pref.MenuValue("pref_color_transform_key_front");
        switch (Pref.sAuxKey) {
            case 0:
                str = "pref_color_transform_key";
                break;
            case 1:
                str = "pref_color_transform_key_2";
                break;
            case 2:
                str = "pref_color_transform_key_3";
                break;
            case 3:
                str = "pref_color_transform_key_4";
                break;
            case 4:
                str = "pref_color_transform_key_5";
                break;
            default:
                str = "pref_color_transform_key";
                break;
        }
        sColorTransform = Pref.MenuValue(str);
    }

    public static void setKeyOnStart() {
        getVFDenoise = Pref.MenuValue("pref_cam2api_nr_vf_mode_key");
        GeometricCalibration = Pref.MenuValue("pref_camera_lightroom_key");
        getSunlightFix = Pref.MenuValue(LensValue.SetLensValue("pref_sunlight_key"));
        sAutoNS = Pref.MenuValue("pref_auto_ns_key");
    }

    public static void setMVresolution() {
        switch (Pref.MenuValue("pref_mv_key")) {
            case 0:
                mv_w = 640;
                mv_h = 480;
                break;
            case 1:
                mv_w = 1280;
                mv_h = 720;
                break;
            case 2:
                mv_w = 1920;
                mv_h = 1080;
                break;
            case 3:
                mv_w = 3840;
                mv_h = 2160;
                break;
            default:
                mv_w = 640;
                mv_h = 480;
                break;
        }
    }

    public static void setMenuValue(String str, String str2) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(str2)).apply();
    }

    public static int setSabre(int i) {
        String str;
        if (sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                    str = "pref_sabre_key_main";
                    break;
                case 1:
                    str = "pref_sabre_key_tele";
                    break;
                case 2:
                    str = "pref_sabre_key_wide";
                    break;
                case 3:
                    str = "pref_sabre_key_id4";
                    break;
                case 4:
                    str = "pref_sabre_key_id5";
                    break;
                default:
                    str = "pref_sabre_key_main";
                    break;
            }
        } else {
            str = "pref_sabre_key_front";
        }
        int iMenuValue = Pref.MenuValue(str);
        return iMenuValue >= 0 ? iMenuValue : i;
    }

    public static void setValue(String str, int i) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(i)).apply();
    }

    public static void showT(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    public void OpenPreference0(String str) {
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) CameraSettingsActivity.class);
        intent.putExtra("pref_open_setting_page", str);
        intent.addFlags(268435456);
        applicationContext.startActivity(intent);
    }
}
