package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ego implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public ego(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static ego b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new ego(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egk get() {
        return new egk((pko) this.a.get(), ((brh) this.b).get(), (ljf) this.c.get());
    }
}
