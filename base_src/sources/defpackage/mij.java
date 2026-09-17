package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mij extends ppd implements pqn {
    public static final mij c;
    private static volatile pqs d;
    public double a;
    public double b;

    static {
        mij mijVar = new mij();
        c = mijVar;
        ppd.F(mij.class, mijVar);
    }

    private mij() {
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
                return E(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"a", "b"});
            case 3:
                return new mij();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (mij.class) {
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
