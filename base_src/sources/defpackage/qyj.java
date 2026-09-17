package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyj extends ppd implements pqn {
    public static final qyj d;
    private static volatile pqs e;
    public int a;
    public long b;
    public int c;

    static {
        qyj qyjVar = new qyj();
        d = qyjVar;
        ppd.F(qyj.class, qyjVar);
    }

    private qyj() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", qxm.h});
            case 3:
                return new qyj();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (qyj.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
