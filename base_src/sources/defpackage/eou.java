package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eou implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public eou(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eos get() {
        return new eos((jtx) this.a.get(), (fix) this.b.get(), (Executor) this.c.get(), (ddf) this.d.get(), null, null);
    }
}
