package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class par extends ppd implements pqn {
    public static final par h;
    private static volatile pqs i;
    public int a;
    public paa b;
    public long c;
    public int d;
    public int e;
    public int f;
    public float g;

    static {
        par parVar = new par();
        h = parVar;
        ppd.F(par.class, parVar);
    }

    private par() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", pcm.n, "e", pcm.h, "f", pcm.g, "g"});
            case 3:
                return new par();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (par.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
