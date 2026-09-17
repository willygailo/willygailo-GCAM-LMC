package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hlm implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public hlm(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hll get() {
        return new hll((Executor) this.a.get(), (lda) this.b.get(), (lda) this.c.get(), ((ing) this.d).a());
    }
}
