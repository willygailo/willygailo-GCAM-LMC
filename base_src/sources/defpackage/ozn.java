package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozn extends ppd implements pqn {
    public static final ozn u;
    private static volatile pqs w;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public ozl g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public ozm p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    private boolean v;

    static {
        ozn oznVar = new ozn();
        u = oznVar;
        ppd.F(ozn.class, oznVar);
    }

    private ozn() {
    }

    public static /* synthetic */ void b(ozn oznVar) {
        oznVar.a |= 2097152;
        oznVar.v = true;
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
                return E(u, "\u0001\u0014\u0000\u0001\u0002\u0016\u0014\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"a", "b", "c", "d", "e", "f", mfw.l, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v"});
            case 3:
                return new ozn();
            case 4:
                return new poy(u);
            case 5:
                return u;
            case 6:
                pqs pozVar = w;
                if (pozVar == null) {
                    synchronized (ozn.class) {
                        pozVar = w;
                        if (pozVar == null) {
                            pozVar = new poz(u);
                            w = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
