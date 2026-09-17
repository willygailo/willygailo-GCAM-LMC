package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ljt implements pys {
    private final qkg a;
    private final qkg b;

    public ljt(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ljs get() {
        return new ljs(((liq) this.a).get(), (Executor) this.b.get());
    }
}
