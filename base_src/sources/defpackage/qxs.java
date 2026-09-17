package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxs extends ppd implements pqn {
    public static final qxs f;
    private static volatile pqs g;
    public int a;
    public long b;
    public boolean c;
    public int d;
    public String e = "";

    static {
        qxs qxsVar = new qxs();
        f = qxsVar;
        ppd.F(qxs.class, qxsVar);
    }

    private qxs() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new qxs();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (qxs.class) {
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
