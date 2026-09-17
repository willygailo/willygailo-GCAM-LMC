package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aoe extends aiq {
    final /* synthetic */ WorkDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoe(WorkDatabase_Impl workDatabase_Impl) {
        super(12);
        this.b = workDatabase_Impl;
    }

    @Override // defpackage.aiq
    public final void a() {
        List list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
    }

    @Override // defpackage.aiq
    public final air b(ajy ajyVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new ajf("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new ajf("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new ajg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new ajg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new aji("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new aji("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        ajj ajjVar = new ajj("Dependency", map, hashSet, hashSet2);
        ajj ajjVarA = ajj.a(ajyVar, "Dependency");
        if (!ajjVar.equals(ajjVarA)) {
            return new air(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + ajjVar + "\n Found:\n" + ajjVarA);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new ajf("id", "TEXT", true, 1, null, 1));
        map2.put("state", new ajf("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new ajf("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new ajf("input_merger_class_name", "TEXT", false, 0, null, 1));
        map2.put("input", new ajf("input", "BLOB", true, 0, null, 1));
        map2.put("output", new ajf("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new ajf("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new ajf("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new ajf("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new ajf("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new ajf("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new ajf("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("period_start_time", new ajf("period_start_time", "INTEGER", true, 0, null, 1));
        map2.put("minimum_retention_duration", new ajf("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new ajf("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new ajf("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new ajf("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("required_network_type", new ajf("required_network_type", "INTEGER", false, 0, null, 1));
        map2.put("requires_charging", new ajf("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new ajf("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new ajf("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new ajf("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new ajf("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new ajf("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new ajf("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new aji("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new aji("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        ajj ajjVar2 = new ajj("WorkSpec", map2, hashSet3, hashSet4);
        ajj ajjVarA2 = ajj.a(ajyVar, "WorkSpec");
        if (!ajjVar2.equals(ajjVarA2)) {
            return new air(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + ajjVar2 + "\n Found:\n" + ajjVarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new ajf("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new ajf("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new ajg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new aji("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        ajj ajjVar3 = new ajj("WorkTag", map3, hashSet5, hashSet6);
        ajj ajjVarA3 = ajj.a(ajyVar, "WorkTag");
        if (!ajjVar3.equals(ajjVarA3)) {
            return new air(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + ajjVar3 + "\n Found:\n" + ajjVarA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new ajf("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("system_id", new ajf("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new ajg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        ajj ajjVar4 = new ajj("SystemIdInfo", map4, hashSet7, new HashSet(0));
        ajj ajjVarA4 = ajj.a(ajyVar, "SystemIdInfo");
        if (!ajjVar4.equals(ajjVarA4)) {
            return new air(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + ajjVar4 + "\n Found:\n" + ajjVarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new ajf("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new ajf("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new ajg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new aji("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        ajj ajjVar5 = new ajj("WorkName", map5, hashSet8, hashSet9);
        ajj ajjVarA5 = ajj.a(ajyVar, "WorkName");
        if (!ajjVar5.equals(ajjVarA5)) {
            return new air(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + ajjVar5 + "\n Found:\n" + ajjVarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new ajf("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new ajf("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new ajg("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        ajj ajjVar6 = new ajj("WorkProgress", map6, hashSet10, new HashSet(0));
        ajj ajjVarA6 = ajj.a(ajyVar, "WorkProgress");
        if (!ajjVar6.equals(ajjVarA6)) {
            return new air(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + ajjVar6 + "\n Found:\n" + ajjVarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new ajf("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new ajf("long_value", "INTEGER", false, 0, null, 1));
        ajj ajjVar7 = new ajj("Preference", map7, new HashSet(0), new HashSet(0));
        ajj ajjVarA7 = ajj.a(ajyVar, "Preference");
        if (ajjVar7.equals(ajjVarA7)) {
            return new air(true, null);
        }
        return new air(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + ajjVar7 + "\n Found:\n" + ajjVarA7);
    }

    @Override // defpackage.aiq
    public final void c(ajy ajyVar) {
        ajyVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        ajyVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ajyVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // defpackage.aiq
    public final void d(ajy ajyVar) {
        ajyVar.g("DROP TABLE IF EXISTS `Dependency`");
        ajyVar.g("DROP TABLE IF EXISTS `WorkSpec`");
        ajyVar.g("DROP TABLE IF EXISTS `WorkTag`");
        ajyVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        ajyVar.g("DROP TABLE IF EXISTS `WorkName`");
        ajyVar.g("DROP TABLE IF EXISTS `WorkProgress`");
        ajyVar.g("DROP TABLE IF EXISTS `Preference`");
        List list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
    }

    @Override // defpackage.aiq
    public final void e(ajy ajyVar) {
        this.b.l = ajyVar;
        ajyVar.g("PRAGMA foreign_keys = ON");
        this.b.p(ajyVar);
        List list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((fx) this.b.f.get(i)).p(ajyVar);
            }
        }
    }

    @Override // defpackage.aiq
    public final void f(ajy ajyVar) {
    }

    @Override // defpackage.aiq
    public final void g(ajy ajyVar) {
        fy.j(ajyVar);
    }
}
