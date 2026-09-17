package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pfw {
    static final pfw a = new pfw(null);
    volatile pfw next;
    volatile Thread thread;

    public pfw() {
        pfx.e.b(this, Thread.currentThread());
    }

    public pfw(byte[] bArr) {
    }

    final void a(pfw pfwVar) {
        pfx.e.a(this, pfwVar);
    }
}
