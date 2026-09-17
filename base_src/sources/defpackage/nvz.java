package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvz extends ppd implements pqn {
    public static final nvz k;
    private static volatile pqs m;
    public int a;
    public Object c;
    public boolean d;
    public float h;
    public float i;
    public float j;
    public int b = 0;
    private byte l = 2;
    public ppm e = pqv.b;
    public ppj f = pow.b;
    public float g = 0.15f;

    static {
        nvz nvzVar = new nvz();
        k = nvzVar;
        ppd.F(nvz.class, nvzVar);
    }

    private nvz() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
            default:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(k, "\u0001\b\u0001\u0001\u0002\u000b\b\u0000\u0002\u0001\u0002ᐼ\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0002\u0007ခ\u0003\bခ\u0004\u000bခ\u0005", new Object[]{"c", "b", "a", nwa.class, "d", "e", nvw.class, "f", "g", "h", "i", "j"});
            case 3:
                return new nvz();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (nvz.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
