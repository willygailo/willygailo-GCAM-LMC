package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbh extends ppd implements pqn {
    public static final pbh c;
    private static volatile pqs d;
    public int a;
    public int b;

    static {
        pbh pbhVar = new pbh();
        c = pbhVar;
        ppd.F(pbh.class, pbhVar);
    }

    private pbh() {
        ppe ppeVar = ppe.b;
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
                return E(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005င\u0002", new Object[]{"a", "b"});
            case 3:
                return new pbh();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (pbh.class) {
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
