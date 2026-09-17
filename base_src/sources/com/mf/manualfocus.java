package com.mf;

import android.util.Log;
import com.Fix.Pref;

/* JADX INFO: loaded from: classes3.dex */
public class manualfocus {
    private static int ISO_RESULT;
    private static float focusDistance;
    private static int focusMode;
    private static int isoVal;
    private static manualfocus manualfocus = new manualfocus();
    private static int ISO_Out = 1;
    private static int ASUSISODIV = 4;
    private static float ISO_to_Gain_Quant = 1.0f;

    public static void calcdist3(int i, float f) {
        focusMode = i;
        if (i == 0) {
            Pref.setMenuValue("pref_af_mode_back", "0");
            Pref.setMenuValue("pref_af_mode_front", "0");
            focusDistance = 1.0E-4f;
        } else {
            Pref.setMenuValue("pref_af_mode_back", "2");
            Pref.setMenuValue("pref_af_mode_front", "2");
            if (i == 1) {
                focusDistance = 0.0f;
            } else {
                focusDistance = f;
            }
        }
        logMSG("SLIDER 1 FOCUS: " + focusDistance);
    }

    public static Float getFocusDistance() {
        return Float.valueOf(focusDistance);
    }

    public static Integer getFocusMode() {
        return Integer.valueOf(focusMode);
    }

    public static int getFocusValue() {
        return focusMode == 0 ? 5 : 0;
    }

    public static int getISO_Out() {
        return Math.round(ISO_Out * 1.1f);
    }

    public static manualfocus getInstance() {
        return manualfocus;
    }

    public static void logMSG(String str) {
        Log.i("DeezNuts", "MSG: " + str);
    }

    public static void setISOResult(Integer num) {
        Log.d("Deez IN ISO", String.valueOf(num));
        ISO_RESULT = num.intValue();
    }
}
