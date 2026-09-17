package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
final class keo implements Runnable {
    final /* synthetic */ kep a;

    public keo(kep kepVar) {
        this.a = kepVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.b.a().b(this);
            return;
        }
        boolean zE = this.a.e();
        this.a.d = 0L;
        if (zE) {
            this.a.a();
        }
    }
}
