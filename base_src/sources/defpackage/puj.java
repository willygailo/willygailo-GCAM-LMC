package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class puj extends ppd implements pqn {
    public static final puj i;
    public static final poq j;
    private static volatile pqs m;
    public int a;
    public pug b;
    public pug c;
    public float d;
    public float e;
    public float f;
    public puk g;
    public puk h;
    private pqh k = pqh.a;
    private pqh l = pqh.a;

    static {
        puj pujVar = new puj();
        i = pujVar;
        ppd.F(puj.class, pujVar);
        j = ppd.I(ptd.l, pujVar, pujVar, 202575443, pry.MESSAGE);
    }

    private puj() {
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
                return E(i, "\u0001\t\u0000\u0001\u0001\t\t\u0002\u0000\u0000\u00012\u00022\u0003ဉ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007ဉ\u0000\bဉ\u0005\tဉ\u0006", new Object[]{"a", "k", puh.a, "l", puf.a, "c", "d", "e", "f", "b", "g", "h"});
            case 3:
                return new puj();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (puj.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(i);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
