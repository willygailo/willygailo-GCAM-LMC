package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mwz {
    public final qxd a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final qwt f;
    public final String g;
    public final qxe h;

    public mwz(qxd qxdVar, Long l, Long l2, Long l3, Long l4, qwt qwtVar, String str, qxe qxeVar) {
        this.a = qxdVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = qwtVar;
        this.g = str;
        this.h = qxeVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
