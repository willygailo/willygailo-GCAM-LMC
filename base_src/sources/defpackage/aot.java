package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class aot implements Runnable {
    final /* synthetic */ aox a;

    public aot(aox aoxVar) {
        this.a = aoxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aox aoxVar;
        aow aowVar;
        synchronized (this.a.g) {
            aox aoxVar2 = this.a;
            aoxVar2.h = (Intent) aoxVar2.g.get(0);
        }
        Intent intent = this.a.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.a.h.getIntExtra("KEY_START_ID", 0);
            kus kusVarL = kus.l();
            Integer numValueOf = Integer.valueOf(intExtra);
            String.format("Processing command %s, %s", this.a.h, numValueOf);
            kusVarL.h(new Throwable[0]);
            PowerManager.WakeLock wakeLockA = aru.a(this.a.b, String.format("%s (%s)", action, numValueOf));
            try {
                kus kusVarL2 = kus.l();
                String.format("Acquiring operation wake lock (%s) %s", action, wakeLockA);
                kusVarL2.h(new Throwable[0]);
                wakeLockA.acquire();
                aox aoxVar3 = this.a;
                aoo aooVar = aoxVar3.f;
                Intent intent2 = aoxVar3.h;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    kus kusVarL3 = kus.l();
                    String.format("Handling constraints changed %s", intent2);
                    kusVarL3.h(new Throwable[0]);
                    int i = aor.a;
                    Context context = aooVar.b;
                    apd apdVar = new apd(context, aoxVar3.j, null);
                    List<aqt> listC = aoxVar3.e.d.s().c();
                    aop.a(context, listC);
                    apdVar.a(listC);
                    ArrayList arrayList = new ArrayList(listC.size());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (aqt aqtVar : listC) {
                        String str = aqtVar.a;
                        if (jCurrentTimeMillis >= aqtVar.a() && (!aqtVar.b() || apdVar.c(str))) {
                            arrayList.add(aqtVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = ((aqt) arrayList.get(i2)).a;
                        Intent intentC = aoo.c(context, str2);
                        kus kusVarL4 = kus.l();
                        String.format("Creating a delay_met command for workSpec with id (%s)", str2);
                        kusVarL4.h(new Throwable[0]);
                        aoxVar3.d(new aou(aoxVar3, intentC, intExtra));
                    }
                    apdVar.b();
                } else if (!"ACTION_RESCHEDULE".equals(action2)) {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty()) {
                        kus.l();
                        kus.i(aoo.a, String.format("Invalid request for %s, requires %s.", action2, "KEY_WORKSPEC_ID"), new Throwable[0]);
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 > 0) {
                            if (!"ACTION_SCHEDULE_WORK".equals(action2)) {
                                if (!"ACTION_DELAY_MET".equals(action2)) {
                                    if (!"ACTION_STOP_WORK".equals(action2)) {
                                        if (!"ACTION_EXECUTION_COMPLETED".equals(action2)) {
                                            kus.l();
                                            kus.k(aoo.a, String.format("Ignoring intent %s", intent2), new Throwable[0]);
                                            break;
                                        }
                                        Bundle extras2 = intent2.getExtras();
                                        String string = extras2.getString("KEY_WORKSPEC_ID");
                                        boolean z = extras2.getBoolean("KEY_NEEDS_RESCHEDULE");
                                        kus kusVarL5 = kus.l();
                                        String.format("Handling onExecutionCompleted %s, %s", intent2, Integer.valueOf(intExtra));
                                        kusVarL5.h(new Throwable[0]);
                                        aooVar.a(string, z);
                                        break;
                                    }
                                    String string2 = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                                    kus kusVarL6 = kus.l();
                                    String.format("Handing stopWork work for %s", string2);
                                    kusVarL6.h(new Throwable[0]);
                                    aoxVar3.e.i(string2);
                                    aon.a(aooVar.b, aoxVar3.e, string2);
                                    aoxVar3.a(string2, false);
                                    break;
                                }
                                Bundle extras3 = intent2.getExtras();
                                synchronized (aooVar.d) {
                                    String string3 = extras3.getString("KEY_WORKSPEC_ID");
                                    kus kusVarL7 = kus.l();
                                    String.format("Handing delay met for %s", string3);
                                    kusVarL7.h(new Throwable[0]);
                                    if (aooVar.c.containsKey(string3)) {
                                        kus kusVarL8 = kus.l();
                                        String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string3);
                                        kusVarL8.h(new Throwable[0]);
                                    } else {
                                        aos aosVar = new aos(aooVar.b, intExtra, string3, aoxVar3);
                                        aooVar.c.put(string3, aosVar);
                                        aosVar.f = aru.a(aosVar.a, String.format("%s (%s)", aosVar.c, Integer.valueOf(aosVar.b)));
                                        kus kusVarL9 = kus.l();
                                        String.format("Acquiring wakelock %s for WorkSpec %s", aosVar.f, aosVar.c);
                                        kusVarL9.h(new Throwable[0]);
                                        aosVar.f.acquire();
                                        aqt aqtVarA = aosVar.d.e.d.s().a(aosVar.c);
                                        if (aqtVarA == null) {
                                            aosVar.c();
                                        } else {
                                            boolean zB = aqtVarA.b();
                                            aosVar.g = zB;
                                            if (zB) {
                                                aosVar.e.a(Collections.singletonList(aqtVarA));
                                            } else {
                                                kus kusVarL10 = kus.l();
                                                String.format("No constraints for %s", aosVar.c);
                                                kusVarL10.h(new Throwable[0]);
                                                aosVar.e(Collections.singletonList(aosVar.c));
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            String string4 = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                            kus kusVarL11 = kus.l();
                            String.format("Handling schedule work for %s", string4);
                            kusVarL11.h(new Throwable[0]);
                            WorkDatabase workDatabase = aoxVar3.e.d;
                            workDatabase.h();
                            try {
                                aqt aqtVarA2 = workDatabase.s().a(string4);
                                if (aqtVarA2 == null) {
                                    kus.l();
                                    kus.k(aoo.a, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                                } else if (gg.f(aqtVarA2.p)) {
                                    kus.l();
                                    kus.k(aoo.a, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                                } else {
                                    long jA = aqtVarA2.a();
                                    if (aqtVarA2.b()) {
                                        kus kusVarL12 = kus.l();
                                        String.format("Opportunistically setting an alarm for %s at %s", string4, Long.valueOf(jA));
                                        kusVarL12.h(new Throwable[0]);
                                        aon.b(aooVar.b, aoxVar3.e, string4, jA);
                                        aoxVar3.d(new aou(aoxVar3, aoo.b(aooVar.b), intExtra));
                                    } else {
                                        kus kusVarL13 = kus.l();
                                        String.format("Setting up Alarms for %s at %s", string4, Long.valueOf(jA));
                                        kusVarL13.h(new Throwable[0]);
                                        aon.b(aooVar.b, aoxVar3.e, string4, jA);
                                    }
                                    workDatabase.j();
                                }
                                workDatabase.i();
                                break;
                            } catch (Throwable th) {
                                workDatabase.i();
                                throw th;
                            }
                        }
                        if (extras.get(strArr[i3]) == null) {
                            kus.l();
                            kus.i(aoo.a, String.format("Invalid request for %s, requires %s.", action2, "KEY_WORKSPEC_ID"), new Throwable[0]);
                            break;
                        }
                        i3++;
                    }
                } else {
                    kus kusVarL14 = kus.l();
                    String.format("Handling reschedule %s, %s", intent2, numValueOf);
                    kusVarL14.h(new Throwable[0]);
                    aoxVar3.e.g();
                }
                kus kusVarL15 = kus.l();
                String.format("Releasing operation wake lock (%s) %s", action, wakeLockA);
                kusVarL15.h(new Throwable[0]);
                wakeLockA.release();
                aoxVar = this.a;
                aowVar = new aow(aoxVar);
            } catch (Throwable th2) {
                try {
                    kus.l();
                    kus.i(aox.a, "Unexpected error in onHandleIntent", th2);
                    kus kusVarL16 = kus.l();
                    String.format("Releasing operation wake lock (%s) %s", action, wakeLockA);
                    kusVarL16.h(new Throwable[0]);
                    wakeLockA.release();
                    aoxVar = this.a;
                    aowVar = new aow(aoxVar);
                } catch (Throwable th3) {
                    kus kusVarL17 = kus.l();
                    String.format("Releasing operation wake lock (%s) %s", action, wakeLockA);
                    kusVarL17.h(new Throwable[0]);
                    wakeLockA.release();
                    aox aoxVar4 = this.a;
                    aoxVar4.d(new aow(aoxVar4));
                    throw th3;
                }
            }
            aoxVar.d(aowVar);
        }
    }
}
