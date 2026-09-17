package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pas extends ppd implements pqn {
    public static final pas m;
    private static volatile pqs n;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public ppm j = pqv.b;
    public long k;
    public long l;

    static {
        pas pasVar = new pas();
        m = pasVar;
        ppd.F(pas.class, pasVar);
    }

    private pas() {
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
                return E(m, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\tဂ\u0005\nဂ\u0006\u000e\u001b\u000fဂ\r\u0010ဂ\u000e", new Object[]{"a", "b", "c", "d", "g", "h", "i", "e", "f", "j", pct.class, "k", "l"});
            case 3:
                return new pas();
            case 4:
                return new poy(m);
            case 5:
                return m;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (pas.class) {
                        pozVar = n;
                        if (pozVar == null) {
                            pozVar = new poz(m);
                            n = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
