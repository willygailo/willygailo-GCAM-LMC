package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pln extends ppd implements pqn {
    public static final pln g;
    private static volatile pqs i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        pln plnVar = new pln();
        g = plnVar;
        ppd.F(pln.class, plnVar);
    }

    private pln() {
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
                return E(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            case 3:
                return new pln();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pln.class) {
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
