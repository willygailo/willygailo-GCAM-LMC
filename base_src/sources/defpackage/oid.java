package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oid extends ppd implements pqn {
    public static final oid o;
    private static volatile pqs p;
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    static {
        oid oidVar = new oid();
        o = oidVar;
        ppd.F(oid.class, oidVar);
    }

    private oid() {
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
                return E(o, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0001\u0002\u000b\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0007\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new oid();
            case 4:
                return new poy(o);
            case 5:
                return o;
            case 6:
                pqs pozVar = p;
                if (pozVar == null) {
                    synchronized (oid.class) {
                        pozVar = p;
                        if (pozVar == null) {
                            pozVar = new poz(o);
                            p = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
