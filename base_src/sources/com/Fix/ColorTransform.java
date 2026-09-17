package com.Fix;

import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import com.Helper;
import com.google.googlex.gcam.FloatArray9;
import com.juliantsependa.ColorTune;
import defpackage.lzv;

/* JADX INFO: loaded from: classes2.dex */
public class ColorTransform {
    public static float[] Arnova(lzv lzvVar) {
        int iIntValue = ((Integer) lzvVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        float[] fArr = {1.53125f, -0.49609375f, -0.0390625f, -0.1640625f, 1.328125f, -0.1640625f, 0.09375f, -0.4609375f, 1.3671875f};
        if (iIntValue <= 30) {
            // fill-array-data instruction
            fArr[0] = 1.9101562f;
            fArr[1] = -0.84375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.24609375f;
            fArr[6] = 0.0f;
            fArr[7] = -0.8203125f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 40) {
            // fill-array-data instruction
            fArr[0] = 1.9140625f;
            fArr[1] = -0.73828125f;
            fArr[2] = -0.17578125f;
            fArr[3] = -0.3125f;
            fArr[4] = 1.7578125f;
            fArr[5] = -0.4453125f;
            fArr[6] = -0.05859375f;
            fArr[7] = -0.87890625f;
            fArr[8] = 1.9375f;
        } else if (iIntValue <= 50) {
            // fill-array-data instruction
            fArr[0] = 1.9375f;
            fArr[1] = -0.8671875f;
            fArr[2] = -0.0703125f;
            fArr[3] = -0.37109375f;
            fArr[4] = 1.6523438f;
            fArr[5] = -0.28125f;
            fArr[6] = -0.01953125f;
            fArr[7] = -0.8984375f;
            fArr[8] = 1.9179688f;
        } else if (iIntValue <= 60) {
            // fill-array-data instruction
            fArr[0] = 1.9257812f;
            fArr[1] = -0.859375f;
            fArr[2] = -0.0703125f;
            fArr[3] = -0.35546875f;
            fArr[4] = 1.609375f;
            fArr[5] = -0.25390625f;
            fArr[6] = -0.0078125f;
            fArr[7] = -0.84765625f;
            fArr[8] = 1.8554688f;
        } else if (iIntValue <= 70) {
            // fill-array-data instruction
            fArr[0] = 1.9257812f;
            fArr[1] = -0.85546875f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.5859375f;
            fArr[5] = -0.23828125f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8164062f;
        } else if (iIntValue <= 90) {
            // fill-array-data instruction
            fArr[0] = 1.921875f;
            fArr[1] = -0.85546875f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.5859375f;
            fArr[5] = -0.23828125f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8164062f;
        } else if (iIntValue <= 160) {
            // fill-array-data instruction
            fArr[0] = 1.9140625f;
            fArr[1] = -0.84765625f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 200) {
            // fill-array-data instruction
            fArr[0] = 1.9140625f;
            fArr[1] = -0.84375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 310) {
            // fill-array-data instruction
            fArr[0] = 1.9140625f;
            fArr[1] = -0.84765625f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 520) {
            // fill-array-data instruction
            fArr[0] = 1.9140625f;
            fArr[1] = -0.84765625f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.5859375f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8164062f;
        } else if (iIntValue <= 720) {
            // fill-array-data instruction
            fArr[0] = 1.9179688f;
            fArr[1] = -0.8515625f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.5859375f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.0f;
            fArr[7] = -0.81640625f;
            fArr[8] = 1.8164062f;
        } else if (iIntValue <= 820) {
            // fill-array-data instruction
            fArr[0] = 1.90625f;
            fArr[1] = -0.83984375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.24609375f;
            fArr[6] = 0.0f;
            fArr[7] = -0.8203125f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 920) {
            // fill-array-data instruction
            fArr[0] = 1.859375f;
            fArr[1] = -0.75f;
            fArr[2] = -0.109375f;
            fArr[3] = -0.3125f;
            fArr[4] = 1.6328125f;
            fArr[5] = -0.3203125f;
            fArr[6] = -0.01171875f;
            fArr[7] = -0.80078125f;
            fArr[8] = 1.8125f;
        } else if (iIntValue <= 1020) {
            // fill-array-data instruction
            fArr[0] = 1.8984375f;
            fArr[1] = -0.82421875f;
            fArr[2] = -0.0703125f;
            fArr[3] = -0.33984375f;
            fArr[4] = 1.5976562f;
            fArr[5] = -0.2578125f;
            fArr[6] = -0.00390625f;
            fArr[7] = -0.8203125f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 1120) {
            // fill-array-data instruction
            fArr[0] = 1.8164062f;
            fArr[1] = -0.6484375f;
            fArr[2] = -0.171875f;
            fArr[3] = -0.26953125f;
            fArr[4] = 1.6914062f;
            fArr[5] = -0.421875f;
            fArr[6] = -0.03125f;
            fArr[7] = -0.78125f;
            fArr[8] = 1.8125f;
        } else if (iIntValue <= 1220) {
            // fill-array-data instruction
            fArr[0] = 1.9101562f;
            fArr[1] = -0.83984375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.6015625f;
            fArr[5] = -0.25390625f;
            fArr[6] = -0.00390625f;
            fArr[7] = -0.83203125f;
            fArr[8] = 1.8359375f;
        } else if (iIntValue <= 1520) {
            // fill-array-data instruction
            fArr[0] = 1.9101562f;
            fArr[1] = -0.83984375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.5976562f;
            fArr[5] = -0.25f;
            fArr[6] = -0.00390625f;
            fArr[7] = -0.83203125f;
            fArr[8] = 1.8320312f;
        } else if (iIntValue <= 1720) {
            // fill-array-data instruction
            fArr[0] = 1.90625f;
            fArr[1] = -0.83984375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.5976562f;
            fArr[5] = -0.25f;
            fArr[6] = -0.00390625f;
            fArr[7] = -0.828125f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 2020) {
            // fill-array-data instruction
            fArr[0] = 1.9101562f;
            fArr[1] = -0.83984375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34765625f;
            fArr[4] = 1.59375f;
            fArr[5] = -0.25f;
            fArr[6] = 0.0f;
            fArr[7] = -0.82421875f;
            fArr[8] = 1.8242188f;
        } else if (iIntValue <= 2220) {
            // fill-array-data instruction
            fArr[0] = 1.9101562f;
            fArr[1] = -0.84375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.24609375f;
            fArr[6] = 0.0f;
            fArr[7] = -0.8203125f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 2420) {
            // fill-array-data instruction
            fArr[0] = 1.9101562f;
            fArr[1] = -0.84375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.34375f;
            fArr[4] = 1.5898438f;
            fArr[5] = -0.24609375f;
            fArr[6] = 0.0f;
            fArr[7] = -0.8203125f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 2720) {
            // fill-array-data instruction
            fArr[0] = 1.9023438f;
            fArr[1] = -0.83203125f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.33984375f;
            fArr[4] = 1.5820312f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.0f;
            fArr[7] = -0.80859375f;
            fArr[8] = 1.8085938f;
        } else if (iIntValue <= 3020) {
            // fill-array-data instruction
            fArr[0] = 1.8984375f;
            fArr[1] = -0.83203125f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.33984375f;
            fArr[4] = 1.5820312f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.00390625f;
            fArr[7] = -0.8046875f;
            fArr[8] = 1.8046875f;
        } else if (iIntValue <= 3320) {
            // fill-array-data instruction
            fArr[0] = 1.890625f;
            fArr[1] = -0.82421875f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.3359375f;
            fArr[4] = 1.5742188f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.00390625f;
            fArr[7] = -0.80078125f;
            fArr[8] = 1.796875f;
        } else if (iIntValue <= 3620) {
            // fill-array-data instruction
            fArr[0] = 1.8867188f;
            fArr[1] = -0.8203125f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.33203125f;
            fArr[4] = 1.5742188f;
            fArr[5] = -0.23828125f;
            fArr[6] = 0.00390625f;
            fArr[7] = -0.796875f;
            fArr[8] = 1.7890625f;
        } else if (iIntValue <= 3920) {
            // fill-array-data instruction
            fArr[0] = 1.8867188f;
            fArr[1] = -0.8203125f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.33203125f;
            fArr[4] = 1.5742188f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.00390625f;
            fArr[7] = -0.796875f;
            fArr[8] = 1.7929688f;
        } else if (iIntValue <= 4420) {
            // fill-array-data instruction
            fArr[0] = 1.8710938f;
            fArr[1] = -0.80859375f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.328125f;
            fArr[4] = 1.5664062f;
            fArr[5] = -0.23828125f;
            fArr[6] = 0.0078125f;
            fArr[7] = -0.78515625f;
            fArr[8] = 1.7773438f;
        } else if (iIntValue <= 4520) {
            // fill-array-data instruction
            fArr[0] = 1.8671875f;
            fArr[1] = -0.8046875f;
            fArr[2] = -0.06640625f;
            fArr[3] = -0.328125f;
            fArr[4] = 1.5664062f;
            fArr[5] = -0.23828125f;
            fArr[6] = 0.0078125f;
            fArr[7] = -0.78515625f;
            fArr[8] = 1.7773438f;
        } else if (iIntValue <= 5020) {
            // fill-array-data instruction
            fArr[0] = 1.859375f;
            fArr[1] = -0.796875f;
            fArr[2] = -0.0625f;
            fArr[3] = -0.32421875f;
            fArr[4] = 1.5625f;
            fArr[5] = -0.23828125f;
            fArr[6] = 0.0078125f;
            fArr[7] = -0.78125f;
            fArr[8] = 1.7695312f;
        } else if (iIntValue <= 6020) {
            // fill-array-data instruction
            fArr[0] = 1.84375f;
            fArr[1] = -0.78125f;
            fArr[2] = -0.0625f;
            fArr[3] = -0.3203125f;
            fArr[4] = 1.5585938f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.01171875f;
            fArr[7] = -0.7734375f;
            fArr[8] = 1.7617188f;
        } else if (iIntValue <= 7020) {
            // fill-array-data instruction
            fArr[0] = 1.8359375f;
            fArr[1] = -0.7734375f;
            fArr[2] = -0.0625f;
            fArr[3] = -0.31640625f;
            fArr[4] = 1.5585938f;
            fArr[5] = -0.2421875f;
            fArr[6] = 0.01171875f;
            fArr[7] = -0.76953125f;
            fArr[8] = 1.7539062f;
        } else if (iIntValue <= 8020) {
            // fill-array-data instruction
            fArr[0] = 1.78125f;
            fArr[1] = -0.71875f;
            fArr[2] = -0.0625f;
            fArr[3] = -0.30078125f;
            fArr[4] = 1.5507812f;
            fArr[5] = -0.25f;
            fArr[6] = 0.01953125f;
            fArr[7] = -0.75f;
            fArr[8] = 1.7304688f;
        } else if (iIntValue <= 9020) {
            // fill-array-data instruction
            fArr[0] = 1.8203125f;
            fArr[1] = -0.7578125f;
            fArr[2] = -0.0625f;
            fArr[3] = -0.3125f;
            fArr[4] = 1.5546875f;
            fArr[5] = -0.24609375f;
            fArr[6] = 0.015625f;
            fArr[7] = -0.765625f;
            fArr[8] = 1.75f;
        } else if (iIntValue <= 10020) {
            // fill-array-data instruction
            fArr[0] = 1.75f;
            fArr[1] = -0.69140625f;
            fArr[2] = -0.05859375f;
            fArr[3] = -0.2890625f;
            fArr[4] = 1.546875f;
            fArr[5] = -0.2578125f;
            fArr[6] = 0.0234375f;
            fArr[7] = -0.7421875f;
            fArr[8] = 1.71875f;
        } else if (iIntValue <= 10520) {
            // fill-array-data instruction
            fArr[0] = 1.7382812f;
            fArr[1] = -0.6796875f;
            fArr[2] = -0.05859375f;
            fArr[3] = -0.2890625f;
            fArr[4] = 1.5507812f;
            fArr[5] = -0.26171875f;
            fArr[6] = 0.0234375f;
            fArr[7] = -0.7421875f;
            fArr[8] = 1.71875f;
        }
        return fArr;
    }

    public static float[] ColorCorrection(float[] fArr) {
        String str;
        String str2;
        String str3;
        if (Helper.sFront == 0) {
            switch (Pref.sAuxKey) {
                case 0:
                    str = "red_key_main";
                    str2 = "green_key_main";
                    str3 = "blue_key_main";
                    break;
                case 1:
                    str = "red_key_tele";
                    str2 = "green_key_tele";
                    str3 = "blue_key_tele";
                    break;
                case 2:
                    str = "red_key_wide";
                    str2 = "green_key_wide";
                    str3 = "blue_key_wide";
                    break;
                case 3:
                    str = "red_key_id4";
                    str2 = "green_key_id4";
                    str3 = "blue_key_id4";
                    break;
                case 4:
                    str = "red_key_id5";
                    str2 = "green_key_id5";
                    str3 = "blue_key_id5";
                    break;
                default:
                    str = "red_key_main";
                    str2 = "green_key_main";
                    str3 = "blue_key_main";
                    break;
            }
        } else {
            str = "red_key_front";
            str2 = "green_key_front";
            str3 = "blue_key_front";
        }
        float floatValue = getFloatValue(str);
        fArr[0] = fArr[0] * floatValue;
        fArr[1] = fArr[1] * floatValue;
        fArr[2] = fArr[2] * floatValue;
        float floatValue2 = getFloatValue(str2);
        fArr[3] = fArr[3] * floatValue2;
        fArr[4] = fArr[4] * floatValue2;
        fArr[5] = fArr[5] * floatValue2;
        float floatValue3 = getFloatValue(str3);
        fArr[6] = fArr[6] * floatValue3;
        fArr[7] = fArr[7] * floatValue3;
        fArr[8] = fArr[8] * floatValue3;
        return fArr;
    }

    public static FloatArray9 Convert(float[] fArr, FloatArray9 floatArray9) {
        floatArray9.b(0, fArr[0]);
        floatArray9.b(1, fArr[1]);
        floatArray9.b(2, fArr[2]);
        floatArray9.b(3, fArr[3]);
        floatArray9.b(4, fArr[4]);
        floatArray9.b(5, fArr[5]);
        floatArray9.b(6, fArr[6]);
        floatArray9.b(7, fArr[7]);
        floatArray9.b(8, fArr[8]);
        return floatArray9;
    }

    public static float[] CustomColorTransform() {
        String[] strArr = Helper.sFront != 0 ? ColorTransformKeys.keys_camera_front : ColorTransformKeys.keys_camera_back;
        SharedPreferences sharedPreferences = Pref.appSharedPreferences;
        float[] fArr = new float[9];
        int i = 8;
        do {
            String str = strArr[i];
            fArr[i] = Float.parseFloat(sharedPreferences.contains(str) ? sharedPreferences.getString(str, null) : "0");
            i--;
        } while (i >= 0);
        return fArr;
    }

    public static float getFloatValue(String str) {
        SharedPreferences sharedPreferences = Pref.appSharedPreferences;
        if (sharedPreferences == null) {
            sharedPreferences = Pref.getSharedPreferences();
            Pref.appSharedPreferences = sharedPreferences;
        }
        return Float.parseFloat(sharedPreferences.contains(str) ? sharedPreferences.getString(str, null) : "1.0");
    }

    public static FloatArray9 getPseudoCT(FloatArray9 floatArray9, lzv lzvVar) {
        float[] fArrCustomColorTransform;
        switch (Helper.sFront != 0 ? Helper.sColorTransformFront : Helper.sColorTransform) {
            case 0:
                fArrCustomColorTransform = ordinary(lzvVar);
                break;
            case 1:
                return floatArray9;
            case 2:
                fArrCustomColorTransform = Arnova(lzvVar);
                break;
            case 3:
                fArrCustomColorTransform = mod_1(lzvVar);
                break;
            case 4:
                fArrCustomColorTransform = new float[]{1.81854f, -0.838371f, 0.0198339f, -0.246695f, 1.57214f, -0.325446f, -0.0111353f, -0.684763f, 1.6959f};
                break;
            case 5:
                fArrCustomColorTransform = new float[]{1.881f, -0.8795f, -0.0015f, -0.2836f, 1.6469f, -0.3633f, -0.0367f, -0.7185f, 1.7552f};
                break;
            case 6:
                fArrCustomColorTransform = new float[]{1.5549506f, -0.47328025f, -0.08167031f, -0.07072529f, 1.2238353f, -0.1531101f, 0.1009724f, -0.77120453f, 1.6702322f};
                break;
            case 7:
                fArrCustomColorTransform = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
                break;
            case 8:
                fArrCustomColorTransform = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                break;
            case 9:
                fArrCustomColorTransform = new float[]{1.6796875f, -0.9375f, 0.238f, -0.1484375f, 1.043f, 0.0859375f, 0.119628906f, -0.9140625f, 1.855f};
                break;
            case 10:
                fArrCustomColorTransform = new float[]{1.2987f, -0.1938f, -0.0977f, -0.2486f, 1.5532f, -0.2974f, -0.05f, -0.3594f, 1.3951f};
                break;
            case 11:
                fArrCustomColorTransform = new float[]{1.812599f, -0.867188f, 0.054688f, -0.226562f, 1.328125f, -0.101562f, -0.0625f, -0.546875f, 1.617188f};
                break;
            case 12:
                fArrCustomColorTransform = new float[]{1.75f, -0.828125f, 0.078125f, -0.1875f, 1.265625f, -0.070312f, -0.039062f, -0.523438f, 1.5625f};
                break;
            case 13:
                fArrCustomColorTransform = new float[]{1.6796875f, -0.9375f, 0.238f, -0.1484375f, 1.043f, 0.0859375f, 0.119628906f, -0.9140625f, 1.81f};
                break;
            case 14:
                fArrCustomColorTransform = new float[]{1.609375f, -0.609375f, 0.007812f, -0.132812f, 1.320312f, -0.1875f, -0.007812f, -0.648438f, 1.664062f};
                break;
            case 15:
                fArrCustomColorTransform = new float[]{1.59375f, -0.632812f, 0.039062f, -0.195312f, 1.304688f, -0.101562f, 0.054688f, -0.671875f, 1.617188f};
                break;
            case 16:
                fArrCustomColorTransform = CustomColorTransform();
                break;
            default:
                fArrCustomColorTransform = ordinary(lzvVar);
                break;
        }
        return Convert(ColorTune.ColorMod1(ColorCorrection(fArrCustomColorTransform)), floatArray9);
    }

    public static float[] mod_1(lzv lzvVar) {
        int iIntValue = ((Integer) lzvVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        float[] fArr = {1.6796875f, -0.9453125f, 0.2578125f, -0.1484375f, 1.0625f, 0.0859375f, 0.10986328f, -0.921875f, 1.828125f};
        if (iIntValue <= 70) {
            // fill-array-data instruction
            fArr[0] = 1.6796875f;
            fArr[1] = -0.9375f;
            fArr[2] = 0.2578125f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.119628906f;
            fArr[7] = -0.9140625f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 120) {
            // fill-array-data instruction
            fArr[0] = 1.6796875f;
            fArr[1] = -0.9375f;
            fArr[2] = 0.2578125f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.114746094f;
            fArr[7] = -0.921875f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 220) {
            // fill-array-data instruction
            fArr[0] = 1.671875f;
            fArr[1] = -0.921875f;
            fArr[2] = 0.25f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0703125f;
            fArr[5] = 0.078125f;
            fArr[6] = 0.10986328f;
            fArr[7] = -0.90625f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 420) {
            // fill-array-data instruction
            fArr[0] = 1.6328125f;
            fArr[1] = -0.7890625f;
            fArr[2] = 0.15625f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.1484375f;
            fArr[5] = 0.0078125f;
            fArr[6] = 0.099609375f;
            fArr[7] = -0.828125f;
            fArr[8] = 1.75f;
        } else if (iIntValue <= 820) {
            // fill-array-data instruction
            fArr[0] = 1.65625f;
            fArr[1] = -0.859375f;
            fArr[2] = 0.203125f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.109375f;
            fArr[5] = 0.046875f;
            fArr[6] = 0.1015625f;
            fArr[7] = -0.8671875f;
            fArr[8] = 1.7890625f;
        } else if (iIntValue <= 1220) {
            // fill-array-data instruction
            fArr[0] = 1.6484375f;
            fArr[1] = -0.84375f;
            fArr[2] = 0.1953125f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.125f;
            fArr[5] = 0.03125f;
            fArr[6] = 0.09765625f;
            fArr[7] = -0.859375f;
            fArr[8] = 1.7734375f;
        } else if (iIntValue <= 1620) {
            // fill-array-data instruction
            fArr[0] = 1.640625f;
            fArr[1] = -0.8203125f;
            fArr[2] = 0.1796875f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.140625f;
            fArr[5] = 0.0234375f;
            fArr[6] = 0.09765625f;
            fArr[7] = -0.84375f;
            fArr[8] = 1.765625f;
        } else if (iIntValue <= 2220) {
            // fill-array-data instruction
            fArr[0] = 1.6796875f;
            fArr[1] = -0.9375f;
            fArr[2] = 0.2578125f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.10986328f;
            fArr[7] = -0.9140625f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 3170) {
            // fill-array-data instruction
            fArr[0] = 1.671875f;
            fArr[1] = -0.921875f;
            fArr[2] = 0.25f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.10986328f;
            fArr[7] = -0.9140625f;
            fArr[8] = 1.8203125f;
        }
        return fArr;
    }

    public static float[] ordinary(lzv lzvVar) {
        int iIntValue = ((Integer) lzvVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        float[] fArr = {1.6796875f, -0.9453125f, 0.2578125f, -0.1484375f, 1.0625f, 0.0859375f, 0.09375f, -0.921875f, 1.828125f};
        if (iIntValue <= 70) {
            // fill-array-data instruction
            fArr[0] = 1.6796875f;
            fArr[1] = -0.9375f;
            fArr[2] = 0.2578125f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.09375f;
            fArr[7] = -0.9140625f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 120) {
            // fill-array-data instruction
            fArr[0] = 1.6796875f;
            fArr[1] = -0.9375f;
            fArr[2] = 0.2578125f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.09375f;
            fArr[7] = -0.921875f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 220) {
            // fill-array-data instruction
            fArr[0] = 1.671875f;
            fArr[1] = -0.921875f;
            fArr[2] = 0.25f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0703125f;
            fArr[5] = 0.078125f;
            fArr[6] = 0.09375f;
            fArr[7] = -0.90625f;
            fArr[8] = 1.8203125f;
        } else if (iIntValue <= 420) {
            // fill-array-data instruction
            fArr[0] = 1.6328125f;
            fArr[1] = -0.7890625f;
            fArr[2] = 0.15625f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.1484375f;
            fArr[5] = 0.0078125f;
            fArr[6] = 0.078125f;
            fArr[7] = -0.828125f;
            fArr[8] = 1.75f;
        } else if (iIntValue <= 820) {
            // fill-array-data instruction
            fArr[0] = 1.65625f;
            fArr[1] = -0.859375f;
            fArr[2] = 0.203125f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.109375f;
            fArr[5] = 0.046875f;
            fArr[6] = 0.0859375f;
            fArr[7] = -0.8671875f;
            fArr[8] = 1.7890625f;
        } else if (iIntValue <= 1220) {
            // fill-array-data instruction
            fArr[0] = 1.6484375f;
            fArr[1] = -0.84375f;
            fArr[2] = 0.1953125f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.125f;
            fArr[5] = 0.03125f;
            fArr[6] = 0.078125f;
            fArr[7] = -0.859375f;
            fArr[8] = 1.7734375f;
        } else if (iIntValue <= 1620) {
            // fill-array-data instruction
            fArr[0] = 1.640625f;
            fArr[1] = -0.8203125f;
            fArr[2] = 0.1796875f;
            fArr[3] = -0.15625f;
            fArr[4] = 1.140625f;
            fArr[5] = 0.0234375f;
            fArr[6] = 0.078125f;
            fArr[7] = -0.84375f;
            fArr[8] = 1.765625f;
        } else if (iIntValue <= 2220) {
            // fill-array-data instruction
            fArr[0] = 1.6796875f;
            fArr[1] = -0.9375f;
            fArr[2] = 0.2578125f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.09375f;
            fArr[7] = -0.9140625f;
            fArr[8] = 1.828125f;
        } else if (iIntValue <= 3170) {
            // fill-array-data instruction
            fArr[0] = 1.671875f;
            fArr[1] = -0.921875f;
            fArr[2] = 0.25f;
            fArr[3] = -0.1484375f;
            fArr[4] = 1.0625f;
            fArr[5] = 0.0859375f;
            fArr[6] = 0.09375f;
            fArr[7] = -0.9140625f;
            fArr[8] = 1.8203125f;
        }
        return fArr;
    }
}
