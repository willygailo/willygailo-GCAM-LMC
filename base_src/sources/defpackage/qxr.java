package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxr extends ppd implements pqn {
    public static final qxr v;
    private static volatile pqs w;
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
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;
    public qxp s;
    public qxp t;
    public pqh u = pqh.a;

    static {
        qxr qxrVar = new qxr();
        v = qxrVar;
        ppd.F(qxr.class, qxrVar);
    }

    private qxr() {
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
                return E(v, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0012\rဉ\u0013\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016ဌ\u0011\u0017ဂ\r\u0018ဂ\u000e", new Object[]{"a", "b", "e", "h", "j", "k", "p", "q", "s", "t", "c", "d", "u", qxq.a, "f", "i", "g", "l", "m", "r", qxm.c, "n", "o"});
            case 3:
                return new qxr();
            case 4:
                return new poy(v);
            case 5:
                return v;
            case 6:
                pqs pozVar = w;
                if (pozVar == null) {
                    synchronized (qxr.class) {
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
