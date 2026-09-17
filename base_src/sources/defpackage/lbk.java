package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lbk implements lie {
    public Runnable b;
    private final lbi c;
    public final Object a = new Object();
    private final Runnable d = new lbj(this);

    public lbk(lbi lbiVar) {
        this.c = lbiVar;
    }

    public final void a() {
        synchronized (this.a) {
            this.b = null;
            this.c.b();
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.a) {
            this.b = runnable;
            this.c.execute(this.d);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b = null;
            }
        }
        this.c.close();
    }
}
