package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mgw extends ppd implements pqn {
    public static final mgw b;
    private static volatile pqs c;
    public ppm a = pqv.b;

    static {
        mgw mgwVar = new mgw();
        b = mgwVar;
        ppd.F(mgw.class, mgwVar);
    }

    private mgw() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", pmh.class});
            case 3:
                return new mgw();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (mgw.class) {
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
