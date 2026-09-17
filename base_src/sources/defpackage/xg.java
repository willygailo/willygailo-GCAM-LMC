package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xg implements Cloneable {
    public static final Object a = new Object();
    public boolean b = false;
    public int[] c;
    public Object[] d;
    public int e;

    public xg() {
        int iD = xb.d(10);
        this.c = new int[iD];
        this.d = new Object[iD];
    }

    public final int a(int i) {
        if (this.b) {
            f();
        }
        return this.c[i];
    }

    public final int b() {
        if (this.b) {
            f();
        }
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xg clone() {
        try {
            xg xgVar = (xg) super.clone();
            xgVar.c = (int[]) this.c.clone();
            xgVar.d = (Object[]) this.d.clone();
            return xgVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object d(int i) {
        int iA = xb.a(this.c, this.e, i);
        if (iA < 0) {
            return null;
        }
        Object[] objArr = this.d;
        if (objArr[iA] == a) {
            return null;
        }
        return objArr[iA];
    }

    public final Object e(int i) {
        if (this.b) {
            f();
        }
        return this.d[i];
    }

    public final void f() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void g(int i, Object obj) {
        int iA = xb.a(this.c, this.e, i);
        if (iA >= 0) {
            this.d[iA] = obj;
            return;
        }
        int iA2 = iA ^ (-1);
        int i2 = this.e;
        if (iA2 < i2) {
            Object[] objArr = this.d;
            if (objArr[iA2] == a) {
                this.c[iA2] = i;
                objArr[iA2] = obj;
                return;
            }
        }
        if (this.b && i2 >= this.c.length) {
            f();
            iA2 = xb.a(this.c, this.e, i) ^ (-1);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int iD = xb.d(i3 + 1);
            int[] iArr = new int[iD];
            Object[] objArr2 = new Object[iD];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e - iA2;
        if (i4 != 0) {
            int[] iArr3 = this.c;
            int i5 = iA2 + 1;
            System.arraycopy(iArr3, iA2, iArr3, i5, i4);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, iA2, objArr4, i5, this.e - iA2);
        }
        this.c[iA2] = i;
        this.d[iA2] = obj;
        this.e++;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object objE = e(i);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
