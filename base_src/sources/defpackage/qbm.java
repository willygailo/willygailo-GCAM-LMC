package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qbm implements qbp {
    public static qbm a(qbo qboVar) {
        qfr qfrVar = new qfr(qboVar);
        qco qcoVar = qmd.j;
        return qfrVar;
    }

    public final qbm d(qbt qbtVar) {
        int i = qbh.a;
        qmd.X(i, "bufferSize");
        qgg qggVar = new qgg(this, qbtVar, i);
        qco qcoVar = qmd.j;
        return qggVar;
    }

    @Override // defpackage.qbp
    public final void f(qbq qbqVar) {
        qmd.W(qbqVar, "observer is null");
        try {
            qcm qcmVar = qmd.q;
            qmd.W(qbqVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            g(qbqVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qmd.Y(th);
            qmd.R(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void g(qbq qbqVar);

    public final qbm gW(qbt qbtVar) {
        qgw qgwVar = new qgw(this, qbtVar);
        qco qcoVar = qmd.j;
        return qgwVar;
    }

    public final qbh h() {
        qes qesVar = new qes(this);
        int i = qbh.a;
        qmd.X(i, "capacity");
        qex qexVar = new qex(qesVar, i);
        qco qcoVar = qmd.i;
        return qexVar;
    }

    public final qbm i(qcn qcnVar, qcn qcnVar2) {
        qfv qfvVar = new qfv(this, qcnVar, qcnVar2);
        qco qcoVar = qmd.j;
        return qfvVar;
    }

    public final void j(qcn qcnVar, qcn qcnVar2) {
        qmd.W(qcnVar2, "onError is null");
        f(new qdr(qcnVar, qcnVar2));
    }
}
