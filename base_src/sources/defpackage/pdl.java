package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdl extends ppd implements pqn {
    public static final pdl p;
    private static volatile pqs q;
    public int a;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float l;
    public float m;
    public float n;
    public float o;
    public String b = "";
    public ppm k = pqv.b;

    static {
        pdl pdlVar = new pdl();
        p = pdlVar;
        ppd.F(pdl.class, pdlVar);
    }

    private pdl() {
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
                return E(p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tခ\b\n\u001b\u000bခ\t\fခ\n\rခ\u000b\u000eခ\f", new Object[]{"a", "b", "c", "d", pcm.t, "e", "f", "g", "h", "i", "j", "k", pdk.class, "l", "m", "n", "o"});
            case 3:
                return new pdl();
            case 4:
                return new poy(p);
            case 5:
                return p;
            case 6:
                pqs pozVar = q;
                if (pozVar == null) {
                    synchronized (pdl.class) {
                        pozVar = q;
                        if (pozVar == null) {
                            pozVar = new poz(p);
                            q = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
