package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqb implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public bqb(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqa get() {
        return new bqa(((emd) this.a).get(), (lar) this.b.get(), (brc) this.c.get(), (ddf) this.d.get());
    }
}
