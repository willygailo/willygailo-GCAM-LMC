package defpackage;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
final class nbh {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.UUID] */
    static PackageStats a(Context context) {
        UUID uuid;
        UUID uuidFromString;
        myw.f();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            ((oug) ((oug) a.b()).G((char) 3664)).o("StorageManager is not available");
            return null;
        }
        try {
            try {
                StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
                String packageName = context.getPackageName();
                PackageStats packageStats = new PackageStats(packageName);
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    if (storageVolume.getState().equals("mounted")) {
                        Object uuid2 = storageVolume.getUuid();
                        if (uuid2 == 0) {
                            try {
                                uuid2 = StorageManager.UUID_DEFAULT;
                                uuid = uuid2;
                            } catch (IllegalArgumentException e) {
                                ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3666)).r("Invalid UUID format: '%s'", uuid2);
                                uuid = 0;
                            }
                        } else {
                            uuidFromString = UUID.fromString(uuid2);
                        }
                        if (uuid != 0) {
                            try {
                                uuid = uuidFromString;
                                StorageStats storageStatsQueryStatsForPackage = storageStatsManager.queryStatsForPackage(uuid, packageName, Process.myUserHandle());
                                if (StorageManager.UUID_DEFAULT.equals(uuid)) {
                                    packageStats.codeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                    packageStats.dataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                    packageStats.cacheSize += storageStatsQueryStatsForPackage.getCacheBytes();
                                } else {
                                    packageStats.externalCodeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                    packageStats.externalDataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                    packageStats.externalCacheSize += storageStatsQueryStatsForPackage.getCacheBytes();
                                }
                            } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e2) {
                                ((oug) ((oug) ((oug) a.c()).h(e2)).G(3662)).o("queryStatsForPackage() call failed");
                            }
                        } else {
                            uuid = uuidFromString;
                        }
                    }
                }
                return packageStats;
            } catch (RuntimeException e3) {
                e = e3;
                ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3663)).o("StorageStatsManager is not available");
                return null;
            }
        } catch (Error e4) {
            e = e4;
            ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3663)).o("StorageStatsManager is not available");
            return null;
        }
    }
}
