package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class dkq {
    private final HashMap a = new HashMap();
    private final HashMap b = new HashMap();

    private static final hlr e(Future future) {
        if (future == null) {
            return null;
        }
        if (!future.isDone()) {
            future.cancel(true);
            return null;
        }
        try {
            return (hlr) future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final ojc a(hsp hspVar) {
        Future future;
        Future future2;
        synchronized (this) {
            future = (Future) this.a.get(hspVar);
            future2 = (Future) this.b.get(hspVar);
        }
        try {
            if (future != null) {
                try {
                    ojc ojcVarI = ojc.i(new dkp((DynamicDepthResult) future.get(), e(future2)));
                    synchronized (this) {
                        this.a.remove(hspVar);
                        this.b.remove(hspVar);
                    }
                    return ojcVarI;
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    synchronized (this) {
                        this.a.remove(hspVar);
                        this.b.remove(hspVar);
                    }
                }
            }
            return oih.a;
        } catch (Throwable th) {
            synchronized (this) {
                this.a.remove(hspVar);
                this.b.remove(hspVar);
                throw th;
            }
        }
    }

    public final synchronized void b(hsp hspVar) {
        this.a.put(hspVar, pih.f());
        this.b.put(hspVar, pih.f());
    }

    public final void c(hsp hspVar, ojc ojcVar) {
        pih pihVar;
        synchronized (this) {
            pihVar = (pih) this.a.get(hspVar);
        }
        if (pihVar == null) {
            String strValueOf = String.valueOf(hspVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
            sb.append("Shot not found: ");
            sb.append(strValueOf);
            throw new NoSuchElementException(sb.toString());
        }
        if (ojcVar.g()) {
            pihVar.o((DynamicDepthResult) ojcVar.c());
            return;
        }
        synchronized (this) {
            this.a.remove(hspVar);
            hlr hlrVarE = e((pih) this.b.remove(hspVar));
            if (hlrVarE != null) {
                hlrVarE.close();
            }
        }
        pihVar.cancel(true);
    }

    public final void d(hsp hspVar, hlr hlrVar) {
        pih pihVar;
        synchronized (this) {
            pihVar = (pih) this.b.get(hspVar);
        }
        if (pihVar != null) {
            pihVar.o(hlrVar);
        } else if (hlrVar != null) {
            hlrVar.close();
        }
    }
}
