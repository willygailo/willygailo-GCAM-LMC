package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pix extends ppd implements pqn {
    public static final pix i;
    private static volatile pqs j;
    public int a;
    public pjb d;
    public piy e;
    public int f;
    public pjd h;
    public ppj b = pow.b;
    public ppj c = pow.b;
    public ppm g = pqv.b;

    static {
        pix pixVar = new pix();
        i = pixVar;
        ppd.F(pix.class, pixVar);
    }

    private pix() {
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
                return E(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0013\u0002\u0013\u0003ဉ\u0000\u0004ဉ\u0001\u0005င\u0002\u0006\u001b\u0007ဉ\u0003", new Object[]{"a", "b", "c", "d", "e", "f", "g", piz.class, "h"});
            case 3:
                return new pix();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (pix.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(i);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
