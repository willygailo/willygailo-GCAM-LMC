package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pex extends ppd implements pqn {
    public static final pex f;
    private static volatile pqs h;
    public int a;
    public long d;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public ppm e = pqv.b;

    static {
        pex pexVar = new pex();
        f = pexVar;
        ppd.F(pex.class, pexVar);
    }

    private pex() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
            default:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"a", "b", "c", "d", "e", pew.class});
            case 3:
                return new pex();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pex.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
