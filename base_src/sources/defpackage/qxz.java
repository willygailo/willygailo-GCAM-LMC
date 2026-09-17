package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxz extends ppd implements pqn {
    public static final qxz d;
    private static volatile pqs e;
    public ppl a = pqb.b;
    public ppl b = pqb.b;
    public ppk c = ppe.b;

    static {
        qxz qxzVar = new qxz();
        d = qxzVar;
        ppd.F(qxz.class, qxzVar);
    }

    private qxz() {
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
                return E(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001%\u0002%\u0003'", new Object[]{"a", "b", "c"});
            case 3:
                return new qxz();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (qxz.class) {
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
