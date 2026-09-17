package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gkt implements pys {
    private final qkg a;

    public gkt(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gkt b(qkg qkgVar) {
        return new gkt(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gks get() {
        return new gks((Executor) this.a.get());
    }
}
