package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mxk implements qkg {
    public final /* synthetic */ qkg a;
    private final /* synthetic */ int b;

    public /* synthetic */ mxk(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final Object get() {
        switch (this.b) {
            case 0:
                fsr fsrVar = (fsr) this.a;
                if (!fsrVar.b().g() || ((mxe) fsrVar.b().c()).b() == null) {
                    return null;
                }
                qkg qkgVarB = ((mxe) fsrVar.b().c()).b();
                qkgVarB.getClass();
                return (qxe) qkgVarB.get();
            case 1:
                return (gtt) this.a.get();
            default:
                return (nbu) this.a.get();
        }
    }
}
