package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psj extends ppd implements pqn {
    public static final psj c;
    private static volatile pqs d;
    public int a = 0;
    public Object b;

    static {
        psj psjVar = new psj();
        c = psjVar;
        ppd.F(psj.class, psjVar);
    }

    private psj() {
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
                return E(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", per.h, psh.class, psi.class});
            case 3:
                return new psj();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (psj.class) {
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
