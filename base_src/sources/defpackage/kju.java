package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kju extends kjm {
    public final xa e;
    private final kkg g;

    public kju(kkn kknVar, kkg kkgVar) {
        super(kknVar, khm.a);
        this.e = new xa();
        this.g = kkgVar;
        this.f.b(this);
    }

    @Override // defpackage.kjm
    protected final void e(khi khiVar, int i) {
        this.g.e(khiVar, i);
    }

    @Override // defpackage.kjm
    protected final void f() {
        this.g.f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        k();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.a = true;
        k();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.a = false;
        kkg kkgVar = this.g;
        synchronized (kkg.c) {
            if (kkgVar.m == this) {
                kkgVar.m = null;
                kkgVar.n.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.g(this);
    }
}
