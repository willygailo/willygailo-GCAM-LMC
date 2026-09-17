package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plu extends ppd implements pqn {
    public static final plu a;
    private static volatile pqs c;
    private pqh b = pqh.a;

    static {
        plu pluVar = new plu();
        a = pluVar;
        ppd.F(plu.class, pluVar);
    }

    private plu() {
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
                return E(a, "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"b", plt.a});
            case 3:
                return new plu();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (plu.class) {
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
