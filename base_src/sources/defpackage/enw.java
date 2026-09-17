package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class enw {
    private final ljk a;
    private int b = 0;

    public enw(ljf ljfVar) {
        this.a = ljfVar.b("AliveLock");
    }

    private final void d() {
        this.a.c(this.b);
    }

    public final synchronized void a() {
        this.b++;
        d();
    }

    public final synchronized void b() {
        this.b--;
        d();
    }

    public final synchronized boolean c() {
        return this.b > 0;
    }
}
