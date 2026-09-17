package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pds extends ppd implements pqn {
    public static final pds d;
    private static volatile pqs e;
    public int a;
    public int b;
    public int c;

    static {
        pds pdsVar = new pds();
        d = pdsVar;
        ppd.F(pds.class, pdsVar);
    }

    private pds() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", pdq.d, "c", pdq.c});
            case 3:
                return new pds();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pds.class) {
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
