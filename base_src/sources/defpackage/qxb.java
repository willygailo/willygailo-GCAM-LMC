package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxb extends ppd implements pqn {
    public static final qxb e;
    private static volatile pqs f;
    public int a;
    public int b;
    public int c;
    public qwx d;

    static {
        qxb qxbVar = new qxb();
        e = qxbVar;
        ppd.F(qxb.class, qxbVar);
    }

    private qxb() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new qxb();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (qxb.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
