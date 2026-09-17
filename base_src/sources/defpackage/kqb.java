package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kqb extends ppd implements pqn {
    public static final kqb n;
    private static volatile pqs o;
    public int a;
    public int b;
    public int g;
    public int i;
    public int k;
    public int l;
    public boolean m;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public long h = -1;
    public String j = "";

    static {
        kqb kqbVar = new kqb();
        n = kqbVar;
        ppd.F(kqb.class, kqbVar);
    }

    private kqb() {
        pqv pqvVar = pqv.b;
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
                return E(n, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"a", "b", "c", "d", "f", "h", "i", "g", per.q, "j", "e", "k", "l", "m"});
            case 3:
                return new kqb();
            case 4:
                return new poy(n);
            case 5:
                return n;
            case 6:
                pqs pozVar = o;
                if (pozVar == null) {
                    synchronized (kqb.class) {
                        pozVar = o;
                        if (pozVar == null) {
                            pozVar = new poz(n);
                            o = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
