package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdn extends ppd implements pqn {
    public static final pdn f;
    private static volatile pqs g;
    public int a;
    public int b;
    public int c;
    public int d;
    public pdo e;

    static {
        pdn pdnVar = new pdn();
        f = pdnVar;
        ppd.F(pdn.class, pdnVar);
    }

    private pdn() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pdn();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pdn.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
