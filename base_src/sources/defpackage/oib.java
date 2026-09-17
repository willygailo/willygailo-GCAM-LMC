package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oib extends ppd implements pqn {
    public static final oib h;
    private static volatile pqs i;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public ppj f = pow.b;
    public float g;

    static {
        oib oibVar = new oib();
        h = oibVar;
        ppd.F(oib.class, oibVar);
    }

    private oib() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u000f\u0002\u0007\u0003\u000b\u0004\f\u0005\u0007\u0006$\u0007\u0001", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new oib();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (oib.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
