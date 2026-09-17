package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class ogf implements Runnable, Closeable {
    private ogi a;
    private final boolean b = myw.i();
    private boolean c;
    private boolean d;

    public ogf(ogi ogiVar) {
        this.a = ogiVar;
    }

    private final void b() {
        this.c = true;
        if (!this.b || this.d) {
            return;
        }
        myw.i();
    }

    public final void a(pht phtVar) {
        if (this.c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.d = true;
        phtVar.d(this, pgr.INSTANCE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ogi ogiVar = this.a;
        this.a = null;
        try {
            if (!this.d) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            ogq.e(ogiVar);
        } catch (Throwable th) {
            ogq.e(ogiVar);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c || !this.d) {
            myw.h(oge.a);
        } else {
            b();
        }
    }
}
