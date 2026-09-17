package defpackage;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jto implements pys {
    private final qkg a;

    public jto(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PackageManager get() {
        PackageManager packageManager = ((emp) this.a).a().getPackageManager();
        qmd.ae(packageManager);
        return packageManager;
    }
}
