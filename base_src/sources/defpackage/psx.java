package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psx extends ppd implements pqn {
    public static final psx e;
    private static volatile pqs g;
    public float a = -1.0f;
    public float b = -1.0f;
    public boolean c = true;
    public psw d;
    private int f;

    static {
        psx psxVar = new psx();
        e = psxVar;
        ppd.F(psx.class, psxVar);
    }

    private psx() {
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
                return E(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            case 3:
                return new psx();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (psx.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
