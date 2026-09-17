package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwv extends ppd implements pqn {
    public static final qwv c;
    private static volatile pqs e;
    public int a;
    public qwu b;
    private byte d = 2;

    static {
        qwv qwvVar = new qwv();
        c = qwvVar;
        ppd.F(qwv.class, qwvVar);
    }

    private qwv() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
            default:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new qwv();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (qwv.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
