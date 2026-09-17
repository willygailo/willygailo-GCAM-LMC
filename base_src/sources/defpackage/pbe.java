package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbe extends ppd implements pqn {
    public static final pbe p;
    private static volatile pqs q;
    public int a;
    public String b = "";
    public String c = "";
    public float d;
    public int e;
    public float f;
    public float g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public float n;
    public float o;

    static {
        pbe pbeVar = new pbe();
        p = pbeVar;
        ppd.F(pbe.class, pbeVar);
    }

    private pbe() {
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
                return E(p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ခ\u0005\u0007ခ\u0006\tဇ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eင\r\u000fခ\u000e\u0010ခ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new pbe();
            case 4:
                return new poy(p);
            case 5:
                return p;
            case 6:
                pqs pozVar = q;
                if (pozVar == null) {
                    synchronized (pbe.class) {
                        pozVar = q;
                        if (pozVar == null) {
                            pozVar = new poz(p);
                            q = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
