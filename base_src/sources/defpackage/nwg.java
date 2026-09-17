package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nwg extends ppd implements pqn {
    public static final nwg c;
    private static volatile pqs e;
    public nwi a;
    public int b;
    private int d;

    static {
        nwg nwgVar = new nwg();
        c = nwgVar;
        ppd.F(nwg.class, nwgVar);
    }

    private nwg() {
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
                return E(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new nwg();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nwg.class) {
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
