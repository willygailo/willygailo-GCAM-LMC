package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbm extends ppd implements pqn {
    public static final pbm g;
    private static volatile pqs h;
    public int a;
    public int b;
    public pei c;
    public long d;
    public int e;
    public int f;

    static {
        pbm pbmVar = new pbm();
        g = pbmVar;
        ppd.F(pbm.class, pbmVar);
    }

    private pbm() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဂ\u0002\u0006ဌ\u0004\u0007ဋ\u0005", new Object[]{"a", "b", paf.s, "c", "d", "e", paf.t, "f"});
            case 3:
                return new pbm();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pbm.class) {
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
