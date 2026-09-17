package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mih extends ppd implements pqn {
    public static final mih h;
    private static volatile pqs i;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public mig f;
    public mig g;

    static {
        mih mihVar = new mih();
        h = mihVar;
        ppd.F(mih.class, mihVar);
    }

    private mih() {
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
                return E(h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new mih();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (mih.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
