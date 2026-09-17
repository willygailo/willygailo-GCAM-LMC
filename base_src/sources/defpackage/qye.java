package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qye extends ppd implements pqn {
    public static final qye f;
    private static volatile pqs g;
    public int a;
    public String b = "";
    public ppl c = pqb.b;
    public long d;
    public int e;

    static {
        qye qyeVar = new qye();
        f = qyeVar;
        ppd.F(qye.class, qyeVar);
    }

    private qye() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(\u0004ဌ\u0002", new Object[]{"a", "b", "d", "c", "e", qyd.c()});
            case 3:
                return new qye();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (qye.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
