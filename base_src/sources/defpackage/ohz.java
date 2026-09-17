package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ohz extends ppd implements pqn {
    public static final ohz a;
    private static volatile pqs b;

    static {
        ohz ohzVar = new ohz();
        a = ohzVar;
        ppd.F(ohz.class, ohzVar);
    }

    private ohz() {
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
                return E(a, "\u0000\u0000", null);
            case 3:
                return new ohz();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = b;
                if (pozVar == null) {
                    synchronized (ohz.class) {
                        pozVar = b;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            b = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
