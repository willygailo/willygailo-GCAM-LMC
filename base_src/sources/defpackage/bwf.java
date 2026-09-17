package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bwf {
    public final pih a;
    private long b;

    public bwf(int i) {
        obr.aF(true);
        this.a = pih.f();
        this.b = i;
    }

    public final synchronized void a() {
        long j = this.b - 1;
        this.b = j;
        if (j <= 0) {
            this.a.o(null);
        }
    }
}
