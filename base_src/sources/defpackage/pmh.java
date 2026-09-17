package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pmh extends ppd implements pqn {
    public static final pmh c;
    private static volatile pqs d;
    public int a = 0;
    public Object b;

    static {
        pmh pmhVar = new pmh();
        c = pmhVar;
        ppd.F(pmh.class, pmhVar);
    }

    private pmh() {
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
                return E(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", pmb.class, pmg.class, pmf.class, pma.class, pme.class, pmd.class, pmc.class});
            case 3:
                return new pmh();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (pmh.class) {
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
