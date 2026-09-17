package com.hdrindicator;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public class DisplayHelper {
    private static final String TAG = "Devices";
    public static final float DENSITY = Resources.getSystem().getDisplayMetrics().density;
    public static float sDensity = 0.0f;
    private static Boolean sHasCamera = null;

    public static void cancelFullScreen(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags &= -1025;
            activity.getWindow().setAttributes(attributes);
            activity.getWindow().addFlags(512);
        }
    }

    public static int dp2px(Context context, int i) {
        return (int) (((double) (getDensity(context) * i)) + 0.5d);
    }

    public static int dpToPx(int i) {
        return (int) ((i * DENSITY) + 0.5f);
    }

    public static int getActionBarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static String getCurCountryLan(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage() + "-" + context.getResources().getConfiguration().locale.getCountry();
    }

    public static float getDensity(Context context) {
        if (sDensity == 0.0f) {
            sDensity = getDisplayMetrics(context).density;
        }
        return sDensity;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int getNavMenuHeight(Context context) {
        return getRealScreenSize(context)[1] - getScreenHeight(context);
    }

    public static int[] getRealScreenSize(Context context) {
        int[] iArr = new int[2];
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int iIntValue = displayMetrics.widthPixels;
        int iIntValue2 = displayMetrics.heightPixels;
        try {
            iIntValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            iIntValue2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
        } catch (Exception e) {
        }
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            iIntValue = point.x;
            iIntValue2 = point.y;
        } catch (Exception e2) {
        }
        iArr[0] = iIntValue;
        iArr[1] = iIntValue2;
        return iArr;
    }

    public static int getScreenHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static final boolean hasCamera(Context context) {
        if (sHasCamera == null) {
            PackageManager packageManager = context.getPackageManager();
            sHasCamera = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.camera.front") || packageManager.hasSystemFeature("android.hardware.camera"));
        }
        return sHasCamera.booleanValue();
    }

    public static boolean hasHardwareMenuKey(Context context) {
        if (Build.VERSION.SDK_INT < 11) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        return false;
    }

    public static boolean hasStatusBar(Context context) {
        return ((context instanceof Activity) && (((Activity) context).getWindow().getAttributes().flags & 1024) == 1024) ? false : true;
    }

    public static boolean isElevationSupported() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean isFullScreen(Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024;
    }

    public static boolean isPackageExist(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    public static boolean isSdcardReady() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean isZhCN(Context context) {
        return context.getResources().getConfiguration().locale.getCountry().equalsIgnoreCase("CN");
    }

    public static int px2dp(Context context, int i) {
        return (int) (((double) (i / getDensity(context))) + 0.5d);
    }

    public static int pxToDp(float f) {
        return (int) ((f / DENSITY) + 0.5f);
    }

    public static void setFullScreen(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags |= 1024;
            activity.getWindow().setAttributes(attributes);
            activity.getWindow().addFlags(512);
        }
    }
}
