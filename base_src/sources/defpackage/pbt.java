package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbt extends ppd implements pqn {
    public static final pbt d;
    private static volatile pqs e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        pbt pbtVar = new pbt();
        d = pbtVar;
        ppd.F(pbt.class, pbtVar);
    }

    private pbt() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new pbt();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pbt.class) {
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
