package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dws implements lie {
    public final hsj a;
    private bcl e;
    private boolean d = false;
    private lif b = lif.c;
    private boolean c = false;

    public dws(hsj hsjVar) {
        this.a = hsjVar;
    }

    public final synchronized bcl a() {
        return this.e;
    }

    public final synchronized lif b() {
        return this.b;
    }

    public final synchronized void c(bcl bclVar) {
        if (this.d) {
            return;
        }
        this.e = bclVar;
        if (this.c) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.e = null;
    }

    public final synchronized void d(lif lifVar) {
        if (this.b == lif.c) {
            lifVar.compareTo(lif.b);
        }
        if (!this.b.equals(lif.a)) {
            lifVar.equals(lif.a);
        }
        this.b = lifVar;
    }

    public final synchronized boolean e() {
        return this.c;
    }

    public final synchronized int f() {
        return this.b.d() ? 2 : 1;
    }
}
