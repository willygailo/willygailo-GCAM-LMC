package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class hns extends BroadcastReceiver {
    final /* synthetic */ hnv a;

    public hns(hnv hnvVar) {
        this.a = hnvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c = false;
    }
}
