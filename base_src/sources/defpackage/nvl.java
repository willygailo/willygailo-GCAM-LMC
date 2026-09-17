package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvl extends ppd implements pqn {
    public static final nvl j;
    private static volatile pqs n;
    public int a;
    public nuw c;
    public nvt d;
    public nvz f;
    public boolean g;
    public nvm h;
    public int i;
    private nvn k;
    private nmj l;
    private byte m = 2;
    public ppm b = pqv.b;
    public ppm e = pqv.b;

    static {
        nvl nvlVar = new nvl();
        j = nvlVar;
        ppd.F(nvl.class, nvlVar);
    }

    private nvl() {
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
                return E(j, "\u0001\n\u0000\u0001\u0001>\n\u0000\u0002\u0002\u0001\u001b\u0003ဉ\u0001\bဉ\u000e\u000fဉ\u001d\u0013\u001b\u0014ᐉ\u0003&ᐉ\b-ဌ\u0013.ဇ\t>ဉ\u0000", new Object[]{"a", "b", nwe.class, "d", "h", "l", "e", nwf.class, "f", "k", "i", mfw.i, "g", "c"});
            case 3:
                return new nvl();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (nvl.class) {
                        pozVar = n;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            n = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
