package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class kvp extends kvk {
    public boolean b;
    public volatile boolean c;
    public Object d;
    public Exception e;
    public final Object a = new Object();
    public final ofh f = new ofh(null);

    private final void m() {
        String string;
        if (this.b) {
            if (!d()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
            if (excB != null) {
                string = "failure";
            } else if (e()) {
                String strValueOf = String.valueOf(c());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
                sb.append("result ");
                sb.append(strValueOf);
                string = sb.toString();
            } else {
                string = this.c ? "cancellation" : "unknown issue";
            }
            String strValueOf2 = String.valueOf(string);
        }
    }

    @Override // defpackage.kvk
    public final kvk a(Executor executor, kuu kuuVar) {
        kvp kvpVar = new kvp();
        this.f.c(new kuw(executor, kuuVar, kvpVar));
        j();
        return kvpVar;
    }

    @Override // defpackage.kvk
    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.kvk
    public final Object c() {
        Object obj;
        synchronized (this.a) {
            mip.dr(this.b, "Task is not yet complete");
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.e;
            if (exc != null) {
                throw new kvj(exc);
            }
            obj = this.d;
        }
        return obj;
    }

    @Override // defpackage.kvk
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.kvk
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.kvk
    public final void f(kvc kvcVar) {
        g(kvo.a, kvcVar);
    }

    @Override // defpackage.kvk
    public final void g(Executor executor, kvc kvcVar) {
        this.f.c(new kvb(executor, kvcVar));
        j();
    }

    @Override // defpackage.kvk
    public final void h(Executor executor, kvf kvfVar) {
        this.f.c(new kve(executor, kvfVar));
        j();
    }

    @Override // defpackage.kvk
    public final void i(Executor executor, kvi kviVar) {
        this.f.c(new kvh(executor, kviVar));
        j();
    }

    public final void j() {
        synchronized (this.a) {
            if (this.b) {
                this.f.d(this);
            }
        }
    }

    public final void k(Exception exc) {
        mip.du(exc, "Exception must not be null");
        synchronized (this.a) {
            m();
            this.b = true;
            this.e = exc;
        }
        this.f.d(this);
    }

    public final void l(Object obj) {
        synchronized (this.a) {
            m();
            this.b = true;
            this.d = obj;
        }
        this.f.d(this);
    }
}
