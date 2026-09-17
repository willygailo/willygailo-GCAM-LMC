package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pum extends ppd implements pqn {
    public static final pum r;
    private static volatile pqs w;
    public int a;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean o;
    public boolean p;
    public puz q;
    private int s;
    private puy t;
    private pva u;
    private byte v = 2;
    public ppm b = pqv.b;
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        pum pumVar = new pum();
        r = pumVar;
        ppd.F(pum.class, pumVar);
    }

    private pum() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
            default:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(r, "\u0001\u0012\u0000\u0002\u00076\u0012\u0000\u0001\u0001\u0007ဉ\u0013\bင\u0006\u000eဌ\u0005\u0016ဉ\u001b\u0018Л\u001eဇ\u0019\u001fဇ\t ဇ\u0001%ဈ\u0016&ဈ\u0017'ဈ\u0018(ဇ\u001a)ဇ\r*ဉ\".ဇ\u00020ဇ\f5ဌ\u00006ဌ\u000e", new Object[]{"a", "s", "t", "g", "f", per.p, "q", "b", ptf.class, "o", "h", "d", "l", "m", "n", "p", "j", "u", "e", "i", "c", per.g, "k", per.o});
            case 3:
                return new pum();
            case 4:
                return new poy(r);
            case 5:
                return r;
            case 6:
                pqs pozVar = w;
                if (pozVar == null) {
                    synchronized (pum.class) {
                        pozVar = w;
                        if (pozVar == null) {
                            pozVar = new poz(r);
                            w = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
