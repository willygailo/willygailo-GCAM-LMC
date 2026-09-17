package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class anp {
    static {
        kus.g("Schedulers");
    }

    static ano a(Context context, aof aofVar) {
        aoz aozVar = new aoz(context, aofVar);
        arn.a(context, SystemJobService.class, true);
        kus.l().h(new Throwable[0]);
        return aozVar;
    }

    public static void b(amj amjVar, WorkDatabase workDatabase, List list) {
        ais aisVar;
        if (list == null || list.size() == 0) {
            return;
        }
        aqu aquVarS = workDatabase.s();
        workDatabase.h();
        try {
            int i = amjVar.e;
            ais aisVarA = ais.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
            aisVarA.e(1, 20L);
            ((are) aquVarS).a.g();
            Cursor cursorI = fy.i(((are) aquVarS).a, aisVarA, false);
            try {
                int iL = fy.l(cursorI, "required_network_type");
                int iL2 = fy.l(cursorI, "requires_charging");
                int iL3 = fy.l(cursorI, "requires_device_idle");
                int iL4 = fy.l(cursorI, "requires_battery_not_low");
                int iL5 = fy.l(cursorI, "requires_storage_not_low");
                int iL6 = fy.l(cursorI, "trigger_content_update_delay");
                int iL7 = fy.l(cursorI, "trigger_max_content_delay");
                int iL8 = fy.l(cursorI, "content_uri_triggers");
                int iL9 = fy.l(cursorI, "id");
                int iL10 = fy.l(cursorI, "state");
                int iL11 = fy.l(cursorI, "worker_class_name");
                int iL12 = fy.l(cursorI, "input_merger_class_name");
                int iL13 = fy.l(cursorI, "input");
                aqu aquVar = aquVarS;
                int iL14 = fy.l(cursorI, "output");
                aisVar = aisVarA;
                try {
                    int iL15 = fy.l(cursorI, "initial_delay");
                    int iL16 = fy.l(cursorI, "interval_duration");
                    int iL17 = fy.l(cursorI, "flex_duration");
                    int iL18 = fy.l(cursorI, "run_attempt_count");
                    int iL19 = fy.l(cursorI, "backoff_policy");
                    int iL20 = fy.l(cursorI, "backoff_delay_duration");
                    int iL21 = fy.l(cursorI, "period_start_time");
                    int iL22 = fy.l(cursorI, "minimum_retention_duration");
                    int iL23 = fy.l(cursorI, "schedule_requested_at");
                    int iL24 = fy.l(cursorI, "run_in_foreground");
                    int iL25 = fy.l(cursorI, "out_of_quota_policy");
                    int i2 = iL14;
                    ArrayList arrayList = new ArrayList(cursorI.getCount());
                    while (cursorI.moveToNext()) {
                        String string = cursorI.getString(iL9);
                        int i3 = iL9;
                        String string2 = cursorI.getString(iL11);
                        int i4 = iL11;
                        aml amlVar = new aml();
                        int i5 = iL;
                        amlVar.i = gh.l(cursorI.getInt(iL));
                        amlVar.b = cursorI.getInt(iL2) != 0;
                        amlVar.c = cursorI.getInt(iL3) != 0;
                        amlVar.d = cursorI.getInt(iL4) != 0;
                        amlVar.e = cursorI.getInt(iL5) != 0;
                        int i6 = iL2;
                        amlVar.f = cursorI.getLong(iL6);
                        amlVar.g = cursorI.getLong(iL7);
                        amlVar.h = gh.i(cursorI.getBlob(iL8));
                        aqt aqtVar = new aqt(string, string2);
                        aqtVar.p = gh.n(cursorI.getInt(iL10));
                        aqtVar.c = cursorI.getString(iL12);
                        aqtVar.d = amq.a(cursorI.getBlob(iL13));
                        int i7 = i2;
                        aqtVar.e = amq.a(cursorI.getBlob(i7));
                        int i8 = iL3;
                        int i9 = iL15;
                        int i10 = iL4;
                        aqtVar.f = cursorI.getLong(i9);
                        int i11 = iL16;
                        int i12 = iL5;
                        aqtVar.g = cursorI.getLong(i11);
                        int i13 = iL17;
                        aqtVar.h = cursorI.getLong(i13);
                        int i14 = iL18;
                        aqtVar.j = cursorI.getInt(i14);
                        int i15 = iL19;
                        i2 = i7;
                        aqtVar.q = gh.k(cursorI.getInt(i15));
                        iL18 = i14;
                        iL19 = i15;
                        int i16 = iL20;
                        aqtVar.k = cursorI.getLong(i16);
                        int i17 = iL21;
                        aqtVar.l = cursorI.getLong(i17);
                        int i18 = iL22;
                        aqtVar.m = cursorI.getLong(i18);
                        iL22 = i18;
                        int i19 = iL23;
                        aqtVar.n = cursorI.getLong(i19);
                        int i20 = iL24;
                        aqtVar.o = cursorI.getInt(i20) != 0;
                        int i21 = iL25;
                        aqtVar.r = gh.m(cursorI.getInt(i21));
                        aqtVar.i = amlVar;
                        arrayList.add(aqtVar);
                        iL25 = i21;
                        iL23 = i19;
                        iL3 = i8;
                        iL4 = i10;
                        iL15 = i9;
                        iL9 = i3;
                        iL11 = i4;
                        iL = i5;
                        iL21 = i17;
                        iL5 = i12;
                        iL16 = i11;
                        iL17 = i13;
                        iL20 = i16;
                        iL24 = i20;
                        iL2 = i6;
                    }
                    cursorI.close();
                    aisVar.j();
                    List listI = aquVar.i();
                    if (arrayList.size() > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            aqu aquVar2 = aquVar;
                            aquVar2.j(((aqt) it.next()).a, jCurrentTimeMillis);
                            aquVar = aquVar2;
                        }
                    }
                    workDatabase.j();
                    workDatabase.i();
                    if (arrayList.size() > 0) {
                        aqt[] aqtVarArr = (aqt[]) arrayList.toArray(new aqt[arrayList.size()]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ano anoVar = (ano) it2.next();
                            if (anoVar.d()) {
                                anoVar.c(aqtVarArr);
                            }
                        }
                    }
                    if (listI.size() > 0) {
                        aqt[] aqtVarArr2 = (aqt[]) listI.toArray(new aqt[listI.size()]);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ano anoVar2 = (ano) it3.next();
                            if (!anoVar2.d()) {
                                anoVar2.c(aqtVarArr2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursorI.close();
                    aisVar.j();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aisVar = aisVarA;
            }
        } catch (Throwable th3) {
            workDatabase.i();
            throw th3;
        }
    }
}
