package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ccw extends ppd implements pqn {
    public static final ccw c;
    private static volatile pqs e;
    private int d;
    public pqh b = pqh.a;
    public String a = "";

    static {
        ccw ccwVar = new ccw();
        c = ccwVar;
        ppd.F(ccw.class, ccwVar);
    }

    private ccw() {
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
                return E(c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"d", "a", "b", ccv.a});
            case 3:
                return new ccw();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (ccw.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
