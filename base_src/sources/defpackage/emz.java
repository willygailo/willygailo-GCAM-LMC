package defpackage;

import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class emz implements pys {
    private final qkg a;

    public emz(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static PowerManager b(emr emrVar) {
        PowerManager powerManager = (PowerManager) emrVar.a(emr.j);
        qmd.ae(powerManager);
        return powerManager;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PowerManager get() {
        return b((emr) this.a.get());
    }
}
