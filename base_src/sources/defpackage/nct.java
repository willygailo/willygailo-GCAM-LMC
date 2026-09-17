package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class nct {
    static final ncu a = new ncr(qyj.d, true);
    private final Random b;
    private final mdf c;
    private final ncd d;

    public nct(Random random, ncd ncdVar, mdf mdfVar) {
        this.b = random;
        this.c = mdfVar;
        this.d = ncdVar;
    }

    final ncu a(qyj qyjVar) {
        int iE = qno.E(qyjVar.c);
        if (iE == 0) {
            iE = 1;
        }
        switch (iE - 1) {
            case 1:
                return new ncr(qyjVar, qyjVar.b == 1000);
            case 3:
                return new ncr(qyjVar, this.b.nextDouble() * 1000.0d < ((double) qyjVar.b));
            case 4:
                return new ncs(qyjVar, this.b, this.d, this.c);
            case 5:
                qyjVar = qyj.d;
                break;
        }
        return new ncr(qyjVar, true);
    }
}
