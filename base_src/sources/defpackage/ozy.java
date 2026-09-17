package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozy extends ppd implements pqn {
    public static final ozy e;
    private static volatile pqs f;
    public int a;
    public int b;
    public long c;
    public ppm d = pqv.b;

    static {
        ozy ozyVar = new ozy();
        e = ozyVar;
        ppd.F(ozy.class, ozyVar);
    }

    private ozy() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"a", "b", mfw.p, "c", "d", pda.class});
            case 3:
                return new ozy();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (ozy.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
