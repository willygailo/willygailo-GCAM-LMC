package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptm extends ppd implements pqn {
    public static final ptm j;
    private static volatile pqs k;
    public int a;
    public plv b;
    public String c = "";
    public ply d;
    public plu e;
    public boolean f;
    public ppm g;
    public ppm h;
    public ppm i;

    static {
        ptm ptmVar = new ptm();
        j = ptmVar;
        ppd.F(ptm.class, ptmVar);
    }

    private ptm() {
        poc pocVar = poc.b;
        this.g = pqv.b;
        this.h = pqv.b;
        this.i = pqv.b;
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
                return E(j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u001b\b\u001b\t\u001b\u0010ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "g", ptj.class, "h", ptk.class, "i", ptl.class, "f"});
            case 3:
                return new ptm();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = k;
                if (pozVar == null) {
                    synchronized (ptm.class) {
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
