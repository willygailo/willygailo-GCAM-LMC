package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes2.dex */
public final class tz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ IntentSender.SendIntentException b;
    final /* synthetic */ um c;

    public tz(um umVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.c = umVar;
        this.a = i;
        this.b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
    }
}
