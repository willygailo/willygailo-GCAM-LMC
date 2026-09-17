package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdb extends ppd implements pqn {
    public static final pdb v;
    private static volatile pqs w;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public boolean o;
    public pbi p;
    public pbi q;
    public pbi r;
    public pbi s;
    public pbi t;
    public ozx u;

    static {
        pdb pdbVar = new pdb();
        v = pdbVar;
        ppd.F(pdb.class, pdbVar);
    }

    private pdb() {
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
                return E(v, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
            case 3:
                return new pdb();
            case 4:
                return new poy(v);
            case 5:
                return v;
            case 6:
                pqs pozVar = w;
                if (pozVar == null) {
                    synchronized (pdb.class) {
                        pozVar = w;
                        if (pozVar == null) {
                            pozVar = new poz(v);
                            w = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
