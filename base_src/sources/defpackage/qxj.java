package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxj extends ppd implements pqn {
    public static final qxj g;
    private static volatile pqs i;
    public int a;
    public int b;
    public int c;
    public String d;
    public ppl e;
    public qxl f;
    private byte h = 2;

    static {
        qxj qxjVar = new qxj();
        g = qxjVar;
        ppd.F(qxj.class, qxjVar);
    }

    private qxj() {
        pqv pqvVar = pqv.b;
        this.d = "";
        this.e = pqb.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
            default:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(g, "\u0001\u0005\u0000\u0001\u0005\u0016\u0005\u0000\u0001\u0000\u0005င\u0005\bဌ\b\u0011ဈ\u0013\u0015(\u0016ဉ\u0016", new Object[]{"a", "b", "c", qxm.b, "d", "e", "f"});
            case 3:
                return new qxj();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (qxj.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
