package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
final class asq implements Runnable {
    final /* synthetic */ pht a;
    final /* synthetic */ ConstraintTrackingWorker b;

    public asq(ConstraintTrackingWorker constraintTrackingWorker, pht phtVar) {
        this.b = constraintTrackingWorker;
        this.a = phtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.g) {
            if (this.b.h) {
                this.b.k();
            } else {
                this.b.j.g(this.a);
            }
        }
    }
}
