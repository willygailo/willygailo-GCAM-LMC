package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mid extends ppd implements pqn {
    public static final mid c;
    private static volatile pqs d;
    public int a;
    public boolean b;

    static {
        mid midVar = new mid();
        c = midVar;
        ppd.F(mid.class, midVar);
    }

    private mid() {
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
                return E(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            case 3:
                return new mid();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (mid.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
