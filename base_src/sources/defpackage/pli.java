package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pli extends ppd implements pqn {
    public static final pli B;
    private static volatile pqs D;
    public plf A;
    private int C;
    public pla a;
    public int f;
    public boolean g;
    public long i;
    public long j;
    public long k;
    public plh m;
    public boolean o;
    public psx q;
    public float r;
    public plg v;
    public plb w;
    public ple x;
    public pld y;
    public plc z;
    public int b = -1;
    public int c = -1;
    public ppj d = pow.b;
    public ppf e = pnu.b;
    public int h = -1;
    public int l = -1;
    public int n = 1;
    public float p = 1.0f;
    public float s = -1.0f;
    public float t = -1.0f;
    public ppj u = pow.b;

    static {
        pli pliVar = new pli();
        B = pliVar;
        ppd.F(pli.class, pliVar);
    }

    private pli() {
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
                return E(B, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0003\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004\u0013\u0005\u0019\u0006ဌ\u0003\u0007ဇ\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fင\t\rဉ\n\u000eဌ\u000b\u000fဇ\f\u0010ခ\r\u0011ဉ\u000e\u0012ခ\u000f\u0013ခ\u0010\u0014ခ\u0011\u0015\u0013\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0014\u0019ဉ\u0015\u001aဉ\u0016\u001bဉ\u0017", new Object[]{"C", "a", "b", "c", "d", "e", "f", per.f, "g", "h", "i", "j", "k", "l", "m", "n", per.e, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A"});
            case 3:
                return new pli();
            case 4:
                return new poy(B);
            case 5:
                return B;
            case 6:
                pqs pozVar = D;
                if (pozVar == null) {
                    synchronized (pli.class) {
                        pozVar = D;
                        if (pozVar == null) {
                            pozVar = new poz(B);
                            D = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
