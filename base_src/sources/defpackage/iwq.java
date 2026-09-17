package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iwq implements lie {
    final /* synthetic */ iwr a;

    public iwq(iwr iwrVar) {
        this.a = iwrVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        iwt iwtVar = this.a.a;
        iwtVar.a.execute(new iwp(iwtVar));
    }
}
