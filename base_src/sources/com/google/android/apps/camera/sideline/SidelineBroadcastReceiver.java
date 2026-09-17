package com.google.android.apps.camera.sideline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.enc;
import defpackage.htu;
import defpackage.hug;
import defpackage.hvt;
import defpackage.hwm;

/* JADX INFO: loaded from: classes.dex */
public class SidelineBroadcastReceiver extends BroadcastReceiver {
    public hwm a;
    public hug b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((hvt) ((enc) context.getApplicationContext()).c(hvt.class)).s(this);
        String action = intent.getAction();
        if (action != null) {
            switch (action) {
                case "android.intent.action.MY_PACKAGE_REPLACED":
                    this.b.d(htu.U);
                    break;
                case "android.intent.action.BOOT_COMPLETED":
                    break;
                default:
                    return;
            }
            if (this.a.b()) {
                this.a.a();
            }
        }
    }
}
