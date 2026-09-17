package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptk extends ppd implements pqn {
    public static final ptk f;
    private static volatile pqs g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        ptk ptkVar = new ptk();
        f = ptkVar;
        ppd.F(ptk.class, ptkVar);
    }

    private ptk() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0010ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ptk();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (ptk.class) {
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
