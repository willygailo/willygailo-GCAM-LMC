package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class qil extends AtomicBoolean implements Runnable, qbz {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;

    public qil(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.qbz
    public final void gT() {
        lazySet(true);
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }
}
