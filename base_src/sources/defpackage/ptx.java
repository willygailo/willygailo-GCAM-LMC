package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptx extends ppd implements pqn {
    public static final ptx k;
    private static volatile pqs l;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    static {
        ptx ptxVar = new ptx();
        k = ptxVar;
        ppd.F(ptx.class, ptxVar);
    }

    private ptx() {
        pow powVar = pow.b;
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
                return E(k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u0010င\u0002", new Object[]{"a", "b", per.n, "d", "e", "f", "g", "h", "i", "j", "c"});
            case 3:
                return new ptx();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (ptx.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
