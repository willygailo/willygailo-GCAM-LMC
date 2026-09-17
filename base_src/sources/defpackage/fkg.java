package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class fkg implements eak {
    final /* synthetic */ fkh a;

    public fkg(fkh fkhVar) {
        this.a = fkhVar;
    }

    @Override // defpackage.eak
    public final /* synthetic */ void a(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    @Override // defpackage.eak
    public final void b(boolean z) {
        iay iayVar;
        iay iayVar2;
        if (!z) {
            fkh fkhVar = this.a;
            if (!fkhVar.a.compareAndSet(true, false) || (iayVar = fkhVar.b) == null) {
                return;
            }
            fkhVar.i = fkhVar.e.schedule(new fkf(iayVar, 0), 2000L, TimeUnit.MILLISECONDS);
            return;
        }
        fkh fkhVar2 = this.a;
        if (fkhVar2.h || fkhVar2.f.a("Astro_smarts_chip") >= 3 || !fkhVar2.a.compareAndSet(false, true) || (iayVar2 = fkhVar2.b) == null) {
            return;
        }
        iayVar2.b(fkhVar2.c);
    }

    @Override // defpackage.eak
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.eak
    public final /* synthetic */ void d() {
    }
}
