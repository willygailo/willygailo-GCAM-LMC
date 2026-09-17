package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psh extends ppd implements pqn {
    public static final psh c;
    private static volatile pqs d;
    public ppk a = ppe.b;
    public ppm b = pqv.b;

    static {
        psh pshVar = new psh();
        c = pshVar;
        ppd.F(psh.class, pshVar);
    }

    private psh() {
    }

    public static poy i() {
        return c.m();
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
                return E(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"a", per.h, "b", psi.class});
            case 3:
                return new psh();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (psh.class) {
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
