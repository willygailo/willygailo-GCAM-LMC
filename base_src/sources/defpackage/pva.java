package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pva extends ppd implements pqn {
    public static final pva a;
    private static volatile pqs e;
    private int b;
    private puy c;
    private puy d;

    static {
        pva pvaVar = new pva();
        a = pvaVar;
        ppd.F(pva.class, pvaVar);
    }

    private pva() {
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
                return E(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new pva();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pva.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
