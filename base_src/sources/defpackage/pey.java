package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pey extends ppd implements pqn {
    public static final pey d;
    private static volatile pqs f;
    public int a;
    public pex b;
    private byte e = 2;
    public ppm c = pqv.b;

    static {
        pey peyVar = new pey();
        d = peyVar;
        ppd.F(pey.class, peyVar);
    }

    private pey() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
            default:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔉ\u0000\u0002Л", new Object[]{"a", "b", "c", pex.class});
            case 3:
                return new pey();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pey.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }

    public final void b() {
        ppm ppmVar = this.c;
        if (ppmVar.c()) {
            return;
        }
        this.c = ppd.B(ppmVar);
    }
}
