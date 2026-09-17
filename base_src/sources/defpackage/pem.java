package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pem extends ppd implements pqn {
    public static final pem B;
    private static volatile pqs C;
    public pdz A;
    public int a;
    public float b;
    public long c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public long k;
    public pel l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public ppk u = ppe.b;
    public int v;
    public float w;
    public long x;
    public long y;
    public boolean z;

    static {
        pem pemVar = new pem();
        B = pemVar;
        ppd.F(pem.class, pemVar);
    }

    private pem() {
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
                return E(B, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0001\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007င\u0006\bင\u0007\tင\b\nဂ\t\u000bဉ\n\fင\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014\u001e\u0015င\u0013\u0016ခ\u0014\u0017ဂ\u0015\u0018ဂ\u0016\u0019ဇ\u0017\u001aဉ\u0018", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", peo.c(), "v", "w", "x", "y", "z", "A"});
            case 3:
                return new pem();
            case 4:
                return new poy(B);
            case 5:
                return B;
            case 6:
                pqs pozVar = C;
                if (pozVar == null) {
                    synchronized (pem.class) {
                        pozVar = C;
                        if (pozVar == null) {
                            pozVar = new poz(B);
                            C = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
