package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jda implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public jda(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jcz get() {
        return new jcz(((emd) this.a).get(), (ius) this.b.get(), this.c, ((Boolean) this.d.get()).booleanValue(), (hnx) this.e.get(), (ddf) this.f.get());
    }
}
