package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class bbw {
    private volatile bdk a;
    private final bdo b;

    public bbw(bdo bdoVar) {
        this.b = bdoVar;
    }

    public final bdk a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    bdq bdqVar = this.b.a;
                    File cacheDir = bdqVar.a.getCacheDir();
                    bdp bdpVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, bdqVar.b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        bdpVar = new bdp(file);
                    }
                    this.a = bdpVar;
                }
                if (this.a == null) {
                    this.a = new bdl();
                }
            }
        }
        return this.a;
    }
}
