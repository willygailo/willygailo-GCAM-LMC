package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptl extends ppd implements pqn {
    public static final ptl a;
    private static volatile pqs b;

    static {
        ptl ptlVar = new ptl();
        a = ptlVar;
        ppd.F(ptl.class, ptlVar);
    }

    private ptl() {
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
                return E(a, "\u0001\u0000", null);
            case 3:
                return new ptl();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = b;
                if (pozVar == null) {
                    synchronized (ptl.class) {
                        pozVar = b;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            b = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
