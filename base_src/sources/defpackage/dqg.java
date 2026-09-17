package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dqg {
    public static final /* synthetic */ int a = 0;
    private static final ope b = ope.J(jrl.PHOTO, jrl.PORTRAIT, jrl.LONG_EXPOSURE);

    public static Set a(ddf ddfVar, final qkg qkgVar, final qkg qkgVar2, final qkg qkgVar3) {
        if (!ddfVar.k(ddl.aB)) {
            return orx.a;
        }
        jrl jrlVar = (jrl) ((dqe) qkgVar.get()).c.get();
        if ((jrlVar == jrl.PHOTO || ddfVar.k(ddl.aC)) && b.contains(jrlVar)) {
            return ope.H(aas.d(new Runnable() { // from class: dqf
                @Override // java.lang.Runnable
                public final void run() {
                    qkg qkgVar4 = qkgVar;
                    qkg qkgVar5 = qkgVar2;
                    qkg qkgVar6 = qkgVar3;
                    int i = dqg.a;
                    ((dqe) qkgVar4.get()).a.c((dqi) qkgVar5.get());
                    ((lap) qkgVar6.get()).c(new fsw(qkgVar4, 1));
                }
            }, "fastzoom"));
        }
        return orx.a;
    }
}
