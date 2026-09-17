package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class aiy {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final aii b;
    private volatile ake c;

    public aiy(aii aiiVar) {
        this.b = aiiVar;
    }

    private final ake a() {
        return this.b.m(d());
    }

    protected abstract String d();

    public final ake e() {
        this.b.f();
        if (!this.a.compareAndSet(false, true)) {
            return a();
        }
        if (this.c == null) {
            this.c = a();
        }
        return this.c;
    }

    public final void f(ake akeVar) {
        if (akeVar == this.c) {
            this.a.set(false);
        }
    }
}
