package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lye {
    public static final lye a = new lye(new Object[0]);
    public final Object[] b;
    private final int c;

    private lye(Object[] objArr) {
        this.b = objArr;
        this.c = Arrays.hashCode(objArr);
    }

    public static lye a(Object... objArr) {
        return objArr.length == 0 ? a : new lye(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lye)) {
            return false;
        }
        lye lyeVar = (lye) obj;
        return this.c == lyeVar.c && Arrays.equals(this.b, lyeVar.b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }
}
