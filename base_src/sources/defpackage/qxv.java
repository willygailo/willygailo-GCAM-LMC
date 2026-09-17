package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxv extends ppd implements pqn {
    public static final qxv c;
    private static volatile pqs d;
    public int a;
    public String b = "";

    static {
        qxv qxvVar = new qxv();
        c = qxvVar;
        ppd.F(qxv.class, qxvVar);
    }

    private qxv() {
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
                return E(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new qxv();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (qxv.class) {
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
