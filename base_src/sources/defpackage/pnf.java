package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pnf extends ppb implements pqn {
    public static final pnf g;
    private static volatile pqs m;
    public int a;
    public pnc c;
    public int e;
    public int f;
    private pnc i;
    private pnc j;
    private pnd k;
    private byte l = 2;
    public ppm b = pqv.b;
    public String d = "";

    static {
        pnf pnfVar = new pnf();
        g = pnfVar;
        ppd.F(pnf.class, pnfVar);
    }

    private pnf() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
            default:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(g, "\u0001\b\u0000\u0001\u0001\u0013\b\u0000\u0001\u0005\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0003\u000fᐉ\u000b\u0011င\r\u0012င\u000e\u0013ᐉ\u0002", new Object[]{"a", "b", pnj.class, "c", "i", "d", "k", "e", "f", "j"});
            case 3:
                return new pnf();
            case 4:
                return new ppa(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (pnf.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
