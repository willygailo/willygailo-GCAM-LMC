package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dlg implements bvv {
    private final dll a;
    private final dli b;
    private final lar c;
    private final bqg d;
    private final fhv e;

    public dlg(dll dllVar, bqg bqgVar, fhv fhvVar, dli dliVar, lar larVar) {
        this.a = dllVar;
        this.d = bqgVar;
        this.e = fhvVar;
        this.b = dliVar;
        this.c = larVar;
    }

    @Override // defpackage.bvv
    public final /* synthetic */ String c() {
        return aas.g(this);
    }

    @Override // defpackage.bvv
    public final pht fz() {
        enl.f(this.c, this.e, this.b);
        lap lapVarI = this.d.i();
        dll dllVar = this.a;
        dli dliVar = this.b;
        dllVar.a.add(dliVar);
        lapVarI.c(new dlk(dllVar, dliVar));
        return plk.V(true);
    }
}
