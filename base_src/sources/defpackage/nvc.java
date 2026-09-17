package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvc extends ppd implements pqn {
    public static final nvc a;
    private static volatile pqs e;
    private int b;
    private piw c;
    private byte d = 2;

    static {
        nvc nvcVar = new nvc();
        a = nvcVar;
        ppd.F(nvc.class, nvcVar);
    }

    private nvc() {
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
                return E(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new nvc();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nvc.class) {
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
