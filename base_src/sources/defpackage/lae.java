package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lae implements lie {
    public final lie a;
    public int b;
    public final lbk c;
    public final Object d;
    public final Runnable e;
    public boolean f;

    public lae(lie lieVar) {
        this(lieVar, plk.K(), null);
    }

    public lae(lie lieVar, Executor executor, lbk lbkVar) {
        this.f = false;
        this.a = lieVar;
        this.c = lbkVar;
        this.d = new Object();
        this.b = 0;
        this.e = new laf(new lac(this), executor);
    }

    public final lie a() {
        synchronized (this.d) {
            if (this.f) {
                return null;
            }
            this.b++;
            lbk lbkVar = this.c;
            if (lbkVar != null) {
                lbkVar.a();
            }
            return new lad(this);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            lbk lbkVar = this.c;
            if (lbkVar != null) {
                lbkVar.a();
            }
            this.a.close();
        }
    }
}
