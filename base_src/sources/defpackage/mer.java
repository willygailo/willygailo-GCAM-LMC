package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mer implements met {
    private final kgt a;

    public mer(kgt kgtVar) {
        this.a = kgtVar;
    }

    @Override // defpackage.met
    public final void a(psl pslVar) {
        if (pslVar != null) {
            kgp kgpVarA = this.a.a(pslVar);
            ppa ppaVar = kgpVarA.l;
            if (ppaVar.c) {
                ppaVar.m();
                ppaVar.c = false;
            }
            pyk pykVar = (pyk) ppaVar.b;
            pyk pykVar2 = pyk.j;
            pykVar.a |= 16;
            pykVar.d = 1;
            kgpVarA.a();
        }
    }
}
