package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdh extends ppd implements pqn {
    public static final pdh d;
    private static volatile pqs e;
    public int a;
    public boolean b;
    public long c;

    static {
        pdh pdhVar = new pdh();
        d = pdhVar;
        ppd.F(pdh.class, pdhVar);
    }

    private pdh() {
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
                return E(d, "\u0001\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0000\tဇ\u0001\nဂ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new pdh();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pdh.class) {
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
