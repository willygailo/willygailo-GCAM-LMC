package com.awb;

import android.os.Environment;
import com.Fix.Pref;
import com.SDE.LensValue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class Internal {
    public static float[] BG() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(GetAbsoluteFile().getAbsolutePath())));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("BG")) {
                    str = line;
                }
            }
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group().trim());
            }
            int size = arrayList.size();
            float[] fArr = new float[size];
            for (int i = 0; i < size; i++) {
                fArr[i] = Float.parseFloat((String) arrayList.get(i));
            }
            return fArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new float[0];
        }
    }

    public static float[] BGRG() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(GetAbsoluteFile().getAbsolutePath())));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("BGRG")) {
                    str = line;
                }
            }
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group().trim());
            }
            int size = arrayList.size();
            float[] fArr = new float[size];
            for (int i = 0; i < size; i++) {
                fArr[i] = Float.parseFloat((String) arrayList.get(i));
            }
            return fArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new float[0];
        }
    }

    public static File GetAbsoluteFile() {
        return new File(Environment.getExternalStorageDirectory(), "/LMC8.4/AWB/" + Pref.getStringValue(LensValue.SetLensValue1("pref_load_awb_key")));
    }

    public static float[] RG() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(GetAbsoluteFile().getAbsolutePath())));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("RG")) {
                    str = line;
                }
            }
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group().trim());
            }
            int size = arrayList.size();
            float[] fArr = new float[size];
            for (int i = 0; i < size; i++) {
                fArr[i] = Float.parseFloat((String) arrayList.get(i));
            }
            return fArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new float[0];
        }
    }
}
