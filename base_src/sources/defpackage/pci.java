package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pci extends ppd implements pqn {
    public static final pci s;
    private static volatile pqs t;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public int n;
    public pdw o;
    public int p;
    public long q;
    public long r;

    static {
        pci pciVar = new pci();
        s = pciVar;
        ppd.F(pci.class, pciVar);
    }

    private pci() {
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
                return E(s, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\fဂ\u000b\rဂ\f\u000eဇ\r\u000fဌ\u000e\u0010ဉ\u000f\u0011ဌ\u0010\u0012ဂ\u0011\u0013ဂ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", pbp.n, "o", "p", pbp.o, "q", "r"});
            case 3:
                return new pci();
            case 4:
                return new poy(s);
            case 5:
                return s;
            case 6:
                pqs pozVar = t;
                if (pozVar == null) {
                    synchronized (pci.class) {
                        pozVar = t;
                        if (pozVar == null) {
                            pozVar = new poz(s);
                            t = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
