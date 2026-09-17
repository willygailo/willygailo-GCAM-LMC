package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class adl {
    private static final adj a = adj.a;

    public static final void a(bu buVar, String str) {
        buVar.getClass();
        adh adhVar = new adh(buVar, str);
        h(adhVar);
        adj adjVarF = f(buVar);
        if (adjVarF.b.contains(adi.DETECT_FRAGMENT_REUSE) && i(adjVarF, buVar.getClass(), adhVar.getClass())) {
            g(adjVarF, adhVar);
        }
    }

    public static final void b(bu buVar, ViewGroup viewGroup) {
        buVar.getClass();
        adm admVar = new adm(buVar, viewGroup);
        h(admVar);
        adj adjVarF = f(buVar);
        if (adjVarF.b.contains(adi.DETECT_FRAGMENT_TAG_USAGE) && i(adjVarF, buVar.getClass(), admVar.getClass())) {
            g(adjVarF, admVar);
        }
    }

    public static final void c(bu buVar) {
        adn adnVar = new adn(buVar);
        h(adnVar);
        adj adjVarF = f(buVar);
        if (adjVarF.b.contains(adi.DETECT_TARGET_FRAGMENT_USAGE) && i(adjVarF, buVar.getClass(), adnVar.getClass())) {
            g(adjVarF, adnVar);
        }
    }

    public static final void d(bu buVar, ViewGroup viewGroup) {
        buVar.getClass();
        adr adrVar = new adr(buVar, viewGroup);
        h(adrVar);
        adj adjVarF = f(buVar);
        if (adjVarF.b.contains(adi.DETECT_WRONG_FRAGMENT_CONTAINER) && i(adjVarF, buVar.getClass(), adrVar.getClass())) {
            g(adjVarF, adrVar);
        }
    }

    public static final void e(bu buVar, bu buVar2) {
        ado adoVar = new ado(buVar, buVar2);
        h(adoVar);
        adj adjVarF = f(buVar);
        if (adjVarF.b.contains(adi.DETECT_TARGET_FRAGMENT_USAGE) && i(adjVarF, buVar.getClass(), adoVar.getClass())) {
            g(adjVarF, adoVar);
        }
    }

    private static final adj f(bu buVar) {
        while (buVar != null) {
            if (buVar.W()) {
                buVar.z();
            }
            buVar = buVar.B;
        }
        return a;
    }

    private static final void g(adj adjVar, adq adqVar) {
        bu buVar = adqVar.a;
        String name = buVar.getClass().getName();
        if (adjVar.b.contains(adi.PENALTY_LOG)) {
            qno.a("Policy violation in ", name);
        }
        if (adjVar.b.contains(adi.PENALTY_DEATH)) {
            adk adkVar = new adk(name, adqVar);
            if (!buVar.W()) {
                adkVar.run();
                return;
            }
            Handler handler = buVar.z().j.d;
            if (qno.c(handler.getLooper(), Looper.myLooper())) {
                adkVar.run();
            } else {
                handler.post(adkVar);
            }
        }
    }

    private static final void h(adq adqVar) {
        if (cu.Q(3)) {
            qno.a("StrictMode violation in ", adqVar.a.getClass().getName());
        }
    }

    private static final boolean i(adj adjVar, Class cls, Class cls2) {
        Set set = (Set) adjVar.c.get(cls);
        if (set == null) {
            return true;
        }
        return (qno.c(cls2.getSuperclass(), adq.class) || !set.contains(cls2.getSuperclass())) && !set.contains(cls2);
    }
}
