package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lcd implements lie {
    final /* synthetic */ lah a;
    final /* synthetic */ lce b;

    public lcd(lce lceVar, lah lahVar) {
        this.b = lceVar;
        this.a = lahVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.b.remove(this.a);
    }
}
