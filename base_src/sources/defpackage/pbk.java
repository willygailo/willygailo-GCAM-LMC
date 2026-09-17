package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbk extends ppd implements pqn {
    public static final pbk i;
    private static volatile pqs j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;

    static {
        pbk pbkVar = new pbk();
        i = pbkVar;
        ppd.F(pbk.class, pbkVar);
    }

    private pbk() {
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
                return E(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new pbk();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (pbk.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(i);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
