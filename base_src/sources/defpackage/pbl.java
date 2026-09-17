package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbl extends ppd implements pqn {
    public static final pbl d;
    private static volatile pqs e;
    public int a;
    public int b;
    public pei c;

    static {
        pbl pblVar = new pbl();
        d = pblVar;
        ppd.F(pbl.class, pblVar);
    }

    private pbl() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", paf.s, "c"});
            case 3:
                return new pbl();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pbl.class) {
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
