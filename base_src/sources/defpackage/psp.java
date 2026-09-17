package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psp extends ppd implements pqn {
    public static final psp g;
    private static volatile pqs h;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public psv e;
    public pss f;

    static {
        psp pspVar = new psp();
        g = pspVar;
        ppd.F(psp.class, pspVar);
    }

    private psp() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new psp();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (psp.class) {
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
