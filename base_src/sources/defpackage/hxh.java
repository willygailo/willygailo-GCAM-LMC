package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hxh implements lie {
    final /* synthetic */ hxi a;
    final /* synthetic */ hxj b;

    public hxh(hxj hxjVar, hxi hxiVar) {
        this.b = hxjVar;
        this.a = hxiVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            this.b.a.remove(this.a);
        }
    }
}
