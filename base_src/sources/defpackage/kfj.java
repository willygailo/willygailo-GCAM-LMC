package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kfj implements kes {
    final /* synthetic */ Runnable a;
    final /* synthetic */ kfl b;

    public kfj(kfl kflVar, Runnable runnable) {
        this.b = kflVar;
        this.a = runnable;
    }

    @Override // defpackage.kes
    public final void a() {
        this.b.a.post(this.a);
    }
}
