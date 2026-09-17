package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ndw extends ppd implements pqn {
    public static final ndw j;
    private static volatile pqs l;
    public int a;
    public qxd b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public qxe i;
    private byte k = 2;
    public String h = "";

    static {
        ndw ndwVar = new ndw();
        j = ndwVar;
        ppd.F(ndw.class, ndwVar);
    }

    private ndw() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
            default:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new ndw();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (ndw.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
