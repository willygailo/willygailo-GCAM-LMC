package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mne implements mnb {
    private final mnb a;

    private mne(mnb mnbVar) {
        this.a = mnbVar;
    }

    public static mne i(mnb mnbVar) {
        return new mne(mnbVar);
    }

    @Override // defpackage.mnb
    public final mnb a(Executor executor, mlu mluVar) {
        return this.a.a(executor, mluVar);
    }

    @Override // defpackage.mnb
    public final mnb b(Executor executor, mnf mnfVar) {
        return this.a.b(executor, mnfVar);
    }

    @Override // defpackage.mnb
    public final mnb c(Executor executor, mlu mluVar, mlu mluVar2) {
        return this.a.c(executor, mluVar, mluVar2);
    }

    @Override // defpackage.mnb
    public final pht d() {
        return this.a.d();
    }

    @Override // defpackage.mnb
    public final /* bridge */ /* synthetic */ Object e() {
        return (mlt) this.a.e();
    }

    @Override // defpackage.mnb
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.mnb
    public final void h(mmg mmgVar) {
        this.a.h(mmgVar);
    }

    @Override // defpackage.mnb
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final mne g(Executor executor, mtw mtwVar) {
        return new mne(this.a.g(executor, mtwVar));
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
