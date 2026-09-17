package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class kn implements Runnable {
    final /* synthetic */ kp a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ kw c;
    final /* synthetic */ ko d;

    public kn(ko koVar, kp kpVar, MenuItem menuItem, kw kwVar) {
        this.d = koVar;
        this.a = kpVar;
        this.b = menuItem;
        this.c = kwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp kpVar = this.a;
        if (kpVar != null) {
            this.d.a.f = true;
            kpVar.b.i(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.z(this.b, 4);
        }
    }
}
