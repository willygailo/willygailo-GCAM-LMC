package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plb extends ppd implements pqn {
    public static final plb d;
    private static volatile pqs f;
    public int a = -1;
    public float b = -1.0f;
    public float c = -1.0f;
    private int e;

    static {
        plb plbVar = new plb();
        d = plbVar;
        ppd.F(plb.class, plbVar);
    }

    private plb() {
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
                return E(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
            case 3:
                return new plb();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (plb.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
