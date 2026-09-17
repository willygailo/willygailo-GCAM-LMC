package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pae extends ppd implements pqn {
    public static final pae d;
    private static volatile pqs e;
    public int a;
    public pbk b;
    public pbd c;

    static {
        pae paeVar = new pae();
        d = paeVar;
        ppd.F(pae.class, paeVar);
    }

    private pae() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new pae();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pae.class) {
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
