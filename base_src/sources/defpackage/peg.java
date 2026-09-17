package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class peg extends ppd implements pqn {
    public static final peg u;
    private static volatile pqs v;
    public int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean t;

    static {
        peg pegVar = new peg();
        u = pegVar;
        ppd.F(peg.class, pegVar);
    }

    private peg() {
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
                return E(u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဇ\u0012", new Object[]{"a", "b", "c", "d", pef.c(), "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
            case 3:
                return new peg();
            case 4:
                return new poy(u);
            case 5:
                return u;
            case 6:
                pqs pozVar = v;
                if (pozVar == null) {
                    synchronized (peg.class) {
                        pozVar = v;
                        if (pozVar == null) {
                            pozVar = new poz(u);
                            v = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
