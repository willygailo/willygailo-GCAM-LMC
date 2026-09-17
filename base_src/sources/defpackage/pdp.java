package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdp extends ppd implements pqn {
    public static final pdp i;
    private static volatile pqs j;
    public int a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    static {
        pdp pdpVar = new pdp();
        i = pdpVar;
        ppd.F(pdp.class, pdpVar);
    }

    private pdp() {
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
                return E(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", pdq.b, "c", "d", "e", "f", "g", "h"});
            case 3:
                return new pdp();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (pdp.class) {
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
