package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwq extends ppd implements pqn {
    public static final qwq j;
    private static volatile pqs k;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;

    static {
        qwq qwqVar = new qwq();
        j = qwqVar;
        ppd.F(qwq.class, qwqVar);
    }

    private qwq() {
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
                return E(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", per.s, "d", "e", per.r, "f", "g", "h", "i"});
            case 3:
                return new qwq();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = k;
                if (pozVar == null) {
                    synchronized (qwq.class) {
                        pozVar = k;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            k = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
