package com.hdrindicator;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class AgcUtil {
    static SharedPreferences sharedPreferences;

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float dp2sp(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int getInt(String str, int i) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        return sharedPreferences2 != null ? sharedPreferences2.getInt(str, i) : i;
    }

    public static String getString(String str, String str2) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        return sharedPreferences2 != null ? sharedPreferences2.getString(str, str2) : str2;
    }

    public static void init(Context context) {
        sharedPreferences = context.getSharedPreferences("lmc", 0);
    }

    public static void putInt(String str, int i) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putInt(str, i).apply();
        }
    }

    public static void putString(String str, String str2) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putString(str, str2).apply();
        }
    }

    public static View viewWithMargin(View view, int i, int i2, int i3, int i4) {
        Context context = view.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = dp2px(context, i);
        layoutParams.rightMargin = dp2px(context, i3);
        layoutParams.topMargin = dp2px(context, i2);
        layoutParams.bottomMargin = dp2px(context, i4);
        view.setLayoutParams(layoutParams);
        frameLayout.addView(view);
        return frameLayout;
    }
}
