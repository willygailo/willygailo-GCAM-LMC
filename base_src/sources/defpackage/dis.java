package defpackage;

import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dis extends aiq {
    final /* synthetic */ ShotDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dis(ShotDatabase_Impl shotDatabase_Impl) {
        super(9);
        this.b = shotDatabase_Impl;
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
        HashMap map = new HashMap(12);
        map.put("shot_id", new ajf("shot_id", "INTEGER", true, 1, null, 1));
        map.put("title", new ajf("title", "TEXT", false, 0, null, 1));
        map.put("start_millis", new ajf("start_millis", "INTEGER", true, 0, null, 1));
        map.put("persisted_millis", new ajf("persisted_millis", "INTEGER", true, 0, null, 1));
        map.put("canceled_millis", new ajf("canceled_millis", "INTEGER", true, 0, null, 1));
        map.put("deleted_millis", new ajf("deleted_millis", "INTEGER", true, 0, null, 1));
        map.put("most_recent_event_millis", new ajf("most_recent_event_millis", "INTEGER", true, 0, null, 1));
        map.put("capture_session_type", new ajf("capture_session_type", "TEXT", false, 0, null, 1));
        map.put("capture_session_shot_id", new ajf("capture_session_shot_id", "TEXT", false, 0, null, 1));
        map.put("pid", new ajf("pid", "INTEGER", true, 0, null, 1));
        map.put("stuck", new ajf("stuck", "INTEGER", true, 0, null, 1));
        map.put("failed", new ajf("failed", "INTEGER", true, 0, null, 1));
        ajj ajjVar = new ajj("shots", map, new HashSet(0), new HashSet(0));
        ajj ajjVarA = ajj.a(ajyVar, "shots");
        if (!ajjVar.equals(ajjVarA)) {
            String strValueOf = String.valueOf(ajjVar);
            String strValueOf2 = String.valueOf(ajjVarA);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 91 + String.valueOf(strValueOf2).length());
            sb.append("shots(com.google.android.apps.camera.debug.shottracker.db.ShotEntity).\n Expected:\n");
            sb.append(strValueOf);
            sb.append("\n Found:\n");
            sb.append(strValueOf2);
            return new air(false, sb.toString());
        }
        HashMap map2 = new HashMap(4);
        map2.put("sequence", new ajf("sequence", "INTEGER", true, 1, null, 1));
        map2.put("shot_id", new ajf("shot_id", "INTEGER", true, 0, null, 1));
        map2.put("time_millis", new ajf("time_millis", "INTEGER", true, 0, null, 1));
        map2.put("message", new ajf("message", "TEXT", false, 0, null, 1));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new ajg("shots", "CASCADE", "NO ACTION", Arrays.asList("shot_id"), Arrays.asList("shot_id")));
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new aji("index_shot_log_shot_id_sequence", false, Arrays.asList("shot_id", "sequence"), Arrays.asList("ASC", "ASC")));
        ajj ajjVar2 = new ajj("shot_log", map2, hashSet, hashSet2);
        ajj ajjVarA2 = ajj.a(ajyVar, "shot_log");
        if (ajjVar2.equals(ajjVarA2)) {
            return new air(true, null);
        }
        String strValueOf3 = String.valueOf(ajjVar2);
        String strValueOf4 = String.valueOf(ajjVarA2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 97 + String.valueOf(strValueOf4).length());
        sb2.append("shot_log(com.google.android.apps.camera.debug.shottracker.db.ShotLogEntity).\n Expected:\n");
        sb2.append(strValueOf3);
        sb2.append("\n Found:\n");
        sb2.append(strValueOf4);
        return new air(false, sb2.toString());
    }

    @Override // defpackage.aiq
    public final void c(ajy ajyVar) {
        ajyVar.g("CREATE TABLE IF NOT EXISTS `shots` (`shot_id` INTEGER NOT NULL, `title` TEXT, `start_millis` INTEGER NOT NULL, `persisted_millis` INTEGER NOT NULL, `canceled_millis` INTEGER NOT NULL, `deleted_millis` INTEGER NOT NULL, `most_recent_event_millis` INTEGER NOT NULL, `capture_session_type` TEXT, `capture_session_shot_id` TEXT, `pid` INTEGER NOT NULL, `stuck` INTEGER NOT NULL, `failed` INTEGER NOT NULL, PRIMARY KEY(`shot_id`))");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `shot_log` (`sequence` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `shot_id` INTEGER NOT NULL, `time_millis` INTEGER NOT NULL, `message` TEXT, FOREIGN KEY(`shot_id`) REFERENCES `shots`(`shot_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_shot_log_shot_id_sequence` ON `shot_log` (`shot_id`, `sequence`)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ajyVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd5a320f0e030e16072c0c60f65398e1d')");
    }

    @Override // defpackage.aiq
    public final void d(ajy ajyVar) {
        ajyVar.g("DROP TABLE IF EXISTS `shots`");
        ajyVar.g("DROP TABLE IF EXISTS `shot_log`");
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
