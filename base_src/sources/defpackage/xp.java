package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class xp {
    static final xp a = new xp(null);
    volatile xp next;
    volatile Thread thread;

    public xp() {
        xq.b.b(this, Thread.currentThread());
    }

    public xp(byte[] bArr) {
    }

    final void a(xp xpVar) {
        xq.b.a(this, xpVar);
    }
}
