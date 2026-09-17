package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pee extends ppd implements pqn {
    public static final pee d;
    private static volatile pqs e;
    public int a;
    public int b;
    public int c;

    static {
        pee peeVar = new pee();
        d = peeVar;
        ppd.F(pee.class, peeVar);
    }

    private pee() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", pdq.o, "c", pdq.o});
            case 3:
                return new pee();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pee.class) {
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
