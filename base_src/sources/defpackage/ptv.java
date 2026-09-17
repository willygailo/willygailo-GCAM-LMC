package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptv extends ppd implements pqn {
    public static final ptv b;
    private static volatile pqs c;
    public ppl a = pqb.b;

    static {
        ptv ptvVar = new ptv();
        b = ptvVar;
        ppd.F(ptv.class, ptvVar);
    }

    private ptv() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"a"});
            case 3:
                return new ptv();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (ptv.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
