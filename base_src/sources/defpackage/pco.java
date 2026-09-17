package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pco extends ppd implements pqn {
    public static final pco f;
    private static volatile pqs g;
    public int a;
    public pcp b;
    public pcl c;
    public pcq d;
    public String e = "";

    static {
        pco pcoVar = new pco();
        f = pcoVar;
        ppd.F(pco.class, pcoVar);
    }

    private pco() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pco();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pco.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
