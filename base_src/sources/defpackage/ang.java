package defpackage;

import androidx.work.Worker;

/* JADX INFO: loaded from: classes.dex */
public final class ang implements Runnable {
    final /* synthetic */ Worker a;

    public ang(Worker worker) {
        this.a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.e(this.a.b());
        } catch (Throwable th) {
            this.a.a.f(th);
        }
    }
}
