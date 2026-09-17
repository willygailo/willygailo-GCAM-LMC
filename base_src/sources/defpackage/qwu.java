package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwu extends ppd implements pqn {
    public static final qwu k;
    private static volatile pqs m;
    public int a;
    public int b;
    public long c;
    public qxe f;
    public int g;
    public long h;
    public qxd i;
    public long j;
    private byte l = 2;
    public String d = "";
    public String e = "";

    static {
        qwu qwuVar = new qwu();
        k = qwuVar;
        ppd.F(qwu.class, qwuVar);
    }

    private qwu() {
        pqv pqvVar = pqv.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
            default:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"a", "b", qwt.c(), "g", qwt.c(), "h", "i", "j", "c", "d", "e", "f"});
            case 3:
                return new qwu();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (qwu.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
