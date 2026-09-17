package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class arl implements Runnable {
    private static final String a = kus.g("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final aof d;
    private int e = 0;

    public arl(Context context, aof aofVar) {
        this.c = context.getApplicationContext();
        this.d = aofVar;
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentB = b(context, 167772160);
        long jCurrentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentB);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        aof aofVar;
        try {
            if (!TextUtils.isEmpty(null)) {
                boolean zA = aro.a(this.c);
                kus kusVarL = kus.l();
                String.format("Is default app process = %s", Boolean.valueOf(zA));
                kusVarL.h(new Throwable[0]);
                if (!zA) {
                    aofVar = this.d;
                }
                aofVar.f();
                return;
            }
            kus.l().h(new Throwable[0]);
            while (true) {
                Context context = this.c;
                if (aod.a(context).exists()) {
                    kus.l().h(new Throwable[0]);
                    HashMap map = new HashMap();
                    File fileA = aod.a(context);
                    File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                    map.put(fileA, file);
                    String[] strArr = aod.b;
                    int length = strArr.length;
                    for (int i = 0; i < 3; i++) {
                        String str = strArr[i];
                        map.put(new File(fileA.getPath() + str), new File(file.getPath() + str));
                    }
                    for (File file2 : map.keySet()) {
                        File file3 = (File) map.get(file2);
                        if (file2.exists() && file3 != null) {
                            if (file3.exists()) {
                                String str2 = String.format("Over-writing contents of %s", file3);
                                kus.l();
                                kus.k(aod.a, str2, new Throwable[0]);
                            }
                            if (file2.renameTo(file3)) {
                                String.format("Migrated %s to %s", file2, file3);
                            } else {
                                String.format("Renaming %s to %s failed", file2, file3);
                            }
                            kus.l().h(new Throwable[0]);
                        }
                    }
                }
                kus.l().h(new Throwable[0]);
                try {
                    boolean zF = aoz.f(this.c, this.d);
                    WorkDatabase workDatabase = this.d.d;
                    aqu aquVarS = workDatabase.s();
                    aqq aqqVarV = workDatabase.v();
                    workDatabase.h();
                    try {
                        List<aqt> listB = aquVarS.b();
                        boolean z = !listB.isEmpty();
                        if (z) {
                            for (aqt aqtVar : listB) {
                                aquVarS.k(1, aqtVar.a);
                                aquVarS.j(aqtVar.a, -1L);
                            }
                        }
                        aqqVarV.a.g();
                        ake akeVarE = aqqVarV.c.e();
                        aqqVarV.a.h();
                        try {
                            akeVarE.a();
                            aqqVarV.a.j();
                            aqqVarV.a.i();
                            aqqVarV.c.f(akeVarE);
                            workDatabase.j();
                            workDatabase.i();
                            boolean z2 = z || zF;
                            Long lB = this.d.j.a.y().b("reschedule_needed");
                            if (lB == null || lB.longValue() != 1) {
                                try {
                                    PendingIntent pendingIntentB = b(this.c, 570425344);
                                    if (pendingIntentB != null) {
                                        pendingIntentB.cancel();
                                    }
                                    List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.c.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < historicalProcessExitReasons.size()) {
                                                if (historicalProcessExitReasons.get(i2).getReason() == 10) {
                                                    kus.l().h(new Throwable[0]);
                                                    this.d.g();
                                                } else {
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                    if (z2) {
                                        kus.l().h(new Throwable[0]);
                                        aof aofVar2 = this.d;
                                        anp.b(aofVar2.c, aofVar2.d, aofVar2.e);
                                    }
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    kus.l();
                                    kus.k(a, "Ignoring exception", e);
                                } catch (SecurityException e2) {
                                    e = e2;
                                    kus.l();
                                    kus.k(a, "Ignoring exception", e);
                                }
                            } else {
                                kus.l().h(new Throwable[0]);
                                this.d.g();
                                this.d.j.a.y().c(new aqf("reschedule_needed", 0L));
                            }
                            aofVar = this.d;
                            aofVar.f();
                            return;
                        } catch (Throwable th) {
                            aqqVarV.a.i();
                            aqqVarV.c.f(akeVarE);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        workDatabase.i();
                        throw th2;
                    }
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e3) {
                    int i3 = this.e + 1;
                    this.e = i3;
                    if (i3 >= 3) {
                        kus.l();
                        kus.i(a, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                        throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                    }
                    kus kusVarL2 = kus.l();
                    String.format("Retrying after %s", Long.valueOf(((long) i3) * 300));
                    kusVarL2.h(e3);
                    try {
                        Thread.sleep(((long) this.e) * 300);
                    } catch (InterruptedException e4) {
                    }
                }
            }
        } catch (Throwable th3) {
            this.d.f();
            throw th3;
        }
    }
}
