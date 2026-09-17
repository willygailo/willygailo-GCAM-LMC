package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plp extends ppd implements pqn {
    public static final plp q;
    private static volatile pqs r;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f = -1.0f;
    public float g = -1.0f;
    public int h;
    public ppj i;
    public boolean j;
    public pln k;
    public pln l;
    public pln m;
    public pln n;
    public pln o;
    public plm p;

    static {
        plp plpVar = new plp();
        q = plpVar;
        ppd.F(plp.class, plpVar);
    }

    private plp() {
        ppe ppeVar = ppe.b;
        this.i = pow.b;
        pqv pqvVar = pqv.b;
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
                return E(q, "\u0001\u000e\u0000\u0001\u0003(\u000e\u0000\u0001\u0000\u0003ဋ\u0004\u0004ဋ\u0005\u0006ဋ\t\nခ\u0007\u000bခ\b\fဇ\u000b\r\u0013\u001dင\u0003#ဉ\u0011$ဉ\u0012%ဉ\u0013&ဉ\u0014'ဉ\u0015(ဉ\u0016", new Object[]{"a", "d", "e", "h", "f", "g", "j", "i", "c", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new plp();
            case 4:
                return new poy(q);
            case 5:
                return q;
            case 6:
                pqs pozVar = r;
                if (pozVar == null) {
                    synchronized (plp.class) {
                        pozVar = r;
                        if (pozVar == null) {
                            pozVar = new poz(q);
                            r = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
