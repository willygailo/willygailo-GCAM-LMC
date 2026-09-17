package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pud extends ppd implements pqn {
    public static final pud l;
    private static volatile pqs n;
    public int a;
    public long b;
    public long c;
    public ptx d;
    public pte e;
    public boolean f;
    public pue h;
    public puc i;
    public float j;
    public pul k;
    private byte m = 2;
    public boolean g = true;

    static {
        pud pudVar = new pud();
        l = pudVar;
        ppd.F(pud.class, pudVar);
    }

    private pud() {
        pqv pqvVar = pqv.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
            default:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(l, "\u0001\n\u0000\u0001\u0001\u0016\n\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0005\u0004ᐉ\u0006\u0005ခ\u0010\u0006ဉ\u000e\u0007ဉ\u000f\u000bဇ\t\u0015ဉ\u0015\u0016ဇ\u000b", new Object[]{"a", "b", "c", "d", "e", "j", "h", "i", "f", "k", "g"});
            case 3:
                return new pud();
            case 4:
                return new poy(l);
            case 5:
                return l;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (pud.class) {
                        pozVar = n;
                        if (pozVar == null) {
                            pozVar = new poz(l);
                            n = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
