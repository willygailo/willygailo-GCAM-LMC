package defpackage;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
final class mfi implements Runnable {
    final /* synthetic */ mfj a;

    public mfi(mfj mfjVar) {
        this.a = mfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getStatus() != AsyncTask.Status.FINISHED) {
            this.a.cancel(true);
            this.a.a(15, 15);
        }
    }
}
