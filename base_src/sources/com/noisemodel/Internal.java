package com.noisemodel;

import android.os.Environment;
import android.util.Pair;
import com.Fix.Pref;
import com.SDE.LensValue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class Internal {
    public static Pair[] FirstPair() {
        List listGetValuesAndMakeList = GetValuesAndMakeList();
        return new Pair[]{new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(0))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(4)))), new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(1))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(5)))), new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(2))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(6)))), new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(3))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(7))))};
    }

    public static File GetAbsoluteFile() {
        return new File(Environment.getExternalStorageDirectory(), "/LMC8.4/NOISE MODELER/" + Pref.getStringValue(LensValue.SetLensValue1("pref_load_noise_model_key")));
    }

    public static List GetValuesAndMakeList() {
        ArrayList arrayList = new ArrayList();
        String str = "";
        String str2 = "";
        String strGroup = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(GetAbsoluteFile().getAbsolutePath())));
            String str3 = "";
            String str4 = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("static double noise_model_A")) {
                    str = line;
                } else if (line.contains("static double noise_model_B")) {
                    str3 = line;
                } else if (line.contains("static double noise_model_C")) {
                    str2 = line;
                } else if (line.contains("static double noise_model_D")) {
                    str4 = line;
                }
            }
            Matcher matcher = Pattern.compile("[{](.*)[}]").matcher("".concat(str.concat(str3.concat(str2.concat(str4)))));
            while (matcher.find()) {
                strGroup = matcher.group();
            }
            Matcher matcher2 = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?").matcher(strGroup);
            while (matcher2.find()) {
                arrayList.add(matcher2.group().trim());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static Pair[] SecondPair() {
        List listGetValuesAndMakeList = GetValuesAndMakeList();
        return new Pair[]{new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(8))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(12)))), new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(9))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(13)))), new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(10))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(14)))), new Pair(Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(11))), Double.valueOf(Double.parseDouble((String) listGetValuesAndMakeList.get(15))))};
    }
}
