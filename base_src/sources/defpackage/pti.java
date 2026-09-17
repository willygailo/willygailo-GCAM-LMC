package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pti extends ppd implements pqn {
    public static final pti b;
    private static volatile pqs c;
    public ppm a = pqv.b;

    static {
        pti ptiVar = new pti();
        b = ptiVar;
        ppd.F(pti.class, ptiVar);
    }

    private pti() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ptl.class});
            case 3:
                return new pti();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (pti.class) {
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
