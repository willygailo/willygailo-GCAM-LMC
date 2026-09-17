package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxn extends ppd implements pqn {
    public static final qxn f;
    private static volatile pqs h;
    public int a;
    public long b;
    public int c;
    public qxr e;
    private byte g = 2;
    public ppm d = pqv.b;

    static {
        qxn qxnVar = new qxn();
        f = qxnVar;
        ppd.F(qxn.class, qxnVar);
    }

    private qxn() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
            default:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0006ဉ\u0004", new Object[]{"a", "b", "d", qxo.class, "c", qxm.a, "e"});
            case 3:
                return new qxn();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (qxn.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
