package com.settings;

import android.os.Environment;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import com.Fix.FileFilterAwb;
import com.Fix.FileFilterNoise;
import com.Helper;
import com.mycompany.myapp40.MainActivity$100000001;
import defpackage.fcb;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Pref {
    Pref() {
    }

    public static void AddPrefForAwb(fcb fcbVar) {
        File[] fileArrListFiles;
        File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/AWB/");
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(new FileFilterAwb())) == null || 0 >= fileArrListFiles.length) {
            return;
        }
        Arrays.sort(fileArrListFiles, new MainActivity$100000001());
        String[] fileNames1 = getFileNames1(fileArrListFiles);
        String[] fileNames2 = getFileNames1(fileArrListFiles);
        GetListPreference(fcbVar, "Load awb", "pref_load_awb_key_front", fileNames1, fileNames2, "pref_awb_pref_screeen_key_front");
        GetListPreference(fcbVar, "Load awb", "pref_load_awb_key", fileNames1, fileNames2, "pref_awb_pref_screeen_key_main");
        GetListPreference(fcbVar, "Load awb", "pref_load_awb_key_2", fileNames1, fileNames2, "pref_awb_pref_screeen_key_tele");
        GetListPreference(fcbVar, "Load awb", "pref_load_awb_key_3", fileNames1, fileNames2, "pref_awb_pref_screeen_key_wide");
        GetListPreference(fcbVar, "Load awb", "pref_load_awb_key_4", fileNames1, fileNames2, "pref_awb_pref_screeen_key_id4");
        GetListPreference(fcbVar, "Load awb", "pref_load_awb_key_5", fileNames1, fileNames2, "pref_awb_pref_screeen_key_id5");
    }

    public static void AddPrefForNoiseModel(fcb fcbVar) {
        File[] fileArrListFiles;
        File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/NOISE MODELER/");
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(new FileFilterNoise())) == null || 0 >= fileArrListFiles.length) {
            return;
        }
        Arrays.sort(fileArrListFiles, new MainActivity$100000001());
        String[] fileNames1 = getFileNames1(fileArrListFiles);
        String[] fileNames2 = getFileNames1(fileArrListFiles);
        GetListPreference(fcbVar, "Load noise model", "pref_load_noise_model_key_front", fileNames1, fileNames2, "pref_get_noise_model_selection_key_front");
        GetListPreference(fcbVar, "Load noise model", "pref_load_noise_model_key", fileNames1, fileNames2, "pref_get_noise_model_selection_key_main");
        GetListPreference(fcbVar, "Load noise model", "pref_load_noise_model_key_2", fileNames1, fileNames2, "pref_get_noise_model_selection_key_tele");
        GetListPreference(fcbVar, "Load noise model", "pref_load_noise_model_key_3", fileNames1, fileNames2, "pref_get_noise_model_selection_key_wide");
        GetListPreference(fcbVar, "Load noise model", "pref_load_noise_model_key_4", fileNames1, fileNames2, "pref_get_noise_model_selection_key_id4");
        GetListPreference(fcbVar, "Load noise model", "pref_load_noise_model_key_5", fileNames1, fileNames2, "pref_get_noise_model_selection_key_id5");
    }

    public static void AddSettingsPref(fcb fcbVar) {
        AddPrefForNoiseModel(fcbVar);
        AddPrefForAwb(fcbVar);
        getEditTexPreAsSummarry(fcbVar, (PreferenceScreen) fcbVar.findPreference("prefscreen_top"));
    }

    public static void GetListPreference(fcb fcbVar, CharSequence charSequence, String str, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, CharSequence charSequence2) {
        PreferenceGroup preferenceGroup;
        PreferenceScreen preferenceScreen;
        Preference preferenceFindPreference = fcbVar.findPreference(charSequence2);
        boolean z = preferenceFindPreference instanceof PreferenceScreen;
        Object obj = preferenceFindPreference;
        if (z && (preferenceScreen = (PreferenceScreen) preferenceFindPreference) != null) {
            obj = preferenceScreen;
            ListPreference listPreference = new ListPreference(fcbVar.getPreferenceScreen().getContext());
            listPreference.setTitle(charSequence);
            listPreference.setDialogTitle(charSequence);
            listPreference.setKey(str);
            listPreference.setLayoutResource(Helper.GetIdFromResources("preference_with_margin", 1));
            listPreference.setIcon(Helper.GetIdFromResources("quantum_gm_ic_info_outline_black_24", 0));
            listPreference.setSummary("%s");
            listPreference.setEntries(charSequenceArr);
            listPreference.setEntryValues(charSequenceArr2);
            listPreference.setValueIndex(0);
            preferenceScreen.addPreference(listPreference);
            return;
        }
        obj = preferenceScreen;
        if (!(obj instanceof PreferenceGroup) || (preferenceGroup = (PreferenceGroup) obj) == null) {
            return;
        }
        ListPreference listPreference2 = new ListPreference(fcbVar.getPreferenceScreen().getContext());
        listPreference2.setTitle(charSequence);
        listPreference2.setDialogTitle(charSequence);
        listPreference2.setKey(str);
        listPreference2.setLayoutResource(Helper.GetIdFromResources("preference_with_margin", 1));
        listPreference2.setIcon(Helper.GetIdFromResources("quantum_gm_ic_info_outline_black_24", 0));
        listPreference2.setSummary("%s");
        listPreference2.setEntries(charSequenceArr);
        listPreference2.setEntryValues(charSequenceArr2);
        listPreference2.setValueIndex(0);
        preferenceGroup.addPreference(listPreference2);
    }

    public static void getEditTexPreAsSummarry(fcb fcbVar, PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                getEditTexPreAsSummarry(fcbVar, (PreferenceGroup) preference);
            } else if (preference != null && preference.getClass().getSimpleName().equalsIgnoreCase("EditTextPreference")) {
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.setSummary(editTextPreference.getText());
            }
        }
    }

    public static String[] getFileNames1(File[] fileArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (fileArr.length == 0) {
            arrayList = (ArrayList) null;
        } else {
            arrayList2.add("Default");
            for (File file : fileArr) {
                arrayList2.add(file.getName());
            }
            arrayList = arrayList2;
        }
        return (String[]) arrayList2.toArray(new String[arrayList.size()]);
    }
}
