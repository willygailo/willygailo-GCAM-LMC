package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class aop extends BroadcastReceiver {
    static {
        kus.g("ConstraintProxy");
    }

    static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            aml amlVar = ((aqt) it.next()).i;
            z4 |= amlVar.d;
            z |= amlVar.b;
            z2 |= amlVar.e;
            z3 |= amlVar.i != 1;
            if (z4 && z && z2 && z3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z4, z, z2, z3));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kus kusVarL = kus.l();
        String.format("onReceive : %s", intent);
        kusVarL.h(new Throwable[0]);
        context.startService(aoo.b(context));
    }
}
