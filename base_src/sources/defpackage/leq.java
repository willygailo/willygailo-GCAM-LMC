package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class leq implements leo {
    public final lew a;

    public leq(lew lewVar) {
        this.a = lewVar;
    }

    @Override // defpackage.leo
    public final ojc a(leb lebVar, lvs lvsVar, boolean z, ojc ojcVar, boolean z2) {
        les lesVarA;
        les lesVar = this.a.d;
        if (lesVar == null) {
            return oih.a;
        }
        int iBF = mip.bF(lesVar.g, lebVar, z, ojcVar);
        if (z) {
            ler lerVarB = les.b(lesVar);
            lerVarB.i(5);
            lerVarB.k(1);
            lerVarB.j(65536);
            lerVarB.h(iBF);
            lesVarA = lerVarB.a();
        } else {
            ler lerVarB2 = les.b(lesVar);
            lerVarB2.i(2);
            lerVarB2.k(8);
            lerVarB2.j(32768);
            lerVarB2.h(iBF);
            lesVarA = lerVarB2.a();
        }
        return ojc.i(lesVarA);
    }
}
