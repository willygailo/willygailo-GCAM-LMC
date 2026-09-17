package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psd {
    public static final pop a;
    public static final pop b;

    static {
        poy poyVarM = pop.c.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pop popVar = (pop) poyVarM.b;
        popVar.a = -315576000000L;
        popVar.b = -999999999;
        a = (pop) poyVarM.j();
        poy poyVarM2 = pop.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pop popVar2 = (pop) poyVarM2.b;
        popVar2.a = 315576000000L;
        popVar2.b = 999999999;
        b = (pop) poyVarM2.j();
        poy poyVarM3 = pop.c.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pop popVar3 = (pop) poyVarM3.b;
        popVar3.a = 0L;
        popVar3.b = 0;
    }

    public static pop a(long j) {
        return b(j / 1000000000, (int) (j % 1000000000));
    }

    public static pop b(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = oxh.O(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - 1000000000);
            j++;
        }
        poy poyVarM = pop.c.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pop popVar = (pop) poyVarM.b;
        popVar.a = j;
        popVar.b = i;
        pop popVar2 = (pop) poyVarM.j();
        c(popVar2);
        return popVar2;
    }

    public static void c(pop popVar) {
        long j = popVar.a;
        int i = popVar.b;
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = i;
            if (j2 >= -999999999 && j2 < 1000000000) {
                if (j >= 0 && i >= 0) {
                    return;
                }
                if (j <= 0 && i <= 0) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
