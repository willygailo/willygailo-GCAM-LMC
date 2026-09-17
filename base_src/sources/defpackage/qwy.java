package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwy extends ppd implements pqn {
    public static final qwy e;
    private static volatile pqs f;
    public int a;
    public ppm b = pqv.b;
    public ppm c = pqv.b;
    public qwx d;

    static {
        qwy qwyVar = new qwy();
        e = qwyVar;
        ppd.F(qwy.class, qwyVar);
    }

    private qwy() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", qxb.class, "c", qww.class, "d"});
            case 3:
                return new qwy();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (qwy.class) {
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
