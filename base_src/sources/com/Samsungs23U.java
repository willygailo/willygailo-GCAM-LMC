package com;

import defpackage.ddf;
import defpackage.ddj;
import defpackage.dep;

/* JADX INFO: loaded from: classes.dex */
public class Samsungs23U {
    public static void overrideDefaults(ddj ddjVar, ddf ddfVar) {
        dep depVar = (dep) ddjVar;
        depVar.sh("pref_enable_manual_array_key", "1");
        depVar.sh("pref_manual_array_key", "0,1,52,54,56,58");
        depVar.sh("pref_show_buttons_key", "1");
        depVar.sh("pref_aux_tele_key", "1");
        depVar.sh("pref_aux_wide_key", "1");
        depVar.sh("pref_aux_4_key", "1");
    }
}
