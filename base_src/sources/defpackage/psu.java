package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psu extends ppd implements pqn {
    public static final psu g;
    private static volatile pqs h;
    public int a;
    public long b;
    public long c;
    public float d;
    public ppj e = pow.b;
    public ppj f = pow.b;

    static {
        psu psuVar = new psu();
        g = psuVar;
        ppd.F(psu.class, psuVar);
    }

    private psu() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004$\u0005$", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new psu();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (psu.class) {
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
