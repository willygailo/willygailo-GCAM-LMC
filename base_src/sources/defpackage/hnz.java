package defpackage;

import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class hnz extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ hoa c;

    public hnz(hoa hoaVar, boolean z, Intent intent) {
        this.c = hoaVar;
        this.a = z;
        this.b = intent;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this.c.a);
        if (this.a) {
            hoa hoaVar = this.c;
            Intent intent = new Intent(hoaVar.a, (Class<?>) hoaVar.c);
            intent.setFlags(intent.getFlags() | 67108864).setAction("android.intent.action.MAIN");
            taskStackBuilderCreate.addNextIntent(intent);
        }
        taskStackBuilderCreate.addNextIntent(this.b).startActivities();
    }
}
