package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyi extends ppd implements pqn {
    public static final qyi d;
    private static volatile pqs g;
    public int a;
    public int b;
    private qyh e;
    private byte f = 2;
    public int c = 1;

    static {
        qyi qyiVar = new qyi();
        d = qyiVar;
        ppd.F(qyi.class, qyiVar);
    }

    private qyi() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
            default:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", qxm.g, "c", "e"});
            case 3:
                return new qyi();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (qyi.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
