package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plx extends ppd implements pqn {
    public static final plx d;
    private static volatile pqs e;
    public Object b;
    public int a = 0;
    public ppm c = pqv.b;

    static {
        plx plxVar = new plx();
        d = plxVar;
        ppd.F(plx.class, plxVar);
    }

    private plx() {
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
                return E(d, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဵ\u0000\u0002\u001a\u0003ျ\u0000\u0004ျ\u0000", new Object[]{"b", "a", "c"});
            case 3:
                return new plx();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (plx.class) {
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
