package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qza extends ppd implements pqn {
    public static final qza h;
    private static volatile pqs i;
    public pqh a = pqh.a;
    public pqh b = pqh.a;
    public ppm c = pqv.b;
    public ppl d = pqb.b;
    public ppk e = ppe.b;
    public ppk f = ppe.b;
    public ppl g = pqb.b;

    static {
        qza qzaVar = new qza();
        h = qzaVar;
        ppd.F(qza.class, qzaVar);
    }

    private qza() {
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
                return E(h, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"a", qyy.a, "b", qyz.a, "c", qyw.class, "d", "e", "f", "g"});
            case 3:
                return new qza();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (qza.class) {
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
