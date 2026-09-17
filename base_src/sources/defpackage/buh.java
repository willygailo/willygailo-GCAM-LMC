package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class buh implements lie {
    final /* synthetic */ bui a;
    private final lap b;

    public buh(bui buiVar, lap lapVar) {
        this.a = buiVar;
        this.b = lapVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a.a) {
            this.b.close();
        }
    }
}
