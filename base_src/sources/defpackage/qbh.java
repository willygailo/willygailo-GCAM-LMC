package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qbh implements qyl {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static qbh b() {
        qbh qbhVar = qep.b;
        qco qcoVar = qmd.i;
        return qbhVar;
    }

    public static qbh c(Object obj) {
        qet qetVar = new qet(obj);
        qco qcoVar = qmd.i;
        return qetVar;
    }

    public static qbh i(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("count >= 0 required but it was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i == 0) {
            return b();
        }
        if (i == 1) {
            return c(0);
        }
        qfb qfbVar = new qfb(i);
        qco qcoVar = qmd.i;
        return qfbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qbh a(qco qcoVar) {
        qmd.X(2, "prefetch");
        if (!(this instanceof qdj)) {
            qeo qeoVar = new qeo(this, qcoVar);
            qco qcoVar2 = qmd.i;
            return qeoVar;
        }
        Object objCall = ((qdj) this).call();
        if (objCall == null) {
            return b();
        }
        qfc qfcVar = new qfc(objCall, qcoVar);
        qco qcoVar3 = qmd.i;
        return qfcVar;
    }

    public final qbh d(Object obj, qcm qcmVar) {
        qfe qfeVar = new qfe(this, qdd.a(obj), qcmVar);
        qco qcoVar = qmd.i;
        return qfeVar;
    }

    public final qbu e(Object obj) {
        qev qevVar = new qev(this, obj);
        qco qcoVar = qmd.m;
        return qevVar;
    }

    public final void f(qbi qbiVar) {
        qmd.W(qbiVar, "s is null");
        try {
            qcm qcmVar = qmd.o;
            qmd.W(qbiVar, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(qbiVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qyl
    public final void g(qym qymVar) {
        if (qymVar instanceof qbi) {
            f(qymVar);
        } else {
            qmd.W(qymVar, "s is null");
            f(new qjg(qymVar));
        }
    }

    protected abstract void h(qym qymVar);
}
