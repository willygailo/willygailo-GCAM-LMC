package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxf extends ppd implements pqn {
    private static volatile pqs A;
    public static final qxf z;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    static {
        qxf qxfVar = new qxf();
        z = qxfVar;
        ppd.F(qxf.class, qxfVar);
    }

    private qxf() {
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
                return E(z, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0007\bင\b\tင\t\nင\n\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\u000f\u0010င\u0010\u0011င\u0011\u0012င\u0012\u0013င\u0006\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "h", "u", "v", "w", "x", "y"});
            case 3:
                return new qxf();
            case 4:
                return new poy(z);
            case 5:
                return z;
            case 6:
                pqs pozVar = A;
                if (pozVar == null) {
                    synchronized (qxf.class) {
                        pozVar = A;
                        if (pozVar == null) {
                            pozVar = new poz(z);
                            A = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
