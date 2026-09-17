package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
abstract class klt extends klv {
    public final int a;
    public final Bundle b;
    final /* synthetic */ kmb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected klt(kmb kmbVar, int i, Bundle bundle) {
        super(kmbVar, true);
        this.c = kmbVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(khi khiVar);

    @Override // defpackage.klv
    protected final void b() {
    }

    protected abstract boolean c();

    @Override // defpackage.klv
    protected final /* bridge */ /* synthetic */ void d() {
        if (this.a != 0) {
            this.c.H(1, null);
            Bundle bundle = this.b;
            a(new khi(this.a, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (c()) {
                return;
            }
            this.c.H(1, null);
            a(new khi(8, null));
        }
    }
}
