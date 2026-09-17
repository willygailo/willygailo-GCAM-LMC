package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qbd implements qbf {
    public static qbd a() {
        qbd qbdVar = qdy.a;
        qco qcoVar = qmd.n;
        return qbdVar;
    }

    public static qbd b(qbf... qbfVarArr) {
        qed qedVar = new qed(qbfVarArr);
        qco qcoVar = qmd.n;
        return qedVar;
    }

    public final qbu c(qbw qbwVar) {
        qhe qheVar = new qhe(qbwVar, this);
        qco qcoVar = qmd.m;
        return qheVar;
    }

    public final qbu d(Object obj) {
        qeh qehVar = new qeh(this, obj);
        qco qcoVar = qmd.m;
        return qehVar;
    }

    @Override // defpackage.qbf
    public final void e(qbe qbeVar) {
        qmd.W(qbeVar, "observer is null");
        try {
            qcm qcmVar = qmd.s;
            qmd.W(qbeVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            f(qbeVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qmd.Y(th);
            qmd.R(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void f(qbe qbeVar);

    public final qbd g(qcn qcnVar, qcl qclVar) {
        qef qefVar = new qef(this, qcnVar, qclVar);
        qco qcoVar = qmd.n;
        return qefVar;
    }
}
