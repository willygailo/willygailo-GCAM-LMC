package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class put extends ppd implements pqn {
    public static final put a;
    private static volatile pqs d;
    private pqh b = pqh.a;
    private pqh c = pqh.a;

    static {
        put putVar = new put();
        a = putVar;
        ppd.F(put.class, putVar);
    }

    private put() {
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
                return E(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", pus.a, "c", pur.a});
            case 3:
                return new put();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (put.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
