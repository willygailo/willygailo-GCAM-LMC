package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psf {
    public static final prl a;
    public static final prl b;
    public static final ThreadLocal c;

    static {
        poy poyVarM = prl.c.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        prl prlVar = (prl) poyVarM.b;
        prlVar.a = -62135596800L;
        prlVar.b = 0;
        a = (prl) poyVarM.j();
        poy poyVarM2 = prl.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        prl prlVar2 = (prl) poyVarM2.b;
        prlVar2.a = 253402300799L;
        prlVar2.b = 999999999;
        b = (prl) poyVarM2.j();
        poy poyVarM3 = prl.c.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        prl prlVar3 = (prl) poyVarM3.b;
        prlVar3.a = 0L;
        prlVar3.b = 0;
        c = new pse();
    }

    public static long a(prl prlVar) {
        c(prlVar);
        return oxh.O(oxh.P(prlVar.a, 1000L), ((long) prlVar.b) / 1000000);
    }

    public static prl b(long j) {
        long jO = j / 1000;
        int i = (int) ((j % 1000) * 1000000);
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            jO = oxh.O(jO, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            jO = oxh.Q(jO, 1L);
        }
        poy poyVarM = prl.c.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        prl prlVar = (prl) poyVarM.b;
        prlVar.a = jO;
        prlVar.b = i;
        prl prlVar2 = (prl) poyVarM.j();
        c(prlVar2);
        return prlVar2;
    }

    public static void c(prl prlVar) {
        long j = prlVar.a;
        int i = prlVar.b;
        if (j < -62135596800L || j > 253402300799L || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }
}
