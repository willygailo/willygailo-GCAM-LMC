package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyq extends ppd implements pqn {
    public static final qyq c;
    private static volatile pqs d;
    public int a = 0;
    public Object b;

    static {
        qyq qyqVar = new qyq();
        c = qyqVar;
        ppd.F(qyq.class, qyqVar);
    }

    private qyq() {
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
                return E(c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", qyo.class, qyt.class, qyu.class});
            case 3:
                return new qyq();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (qyq.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
