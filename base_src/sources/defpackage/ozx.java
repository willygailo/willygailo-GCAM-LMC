package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozx extends ppd implements pqn {
    public static final ozx d;
    private static volatile pqs e;
    public int a;
    public double b;
    public int c;

    static {
        ozx ozxVar = new ozx();
        d = ozxVar;
        ppd.F(ozx.class, ozxVar);
    }

    private ozx() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ozx();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (ozx.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
