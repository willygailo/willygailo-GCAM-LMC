package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pna extends ppd implements pqn {
    public static final pna a;
    private static volatile pqs c;
    private pqh b = pqh.a;

    static {
        pna pnaVar = new pna();
        a = pnaVar;
        ppd.F(pna.class, pnaVar);
    }

    private pna() {
        pqv pqvVar = pqv.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", pmz.a});
            case 3:
                return new pna();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (pna.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
