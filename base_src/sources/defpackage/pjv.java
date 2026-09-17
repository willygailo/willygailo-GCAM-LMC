package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjv extends ppd implements pqn {
    public static final pjv c;
    private static volatile pqs e;
    public pju a;
    public pju b;
    private int d;

    static {
        pjv pjvVar = new pjv();
        c = pjvVar;
        ppd.F(pjv.class, pjvVar);
    }

    private pjv() {
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
                return E(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new pjv();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pjv.class) {
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
