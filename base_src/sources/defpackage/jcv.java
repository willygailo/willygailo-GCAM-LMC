package defpackage;

import android.app.KeyguardManager;

/* JADX INFO: loaded from: classes2.dex */
final class jcv extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ Runnable a;
    final /* synthetic */ pih b;

    public jcv(Runnable runnable, pih pihVar) {
        this.a = runnable;
        this.b = pihVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        this.b.o(false);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        ((oug) ((oug) jcw.a.b()).G((char) 3247)).o("Error dismissing keyguard");
        this.b.o(false);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.a.run();
        this.b.o(true);
    }
}
