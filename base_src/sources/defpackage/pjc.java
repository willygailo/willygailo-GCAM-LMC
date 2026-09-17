package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjc extends ppd implements pqn {
    public static final pjc c;
    private static volatile pqs e;
    public float a;
    public int b;
    private int d;

    static {
        pjc pjcVar = new pjc();
        c = pjcVar;
        ppd.F(pjc.class, pjcVar);
    }

    private pjc() {
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
                return E(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", per.d});
            case 3:
                return new pjc();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pjc.class) {
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
