package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fff {
    public static final lda a = new lce(true);

    static Boolean a(ddf ddfVar, boolean z, boolean z2) {
        boolean z3 = true;
        if ((!z && !z2 && !ddfVar.k(ddp.h)) || ((!ddfVar.k(ddp.e) && !ddfVar.k(ddp.d)) || (ddfVar.k(ddp.r) && ddfVar.k(ddp.q)))) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    public static Set b(final hyc hycVar, final fgb fgbVar, final lda ldaVar, final imt imtVar, final fez fezVar, final bqg bqgVar, boolean z) {
        return z ? ope.H(new iho() { // from class: ffe
            @Override // java.lang.Runnable
            public final void run() {
                bqg bqgVar2 = bqgVar;
                imt imtVar2 = imtVar;
                fez fezVar2 = fezVar;
                hyc hycVar2 = hycVar;
                fgb fgbVar2 = fgbVar;
                lda ldaVar2 = ldaVar;
                lda ldaVar3 = fff.a;
                bqgVar2.i().c(imtVar2.d(fezVar2));
                iau iauVarA = iav.a();
                iauVarA.a = "LensLite";
                iauVarA.b(ope.H(lwd.BACK));
                iauVarA.c(ope.H(jrl.PHOTO));
                iauVarA.d(ldaVar2);
                hycVar2.a(fgbVar2, iauVarA.a());
            }
        }) : orx.a;
    }
}
