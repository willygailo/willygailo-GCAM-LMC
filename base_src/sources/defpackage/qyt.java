package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyt extends ppd implements pqn {
    public static final qyt b;
    private static volatile pqs c;
    public ppj a = pow.b;

    static {
        qyt qytVar = new qyt();
        b = qytVar;
        ppd.F(qyt.class, qytVar);
    }

    private qyt() {
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
                return E(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new qyt();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (qyt.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }

    public final void i() {
        ppj ppjVar = this.a;
        if (ppjVar.c()) {
            return;
        }
        this.a = ppd.v(ppjVar);
    }
}
