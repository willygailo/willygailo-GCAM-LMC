package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pav extends ppd implements pqn {
    public static final pav h;
    private static volatile pqs i;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;

    static {
        pav pavVar = new pav();
        h = pavVar;
        ppd.F(pav.class, pavVar);
    }

    private pav() {
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
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", paf.l, "c", paf.l, "d", "e", "f", paf.m, "g"});
            case 3:
                return new pav();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pav.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
