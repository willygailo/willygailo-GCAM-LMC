package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pup extends ppd implements pqn {
    public static final pup a;
    private static volatile pqs c;
    private pqh b = pqh.a;

    static {
        pup pupVar = new pup();
        a = pupVar;
        ppd.F(pup.class, pupVar);
    }

    private pup() {
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
                return E(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", puo.a});
            case 3:
                return new pup();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (pup.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
