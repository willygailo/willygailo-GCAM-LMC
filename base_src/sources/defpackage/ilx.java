package defpackage;

import android.os.Environment;
import android.os.StatFs;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ilx {
    public static final ouj a = ouj.h("com/google/android/apps/camera/storage/spacechecker/StorageSpaceCheckerImpl");
    public final ljf b;
    public final lzh c;
    public final ddf d;
    public final iki e;
    private final Executor f;

    public ilx(iki ikiVar, Executor executor, ljf ljfVar, lzh lzhVar, ddf ddfVar) {
        this.e = ikiVar;
        this.f = executor;
        this.b = ljfVar;
        this.c = lzhVar;
        this.d = ddfVar;
    }

    public final pht a() {
        return b(this.f);
    }

    public final pht b(Executor executor) {
        return plk.Z(new Callable() { // from class: ilw
            /* JADX WARN: Code duplicated, block: B:16:0x007c A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x0002, B:5:0x0015, B:8:0x0033, B:10:0x003f, B:12:0x0050, B:14:0x005c, B:16:0x007c, B:18:0x0088, B:20:0x00a8, B:22:0x00ae, B:24:0x00ba, B:26:0x00db, B:28:0x00f8, B:30:0x011e), top: B:37:0x0002 }] */
            /* JADX WARN: Code duplicated, block: B:18:0x0088 A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x0002, B:5:0x0015, B:8:0x0033, B:10:0x003f, B:12:0x0050, B:14:0x005c, B:16:0x007c, B:18:0x0088, B:20:0x00a8, B:22:0x00ae, B:24:0x00ba, B:26:0x00db, B:28:0x00f8, B:30:0x011e), top: B:37:0x0002 }] */
            /* JADX WARN: Code duplicated, block: B:20:0x00a8 A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x0002, B:5:0x0015, B:8:0x0033, B:10:0x003f, B:12:0x0050, B:14:0x005c, B:16:0x007c, B:18:0x0088, B:20:0x00a8, B:22:0x00ae, B:24:0x00ba, B:26:0x00db, B:28:0x00f8, B:30:0x011e), top: B:37:0x0002 }] */
            /* JADX WARN: Code duplicated, block: B:26:0x00db A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x0002, B:5:0x0015, B:8:0x0033, B:10:0x003f, B:12:0x0050, B:14:0x005c, B:16:0x007c, B:18:0x0088, B:20:0x00a8, B:22:0x00ae, B:24:0x00ba, B:26:0x00db, B:28:0x00f8, B:30:0x011e), top: B:37:0x0002 }] */
            /* JADX WARN: Code duplicated, block: B:28:0x00f8 A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x0002, B:5:0x0015, B:8:0x0033, B:10:0x003f, B:12:0x0050, B:14:0x005c, B:16:0x007c, B:18:0x0088, B:20:0x00a8, B:22:0x00ae, B:24:0x00ba, B:26:0x00db, B:28:0x00f8, B:30:0x011e), top: B:37:0x0002 }] */
            /* JADX WARN: Code duplicated, block: B:30:0x011e A[Catch: all -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0137, blocks: (B:3:0x0002, B:5:0x0015, B:8:0x0033, B:10:0x003f, B:12:0x0050, B:14:0x005c, B:16:0x007c, B:18:0x0088, B:20:0x00a8, B:22:0x00ae, B:24:0x00ba, B:26:0x00db, B:28:0x00f8, B:30:0x011e), top: B:37:0x0002 }] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                StatFs statFs;
                long totalBytes;
                ilv ilvVarA;
                ljf ljfVar;
                ilx ilxVar = this.a;
                try {
                    ilxVar.b.e("checkSpace");
                    String externalStorageState = Environment.getExternalStorageState();
                    if (!"mounted".equals(externalStorageState)) {
                        ((oug) ((oug) ilx.a.c()).G(2993)).r("the current state of the primary shared/external storage media: %s", externalStorageState);
                        ilvVarA = ilv.a;
                        ljfVar = ilxVar.b;
                    } else if (!ilxVar.e.a().exists()) {
                        ilxVar.e.a();
                        if (!ilxVar.e.a().mkdirs() && !ilxVar.e.a().exists()) {
                            ((oug) ((oug) ilx.a.c()).G(2992)).r("failed to create the media folder: %s", ilxVar.e.a());
                            ilvVarA = ilv.a;
                            ljfVar = ilxVar.b;
                        } else if (!ilxVar.e.a().isDirectory()) {
                            ((oug) ((oug) ilx.a.c()).G(2990)).r("the media folder is not a folder: %s", ilxVar.e.a());
                            ilvVarA = ilv.a;
                            ljfVar = ilxVar.b;
                        } else if (!ilxVar.c.f || ilxVar.e.a().canWrite()) {
                            statFs = new StatFs(ilxVar.e.b());
                            totalBytes = statFs.getTotalBytes();
                            if (ilxVar.d.a(ddl.v).g()) {
                                ilvVarA = ilv.a(1048576 * ((long) ((Integer) ilxVar.d.a(ddl.v).c()).intValue()), totalBytes, 419430400L, 52428800L);
                                ljfVar = ilxVar.b;
                            } else {
                                ilvVarA = ilv.a(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong(), totalBytes, 419430400L, 52428800L);
                                ljfVar = ilxVar.b;
                            }
                        } else {
                            ((oug) ((oug) ilx.a.c()).G(2989)).r("the media folder is not writable: %s", ilxVar.e.a());
                            ilvVarA = ilv.a;
                            ljfVar = ilxVar.b;
                        }
                    } else if (!ilxVar.e.a().isDirectory()) {
                        ((oug) ((oug) ilx.a.c()).G(2990)).r("the media folder is not a folder: %s", ilxVar.e.a());
                        ilvVarA = ilv.a;
                        ljfVar = ilxVar.b;
                    } else if (ilxVar.c.f) {
                        statFs = new StatFs(ilxVar.e.b());
                        totalBytes = statFs.getTotalBytes();
                        if (ilxVar.d.a(ddl.v).g()) {
                            ilvVarA = ilv.a(1048576 * ((long) ((Integer) ilxVar.d.a(ddl.v).c()).intValue()), totalBytes, 419430400L, 52428800L);
                            ljfVar = ilxVar.b;
                        } else {
                            ilvVarA = ilv.a(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong(), totalBytes, 419430400L, 52428800L);
                            ljfVar = ilxVar.b;
                        }
                    } else {
                        statFs = new StatFs(ilxVar.e.b());
                        totalBytes = statFs.getTotalBytes();
                        if (ilxVar.d.a(ddl.v).g()) {
                            ilvVarA = ilv.a(1048576 * ((long) ((Integer) ilxVar.d.a(ddl.v).c()).intValue()), totalBytes, 419430400L, 52428800L);
                            ljfVar = ilxVar.b;
                        } else {
                            ilvVarA = ilv.a(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong(), totalBytes, 419430400L, 52428800L);
                            ljfVar = ilxVar.b;
                        }
                    }
                    ljfVar.f();
                    return ilvVarA;
                } catch (Throwable th) {
                    ilxVar.b.f();
                    throw th;
                }
            }
        }, executor);
    }
}
