package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbn extends ppd implements pqn {
    public static final pbn l;
    private static volatile pqs m;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public int i;
    public ozq j;
    public long k;

    static {
        pbn pbnVar = new pbn();
        l = pbnVar;
        ppd.F(pbn.class, pbnVar);
    }

    private pbn() {
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
                return E(l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001ဌ\u0000\u0006ဌ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဂ\n\fဌ\u000b\rဉ\f\u000eဃ\r", new Object[]{"a", "b", paf.u, "c", pcm.n, "d", "e", "f", "g", "h", "i", pbp.b, "j", "k"});
            case 3:
                return new pbn();
            case 4:
                return new poy(l);
            case 5:
                return l;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (pbn.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(l);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
