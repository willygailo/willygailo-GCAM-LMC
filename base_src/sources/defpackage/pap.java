package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pap extends ppd implements pqn {
    public static final pap f;
    private static volatile pqs g;
    public int a;
    public paa b;
    public long c;
    public long d;
    public pat e;

    static {
        pap papVar = new pap();
        f = papVar;
        ppd.F(pap.class, papVar);
    }

    private pap() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pap();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pap.class) {
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
