package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdv extends ppd implements pqn {
    public static final pdv d;
    private static volatile pqs e;
    public int a;
    public int b;
    public boolean c;

    static {
        pdv pdvVar = new pdv();
        d = pdvVar;
        ppd.F(pdv.class, pdvVar);
    }

    private pdv() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", pdq.f, "c"});
            case 3:
                return new pdv();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pdv.class) {
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
