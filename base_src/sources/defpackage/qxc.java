package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxc extends ppd implements pqn {
    public static final qxc e;
    private static volatile pqs f;
    public int a;
    public int b;
    public long c;
    public qwx d;

    static {
        qxc qxcVar = new qxc();
        e = qxcVar;
        ppd.F(qxc.class, qxcVar);
    }

    private qxc() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new qxc();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (qxc.class) {
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
