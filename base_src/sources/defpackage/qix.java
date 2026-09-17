package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qix extends qie implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    public qix(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            return null;
        } finally {
            lazySet(a);
            this.d = null;
        }
    }
}
