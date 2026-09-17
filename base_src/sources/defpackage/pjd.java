package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjd extends ppd implements pqn {
    public static final pjd b;
    private static volatile pqs d;
    public pjc a;
    private int c;

    static {
        pjd pjdVar = new pjd();
        b = pjdVar;
        ppd.F(pjd.class, pjdVar);
    }

    private pjd() {
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
                return E(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            case 3:
                return new pjd();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (pjd.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
