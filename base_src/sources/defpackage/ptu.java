package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptu extends ppd implements pqn {
    public static final ptu b;
    private static volatile pqs d;
    public long a;
    private int c;

    static {
        ptu ptuVar = new ptu();
        b = ptuVar;
        ppd.F(ptu.class, ptuVar);
    }

    private ptu() {
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
                return E(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဃ\u0001", new Object[]{"c", "a"});
            case 3:
                return new ptu();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (ptu.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
