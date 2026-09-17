package com;

import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import com.Fix.Pref;
import defpackage.dep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class eszdman {
    private static String TAG = "CameraManager2";
    public static eszdman cameraManager2;
    public final SharedPreferences SharedPreferences;
    private Set<String> mCameraIDs;

    public eszdman(CameraManager cameraManager) {
        cameraManager2 = this;
        this.mCameraIDs = new HashSet();
        SharedPreferences sharedPreferences = dep.d.b;
        this.SharedPreferences = sharedPreferences;
        if (get("pref_enable_camera_key") != 0) {
            this.mCameraIDs = sharedPreferences.getStringSet("pref_list_camera_key", null);
        } else {
            getCameraId(cameraManager);
            save();
        }
    }

    private boolean checkCaps(String str, ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean getBit(int i, int i2) {
        return ((i2 >> (i + (-1))) & 1) == 1;
    }

    private void getCameraId(CameraManager cameraManager) {
        ArrayList<String> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 121; i++) {
            arrayList.add(String.valueOf(i));
        }
        try {
            for (String str : arrayList) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    if (cameraCharacteristics != null) {
                        int i2 = Integer.parseInt(str);
                        Log.d(TAG, "Number:" + str + " bit 4:" + getBit(4, i2) + " bit 5:" + getBit(5, i2) + " bit 6:" + getBit(6, i2) + " bit 7:" + getBit(7, i2) + " bit 8:" + getBit(8, i2));
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.valueOf(((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0]));
                        sb.append(String.valueOf(((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES))[0]));
                        if (i2 <= 2) {
                            sb.append(str);
                        }
                        String string = sb.toString();
                        Log.d(TAG, "Caps:" + string);
                        if (!getBit(6, i2) && !checkCaps(string, arrayList2)) {
                            arrayList2.add(string);
                            this.mCameraIDs.add(str);
                        }
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
        }
        this.mCameraIDs.toArray();
    }

    private boolean isTwoLens(CameraCharacteristics cameraCharacteristics) {
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        return iIntValue == 0 || iIntValue == 1;
    }

    public void SetList(String str, Set set) {
        SharedPreferences sharedPreferences = this.SharedPreferences;
        if (sharedPreferences.contains(str)) {
            return;
        }
        sharedPreferences.edit().putStringSet(str, set).apply();
    }

    public void SetString(String str, String str2) {
        SharedPreferences sharedPreferences = this.SharedPreferences;
        if (sharedPreferences.contains(str)) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public int get(String str) {
        SharedPreferences sharedPreferences = this.SharedPreferences;
        if (sharedPreferences.contains(str)) {
            return Integer.parseInt(sharedPreferences.getString(str, null));
        }
        return 0;
    }

    public String[] getCameraIdList() {
        Set<String> setManualArray = manualArray();
        int size = setManualArray.size();
        if (size == 0) {
            setManualArray = this.mCameraIDs;
            size = setManualArray.size();
        }
        String[] strArr = (String[]) setManualArray.toArray(new String[size]);
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = String.valueOf(iArr[i2]);
            Log.d(TAG, "GotArray:" + strArr[i2]);
        }
        return strArr;
    }

    Set manualArray() {
        if (Pref.MenuValue("pref_enable_manual_array_key") == 0) {
            return new HashSet();
        }
        String[] strArrSplit = Pref.MenuValueString("pref_manual_array_key").split(",");
        int length = strArrSplit.length;
        HashSet hashSet = new HashSet();
        for (int i = 0; length != i; i++) {
            String str = strArrSplit[i];
            if (!str.isEmpty()) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    void save() {
        SetString("pref_enable_camera_key", "1");
        SetList("pref_list_camera_key", this.mCameraIDs);
    }
}
