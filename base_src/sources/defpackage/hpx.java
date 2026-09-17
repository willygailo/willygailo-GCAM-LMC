package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class hpx implements pys {
    private final qkg a;

    public hpx(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final File get() {
        File cacheDir = ((emp) this.a).a().getCacheDir();
        qmd.ae(cacheDir);
        return cacheDir;
    }
}
