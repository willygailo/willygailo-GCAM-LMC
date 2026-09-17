package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyl extends ppd implements pqn {
    public static final pyl f;
    private static volatile pqs g;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public long e;

    static {
        pyl pylVar = new pyl();
        f = pylVar;
        ppd.F(pyl.class, pylVar);
    }

    private pyl() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pyl();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pyl.class) {
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
