package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gzb implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public gzb(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public static gzb a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new gzb(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mbg get() {
        return new mbg(this.a, this.b, this.c, this.d, this.e, (byte[]) null, (char[]) null);
    }
}
