package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class egn implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public egn(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static egn b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new egn(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egm get() {
        return new egm(((ego) this.a).get(), (hrx) this.b.get(), (Executor) this.c.get());
    }
}
