package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psm extends ppd implements pqn {
    public static final psm h;
    private static volatile pqs i;
    public int a;
    public ppj b = pow.b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;

    static {
        psm psmVar = new psm();
        h = psmVar;
        ppd.F(psm.class, psmVar);
    }

    private psm() {
        ppe ppeVar = ppe.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001$\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006ဌ\u0003\tဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", per.k, "g", per.l});
            case 3:
                return new psm();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (psm.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
