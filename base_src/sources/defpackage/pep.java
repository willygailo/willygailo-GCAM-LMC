package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pep extends ppd implements pqn {
    public static final pep g;
    private static volatile pqs i;
    public int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    private byte h = 2;

    static {
        pep pepVar = new pep();
        g = pepVar;
        ppd.F(pep.class, pepVar);
    }

    private pep() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
            default:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0002\u0001ᔂ\u0000\u0002ᔂ\u0001\u0003င\u0002\u0007င\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", per.b});
            case 3:
                return new pep();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pep.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
