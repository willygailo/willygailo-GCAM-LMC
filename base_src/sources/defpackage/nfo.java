package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nfo extends ppd implements pqn {
    public static final nfo g;
    private static volatile pqs i;
    public String a = "";
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        nfo nfoVar = new nfo();
        g = nfoVar;
        ppd.F(nfo.class, nfoVar);
    }

    private nfo() {
        pqv pqvVar = pqv.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"h", "a", "b", "c", per.c, "d", "f", "e"});
            case 3:
                return new nfo();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (nfo.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
