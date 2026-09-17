package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pgb extends phb implements Runnable {
    pht a;
    Object b;

    public pgb(pht phtVar, Object obj) {
        phtVar.getClass();
        this.a = phtVar;
        obj.getClass();
        this.b = obj;
    }

    public static pht h(pht phtVar, oiu oiuVar, Executor executor) {
        oiuVar.getClass();
        pga pgaVar = new pga(phtVar, oiuVar);
        phtVar.d(pgaVar, plk.N(executor, pgaVar));
        return pgaVar;
    }

    public static pht i(pht phtVar, pgk pgkVar, Executor executor) {
        executor.getClass();
        pfz pfzVar = new pfz(phtVar, pgkVar);
        phtVar.d(pfzVar, plk.N(executor, pfzVar));
        return pfzVar;
    }

    @Override // defpackage.pfx
    protected final void c() {
        n(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object f(Object obj, Object obj2);

    public abstract void g(Object obj);

    @Override // defpackage.pfx
    protected final String ga() {
        String string;
        pht phtVar = this.a;
        Object obj = this.b;
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
        if (obj == null) {
            if (strGa == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strGa.length() != 0 ? strValueOf2.concat(strGa) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + String.valueOf(strValueOf3).length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        pht phtVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (phtVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (phtVar.isCancelled()) {
            e(phtVar);
            return;
        }
        try {
            try {
                Object objF = f(obj, plk.ad(phtVar));
                this.b = null;
                g(objF);
            } catch (Throwable th) {
                try {
                    a(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            a(e);
        } catch (CancellationException e2) {
            cancel(false);
        } catch (RuntimeException e3) {
            a(e3);
        } catch (ExecutionException e4) {
            a(e4.getCause());
        }
    }
}
