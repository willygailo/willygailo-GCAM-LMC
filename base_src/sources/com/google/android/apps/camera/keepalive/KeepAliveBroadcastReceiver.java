package com.google.android.apps.camera.keepalive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.enc;
import defpackage.eoa;
import defpackage.eob;
import defpackage.eoc;

/* JADX INFO: loaded from: classes.dex */
public class KeepAliveBroadcastReceiver extends BroadcastReceiver {
    public eoa a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((eob) ((enc) context.getApplicationContext()).c(eob.class)).h(this);
        if (this.a.a()) {
            String strValueOf = String.valueOf(intent.getAction());
            if (strValueOf.length() != 0) {
                "Broadcast: ".concat(strValueOf);
            } else {
                new String("Broadcast: ");
            }
            eoc.b(context);
        }
    }
}
