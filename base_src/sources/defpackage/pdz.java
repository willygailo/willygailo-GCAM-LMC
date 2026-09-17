package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdz extends ppd implements pqn {
    public static final pdz g;
    private static volatile pqs h;
    public int a;
    public boolean b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    static {
        pdz pdzVar = new pdz();
        g = pdzVar;
        ppd.F(pdz.class, pdzVar);
    }

    private pdz() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new pdz();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pdz.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
