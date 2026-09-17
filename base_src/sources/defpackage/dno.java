package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dno implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public dno(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static dno b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new dno(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dnn get() {
        return new dnn((lzi) this.a.get(), dln.a(), (Executor) this.b.get(), ((Integer) this.c.get()).intValue(), (ddf) this.d.get());
    }
}
