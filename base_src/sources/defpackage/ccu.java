package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ccu extends ppd implements pqn {
    public static final ccu j;
    private static volatile pqs m;
    public int a;
    public int b;
    public int c;
    public int d;
    public prl e;
    public prl f;
    public int g;
    public boolean i;
    private int k;
    private pqh l = pqh.a;
    public ppm h = pqv.b;

    static {
        ccu ccuVar = new ccu();
        j = ccuVar;
        ppd.F(ccu.class, ccuVar);
    }

    private ccu() {
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
                return E(j, "\u0000\n\u0000\u0001\u0001\n\n\u0001\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006\t\u0007\u0004\b2\t\u001b\nဇ\u0000", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "l", cct.a, "h", ccw.class, "i"});
            case 3:
                return new ccu();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (ccu.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
