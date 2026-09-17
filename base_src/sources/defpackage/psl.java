package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psl extends ppd implements pqn {
    public static final psl m;
    private static volatile pqs n;
    public int a;
    public int c;
    public long d;
    public long e;
    public long f;
    public int h;
    public int i;
    public psj j;
    public String b = "";
    public String g = "";
    public ppl k = pqb.b;
    public String l = "";

    static {
        psl pslVar = new psl();
        m = pslVar;
        ppd.F(psl.class, pslVar);
    }

    private psl() {
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
                return E(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t", new Object[]{"a", "b", "d", "e", "f", "g", "h", per.j, "i", per.i, "k", "l", "c", "j"});
            case 3:
                return new psl();
            case 4:
                return new poy(m);
            case 5:
                return m;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (psl.class) {
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

    public final void i() {
        ppl pplVar = this.k;
        if (pplVar.c()) {
            return;
        }
        this.k = ppd.z(pplVar);
    }
}
