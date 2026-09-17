package com;

import defpackage.ddf;
import defpackage.ddj;
import defpackage.dep;

/* JADX INFO: loaded from: classes.dex */
public class OnePlus {
    public static void overrideDefaults(ddj ddjVar, ddf ddfVar) {
        dep depVar = (dep) ddjVar;
        depVar.sh("pref_camera_lightroom_key", "1");
        depVar.sh("pref_sunlight_key", "1");
    }
}
