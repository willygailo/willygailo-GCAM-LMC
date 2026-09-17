package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qjr {
    public int a;
    public int b;
    public int c;
    public Object[] d;

    public qjr() {
        int iT = qmd.T(16);
        this.a = iT - 1;
        this.c = (int) (iT * 0.75f);
        this.d = new Object[iT];
    }

    public static int a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public final void b(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int iA = a(obj.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iA && iA > i3) {
                            break;
                        } else {
                            i4 = i3 + 1;
                        }
                    } else if (i >= iA || iA > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
