package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbc extends ppd implements pqn {
    public static final pbc c;
    private static volatile pqs d;
    public int a;
    public int b;

    static {
        pbc pbcVar = new pbc();
        c = pbcVar;
        ppd.F(pbc.class, pbcVar);
    }

    private pbc() {
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
                return E(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", paf.p});
            case 3:
                return new pbc();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (pbc.class) {
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
