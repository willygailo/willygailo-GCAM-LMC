package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ify implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public ify(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ifx get() {
        return new ifx(((emp) this.a).a(), (lco) this.b.get(), this.c, (Executor) this.d.get());
    }
}
