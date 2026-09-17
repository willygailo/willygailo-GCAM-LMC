package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class otu extends otx {
    protected final oiu a;

    protected otu(oiu oiuVar) {
        this.a = oiuVar;
    }

    @Override // defpackage.otx
    public final pfc b(Object obj) {
        pfc pfcVar = (pfc) this.a.a(obj);
        pfb pfbVarC = pfc.c(pfcVar.c);
        for (int i = 0; i < pfcVar.c; i++) {
            pfbVarC.b(c(pfcVar.a(i)));
        }
        return pfbVarC.a();
    }

    public abstract int c(int i);
}
