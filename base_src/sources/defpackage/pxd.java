package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxd extends ppd implements pqn {
    public static final pxd a;
    private static volatile pqs b;

    static {
        pxd pxdVar = new pxd();
        a = pxdVar;
        ppd.F(pxd.class, pxdVar);
    }

    private pxd() {
        pow powVar = pow.b;
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
                return new pxd();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = b;
                if (pozVar == null) {
                    synchronized (pxd.class) {
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
