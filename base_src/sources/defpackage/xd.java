package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xd implements Cloneable {
    public static final Object a = new Object();
    public boolean b = false;
    public long[] c;
    public Object[] d;
    public int e;

    public xd() {
        int iE = xb.e(10);
        this.c = new long[iE];
        this.d = new Object[iE];
    }

    public final int a() {
        if (this.b) {
            f();
        }
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xd clone() {
        try {
            xd xdVar = (xd) super.clone();
            xdVar.c = (long[]) this.c.clone();
            xdVar.d = (Object[]) this.d.clone();
            return xdVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object c(long j) {
        int iB = xb.b(this.c, this.e, j);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.d;
        if (objArr[iB] == a) {
            return null;
        }
        return objArr[iB];
    }

    public final Object d(int i) {
        if (this.b) {
            f();
        }
        return this.d[i];
    }

    public final void e() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final void f() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void g(long j, Object obj) {
        int iB = xb.b(this.c, this.e, j);
        if (iB >= 0) {
            this.d[iB] = obj;
            return;
        }
        int iB2 = iB ^ (-1);
        int i = this.e;
        if (iB2 < i) {
            Object[] objArr = this.d;
            if (objArr[iB2] == a) {
                this.c[iB2] = j;
                objArr[iB2] = obj;
                return;
            }
        }
        if (this.b && i >= this.c.length) {
            f();
            iB2 = xb.b(this.c, this.e, j) ^ (-1);
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int iE = xb.e(i2 + 1);
            long[] jArr = new long[iE];
            Object[] objArr2 = new Object[iE];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e - iB2;
        if (i3 != 0) {
            long[] jArr3 = this.c;
            int i4 = iB2 + 1;
            System.arraycopy(jArr3, iB2, jArr3, i4, i3);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, iB2, objArr4, i4, this.e - iB2);
        }
        this.c[iB2] = j;
        this.d[iB2] = obj;
        this.e++;
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.b) {
                f();
            }
            sb.append(this.c[i]);
            sb.append('=');
            Object objD = d(i);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
