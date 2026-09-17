package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plf extends ppd implements pqn {
    public static final plf d;
    private static volatile pqs f;
    public float a = -1.0f;
    public ppj b = pow.b;
    public ppj c = pow.b;
    private int e;

    static {
        plf plfVar = new plf();
        d = plfVar;
        ppd.F(plf.class, plfVar);
    }

    private plf() {
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
                return E(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ခ\u0000\u0002$\u0003$", new Object[]{"e", "a", "b", "c"});
            case 3:
                return new plf();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (plf.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
