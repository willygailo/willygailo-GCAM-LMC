package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxo extends ppd implements pqn {
    public static final qxo e;
    private static volatile pqs g;
    public int a;
    public long c;
    private byte f = 2;
    public String b = "";
    public String d = "";

    static {
        qxo qxoVar = new qxo();
        e = qxoVar;
        ppd.F(qxo.class, qxoVar);
    }

    private qxo() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
            default:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new qxo();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (qxo.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
