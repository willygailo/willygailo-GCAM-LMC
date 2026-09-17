package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pld extends ppd implements pqn {
    public static final pld c;
    private static volatile pqs e;
    public int a = -1;
    public int b = -1;
    private int d;

    static {
        pld pldVar = new pld();
        c = pldVar;
        ppd.F(pld.class, pldVar);
    }

    private pld() {
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
                return E(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new pld();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pld.class) {
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
