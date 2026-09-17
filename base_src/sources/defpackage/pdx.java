package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdx extends ppd implements pqn {
    public static final pdx d;
    private static volatile pqs e;
    public int a;
    public long b;
    public ppm c = pqv.b;

    static {
        pdx pdxVar = new pdx();
        d = pdxVar;
        ppd.F(pdx.class, pdxVar);
    }

    private pdx() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", pdu.class});
            case 3:
                return new pdx();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pdx.class) {
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
