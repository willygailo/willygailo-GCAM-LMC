package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fwg implements lco, lie {
    public final lce a;
    public final Executor b;
    public lco c;
    public lco d;
    public lie e;
    public lie f;
    public boolean g;

    public fwg() {
        lar larVar = lar.b;
        this.g = false;
        this.a = new lce(true);
        this.b = larVar;
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.a.a(lijVar, executor);
    }

    @Override // defpackage.lco
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean fA() {
        return (Boolean) this.a.d;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.execute(new Runnable() { // from class: fwe
            @Override // java.lang.Runnable
            public final void run() {
                fwg fwgVar = this.a;
                if (fwgVar.g) {
                    return;
                }
                fwgVar.g = true;
                fwgVar.a.fB(false);
                lie lieVar = fwgVar.e;
                if (lieVar != null) {
                    lieVar.close();
                }
                lie lieVar2 = fwgVar.f;
                if (lieVar2 != null) {
                    lieVar2.close();
                }
            }
        });
    }

    public final void d(lco lcoVar) {
        this.b.execute(new fwf(this, lcoVar, 1));
    }

    public final void e() {
        if (this.g) {
            return;
        }
        lco lcoVar = this.c;
        boolean z = false;
        boolean z2 = lcoVar == null || ((Boolean) lcoVar.fA()).booleanValue();
        lco lcoVar2 = this.d;
        boolean z3 = lcoVar2 == null || ((Boolean) lcoVar2.fA()).booleanValue();
        lce lceVar = this.a;
        if (z2 && z3) {
            z = true;
        }
        lceVar.fB(Boolean.valueOf(z));
    }
}
