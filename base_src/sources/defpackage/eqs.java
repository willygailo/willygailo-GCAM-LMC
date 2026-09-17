package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqs implements Runnable {
    public final /* synthetic */ eqx a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqs(eqx eqxVar, int i) {
        this.b = i;
        this.a = eqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eqx eqxVar = this.a;
                try {
                    ovd ovdVar = ovl.a;
                    eqxVar.i.e("Lasagna#initialize");
                    List listG = eqxVar.g.g();
                    lig ligVarH = lig.h(0, 0);
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        lvp lvpVarA = eqxVar.g.a((lvs) it.next());
                        ligVarH = eqx.k(ligVarH, lvpVarA);
                        if (lvpVarA.L()) {
                            Iterator it2 = ((lvo) lvpVarA).b.iterator();
                            while (it2.hasNext()) {
                                ligVarH = eqx.k(ligVarH, eqxVar.g.a((lvs) it2.next()));
                            }
                        }
                    }
                    if (eqxVar.j.a() == 0) {
                        eqxVar.i.e("PortraitSegmenter#init");
                        eqxVar.j.b();
                        eqxVar.i.f();
                    }
                    eqxVar.c.d(ligVarH.a, ligVarH.b, eqxVar.h, eqxVar.k.g() ? ((File) eqxVar.k.c()).getAbsolutePath() : "", eqxVar.j.a(), eqxVar.d, eqxVar.s);
                    eqxVar.i.f();
                    eqxVar.c.e();
                    eqxVar.e.fB(true);
                } catch (IllegalStateException e) {
                    ((oug) ((oug) ((oug) eqx.a.b().g(ovl.a, "LasagnaController")).h(e)).G((char) 1406)).o("Error initializing processor.");
                    return;
                }
                break;
            default:
                this.a.e.fB(true);
                break;
        }
    }
}
