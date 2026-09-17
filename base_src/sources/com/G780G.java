package com;

import defpackage.ddf;
import defpackage.ddj;
import defpackage.dep;

/* JADX INFO: loaded from: classes.dex */
public class G780G {
    public static void overrideDefaults(ddj ddjVar, ddf ddfVar) {
        dep depVar = (dep) ddjVar;
        depVar.sh("pref_enable_manual_array_key", "1");
        depVar.sh("pref_manual_array_key", "0,1,2,4,5,52");
        depVar.sh("pref_show_buttons_key", "1");
        depVar.sh("pref_aux_tele_key", "1");
        depVar.sh("pref_aux_wide_key", "1");
        depVar.sh("pref_img_key", "1");
        depVar.sh("pref_img_key_2", "1");
        depVar.sh("pref_img_key_3", "1");
        depVar.sh("pref_img_key_front", "1");
        depVar.sh("fix_resolution_key", "37");
        depVar.sh("fix_resolution_key_2", "37");
        depVar.sh("fix_resolution_key_3", "37");
        depVar.sh("fix_resolution_key_front", "0");
    }
}
