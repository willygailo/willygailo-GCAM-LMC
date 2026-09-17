package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class exn implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public exn(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final exm get() {
        return new exm((fnv) this.a.get(), pyr.a(this.b), pyr.a(this.c), (ivj) this.d.get(), ((emf) this.e).get());
    }
}
