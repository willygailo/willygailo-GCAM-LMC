package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyf extends ppd implements pqn {
    public static final qyf k;
    private static volatile pqs l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public ppm j = pqv.b;

    static {
        qyf qyfVar = new qyf();
        k = qyfVar;
        ppd.F(qyf.class, qyfVar);
    }

    private qyf() {
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
                return E(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", qye.class});
            case 3:
                return new qyf();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (qyf.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }

    public final void i() {
        ppm ppmVar = this.j;
        if (ppmVar.c()) {
            return;
        }
        this.j = ppd.B(ppmVar);
    }
}
