package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozo extends ppd implements pqn {
    public static final ozo c;
    private static volatile pqs d;
    public int a;
    public int b;

    static {
        ozo ozoVar = new ozo();
        c = ozoVar;
        ppd.F(ozo.class, ozoVar);
    }

    private ozo() {
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
                return E(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mfw.m});
            case 3:
                return new ozo();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (ozo.class) {
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
