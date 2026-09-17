package com.google.vr.ndk.base;

import android.app.Activity;
import defpackage.pvw;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompat {
    private AndroidCompat() {
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        pvw.a(activity, z);
    }

    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        return pvw.b(activity, z);
    }
}
