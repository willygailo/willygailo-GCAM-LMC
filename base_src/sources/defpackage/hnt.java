package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class hnt extends BroadcastReceiver {
    final /* synthetic */ hnv a;

    public hnt(hnv hnvVar) {
        this.a = hnvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        hnv hnvVar = this.a;
        hnvVar.c = true;
        if (hnvVar.b) {
            hnvVar.a.f("Ignoring ScreenOff shutdown behavior, the activity is still started.");
            return;
        }
        String strValueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 43);
        sb.append("Received ScreenOff broadcast after onStop: ");
        sb.append(strValueOf);
        hnvVar.c(sb.toString());
    }
}
