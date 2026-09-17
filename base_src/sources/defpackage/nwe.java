package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nwe extends ppd implements pqn {
    public static final nwe f;
    private static volatile pqs g;
    public int a;
    public nwd c;
    public float d;
    public String b = "";
    public ppm e = pqv.b;

    static {
        nwe nweVar = new nwe();
        f = nweVar;
        ppd.F(nwe.class, nweVar);
    }

    private nwe() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0003\u000f\u0004\u0000\u0001\u0000\u0003ခ\b\u0004\u001a\u0006ဉ\u0002\u000fဈ\u0001", new Object[]{"a", "d", "e", "c", "b"});
            case 3:
                return new nwe();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (nwe.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }

    public final void b() {
        ppm ppmVar = this.e;
        if (ppmVar.c()) {
            return;
        }
        this.e = ppd.B(ppmVar);
    }
}
