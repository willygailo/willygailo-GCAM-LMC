package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pst extends ppd implements pqn {
    public static final pst i;
    private static volatile pqs j;
    public int a;
    public int b;
    public int c;
    public int d;
    public poc e = poc.b;
    public poc f = poc.b;
    public String g = "";
    public ppk h = ppe.b;

    static {
        pst pstVar = new pst();
        i = pstVar;
        ppd.F(pst.class, pstVar);
    }

    private pst() {
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
                return E(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ည\u0003\u0005ည\u0004\u0006ဈ\u0005\u0007'", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new pst();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (pst.class) {
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
