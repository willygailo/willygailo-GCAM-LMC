package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvs extends ppd implements pqn {
    public static final hvs b;
    private static volatile pqs c;
    public long a;

    static {
        hvs hvsVar = new hvs();
        b = hvsVar;
        ppd.F(hvs.class, hvsVar);
    }

    private hvs() {
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
                return E(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"a"});
            case 3:
                return new hvs();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (hvs.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
