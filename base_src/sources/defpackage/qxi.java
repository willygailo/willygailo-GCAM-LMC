package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxi extends ppb implements pqn {
    public static final qxi g;
    private static volatile pqs j;
    public int a;
    public qxh b;
    public qxt c;
    public int d;
    public qxg e;
    private byte i = 2;
    public String f = "";

    static {
        qxi qxiVar = new qxi();
        g = qxiVar;
        ppd.F(qxi.class, qxiVar);
    }

    private qxi() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
            default:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", per.u, "e", "f"});
            case 3:
                return new qxi();
            case 4:
                return new ppa(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (qxi.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
