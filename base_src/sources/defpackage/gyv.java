package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gyv implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public gyv(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static gyv a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gyv(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final meh get() {
        return new meh(this.a, this.b, this.c, (char[]) null);
    }
}
