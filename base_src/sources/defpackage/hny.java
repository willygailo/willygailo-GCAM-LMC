package defpackage;

import android.app.KeyguardManager;

/* JADX INFO: loaded from: classes2.dex */
final class hny extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ KeyguardManager.KeyguardDismissCallback a;
    final /* synthetic */ hoa b;
    final /* synthetic */ int c;

    public hny(hoa hoaVar, int i, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        this.b = hoaVar;
        this.c = i;
        this.a = keyguardDismissCallback;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        hnw hnwVar = this.b.d;
        if (hnwVar != null) {
            hnwVar.A();
        }
        ((epj) this.b.b.get()).g(this.c);
        this.a.onDismissCancelled();
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        hnw hnwVar = this.b.d;
        if (hnwVar != null) {
            hnwVar.A();
        }
        ((epj) this.b.b.get()).g(this.c);
        this.a.onDismissError();
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        ((epj) this.b.b.get()).g(this.c);
        this.a.onDismissSucceeded();
    }
}
