package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psy extends ppd implements pqn {
    public static final psy a;
    private static volatile pqs c;
    private pna b;

    static {
        psy psyVar = new psy();
        a = psyVar;
        ppd.F(psy.class, psyVar);
    }

    private psy() {
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
                return E(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"b"});
            case 3:
                return new psy();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (psy.class) {
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
