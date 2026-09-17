package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes2.dex */
final class klg implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b = "ConnectionlessLifecycleHelper";
    final /* synthetic */ klh c;

    public klg(klh klhVar, LifecycleCallback lifecycleCallback) {
        this.c = klhVar;
        this.a = lifecycleCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        klh klhVar = this.c;
        if (klhVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = klhVar.c;
            lifecycleCallback.d(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.i();
        }
        if (this.c.b >= 3) {
            ((kju) this.a).k();
        }
        if (this.c.b >= 4) {
            this.a.j();
        }
    }
}
