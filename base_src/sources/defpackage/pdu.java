package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdu extends ppd implements pqn {
    public static final pdu e;
    private static volatile pqs f;
    public int a;
    public long b;
    public String c = "";
    public boolean d;

    static {
        pdu pduVar = new pdu();
        e = pduVar;
        ppd.F(pdu.class, pduVar);
    }

    private pdu() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new pdu();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pdu.class) {
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
