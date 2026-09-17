package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyc extends ppd implements pqn {
    public static final qyc o;
    private static volatile pqs p;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public qyg i;
    public ppm j = pqv.b;
    public int k;
    public int l;
    public int m;
    public qyg n;

    static {
        qyc qycVar = new qyc();
        o = qycVar;
        ppd.F(qyc.class, qycVar);
    }

    private qyc() {
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
                return E(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"a", "b", "c", "e", "h", "j", qyb.class, "k", "d", "f", "g", "i", "l", "m", "n"});
            case 3:
                return new qyc();
            case 4:
                return new poy(o);
            case 5:
                return o;
            case 6:
                pqs pozVar = p;
                if (pozVar == null) {
                    synchronized (qyc.class) {
                        pozVar = p;
                        if (pozVar == null) {
                            pozVar = new poz(o);
                            p = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
