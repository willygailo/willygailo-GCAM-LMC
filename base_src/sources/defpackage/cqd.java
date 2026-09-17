package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cqd implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public cqd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cqc get() {
        return new cqc(((cpk) this.a).get(), (fix) this.b.get(), (jtx) this.c.get(), (cvh) this.d.get());
    }
}
