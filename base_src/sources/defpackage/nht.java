package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nht extends ppd implements pqn {
    public static final nht p;
    private static volatile pqs s;
    public boolean d;
    public int o;
    private int q;
    private byte r = 2;
    public String a = "";
    public String b = "";
    public String c = "";
    public String e = "";
    public ppm f = pqv.b;
    public ppf g = pnu.b;
    public String h = "";
    public String i = "";
    public String j = "";
    public ppm k = pqv.b;
    public String l = "";
    public String m = "";
    public String n = "";

    static {
        nht nhtVar = new nht();
        p = nhtVar;
        ppd.F(nht.class, nhtVar);
    }

    private nht() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
            default:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(p, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0003\b\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔇ\u0003\u0005ᔈ\u0004\u0006\u001a\u0007\u0019\bᔈ\u0005\tᔈ\u0006\nᔈ\u0007\u000b\u001a\fဈ\b\rဈ\t\u000eဈ\n\u000fဌ\u000b", new Object[]{"q", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", mfw.h});
            case 3:
                return new nht();
            case 4:
                return new poy(p);
            case 5:
                return p;
            case 6:
                pqs pozVar = s;
                if (pozVar == null) {
                    synchronized (nht.class) {
                        pozVar = s;
                        if (pozVar == null) {
                            pozVar = new poz(p);
                            s = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
