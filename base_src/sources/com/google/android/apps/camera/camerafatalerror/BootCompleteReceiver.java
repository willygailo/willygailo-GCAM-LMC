package com.google.android.apps.camera.camerafatalerror;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ahj;

/* JADX INFO: loaded from: classes.dex */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ahj.c(context).edit().putBoolean("pref_key_reboot_completed", true).apply();
    }
}
