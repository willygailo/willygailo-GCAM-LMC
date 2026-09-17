package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbg extends ppd implements pqn {
    public static final pbg i;
    private static volatile pqs j;
    public int a;
    public int b;
    public ppj c = pow.b;
    public ppj d = pow.b;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        pbg pbgVar = new pbg();
        i = pbgVar;
        ppd.F(pbg.class, pbgVar);
    }

    private pbg() {
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
                return E(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u0013\u0003\u0013\u0004င\u0001\u0006င\u0003\u0007င\u0004\tင\u0006", new Object[]{"a", "b", paf.q, "c", "d", "e", "f", "g", "h"});
            case 3:
                return new pbg();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (pbg.class) {
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
