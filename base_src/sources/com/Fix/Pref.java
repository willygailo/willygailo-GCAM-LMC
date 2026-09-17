package com.Fix;

import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class Pref {
    public static SharedPreferences appSharedPreferences;
    public static int sAuxKey;
    public static Resources sResources;

    public Pref() {
        appSharedPreferences = getSharedPreferences();
        int iMenuValue = MenuValue("pref_aux_key");
        sAuxKey = iMenuValue;
        new ColorTransformKeys(iMenuValue);
    }

    public static int MenuValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext());
        if (!defaultSharedPreferences.contains(str)) {
            return 0;
        }
        String string = defaultSharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        return Integer.parseInt(string);
    }

    public static int MenuValue(String str, int i) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (!sharedPreferences.contains(str)) {
            return i;
        }
        String string = sharedPreferences.getString(str, null);
        return !TextUtils.isEmpty(string) ? Integer.parseInt(string) : i;
    }

    public static int MenuValue1(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        boolean zContains = PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str);
        return zContains ? Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null)) : zContains ? 1 : 0;
    }

    public static String MenuValueString(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        boolean zContains = PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str);
        return zContains ? PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null) : Integer.toString(zContains ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public static double getDoubleValue(String str) {
        String string;
        Application initialApplication = AppGlobals.getInitialApplication();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext());
        if (defaultSharedPreferences.contains(str)) {
            string = defaultSharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                string = "0";
            }
        } else {
            string = "0";
        }
        return Double.parseDouble(string);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public static float getFloatValue(String str) {
        String string;
        Application initialApplication = AppGlobals.getInitialApplication();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext());
        if (defaultSharedPreferences.contains(str)) {
            string = defaultSharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                string = "0";
            }
        } else {
            string = "0";
        }
        return Float.parseFloat(string);
    }

    public static String getModel(String str) {
        SharedPreferences sharedPreferences = appSharedPreferences;
        return sharedPreferences.contains(str) ? sharedPreferences.getString(str, null) : "crosshatch";
    }

    public static SharedPreferences getSharedPreferences() {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        sResources = applicationContext.getResources();
        return PreferenceManager.getDefaultSharedPreferences(applicationContext);
    }

    public static SharedPreferences getSharedPreferences1() {
        Application initialApplication = AppGlobals.getInitialApplication();
        return PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext());
    }

    public static String getStringValue(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        return PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(str) ? PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(str, null) : "0";
    }

    public static void setMenuValue(String str, int i) {
        getSharedPreferences().edit().putString(str, String.valueOf(i)).apply();
    }

    public static void setMenuValue(String str, String str2) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(str2)).apply();
    }

    public static void setValue(String str, int i) {
        Application initialApplication = AppGlobals.getInitialApplication();
        PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).edit().putString(str, String.valueOf(i)).apply();
    }
}
