package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdy extends ppd implements pqn {
    public static final pdy j;
    private static volatile pqs k;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public boolean h;
    public boolean i;

    static {
        pdy pdyVar = new pdy();
        j = pdyVar;
        ppd.F(pdy.class, pdyVar);
    }

    private pdy() {
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
                return E(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", pdq.g, "d", pdq.h, "e", "f", "g", "h", "i"});
            case 3:
                return new pdy();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = k;
                if (pozVar == null) {
                    synchronized (pdy.class) {
                        pozVar = k;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            k = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
