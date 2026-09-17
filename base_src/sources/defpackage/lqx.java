package defpackage;

import android.util.Log;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lqx implements lie {
    private final lrl a;
    private final lap b;
    private final lxn c;
    private final lrk d;
    private final Runnable e;
    private boolean f = false;
    private boolean g = false;

    public lqx(mxm mxmVar, ncp ncpVar, lxn lxnVar, Runnable runnable, ltd ltdVar, lrg lrgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = lxnVar;
        this.e = runnable;
        lap lapVar = new lap();
        this.b = lapVar;
        lnf lnfVarA = ((lpn) mxmVar.f).get();
        lqn lqnVar = (lqn) mxmVar.c.get();
        lqnVar.getClass();
        Object obj = mxmVar.b.get();
        lom lomVar = (lom) mxmVar.e.get();
        lomVar.getClass();
        loy loyVar = (loy) mxmVar.a.get();
        loyVar.getClass();
        mip mipVar = (mip) mxmVar.d.get();
        mipVar.getClass();
        lrl lrlVar = new lrl(lnfVarA, lqnVar, (ncp) obj, lomVar, loyVar, mipVar, ltdVar, lrgVar, null, null, null);
        this.a = lrlVar;
        lol lolVar = (lol) ncpVar.d.get();
        lolVar.getClass();
        lrk lrkVar = new lrk(lolVar, ((lpl) ncpVar.a).get(), ((liq) ncpVar.c).get(), ((lpn) ncpVar.b).get(), lrlVar, lrgVar);
        this.d = lrkVar;
        lapVar.c(lrkVar);
    }

    public final synchronized lmp a() {
        if (this.f) {
            throw new llv("getConfig3ABuilder() cannot be called after the session is closed.");
        }
        return this.d.a();
    }

    public final synchronized lpc b() {
        if (this.f) {
            throw new llv("getRequestBuilder() cannot be called after the session is closed.");
        }
        return this.a.a();
    }

    public final synchronized pht c(lnv lnvVar, boolean z) {
        if (this.f) {
            throw new llv("trigger3A() cannot be called after the session is closed.");
        }
        return this.d.b(lnvVar, z);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.d.a.shutdownNow();
        synchronized (this) {
            if (this.g) {
                try {
                    this.a.f(b().b());
                    this.g = false;
                } catch (llv e) {
                    String strValueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 40);
                    sb.append("Failed to resume last repeating request ");
                    sb.append(strValueOf);
                    Log.e("CAM_RequestProcessorSess", sb.toString());
                }
                this.f = true;
            } else {
                this.f = true;
            }
            throw th;
        }
        this.b.close();
        this.c.close();
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final synchronized pht d(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f) {
            throw new llv("unlock3A() cannot be called after the session is closed.");
        }
        return this.d.c(z, z2, z3, z4);
    }

    public final synchronized pht e(lmq lmqVar, boolean z) {
        if (this.f) {
            throw new llv("update3A() cannot be called after the session is closed.");
        }
        return this.d.d(lmqVar, z);
    }

    public final synchronized void f() {
        if (this.f) {
            throw new llv("abortCaptures() cannot be called after the session is closed.");
        }
        this.a.c();
    }

    public final synchronized void g() {
        if (this.f) {
            throw new llv("stopRepeating() cannot be called after the session is closed.");
        }
        this.g = true;
        this.a.d();
    }

    public final synchronized void h(List list, List list2) {
        if (this.f) {
            throw new llv("submit() cannot be called after the session is closed.");
        }
        this.a.e(list, list2);
    }

    public final synchronized void i(lpd lpdVar) {
        if (this.f) {
            throw new llv("setRepeating() cannot be called after the session is closed.");
        }
        this.a.f(lpdVar);
    }

    public final synchronized void j(lpd lpdVar, Set set) {
        if (this.f) {
            throw new llv("submit() cannot be called after the session is closed.");
        }
        this.a.g(lpdVar, set);
    }

    public final synchronized pht k(lmq lmqVar) {
        if (this.f) {
            throw new llv("lock3AImmediately() with config3a cannot be called after the session is closed.");
        }
        return this.d.e(lmqVar);
    }

    public final synchronized void l(lmq lmqVar) {
        if (this.f) {
            throw new llv("updateConfig3AWithLocksRetained() cannot be called after the session is closed.");
        }
        this.d.f(lmqVar);
    }

    public final synchronized void m(lmq lmqVar) {
        if (this.f) {
            throw new llv("submit3A() cannot be called after the session is closed.");
        }
        this.d.g(lmqVar);
    }

    public final synchronized void n(Set set, mip mipVar) {
        if (this.f) {
            throw new llv("submit(parameters, listener) cannot be called after the session is closed.");
        }
        lpc lpcVarA = this.a.a();
        lpcVarA.e(set);
        lpcVarA.g(mipVar);
        this.a.h(lpcVarA.b());
    }
}
