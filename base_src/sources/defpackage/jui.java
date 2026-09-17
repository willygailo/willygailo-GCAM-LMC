package defpackage;

import android.os.UserManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jui implements pys {
    private final qkg a;

    public jui(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean get() {
        return Boolean.valueOf(((UserManager) ((emp) this.a).a().getSystemService("user")).isDemoUser());
    }
}
