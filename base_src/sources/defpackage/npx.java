package defpackage;

import android.database.Cursor;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class npx extends aiq {
    final /* synthetic */ F250RoomDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npx(F250RoomDatabase_Impl f250RoomDatabase_Impl) {
        super(5);
        this.b = f250RoomDatabase_Impl;
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
        HashMap map = new HashMap(25);
        map.put("title", new ajf("title", "TEXT", false, 0, null, 1));
        map.put("experienceId", new ajf("experienceId", "TEXT", false, 0, null, 1));
        map.put("queryableTags", new ajf("queryableTags", "TEXT", true, 0, null, 1));
        map.put("queryableEpochTimestamp", new ajf("queryableEpochTimestamp", "INTEGER", false, 0, null, 1));
        map.put("queryableDuration", new ajf("queryableDuration", "INTEGER", false, 0, null, 1));
        map.put("approximateTotalSize", new ajf("approximateTotalSize", "INTEGER", true, 0, null, 1));
        map.put("namespaceId", new ajf("namespaceId", "TEXT", false, 0, null, 1));
        map.put("partitionId", new ajf("partitionId", "TEXT", false, 0, null, 1));
        map.put("f250ResourceId", new ajf("f250ResourceId", "TEXT", false, 0, null, 1));
        map.put("f250AutoUploadDelay", new ajf("f250AutoUploadDelay", "INTEGER", false, 0, null, 1));
        map.put("airlockExpiration", new ajf("airlockExpiration", "INTEGER", false, 0, null, 1));
        map.put("f250Expiration", new ajf("f250Expiration", "INTEGER", false, 0, null, 1));
        map.put("deleteAirlockFilesOnceUploaded", new ajf("deleteAirlockFilesOnceUploaded", "INTEGER", true, 0, null, 1));
        map.put("nonSignedInDataOwners", new ajf("nonSignedInDataOwners", "TEXT", true, 0, null, 1));
        map.put("overridenObfuscatedGaiaId", new ajf("overridenObfuscatedGaiaId", "TEXT", false, 0, null, 1));
        map.put("uploadTransferHandle", new ajf("uploadTransferHandle", "TEXT", false, 0, null, 1));
        map.put("relations", new ajf("relations", "BLOB", false, 0, null, 1));
        map.put("indexTokens", new ajf("indexTokens", "BLOB", false, 0, null, 1));
        map.put("onDeviceId", new ajf("onDeviceId", "INTEGER", true, 1, null, 1));
        map.put("status_addedToAirlockEpochTimestamp", new ajf("status_addedToAirlockEpochTimestamp", "INTEGER", true, 0, null, 1));
        map.put("status_uploadToF250RequestedEpochTimestamp", new ajf("status_uploadToF250RequestedEpochTimestamp", "INTEGER", false, 0, null, 1));
        map.put("status_uploadToF250CompletedEpochTimestamp", new ajf("status_uploadToF250CompletedEpochTimestamp", "INTEGER", false, 0, null, 1));
        map.put("status_airlockFileState", new ajf("status_airlockFileState", "INTEGER", true, 0, null, 1));
        map.put("status_uploadState", new ajf("status_uploadState", "INTEGER", true, 0, null, 1));
        map.put("status_uploadProgressPercent", new ajf("status_uploadProgressPercent", "REAL", true, 0, null, 1));
        ajj ajjVar = new ajj("ResourceEntity", map, new HashSet(0), new HashSet(0));
        ajj ajjVarA = ajj.a(ajyVar, "ResourceEntity");
        if (!ajjVar.equals(ajjVarA)) {
            String strValueOf = String.valueOf(ajjVar);
            String strValueOf2 = String.valueOf(ajjVarA);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + R.styleable.AppCompatTheme_windowMinWidthMinor + String.valueOf(strValueOf2).length());
            sb.append("ResourceEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceEntity).\n Expected:\n");
            sb.append(strValueOf);
            sb.append("\n Found:\n");
            sb.append(strValueOf2);
            return new air(false, sb.toString());
        }
        HashSet hashSet = new HashSet(6);
        hashSet.add("experienceId");
        hashSet.add("queryableTags");
        hashSet.add("namespaceId");
        hashSet.add("partitionId");
        hashSet.add("f250ResourceId");
        hashSet.add("nonSignedInDataOwners");
        aje ajeVar = new aje(hashSet);
        Cursor cursorB = ajyVar.b("PRAGMA table_info(`ResourceFts`)");
        HashSet hashSet2 = new HashSet();
        try {
            if (cursorB.getColumnCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("name");
                while (cursorB.moveToNext()) {
                    hashSet2.add(cursorB.getString(columnIndex));
                }
            }
            cursorB.close();
            Cursor cursorB2 = ajyVar.b("SELECT * FROM sqlite_master WHERE `name` = 'ResourceFts'");
            try {
                String string = cursorB2.moveToFirst() ? cursorB2.getString(cursorB2.getColumnIndexOrThrow("sql")) : "";
                cursorB2.close();
                aje ajeVar2 = new aje(hashSet2, aje.a(string));
                if (!ajeVar.equals(ajeVar2)) {
                    String strValueOf3 = String.valueOf(ajeVar);
                    String strValueOf4 = String.valueOf(ajeVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + R.styleable.AppCompatTheme_windowActionModeOverlay + String.valueOf(strValueOf4).length());
                    sb2.append("ResourceFts(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceFts).\n Expected:\n");
                    sb2.append(strValueOf3);
                    sb2.append("\n Found:\n");
                    sb2.append(strValueOf4);
                    return new air(false, sb2.toString());
                }
                HashMap map2 = new HashMap(15);
                map2.put("resourceOnDeviceId", new ajf("resourceOnDeviceId", "INTEGER", true, 0, null, 1));
                map2.put("isAttachment", new ajf("isAttachment", "INTEGER", true, 0, null, 1));
                map2.put("id", new ajf("id", "TEXT", false, 0, null, 1));
                map2.put("contentType", new ajf("contentType", "TEXT", false, 0, null, 1));
                map2.put("onDeviceSize", new ajf("onDeviceSize", "INTEGER", true, 0, null, 1));
                map2.put("uploadTransferHandle", new ajf("uploadTransferHandle", "TEXT", false, 0, null, 1));
                map2.put("blobstoreId", new ajf("blobstoreId", "TEXT", false, 0, null, 1));
                map2.put("contentHash", new ajf("contentHash", "TEXT", false, 0, null, 1));
                map2.put("onDeviceId", new ajf("onDeviceId", "INTEGER", true, 1, null, 1));
                map2.put("status_addedToAirlockEpochTimestamp", new ajf("status_addedToAirlockEpochTimestamp", "INTEGER", true, 0, null, 1));
                map2.put("status_uploadToF250RequestedEpochTimestamp", new ajf("status_uploadToF250RequestedEpochTimestamp", "INTEGER", false, 0, null, 1));
                map2.put("status_uploadToF250CompletedEpochTimestamp", new ajf("status_uploadToF250CompletedEpochTimestamp", "INTEGER", false, 0, null, 1));
                map2.put("status_airlockFileState", new ajf("status_airlockFileState", "INTEGER", true, 0, null, 1));
                map2.put("status_uploadState", new ajf("status_uploadState", "INTEGER", true, 0, null, 1));
                map2.put("status_uploadProgressPercent", new ajf("status_uploadProgressPercent", "REAL", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new ajg("ResourceEntity", "NO ACTION", "NO ACTION", Arrays.asList("resourceOnDeviceId"), Arrays.asList("onDeviceId")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new aji("index_AnnotachmentEntity_resourceOnDeviceId", false, Arrays.asList("resourceOnDeviceId"), Arrays.asList("ASC")));
                ajj ajjVar2 = new ajj("AnnotachmentEntity", map2, hashSet3, hashSet4);
                ajj ajjVarA2 = ajj.a(ajyVar, "AnnotachmentEntity");
                if (!ajjVar2.equals(ajjVarA2)) {
                    String strValueOf5 = String.valueOf(ajjVar2);
                    String strValueOf6 = String.valueOf(ajjVarA2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf5).length() + 133 + String.valueOf(strValueOf6).length());
                    sb3.append("AnnotachmentEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.AnnotachmentEntity).\n Expected:\n");
                    sb3.append(strValueOf5);
                    sb3.append("\n Found:\n");
                    sb3.append(strValueOf6);
                    return new air(false, sb3.toString());
                }
                HashMap map3 = new HashMap(6);
                map3.put("id", new ajf("id", "INTEGER", true, 1, null, 1));
                map3.put("resourceOnDeviceIds", new ajf("resourceOnDeviceIds", "TEXT", true, 0, null, 1));
                map3.put("f250LogAction", new ajf("f250LogAction", "TEXT", true, 0, null, 1));
                map3.put("logEpochTimestamp", new ajf("logEpochTimestamp", "INTEGER", true, 0, null, 1));
                map3.put("f250LogReason", new ajf("f250LogReason", "INTEGER", true, 0, null, 1));
                map3.put("errorMessage", new ajf("errorMessage", "TEXT", false, 0, null, 1));
                ajj ajjVar3 = new ajj("F250LogEntity", map3, new HashSet(0), new HashSet(0));
                ajj ajjVarA3 = ajj.a(ajyVar, "F250LogEntity");
                if (ajjVar3.equals(ajjVarA3)) {
                    return new air(true, null);
                }
                String strValueOf7 = String.valueOf(ajjVar3);
                String strValueOf8 = String.valueOf(ajjVarA3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf7).length() + R.styleable.AppCompatTheme_windowFixedWidthMinor + String.valueOf(strValueOf8).length());
                sb4.append("F250LogEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250LogEntity).\n Expected:\n");
                sb4.append(strValueOf7);
                sb4.append("\n Found:\n");
                sb4.append(strValueOf8);
                return new air(false, sb4.toString());
            } catch (Throwable th) {
                cursorB2.close();
                throw th;
            }
        } catch (Throwable th2) {
            cursorB.close();
            throw th2;
        }
    }

    @Override // defpackage.aiq
    public final void c(ajy ajyVar) {
        ajyVar.g("CREATE TABLE IF NOT EXISTS `ResourceEntity` (`title` TEXT, `experienceId` TEXT, `queryableTags` TEXT NOT NULL, `queryableEpochTimestamp` INTEGER, `queryableDuration` INTEGER, `approximateTotalSize` INTEGER NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `f250AutoUploadDelay` INTEGER, `airlockExpiration` INTEGER, `f250Expiration` INTEGER, `deleteAirlockFilesOnceUploaded` INTEGER NOT NULL, `nonSignedInDataOwners` TEXT NOT NULL, `overridenObfuscatedGaiaId` TEXT, `uploadTransferHandle` TEXT, `relations` BLOB, `indexTokens` BLOB, `onDeviceId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status_addedToAirlockEpochTimestamp` INTEGER NOT NULL, `status_uploadToF250RequestedEpochTimestamp` INTEGER, `status_uploadToF250CompletedEpochTimestamp` INTEGER, `status_airlockFileState` INTEGER NOT NULL, `status_uploadState` INTEGER NOT NULL, `status_uploadProgressPercent` REAL NOT NULL)");
        ajyVar.g("CREATE VIRTUAL TABLE IF NOT EXISTS `ResourceFts` USING FTS4(`experienceId` TEXT, `queryableTags` TEXT NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `nonSignedInDataOwners` TEXT NOT NULL, content=`ResourceEntity`)");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_UPDATE BEFORE UPDATE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_DELETE BEFORE DELETE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_UPDATE AFTER UPDATE ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_INSERT AFTER INSERT ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `AnnotachmentEntity` (`resourceOnDeviceId` INTEGER NOT NULL, `isAttachment` INTEGER NOT NULL, `id` TEXT, `contentType` TEXT, `onDeviceSize` INTEGER NOT NULL, `uploadTransferHandle` TEXT, `blobstoreId` TEXT, `contentHash` TEXT, `onDeviceId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status_addedToAirlockEpochTimestamp` INTEGER NOT NULL, `status_uploadToF250RequestedEpochTimestamp` INTEGER, `status_uploadToF250CompletedEpochTimestamp` INTEGER, `status_airlockFileState` INTEGER NOT NULL, `status_uploadState` INTEGER NOT NULL, `status_uploadProgressPercent` REAL NOT NULL, FOREIGN KEY(`resourceOnDeviceId`) REFERENCES `ResourceEntity`(`onDeviceId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        ajyVar.g("CREATE INDEX IF NOT EXISTS `index_AnnotachmentEntity_resourceOnDeviceId` ON `AnnotachmentEntity` (`resourceOnDeviceId`)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS `F250LogEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceOnDeviceIds` TEXT NOT NULL, `f250LogAction` TEXT NOT NULL, `logEpochTimestamp` INTEGER NOT NULL, `f250LogReason` INTEGER NOT NULL, `errorMessage` TEXT)");
        ajyVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ajyVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7be8e383f6d467ee893379ce9fd98a66')");
    }

    @Override // defpackage.aiq
    public final void d(ajy ajyVar) {
        ajyVar.g("DROP TABLE IF EXISTS `ResourceEntity`");
        ajyVar.g("DROP TABLE IF EXISTS `ResourceFts`");
        ajyVar.g("DROP TABLE IF EXISTS `AnnotachmentEntity`");
        ajyVar.g("DROP TABLE IF EXISTS `F250LogEntity`");
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
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_UPDATE BEFORE UPDATE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_DELETE BEFORE DELETE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_UPDATE AFTER UPDATE ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        ajyVar.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_INSERT AFTER INSERT ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
    }

    @Override // defpackage.aiq
    public final void g(ajy ajyVar) {
        fy.j(ajyVar);
    }
}
