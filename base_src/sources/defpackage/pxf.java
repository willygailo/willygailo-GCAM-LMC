package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxf extends ppd implements pqn {
    public static final pxf a;
    private static volatile pqs b;

    static {
        pxf pxfVar = new pxf();
        a = pxfVar;
        ppd.F(pxf.class, pxfVar);
    }

    private pxf() {
        pqv pqvVar = pqv.b;
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
                return new pxf();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = b;
                if (pozVar == null) {
                    synchronized (pxf.class) {
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
