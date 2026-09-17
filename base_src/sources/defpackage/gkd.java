package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gkd implements pys {
    private final qkg a;
    private final qkg b;

    public gkd(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hnm get() {
        ddf ddfVar = (ddf) this.a.get();
        ((emp) this.b).a();
        hnn hnnVar = ddfVar.k(ddl.bf) ? new hnn(1) : new hnn(0);
        ddfVar.e();
        return hnnVar;
    }
}
