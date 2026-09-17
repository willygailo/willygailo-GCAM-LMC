package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qbj implements qbl {
    @Override // defpackage.qbl
    public final void a(qbk qbkVar) {
        qmd.W(qbkVar, "observer is null");
        qcm qcmVar = qmd.p;
        qmd.W(qbkVar, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(qbkVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qmd.Y(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void b(qbk qbkVar);
}
