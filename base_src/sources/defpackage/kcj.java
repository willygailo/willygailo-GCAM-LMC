package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcj extends ppb implements pqn {
    public static final kcj c;
    private static volatile pqs e;
    public int a;
    public int b;
    private byte d = 2;

    static {
        kcj kcjVar = new kcj();
        c = kcjVar;
        ppd.F(kcj.class, kcjVar);
    }

    private kcj() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
            default:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", kci.a});
            case 3:
                return new kcj();
            case 4:
                return new ppa(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (kcj.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
