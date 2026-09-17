package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ncu {
    private final qyj a;

    public ncu(qyj qyjVar) {
        this.a = qyjVar;
    }

    public abstract long a(String str);

    public abstract qyj b(Long l);

    public abstract boolean c();

    public final qyj d() {
        qyj qyjVarE = e(null);
        poy poyVar = (poy) qyjVarE.G(5);
        poyVar.o(qyjVarE);
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        qyj qyjVar = (qyj) poyVar.b;
        qyj qyjVar2 = qyj.d;
        qyjVar.a |= 2;
        qyjVar.b = -1L;
        return (qyj) poyVar.j();
    }

    public final qyj e(Long l) {
        int iE = qno.E(this.a.c);
        if (iE == 0 || iE != 5 || l == null || l.longValue() == this.a.b) {
            return this.a;
        }
        poy poyVarM = qyj.d.m();
        int iE2 = qno.E(this.a.c);
        if (iE2 == 0) {
            iE2 = 1;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyj qyjVar = (qyj) poyVarM.b;
        qyjVar.c = iE2 - 1;
        qyjVar.a |= 4;
        long jLongValue = l.longValue();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyj qyjVar2 = (qyj) poyVarM.b;
        qyjVar2.a |= 2;
        qyjVar2.b = jLongValue;
        return (qyj) poyVarM.j();
    }
}
