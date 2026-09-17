package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptj extends ppd implements pqn {
    public static final ptj f;
    private static volatile pqs g;
    public int a;
    public String b = "";
    public String c = "";
    public poc d = poc.b;
    public boolean e;

    static {
        ptj ptjVar = new ptj();
        f = ptjVar;
        ppd.F(ptj.class, ptjVar);
    }

    private ptj() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0010ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ptj();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (ptj.class) {
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
