package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jtn implements pys {
    private final qkg a;
    private final qkg b;

    public jtn(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PackageInfo get() {
        try {
            PackageInfo packageInfo = ((jto) this.a).get().getPackageInfo(((emp) this.b).a().getPackageName(), 0);
            qmd.ae(packageInfo);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("getPackageInfo for getPackageName should always succeed.", e);
        }
    }
}
