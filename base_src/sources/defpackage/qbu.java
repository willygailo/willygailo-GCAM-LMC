package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qbu implements qbw {
    public static qbu h(Throwable th) {
        qhh qhhVar = new qhh(qdd.a(th));
        qco qcoVar = qmd.m;
        return qhhVar;
    }

    public static qbu j(Callable callable) {
        qmd.W(callable, "callable is null");
        qhn qhnVar = new qhn(callable);
        qco qcoVar = qmd.m;
        return qhnVar;
    }

    public static qbu k(Object obj) {
        qmd.W(obj, "item is null");
        qho qhoVar = new qho(obj);
        qco qcoVar = qmd.m;
        return qhoVar;
    }

    public static qbu m(qbw qbwVar, qbw qbwVar2, qcm qcmVar) {
        qhz qhzVar = new qhz(new qbw[]{qbwVar, qbwVar2}, new qcv(qcmVar));
        qco qcoVar = qmd.m;
        return qhzVar;
    }

    public final qbd a(qco qcoVar) {
        qhm qhmVar = new qhm(this, qcoVar);
        qco qcoVar2 = qmd.n;
        return qhmVar;
    }

    public final qbd e() {
        qeb qebVar = new qeb(this);
        qco qcoVar = qmd.n;
        return qebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qbh f() {
        if (this instanceof qdf) {
            return ((qdf) this).a();
        }
        qhw qhwVar = new qhw(this);
        qco qcoVar = qmd.i;
        return qhwVar;
    }

    public final qbm g(qco qcoVar) {
        qfn qfnVar = new qfn(this, qcoVar);
        qco qcoVar2 = qmd.j;
        return qfnVar;
    }

    public final qbu i(qco qcoVar) {
        qhk qhkVar = new qhk(this, qcoVar);
        qco qcoVar2 = qmd.m;
        return qhkVar;
    }

    public final qbu l(qco qcoVar) {
        qhq qhqVar = new qhq(this, qcoVar);
        qco qcoVar2 = qmd.m;
        return qhqVar;
    }

    @Override // defpackage.qbw
    public final void n(qbv qbvVar) {
        qmd.W(qbvVar, "observer is null");
        qcm qcmVar = qmd.r;
        qmd.W(qbvVar, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            o(qbvVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qmd.Y(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void o(qbv qbvVar);
}
