package com.SDE;

import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class GetMenuValues {
    public static Context appContext;

    public GetMenuValues() {
        appContext = getAppContext();
    }

    public static Context getAppContext() {
        Application initialApplication = AppGlobals.getInitialApplication();
        return initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
    }

    public static Double getDouble(String str) {
        return Double.valueOf(getString(str));
    }

    public static double getDoubleValue(String str) {
        return Double.parseDouble(getString(str));
    }

    public static Float getFloat(String str) {
        return Float.valueOf(getString(str));
    }

    public static float getFloatValue(String str) {
        return Float.parseFloat(getString(str));
    }

    public static int getHexIntValue(String str) {
        return Integer.parseInt(getString(str), 16);
    }

    public static long getHexLongValue(String str) {
        return Long.parseLong(getString(str), 16);
    }

    public static int getIntValue(String str) {
        return Integer.parseInt(getString(str));
    }

    public static Integer getInteger(String str) {
        return Integer.valueOf(getString(str));
    }

    public static Long getLong(String str) {
        return Long.valueOf(getString(str));
    }

    public static long getLongValue(String str) {
        return Long.parseLong(getString(str));
    }

    public static String getString(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        return PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str) ? PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null) : "0";
    }
}
