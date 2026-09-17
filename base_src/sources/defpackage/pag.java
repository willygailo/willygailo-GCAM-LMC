package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pag extends ppd implements pqn {
    public static final pag g;
    private static volatile pqs h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        pag pagVar = new pag();
        g = pagVar;
        ppd.F(pag.class, pagVar);
    }

    private pag() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", paf.c, "c", paf.a, "d", paf.d, "e", ozz.c(), "f", paf.e});
            case 3:
                return new pag();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pag.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
