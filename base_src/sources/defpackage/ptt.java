package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptt extends ppd implements pqn {
    public static final ptt d;
    private static volatile pqs e;
    public int a;
    public ptv b;
    public ptu c;

    static {
        ptt pttVar = new ptt();
        d = pttVar;
        ppd.F(ptt.class, pttVar);
    }

    private ptt() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ptt();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (ptt.class) {
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
