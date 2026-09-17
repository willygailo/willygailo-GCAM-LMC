package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxe extends ppb implements pqn {
    public static final qxe a;
    private static volatile pqs c;
    private byte b = 2;

    static {
        qxe qxeVar = new qxe();
        a = qxeVar;
        ppd.F(qxe.class, qxeVar);
    }

    private qxe() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
            default:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(a, "\u0001\u0000", null);
            case 3:
                return new qxe();
            case 4:
                return new ppa(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (qxe.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
