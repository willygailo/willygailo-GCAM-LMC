package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cbi implements pys {
    private final qkg a;
    private final qkg b;

    public cbi(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbl get() {
        return new cbb((Executor) this.a.get(), ((pyw) this.b).get());
    }
}
