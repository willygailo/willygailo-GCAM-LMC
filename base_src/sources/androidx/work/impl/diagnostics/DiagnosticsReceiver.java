package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.ane;
import defpackage.anq;
import defpackage.aof;
import defpackage.kus;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = kus.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        kus.l().h(new Throwable[0]);
        try {
            aof aofVarE = aof.e(context);
            List listSingletonList = Collections.singletonList(new ane(DiagnosticsWorker.class).a());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new anq(aofVarE, null, 2, listSingletonList).d();
        } catch (IllegalStateException e) {
            kus.l();
            kus.i(a, "WorkManager is not initialized", e);
        }
    }
}
