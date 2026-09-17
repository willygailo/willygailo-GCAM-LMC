package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qww extends ppd implements pqn {
    public static final qww d;
    private static volatile pqs e;
    public int a;
    public int b;
    public qwx c;

    static {
        qww qwwVar = new qww();
        d = qwwVar;
        ppd.F(qww.class, qwwVar);
    }

    private qww() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new qww();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (qww.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
