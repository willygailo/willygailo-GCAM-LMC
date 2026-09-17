package overwhelmer;

import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes2.dex */
public class Menu {
    public String note = "Note by Overwhelmer: use a getValue corresponding with its setValue for best results. Casting them may not work for all data types. For Example a key will give error if it was set as setFloatValue but retrieved with (int)getValue since decimal(.) cannot be parsed into Integer.";

    public static double getDoubleValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str)) {
            return Double.parseDouble(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null));
        }
        return 0.0d;
    }

    public static float getFloatValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str)) {
            return Float.parseFloat(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null));
        }
        return 0.0f;
    }

    public static long getLongValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str)) {
            return Long.parseLong(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null));
        }
        return 0L;
    }

    public static String getStringValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str)) {
            return PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null);
        }
        return null;
    }

    public static String getStringValue(String str, int i) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (applicationContext.getSharedPreferences("settings", 0).contains(str)) {
            return applicationContext.getSharedPreferences("settings", 0).getString(str, "");
        }
        return null;
    }

    public static int getValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str)) {
            return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null));
        }
        return 0;
    }

    public static int getValue(String str, int i) {
        int value = getValue(str);
        return value == 0 ? i : value;
    }

    public static void setDoubleValue(String str, double d) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(d)).apply();
    }

    public static void setFloatValue(String str, float f) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(f)).apply();
    }

    public static void setLongValue(String str, long j) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(j)).apply();
    }

    public static void setStringValue(String str, String str2) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, str2).apply();
    }

    public static void setStringValue(String str, String str2, int i) {
        Application initialApplication = AppGlobals.getInitialApplication();
        initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext().getSharedPreferences("settings", 0).edit().putString(str, str2).apply();
    }

    public static void setValue(String str, int i) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(i)).apply();
    }
}
