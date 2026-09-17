package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvn extends ppd implements pqn {
    public static final nvn a;
    private static volatile pqs e;
    private int b;
    private nmj c;
    private byte d = 2;

    static {
        nvn nvnVar = new nvn();
        a = nvnVar;
        ppd.F(nvn.class, nvnVar);
    }

    private nvn() {
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
                return E(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new nvn();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nvn.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
