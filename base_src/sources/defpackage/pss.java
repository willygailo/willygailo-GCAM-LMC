package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pss extends ppd implements pqn {
    public static final pss f;
    private static volatile pqs g;
    public int a;
    public ppm b = pqv.b;
    public float c;
    public int d;
    public pst e;

    static {
        pss pssVar = new pss();
        f = pssVar;
        ppd.F(pss.class, pssVar);
    }

    private pss() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003င\u0001\u0005ဉ\u0002", new Object[]{"a", "b", psr.class, "c", "d", "e"});
            case 3:
                return new pss();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pss.class) {
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
