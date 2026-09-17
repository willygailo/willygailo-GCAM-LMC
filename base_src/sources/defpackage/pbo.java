package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbo extends ppd implements pqn {
    public static final pbo i;
    private static volatile pqs j;
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        pbo pboVar = new pbo();
        i = pboVar;
        ppd.F(pbo.class, pboVar);
    }

    private pbo() {
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
                return E(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new pbo();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (pbo.class) {
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
