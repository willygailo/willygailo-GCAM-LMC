package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdj extends ppd implements pqn {
    public static final pdj f;
    private static volatile pqs g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;

    static {
        pdj pdjVar = new pdj();
        f = pdjVar;
        ppd.F(pdj.class, pdjVar);
    }

    private pdj() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pdj();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pdj.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
