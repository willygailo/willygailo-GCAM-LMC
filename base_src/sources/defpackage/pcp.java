package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcp extends ppd implements pqn {
    public static final pcp f;
    private static volatile pqs g;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        pcp pcpVar = new pcp();
        f = pcpVar;
        ppd.F(pcp.class, pcpVar);
    }

    private pcp() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဌ\u0001", new Object[]{"a", "b", pcm.c, "d", "e", "c", pcm.d});
            case 3:
                return new pcp();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pcp.class) {
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
