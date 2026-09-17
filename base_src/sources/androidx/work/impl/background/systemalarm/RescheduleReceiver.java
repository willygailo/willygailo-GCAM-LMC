package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.aof;
import defpackage.kus;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = kus.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kus kusVarL = kus.l();
        String.format("Received intent %s", intent);
        kusVarL.h(new Throwable[0]);
        try {
            aof aofVarE = aof.e(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (aof.a) {
                aofVarE.h = pendingResultGoAsync;
                if (aofVarE.g) {
                    aofVarE.h.finish();
                    aofVarE.h = null;
                }
            }
        } catch (IllegalStateException e) {
            kus.l();
            kus.i(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
