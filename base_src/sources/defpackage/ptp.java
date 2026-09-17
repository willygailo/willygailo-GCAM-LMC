package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptp extends ppb implements pqn {
    public static final ptp k;
    private static volatile pqs m;
    public int a;
    public float e;
    public boolean g;
    public int i;
    public ptn j;
    private byte l = 2;
    public String b = "";
    public int c = 10;
    public int d = 1;
    public float f = 0.3f;

    static {
        ptp ptpVar = new ptp();
        k = ptpVar;
        ppd.F(ptp.class, ptpVar);
    }

    private ptp() {
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
                return E(k, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\tဇ\u0007\nဋ\b\u0010ဉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j"});
            case 3:
                return new ptp();
            case 4:
                return new ppa(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (ptp.class) {
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
