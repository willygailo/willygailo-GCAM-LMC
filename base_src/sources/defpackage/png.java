package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class png extends ppd implements pqn {
    public static final png f;
    private static volatile pqs l;
    public int a;
    public int b;
    public pnc c;
    public String d;
    public float e;
    private pnc g;
    private pnc h;
    private pnc i;
    private pne j;
    private byte k = 2;

    static {
        png pngVar = new png();
        f = pngVar;
        ppd.F(png.class, pngVar);
    }

    private png() {
        ppe ppeVar = ppe.b;
        this.d = "";
        pqv pqvVar = pqv.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
            default:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(f, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0006\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"a", "b", "c", "g", "d", "e", "h", "i", "j"});
            case 3:
                return new png();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (png.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
