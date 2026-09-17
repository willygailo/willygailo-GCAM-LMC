package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class hnu extends BroadcastReceiver {
    final /* synthetic */ hnv a;

    public hnu(hnv hnvVar) {
        this.a = hnvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        hnv hnvVar = this.a;
        String strValueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
        sb.append("Received UserPresent broadcast: ");
        sb.append(strValueOf);
        hnvVar.c(sb.toString());
    }
}
