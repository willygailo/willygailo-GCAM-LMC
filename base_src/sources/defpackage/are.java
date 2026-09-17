package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class are implements aqu {
    public final aii a;
    public final aia b;
    public final aiy c;
    public final aiy d;
    public final aiy e;
    private final aiy f;
    private final aiy g;
    private final aiy h;
    private final aiy i;

    public are(aii aiiVar) {
        this.a = aiiVar;
        this.b = new aqv(aiiVar);
        this.f = new aqw(aiiVar);
        this.g = new aqx(aiiVar);
        this.h = new aqy(aiiVar);
        this.c = new aqz(aiiVar);
        this.d = new ara(aiiVar);
        this.i = new arb(aiiVar);
        this.e = new arc(aiiVar);
        new ard(aiiVar);
    }

    @Override // defpackage.aqu
    public final aqt a(String str) throws Throwable {
        ais aisVar;
        aqt aqtVar;
        ais aisVarA = ais.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            aisVarA.f(1);
        } else {
            aisVarA.g(1, str);
        }
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
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
                if (cursorI.moveToFirst()) {
                    String string = cursorI.getString(iL9);
                    String string2 = cursorI.getString(iL11);
                    aml amlVar = new aml();
                    amlVar.i = gh.l(cursorI.getInt(iL));
                    amlVar.b = cursorI.getInt(iL2) != 0;
                    amlVar.c = cursorI.getInt(iL3) != 0;
                    amlVar.d = cursorI.getInt(iL4) != 0;
                    amlVar.e = cursorI.getInt(iL5) != 0;
                    amlVar.f = cursorI.getLong(iL6);
                    amlVar.g = cursorI.getLong(iL7);
                    amlVar.h = gh.i(cursorI.getBlob(iL8));
                    aqtVar = new aqt(string, string2);
                    aqtVar.p = gh.n(cursorI.getInt(iL10));
                    aqtVar.c = cursorI.getString(iL12);
                    aqtVar.d = amq.a(cursorI.getBlob(iL13));
                    aqtVar.e = amq.a(cursorI.getBlob(iL14));
                    aqtVar.f = cursorI.getLong(iL15);
                    aqtVar.g = cursorI.getLong(iL16);
                    aqtVar.h = cursorI.getLong(iL17);
                    aqtVar.j = cursorI.getInt(iL18);
                    aqtVar.q = gh.k(cursorI.getInt(iL19));
                    aqtVar.k = cursorI.getLong(iL20);
                    aqtVar.l = cursorI.getLong(iL21);
                    aqtVar.m = cursorI.getLong(iL22);
                    aqtVar.n = cursorI.getLong(iL23);
                    aqtVar.o = cursorI.getInt(iL24) != 0;
                    aqtVar.r = gh.m(cursorI.getInt(iL25));
                    aqtVar.i = amlVar;
                } else {
                    aqtVar = null;
                }
                cursorI.close();
                aisVar.j();
                return aqtVar;
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

    @Override // defpackage.aqu
    public final List b() throws Throwable {
        ais aisVar;
        ais aisVarA = ais.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
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
                int i = iL14;
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(iL9);
                    int i2 = iL9;
                    String string2 = cursorI.getString(iL11);
                    int i3 = iL11;
                    aml amlVar = new aml();
                    int i4 = iL;
                    amlVar.i = gh.l(cursorI.getInt(iL));
                    amlVar.b = cursorI.getInt(iL2) != 0;
                    amlVar.c = cursorI.getInt(iL3) != 0;
                    amlVar.d = cursorI.getInt(iL4) != 0;
                    amlVar.e = cursorI.getInt(iL5) != 0;
                    int i5 = iL2;
                    int i6 = iL3;
                    amlVar.f = cursorI.getLong(iL6);
                    amlVar.g = cursorI.getLong(iL7);
                    amlVar.h = gh.i(cursorI.getBlob(iL8));
                    aqt aqtVar = new aqt(string, string2);
                    aqtVar.p = gh.n(cursorI.getInt(iL10));
                    aqtVar.c = cursorI.getString(iL12);
                    aqtVar.d = amq.a(cursorI.getBlob(iL13));
                    int i7 = i;
                    aqtVar.e = amq.a(cursorI.getBlob(i7));
                    i = i7;
                    int i8 = iL15;
                    aqtVar.f = cursorI.getLong(i8);
                    int i9 = iL13;
                    int i10 = iL16;
                    aqtVar.g = cursorI.getLong(i10);
                    int i11 = iL4;
                    int i12 = iL17;
                    aqtVar.h = cursorI.getLong(i12);
                    int i13 = iL18;
                    aqtVar.j = cursorI.getInt(i13);
                    int i14 = iL19;
                    aqtVar.q = gh.k(cursorI.getInt(i14));
                    iL17 = i12;
                    int i15 = iL20;
                    aqtVar.k = cursorI.getLong(i15);
                    int i16 = iL21;
                    aqtVar.l = cursorI.getLong(i16);
                    iL21 = i16;
                    int i17 = iL22;
                    aqtVar.m = cursorI.getLong(i17);
                    int i18 = iL23;
                    aqtVar.n = cursorI.getLong(i18);
                    int i19 = iL24;
                    aqtVar.o = cursorI.getInt(i19) != 0;
                    int i20 = iL25;
                    aqtVar.r = gh.m(cursorI.getInt(i20));
                    aqtVar.i = amlVar;
                    arrayList.add(aqtVar);
                    iL25 = i20;
                    iL2 = i5;
                    iL13 = i9;
                    iL15 = i8;
                    iL16 = i10;
                    iL18 = i13;
                    iL23 = i18;
                    iL9 = i2;
                    iL11 = i3;
                    iL = i4;
                    iL24 = i19;
                    iL22 = i17;
                    iL3 = i6;
                    iL20 = i15;
                    iL4 = i11;
                    iL19 = i14;
                }
                cursorI.close();
                aisVar.j();
                return arrayList;
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

    @Override // defpackage.aqu
    public final List c() throws Throwable {
        ais aisVar;
        ais aisVarA = ais.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
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
                int i = iL14;
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(iL9);
                    int i2 = iL9;
                    String string2 = cursorI.getString(iL11);
                    int i3 = iL11;
                    aml amlVar = new aml();
                    int i4 = iL;
                    amlVar.i = gh.l(cursorI.getInt(iL));
                    amlVar.b = cursorI.getInt(iL2) != 0;
                    amlVar.c = cursorI.getInt(iL3) != 0;
                    amlVar.d = cursorI.getInt(iL4) != 0;
                    amlVar.e = cursorI.getInt(iL5) != 0;
                    int i5 = iL2;
                    int i6 = iL3;
                    amlVar.f = cursorI.getLong(iL6);
                    amlVar.g = cursorI.getLong(iL7);
                    amlVar.h = gh.i(cursorI.getBlob(iL8));
                    aqt aqtVar = new aqt(string, string2);
                    aqtVar.p = gh.n(cursorI.getInt(iL10));
                    aqtVar.c = cursorI.getString(iL12);
                    aqtVar.d = amq.a(cursorI.getBlob(iL13));
                    int i7 = i;
                    aqtVar.e = amq.a(cursorI.getBlob(i7));
                    i = i7;
                    int i8 = iL15;
                    aqtVar.f = cursorI.getLong(i8);
                    int i9 = iL13;
                    int i10 = iL16;
                    aqtVar.g = cursorI.getLong(i10);
                    int i11 = iL4;
                    int i12 = iL17;
                    aqtVar.h = cursorI.getLong(i12);
                    int i13 = iL18;
                    aqtVar.j = cursorI.getInt(i13);
                    int i14 = iL19;
                    aqtVar.q = gh.k(cursorI.getInt(i14));
                    iL17 = i12;
                    int i15 = iL20;
                    aqtVar.k = cursorI.getLong(i15);
                    int i16 = iL21;
                    aqtVar.l = cursorI.getLong(i16);
                    iL21 = i16;
                    int i17 = iL22;
                    aqtVar.m = cursorI.getLong(i17);
                    int i18 = iL23;
                    aqtVar.n = cursorI.getLong(i18);
                    int i19 = iL24;
                    aqtVar.o = cursorI.getInt(i19) != 0;
                    int i20 = iL25;
                    aqtVar.r = gh.m(cursorI.getInt(i20));
                    aqtVar.i = amlVar;
                    arrayList.add(aqtVar);
                    iL25 = i20;
                    iL2 = i5;
                    iL13 = i9;
                    iL15 = i8;
                    iL16 = i10;
                    iL18 = i13;
                    iL23 = i18;
                    iL9 = i2;
                    iL11 = i3;
                    iL = i4;
                    iL24 = i19;
                    iL22 = i17;
                    iL3 = i6;
                    iL20 = i15;
                    iL4 = i11;
                    iL19 = i14;
                }
                cursorI.close();
                aisVar.j();
                return arrayList;
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

    @Override // defpackage.aqu
    public final List d(String str) {
        ais aisVarA = ais.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            aisVarA.f(1);
        } else {
            aisVarA.g(1, str);
        }
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            int iL = fy.l(cursorI, "id");
            int iL2 = fy.l(cursorI, "state");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                aqr aqrVar = new aqr();
                aqrVar.a = cursorI.getString(iL);
                aqrVar.b = gh.n(cursorI.getInt(iL2));
                arrayList.add(aqrVar);
            }
            cursorI.close();
            aisVarA.j();
            return arrayList;
        } catch (Throwable th) {
            cursorI.close();
            aisVarA.j();
            throw th;
        }
    }

    @Override // defpackage.aqu
    public final void e(String str) {
        this.a.g();
        ake akeVarE = this.f.e();
        if (str == null) {
            akeVarE.f(1);
        } else {
            akeVarE.g(1, str);
        }
        this.a.h();
        try {
            akeVarE.a();
            this.a.j();
        } finally {
            this.a.i();
            this.f.f(akeVarE);
        }
    }

    @Override // defpackage.aqu
    public final void f(String str, amq amqVar) {
        this.a.g();
        ake akeVarE = this.g.e();
        byte[] bArrC = amq.c(amqVar);
        if (bArrC == null) {
            akeVarE.f(1);
        } else {
            akeVarE.c(1, bArrC);
        }
        if (str == null) {
            akeVarE.f(2);
        } else {
            akeVarE.g(2, str);
        }
        this.a.h();
        try {
            akeVarE.a();
            this.a.j();
        } finally {
            this.a.i();
            this.g.f(akeVarE);
        }
    }

    @Override // defpackage.aqu
    public final void g(String str, long j) {
        this.a.g();
        ake akeVarE = this.h.e();
        akeVarE.e(1, j);
        if (str == null) {
            akeVarE.f(2);
        } else {
            akeVarE.g(2, str);
        }
        this.a.h();
        try {
            akeVarE.a();
            this.a.j();
        } finally {
            this.a.i();
            this.h.f(akeVarE);
        }
    }

    @Override // defpackage.aqu
    public final int h(String str) {
        ais aisVarA = ais.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            aisVarA.f(1);
        } else {
            aisVarA.g(1, str);
        }
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            return cursorI.moveToFirst() ? gh.n(cursorI.getInt(0)) : 0;
        } finally {
            cursorI.close();
            aisVarA.j();
        }
    }

    @Override // defpackage.aqu
    public final List i() throws Throwable {
        ais aisVar;
        ais aisVarA = ais.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        aisVarA.e(1, 200L);
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
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
                int i = iL14;
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(iL9);
                    int i2 = iL9;
                    String string2 = cursorI.getString(iL11);
                    int i3 = iL11;
                    aml amlVar = new aml();
                    int i4 = iL;
                    amlVar.i = gh.l(cursorI.getInt(iL));
                    amlVar.b = cursorI.getInt(iL2) != 0;
                    amlVar.c = cursorI.getInt(iL3) != 0;
                    amlVar.d = cursorI.getInt(iL4) != 0;
                    amlVar.e = cursorI.getInt(iL5) != 0;
                    int i5 = iL2;
                    int i6 = iL3;
                    amlVar.f = cursorI.getLong(iL6);
                    amlVar.g = cursorI.getLong(iL7);
                    amlVar.h = gh.i(cursorI.getBlob(iL8));
                    aqt aqtVar = new aqt(string, string2);
                    aqtVar.p = gh.n(cursorI.getInt(iL10));
                    aqtVar.c = cursorI.getString(iL12);
                    aqtVar.d = amq.a(cursorI.getBlob(iL13));
                    int i7 = i;
                    aqtVar.e = amq.a(cursorI.getBlob(i7));
                    i = i7;
                    int i8 = iL15;
                    aqtVar.f = cursorI.getLong(i8);
                    int i9 = iL12;
                    int i10 = iL16;
                    aqtVar.g = cursorI.getLong(i10);
                    int i11 = iL4;
                    int i12 = iL17;
                    aqtVar.h = cursorI.getLong(i12);
                    int i13 = iL18;
                    aqtVar.j = cursorI.getInt(i13);
                    int i14 = iL19;
                    aqtVar.q = gh.k(cursorI.getInt(i14));
                    iL17 = i12;
                    int i15 = iL20;
                    aqtVar.k = cursorI.getLong(i15);
                    int i16 = iL21;
                    aqtVar.l = cursorI.getLong(i16);
                    iL21 = i16;
                    int i17 = iL22;
                    aqtVar.m = cursorI.getLong(i17);
                    int i18 = iL23;
                    aqtVar.n = cursorI.getLong(i18);
                    int i19 = iL24;
                    aqtVar.o = cursorI.getInt(i19) != 0;
                    int i20 = iL25;
                    aqtVar.r = gh.m(cursorI.getInt(i20));
                    aqtVar.i = amlVar;
                    arrayList.add(aqtVar);
                    iL25 = i20;
                    iL2 = i5;
                    iL12 = i9;
                    iL15 = i8;
                    iL16 = i10;
                    iL18 = i13;
                    iL23 = i18;
                    iL9 = i2;
                    iL11 = i3;
                    iL = i4;
                    iL24 = i19;
                    iL22 = i17;
                    iL3 = i6;
                    iL20 = i15;
                    iL4 = i11;
                    iL19 = i14;
                }
                cursorI.close();
                aisVar.j();
                return arrayList;
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

    @Override // defpackage.aqu
    public final void j(String str, long j) {
        this.a.g();
        ake akeVarE = this.i.e();
        akeVarE.e(1, j);
        if (str == null) {
            akeVarE.f(2);
        } else {
            akeVarE.g(2, str);
        }
        this.a.h();
        try {
            akeVarE.a();
            this.a.j();
        } finally {
            this.a.i();
            this.i.f(akeVarE);
        }
    }

    @Override // defpackage.aqu
    public final void k(int i, String... strArr) {
        this.a.g();
        StringBuilder sbE = fz.e();
        sbE.append("UPDATE workspec SET state=? WHERE id IN (");
        fz.f(sbE, 1);
        sbE.append(")");
        ake akeVarM = this.a.m(sbE.toString());
        akeVarM.e(1, gh.j(i));
        int i2 = 2;
        for (char c = 0; c <= 0; c = 1) {
            String str = strArr[0];
            if (str == null) {
                akeVarM.f(i2);
            } else {
                akeVarM.g(i2, str);
            }
            i2++;
        }
        this.a.h();
        try {
            akeVarM.a();
            this.a.j();
        } finally {
            this.a.i();
        }
    }

    public final void l(wy wyVar) {
        ArrayList arrayList;
        Set<String> setKeySet = wyVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (wyVar.j > 999) {
            wy wyVar2 = new wy(999);
            int i = wyVar.j;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                wyVar2.put((String) wyVar.f(i2), (ArrayList) wyVar.i(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    l(wyVar2);
                    wyVar2 = new wy(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                l(wyVar2);
                return;
            }
            return;
        }
        StringBuilder sbE = fz.e();
        sbE.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        fz.f(sbE, size);
        sbE.append(")");
        ais aisVarA = ais.a(sbE.toString(), size);
        int i4 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                aisVarA.f(i4);
            } else {
                aisVarA.g(i4, str);
            }
            i4++;
        }
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            int iK = fy.k(cursorI, "work_spec_id");
            if (iK != -1) {
                while (cursorI.moveToNext()) {
                    if (!cursorI.isNull(iK) && (arrayList = (ArrayList) wyVar.get(cursorI.getString(iK))) != null) {
                        arrayList.add(amq.a(cursorI.getBlob(0)));
                    }
                }
            }
        } finally {
            cursorI.close();
        }
    }

    public final void m(wy wyVar) {
        ArrayList arrayList;
        Set<String> setKeySet = wyVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (wyVar.j > 999) {
            wy wyVar2 = new wy(999);
            int i = wyVar.j;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                wyVar2.put((String) wyVar.f(i2), (ArrayList) wyVar.i(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    m(wyVar2);
                    wyVar2 = new wy(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                m(wyVar2);
                return;
            }
            return;
        }
        StringBuilder sbE = fz.e();
        sbE.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        fz.f(sbE, size);
        sbE.append(")");
        ais aisVarA = ais.a(sbE.toString(), size);
        int i4 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                aisVarA.f(i4);
            } else {
                aisVarA.g(i4, str);
            }
            i4++;
        }
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            int iK = fy.k(cursorI, "work_spec_id");
            if (iK != -1) {
                while (cursorI.moveToNext()) {
                    if (!cursorI.isNull(iK) && (arrayList = (ArrayList) wyVar.get(cursorI.getString(iK))) != null) {
                        arrayList.add(cursorI.getString(0));
                    }
                }
            }
        } finally {
            cursorI.close();
        }
    }
}
