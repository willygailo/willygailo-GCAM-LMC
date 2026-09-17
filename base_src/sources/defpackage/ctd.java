package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ctd {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/topshot/selection/BestFramesSelector");
    public final hkg c;
    private final hkr f;
    public final List b = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private long g = 0;

    public ctd(hkr hkrVar, hkg hkgVar) {
        this.f = hkrVar;
        this.c = hkgVar;
    }

    public final void a() {
        b();
        this.b.clear();
        this.d.clear();
        this.e.clear();
    }

    public final synchronized void b() {
        drf drfVarA = this.f.a.a(this.g);
        hkn hknVar = null;
        while (drfVarA.b()) {
            hkn hknVarC = this.f.c(((dtf) drfVarA).a);
            if (hknVarC != null && (hknVar == null || hknVar.b < hknVarC.b)) {
                hknVar = hknVarC;
            }
            this.g = ((dtf) drfVarA).a;
        }
        if (hknVar != null) {
            this.b.add(hknVar);
        }
        this.b.size();
    }
}
