package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.ais;
import defpackage.aml;
import defpackage.amq;
import defpackage.aof;
import defpackage.aqh;
import defpackage.aqk;
import defpackage.aqt;
import defpackage.aqu;
import defpackage.are;
import defpackage.arg;
import defpackage.fy;
import defpackage.ge;
import defpackage.gg;
import defpackage.gh;
import defpackage.kus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        kus.g("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static void k(arg argVar, arg argVar2, aqk aqkVar, List list) {
        String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqt aqtVar = (aqt) it.next();
            aqh aqhVarA = aqkVar.a(aqtVar.a);
            Integer numValueOf = aqhVarA != null ? Integer.valueOf(aqhVarA.b) : null;
            String str = aqtVar.a;
            ais aisVarA = ais.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                aisVarA.f(1);
            } else {
                aisVarA.g(1, str);
            }
            argVar.a.g();
            Cursor cursorI = fy.i(argVar.a, aisVarA, false);
            try {
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    arrayList.add(cursorI.getString(0));
                }
                cursorI.close();
                aisVarA.j();
                List listA = argVar2.a(aqtVar.a);
                String strJoin = TextUtils.join(",", arrayList);
                String strJoin2 = TextUtils.join(",", listA);
                Object[] objArr = new Object[6];
                objArr[0] = aqtVar.a;
                objArr[1] = aqtVar.b;
                objArr[2] = numValueOf;
                int i = aqtVar.p;
                String strE = gg.e(i);
                if (i == 0) {
                    throw null;
                }
                objArr[3] = strE;
                objArr[4] = strJoin;
                objArr[5] = strJoin2;
                String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", objArr);
            } catch (Throwable th) {
                cursorI.close();
                aisVarA.j();
                throw th;
            }
        }
    }

    @Override // androidx.work.Worker
    public final ge b() throws Throwable {
        ais aisVar;
        aqk aqkVar;
        arg argVar;
        arg argVar2;
        int i;
        WorkDatabase workDatabase = aof.e(this.c).d;
        aqu aquVarS = workDatabase.s();
        arg argVarX = workDatabase.x();
        arg argVarW = workDatabase.w();
        aqk aqkVarU = workDatabase.u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(1L);
        ais aisVarA = ais.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        aisVarA.e(1, jCurrentTimeMillis - millis);
        are areVar = (are) aquVarS;
        areVar.a.g();
        Cursor cursorI = fy.i(areVar.a, aisVarA, false);
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
                    int i8 = iL10;
                    i2 = i7;
                    int i9 = iL15;
                    aqtVar.f = cursorI.getLong(i9);
                    int i10 = iL12;
                    int i11 = iL16;
                    aqtVar.g = cursorI.getLong(i11);
                    int i12 = iL13;
                    int i13 = iL17;
                    aqtVar.h = cursorI.getLong(i13);
                    int i14 = iL18;
                    aqtVar.j = cursorI.getInt(i14);
                    int i15 = iL19;
                    aqtVar.q = gh.k(cursorI.getInt(i15));
                    iL17 = i13;
                    int i16 = iL20;
                    aqtVar.k = cursorI.getLong(i16);
                    int i17 = iL21;
                    aqtVar.l = cursorI.getLong(i17);
                    iL21 = i17;
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
                    iL10 = i8;
                    iL12 = i10;
                    iL23 = i19;
                    iL11 = i4;
                    iL2 = i6;
                    iL = i5;
                    iL24 = i20;
                    iL15 = i9;
                    iL9 = i3;
                    iL20 = i16;
                    iL13 = i12;
                    iL16 = i11;
                    iL18 = i14;
                    iL19 = i15;
                }
                cursorI.close();
                aisVar.j();
                List listB = aquVarS.b();
                List listI = aquVarS.i();
                if (arrayList.isEmpty()) {
                    aqkVar = aqkVarU;
                    argVar = argVarX;
                    argVar2 = argVarW;
                    i = 0;
                } else {
                    kus.l();
                    i = 0;
                    kus.j(new Throwable[0]);
                    kus.l();
                    aqkVar = aqkVarU;
                    argVar = argVarX;
                    argVar2 = argVarW;
                    k(argVar, argVar2, aqkVar, arrayList);
                    kus.j(new Throwable[0]);
                }
                if (!listB.isEmpty()) {
                    kus.l();
                    kus.j(new Throwable[i]);
                    kus.l();
                    k(argVar, argVar2, aqkVar, listB);
                    kus.j(new Throwable[i]);
                }
                if (!listI.isEmpty()) {
                    kus.l();
                    kus.j(new Throwable[i]);
                    kus.l();
                    k(argVar, argVar2, aqkVar, listI);
                    kus.j(new Throwable[i]);
                }
                return ge.f();
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
    }
}
