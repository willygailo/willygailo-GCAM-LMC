package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jtk implements lie {
    final /* synthetic */ jtl a;

    public jtk(jtl jtlVar) {
        this.a = jtlVar;
        jtlVar.a.incrementAndGet();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.a.decrementAndGet();
    }
}
