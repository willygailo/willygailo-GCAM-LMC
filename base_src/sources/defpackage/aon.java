package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
final class aon {
    static {
        kus.g("Alarms");
    }

    public static void a(Context context, aof aofVar, String str) {
        aqk aqkVarU = aofVar.d.u();
        aqh aqhVarA = aqkVarU.a(str);
        if (aqhVarA != null) {
            c(context, str, aqhVarA.b);
            kus kusVarL = kus.l();
            String.format("Removing SystemIdInfo for workSpecId (%s)", str);
            kusVarL.h(new Throwable[0]);
            aqkVarU.c(str);
        }
    }

    public static void b(Context context, aof aofVar, String str, long j) {
        int iA;
        WorkDatabase workDatabase = aofVar.d;
        aqk aqkVarU = workDatabase.u();
        aqh aqhVarA = aqkVarU.a(str);
        if (aqhVarA != null) {
            c(context, str, aqhVarA.b);
            d(context, str, aqhVarA.b, j);
            return;
        }
        arm armVar = new arm(workDatabase);
        synchronized (arm.class) {
            iA = armVar.a("next_alarm_manager_id");
        }
        aqkVarU.b(new aqh(str, iA));
        d(context, str, iA, j);
    }

    private static void c(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, aoo.c(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        kus kusVarL = kus.l();
        String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i));
        kusVarL.h(new Throwable[0]);
        alarmManager.cancel(service);
    }

    private static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, aoo.c(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
