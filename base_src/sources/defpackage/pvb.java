package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pvb extends ppd implements pqn {
    public static final pvb e;
    private static volatile pqs i;
    public ptt a;
    public float b;
    public pvc c;
    public pud d;
    private int f;
    private pud g;
    private byte h = 2;

    static {
        pvb pvbVar = new pvb();
        e = pvbVar;
        ppd.F(pvb.class, pvbVar);
    }

    private pvb() {
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
                return E(e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ခ\u0001\u0004ဉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"f", "a", "b", "c", "d", "g"});
            case 3:
                return new pvb();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pvb.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
