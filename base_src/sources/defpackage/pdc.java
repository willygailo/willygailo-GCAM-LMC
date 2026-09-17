package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdc extends ppd implements pqn {
    public static final pdc h;
    private static volatile pqs i;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public long f;
    public long g;

    static {
        pdc pdcVar = new pdc();
        h = pdcVar;
        ppd.F(pdc.class, pdcVar);
    }

    private pdc() {
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
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", pcm.n, "c", pcm.n, "d", pcm.m, "e", "f", "g"});
            case 3:
                return new pdc();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pdc.class) {
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
