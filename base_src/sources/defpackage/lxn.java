package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lxn implements lie {
    public final long a;
    final /* synthetic */ lxq b;
    private volatile boolean c = false;

    public lxn(lxq lxqVar, long j) {
        this.b = lxqVar;
        this.a = j;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            lxq lxqVar = this.b;
            long j = this.a;
            synchronized (lxqVar.a) {
                lxqVar.d -= j;
                lxqVar.d();
            }
            lxqVar.e();
        }
    }
}
