package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcs extends ppd implements pqn {
    public static final kcs e;
    private static volatile pqs g;
    public int a;
    public kcr b;
    public kcq c;
    public int d = -1;
    private int f;

    static {
        kcs kcsVar = new kcs();
        e = kcsVar;
        ppd.F(kcs.class, kcsVar);
    }

    private kcs() {
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
                return E(e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007ဌ\u0005", new Object[]{"f", "a", "b", "c", "d", mfw.a});
            case 3:
                return new kcs();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (kcs.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
