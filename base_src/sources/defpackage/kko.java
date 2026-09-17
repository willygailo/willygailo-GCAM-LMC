package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes2.dex */
final class kko implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b = "ConnectionlessLifecycleHelper";
    final /* synthetic */ kkp c;

    public kko(kkp kkpVar, LifecycleCallback lifecycleCallback) {
        this.c = kkpVar;
        this.a = lifecycleCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kkp kkpVar = this.c;
        if (kkpVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = kkpVar.c;
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
