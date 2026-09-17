package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class puy extends ppd implements pqn {
    public static final puy a;
    private static volatile pqs k;
    private int b;
    private put e;
    private put f;
    private put h;
    private pqh c = pqh.a;
    private pqh d = pqh.a;
    private pqh g = pqh.a;
    private pqh i = pqh.a;
    private pqh j = pqh.a;

    static {
        puy puyVar = new puy();
        a = puyVar;
        ppd.F(puy.class, puyVar);
    }

    private puy() {
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
                return E(a, "\u0001\b\u0000\u0001\u0001\u0014\b\u0005\u0000\u0000\u00012\u00052\u0007ဉ\n\bဉ\u0003\t2\u00122\u0013ဉ\u000b\u00142", new Object[]{"b", "c", puu.a, "d", puq.a, "f", "e", "j", pun.a, "g", puv.a, "h", "i", puw.a});
            case 3:
                return new puy();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = k;
                if (pozVar == null) {
                    synchronized (puy.class) {
                        pozVar = k;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            k = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
