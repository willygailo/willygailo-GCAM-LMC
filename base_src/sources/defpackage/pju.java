package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pju extends ppd implements pqn {
    public static final pju e;
    private static volatile pqs g;
    public int a;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        pju pjuVar = new pju();
        e = pjuVar;
        ppd.F(pju.class, pjuVar);
    }

    private pju() {
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
                return E(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "a", "b", "c", "d"});
            case 3:
                return new pju();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pju.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
