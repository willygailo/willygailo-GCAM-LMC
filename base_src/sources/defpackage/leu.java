package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class leu implements leo {
    private final /* synthetic */ int a;

    public leu(int i) {
        this.a = i;
    }

    @Override // defpackage.leo
    public final ojc a(leb lebVar, lvs lvsVar, boolean z, ojc ojcVar, boolean z2) {
        les lesVarA;
        les lesVarA2;
        switch (this.a) {
            case 0:
                lep lepVarA = lep.a(lebVar);
                lepVarA.getClass();
                les lesVarBE = mip.bE(lvsVar, lepVarA);
                int iBF = mip.bF(lesVarBE.g, lebVar, z, ojcVar);
                if (z) {
                    ler lerVarB = les.b(lesVarBE);
                    lerVarB.i(5);
                    lerVarB.k(1);
                    lerVarB.j(65536);
                    lerVarB.h(iBF);
                    lesVarA = lerVarB.a();
                } else {
                    ler lerVarB2 = les.b(lesVarBE);
                    lerVarB2.i(2);
                    lerVarB2.k(8);
                    lerVarB2.j(32768);
                    lerVarB2.h(iBF);
                    lesVarA = lerVarB2.a();
                }
                if (z2) {
                    ler lerVarB3 = les.b(lesVarA);
                    lerVarB3.d(3);
                    lerVarB3.c(2);
                    lerVarB3.b(192000);
                    lerVarB3.e(48000);
                    lesVarA = lerVarB3.a();
                }
                return ojc.i(lesVarA);
            default:
                len lenVarA = len.a(lebVar);
                lenVarA.getClass();
                les lesVarBD = mip.bD(lvsVar, lenVarA);
                int iBF2 = mip.bF(lesVarBD.g, lebVar, z, ojcVar);
                if (z) {
                    ler lerVarB4 = les.b(lesVarBD);
                    lerVarB4.i(5);
                    lerVarB4.k(1);
                    lerVarB4.j(65536);
                    lerVarB4.h(iBF2);
                    lesVarA2 = lerVarB4.a();
                } else {
                    ler lerVarB5 = les.b(lesVarBD);
                    lerVarB5.i(2);
                    lerVarB5.k(1);
                    lerVarB5.j(32768);
                    lerVarB5.h(iBF2);
                    lesVarA2 = lerVarB5.a();
                }
                if (z2) {
                    ler lerVarB6 = les.b(lesVarA2);
                    lerVarB6.d(3);
                    lerVarB6.c(2);
                    lerVarB6.b(192000);
                    lerVarB6.e(48000);
                    lesVarA2 = lerVarB6.a();
                }
                return ojc.i(lesVarA2);
        }
    }
}
