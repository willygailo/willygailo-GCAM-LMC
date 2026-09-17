package defpackage;

import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public final class eoa {
    private final ddf a;
    private final UserManager b;

    public eoa(ddf ddfVar, UserManager userManager) {
        this.a = ddfVar;
        this.b = userManager;
    }

    public final boolean a() {
        return this.a.k(ddl.ak) && this.b.isSystemUser();
    }
}
