package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class her implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public her(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static her a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new her(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final meh get() {
        return new meh(this.a, this.b, this.d, (byte[]) null);
    }
}
