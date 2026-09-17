package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class piy extends ppd implements pqn {
    public static final piy d;
    private static volatile pqs e;
    public int a;
    public ppj b = pow.b;
    public float c = 1.0E9f;

    static {
        piy piyVar = new piy();
        d = piyVar;
        ppd.F(piy.class, piyVar);
    }

    private piy() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0013\u0002ခ\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new piy();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (piy.class) {
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
