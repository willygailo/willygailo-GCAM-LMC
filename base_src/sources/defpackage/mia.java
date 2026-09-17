package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mia extends ppd implements pqn {
    public static final mia L;
    private static volatile pqs M;
    public boolean B;
    public mio C;
    public boolean D;
    public boolean F;
    public mie G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public mib e;
    public boolean f;
    public boolean g;
    public int h;
    public mid i;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public int q;
    public mic r;
    public boolean t;
    public int u;
    public boolean v;
    public boolean x;
    public long y;
    public mhz z;
    public int j = 1;
    public int l = 3;
    public ppm p = pqv.b;
    public int s = 1;
    public boolean w = true;
    public boolean A = true;
    public poc E = poc.b;

    static {
        mia miaVar = new mia();
        L = miaVar;
        ppd.F(mia.class, miaVar);
    }

    private mia() {
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
                return E(L, "\u0001#\u0000\u0002\u0001%#\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0007င\u0005\bဉ\u0006\tဌ\u0007\nဇ\b\u000bင\t\fဇ\n\u000eဇ\u000b\u000fဇ\f\u0010\u001b\u0011ဌ\r\u0012ဉ\u000e\u0013ဌ\u000f\u0014ဇ\u0010\u0015ဌ\u0011\u0016ဇ\u0012\u0017ဇ\u0013\u0018ဇ\u0014\u0019ဃ\u0015\u001aဉ\u0016\u001bဇ\u0017\u001cဇ\u0018\u001dဉ\u0019\u001eဇ\u001a\u001fည\u001b ဇ\u001c!ဉ\u001d\"ဇ\u001e#ဇ\u001f$ဃ!%ဇ ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", mfw.f, "k", "l", "m", "n", "o", "p", mif.class, "q", mhy.c(), "r", "s", mfw.c, "t", "u", mfw.d, "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "J"});
            case 3:
                return new mia();
            case 4:
                return new poy(L);
            case 5:
                return L;
            case 6:
                pqs pozVar = M;
                if (pozVar == null) {
                    synchronized (mia.class) {
                        pozVar = M;
                        if (pozVar == null) {
                            pozVar = new poz(L);
                            M = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
