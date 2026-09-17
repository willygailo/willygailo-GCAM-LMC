package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class jix extends BroadcastReceiver {
    final /* synthetic */ jiy a;

    public jix(jiy jiyVar) {
        this.a = jiyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "android.intent.action.BATTERY_CHANGED":
                this.a.a(intent);
                break;
        }
    }
}
