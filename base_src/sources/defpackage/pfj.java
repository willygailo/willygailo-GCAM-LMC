package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pfj extends phb implements Runnable {
    pht a;
    Class b;
    Object c;

    public pfj(pht phtVar, Class cls, Object obj) {
        phtVar.getClass();
        this.a = phtVar;
        this.b = cls;
        obj.getClass();
        this.c = obj;
    }

    public static pht h(pht phtVar, Class cls, oiu oiuVar, Executor executor) {
        pfi pfiVar = new pfi(phtVar, cls, oiuVar);
        phtVar.d(pfiVar, plk.N(executor, pfiVar));
        return pfiVar;
    }

    public static pht i(pht phtVar, Class cls, pgk pgkVar, Executor executor) {
        pfh pfhVar = new pfh(phtVar, cls, pgkVar);
        phtVar.d(pfhVar, plk.N(executor, pfhVar));
        return pfhVar;
    }

    @Override // defpackage.pfx
    protected final void c() {
        n(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object f(Object obj, Throwable th);

    public abstract void g(Object obj);

    @Override // defpackage.pfx
    protected final String ga() {
        String string;
        pht phtVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strGa = super.ga();
        if (phtVar != null) {
            String strValueOf = String.valueOf(phtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (cls == null || obj == null) {
            if (strGa == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strGa.length() != 0 ? strValueOf2.concat(strGa) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(cls);
        String strValueOf4 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 29 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(strValueOf3);
        sb2.append("], fallback=[");
        sb2.append(strValueOf4);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objAd;
        pht phtVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((phtVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = phtVar instanceof pir ? ((pir) phtVar).k() : null;
            objAd = th == null ? plk.ad(phtVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(phtVar.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35 + String.valueOf(strValueOf2).length());
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                th = new NullPointerException(sb.toString());
            } else {
                th = cause;
            }
            objAd = null;
        } catch (Throwable th) {
            th = th;
            objAd = null;
        }
        if (th == null) {
            o(objAd);
            return;
        }
        if (!cls.isInstance(th)) {
            e(phtVar);
            return;
        }
        try {
            Object objF = f(obj, th);
            this.b = null;
            this.c = null;
            g(objF);
        } catch (Throwable th2) {
            try {
                a(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
