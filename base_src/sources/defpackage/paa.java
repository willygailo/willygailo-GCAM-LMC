package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class paa extends ppd implements pqn {
    public static final paa c;
    private static volatile pqs d;
    public int a;
    public int b;

    static {
        paa paaVar = new paa();
        c = paaVar;
        ppd.F(paa.class, paaVar);
    }

    private paa() {
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
                return E(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", mfw.r});
            case 3:
                return new paa();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (paa.class) {
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
