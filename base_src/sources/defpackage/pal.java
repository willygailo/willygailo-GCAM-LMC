package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pal extends ppd implements pqn {
    public static final pal g;
    private static volatile pqs h;
    public int a;
    public int b;
    public pdi c;
    public pdl d;
    public long e;
    public pdy f;

    static {
        pal palVar = new pal();
        g = palVar;
        ppd.F(pal.class, palVar);
    }

    private pal() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", pcm.n, "c", "d", "e", "f"});
            case 3:
                return new pal();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pal.class) {
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
