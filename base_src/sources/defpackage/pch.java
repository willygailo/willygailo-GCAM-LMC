package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pch extends ppd implements pqn {
    public static final pch g;
    private static volatile pqs h;
    public int a;
    public boolean c;
    public int d;
    public int f;
    public String b = "";
    public String e = "";

    static {
        pch pchVar = new pch();
        g = pchVar;
        ppd.F(pch.class, pchVar);
    }

    private pch() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", "c", "d", mfw.s, "e", "f"});
            case 3:
                return new pch();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pch.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
