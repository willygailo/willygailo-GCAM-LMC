package defpackage;

import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public final class enb implements pys {
    private final qkg a;

    public enb(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UserManager get() {
        UserManager userManager = (UserManager) ((emr) this.a.get()).a(emr.m);
        qmd.ae(userManager);
        return userManager;
    }
}
