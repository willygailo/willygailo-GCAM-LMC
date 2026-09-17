package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class min extends ppd implements pqn {
    public static final min e;
    private static volatile pqs f;
    public int b;
    public boolean d;
    public String a = "";
    public String c = "";

    static {
        min minVar = new min();
        e = minVar;
        ppd.F(min.class, minVar);
    }

    private min() {
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
                return E(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new min();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (min.class) {
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
