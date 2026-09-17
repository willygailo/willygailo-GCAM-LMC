package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ott extends otx {
    public final oqw a;
    private final int b;
    private final otq c;

    public ott(oqw oqwVar, otq otqVar) {
        this.a = oqwVar;
        this.c = otqVar;
        this.b = oqwVar.j().size() + 1;
    }

    @Override // defpackage.otx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.otx
    public final pfc b(Object obj) {
        pfb pfbVarB = pfc.b();
        this.c.a(obj, new ots(this, pfbVarB));
        return pfbVarB.a();
    }
}
