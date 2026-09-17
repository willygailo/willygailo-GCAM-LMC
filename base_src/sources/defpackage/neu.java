package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class neu extends ppd implements pqn {
    public static final neu i;
    private static volatile pqs j;
    public int a;
    public String b = "";
    public poc c = poc.b;
    public String d = "";
    public ppm e = pqv.b;
    public ppm f = pqv.b;
    public boolean g;
    public long h;

    static {
        neu neuVar = new neu();
        i = neuVar;
        ppd.F(neu.class, neuVar);
    }

    private neu() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"a", "d", "b", "c", "e", nev.class, "f", "g", "h"});
            case 3:
                return new neu();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (neu.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(i);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
