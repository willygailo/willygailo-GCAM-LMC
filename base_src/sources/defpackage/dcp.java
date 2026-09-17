package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dcp {
    public final long a;
    private long b = 0;
    private int c = 0;
    private final int d;

    public dcp(int i, long j) {
        this.d = i;
        this.a = j;
    }

    final synchronized pbs a(long j) {
        poy poyVarM;
        long j2 = j - this.a;
        poyVarM = pbs.f.m();
        int i = this.d;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbs pbsVar = (pbs) poyVarM.b;
        pbsVar.b = i - 1;
        int i2 = pbsVar.a | 1;
        pbsVar.a = i2;
        int i3 = i2 | 2;
        pbsVar.a = i3;
        pbsVar.c = j2;
        long j3 = this.b;
        int i4 = i3 | 4;
        pbsVar.a = i4;
        pbsVar.d = j3;
        int i5 = this.c;
        pbsVar.a = i4 | 8;
        pbsVar.e = i5;
        return (pbs) poyVarM.j();
    }

    final synchronized void b() {
        this.c++;
    }

    final synchronized void c() {
        this.b++;
    }
}
