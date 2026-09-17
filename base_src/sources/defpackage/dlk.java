package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dlk implements lie {
    final /* synthetic */ dlt a;
    final /* synthetic */ dll b;

    public dlk(dll dllVar, dlt dltVar) {
        this.b = dllVar;
        this.a = dltVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.a.remove(this.a);
    }
}
