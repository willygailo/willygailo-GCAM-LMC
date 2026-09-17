package defpackage;

import android.app.KeyguardManager;

/* JADX INFO: loaded from: classes.dex */
public final class emw implements pys {
    private final qkg a;

    public emw(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final KeyguardManager get() {
        KeyguardManager keyguardManager = (KeyguardManager) ((emr) this.a.get()).a(emr.g);
        qmd.ae(keyguardManager);
        return keyguardManager;
    }
}
