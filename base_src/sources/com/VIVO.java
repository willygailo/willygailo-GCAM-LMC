package com;

import defpackage.ddf;
import defpackage.ddj;
import defpackage.dep;

/* JADX INFO: loaded from: classes.dex */
public class VIVO {
    public static void overrideDefaults(ddj ddjVar, ddf ddfVar) {
        dep depVar = (dep) ddjVar;
        depVar.sh("pref_device_key", "5");
        depVar.sh("pref_device_key_tele", "5");
        depVar.sh("pref_device_key_wide", "5");
        depVar.sh("pref_device_key_id4", "5");
        depVar.sh("pref_device_key_id5", "5");
        depVar.sh("pref_device_key_front", "5");
    }
}
