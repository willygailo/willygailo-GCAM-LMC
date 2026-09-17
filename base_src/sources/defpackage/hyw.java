package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hyw extends maa {
    private final Runnable a;
    private boolean b;

    public hyw(mad madVar, Runnable runnable) {
        super(madVar);
        this.b = false;
        this.a = runnable;
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this) {
            z = true;
            if (this.b) {
                z = false;
            } else {
                this.b = true;
            }
        }
        if (z) {
            super.close();
            this.a.run();
        }
    }
}
