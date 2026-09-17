package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdk extends ppd implements pqn {
    public static final pdk A;
    private static volatile pqs B;
    public int a;
    public pdj b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    static {
        pdk pdkVar = new pdk();
        A = pdkVar;
        ppd.F(pdk.class, pdkVar);
    }

    private pdk() {
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
                return E(A, "\u0001\u0019\u0000\u0001\u0001 \u0019\u0000\u0000\u0000\u0001ဉ\u0000\bခ\u0001\tခ\u0002\nခ\u0003\u000bခ\u0004\fခ\u0005\rခ\u0006\u000eခ\u0007\u000fခ\b\u0010ခ\t\u0011ခ\n\u0012ခ\u000b\u0013ခ\f\u0014ခ\r\u0015ခ\u000e\u0017ခ\u0010\u0018ခ\u0011\u0019ခ\u0012\u001aခ\u0013\u001bခ\u0014\u001cခ\u0015\u001dခ\u0016\u001eခ\u0018\u001fခ\u000f ခ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "w", "x", "z", "q", "y"});
            case 3:
                return new pdk();
            case 4:
                return new poy(A);
            case 5:
                return A;
            case 6:
                pqs pozVar = B;
                if (pozVar == null) {
                    synchronized (pdk.class) {
                        pozVar = B;
                        if (pozVar == null) {
                            pozVar = new poz(A);
                            B = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
