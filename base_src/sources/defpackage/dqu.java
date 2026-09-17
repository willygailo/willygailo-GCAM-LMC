package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dqu {
    public final float[] a;
    private final dqw b;
    private final long c;

    public dqu(dqw dqwVar, long j, float[] fArr) {
        this.b = dqwVar;
        this.c = j;
        this.a = fArr;
    }

    public static dqu c(dqw dqwVar, long j) {
        return new dqu(dqwVar, j, new float[0]);
    }

    public static dqu d(dqw dqwVar, long j, float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, i, fArr2, 0, i2);
        return new dqu(dqwVar, j, fArr2);
    }

    public final float a() {
        float[] fArr = this.a;
        int length = fArr.length;
        if (length == 1) {
            return fArr[0];
        }
        if (length == 0) {
            return Float.NaN;
        }
        throw new IllegalStateException("Attempting to treat multi-dimensional feature as singular!");
    }

    public final float b(int i) {
        return this.a[i];
    }

    public final boolean e() {
        return this.a.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqu)) {
            return false;
        }
        dqu dquVar = (dqu) obj;
        return this.c == dquVar.c && this.b.equals(dquVar.b) && Arrays.equals(this.a, dquVar.a);
    }

    public final int hashCode() {
        return (Objects.hash(this.b, Long.valueOf(this.c)) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        long j = this.c;
        String string = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 24);
        sb.append("f(");
        sb.append(j);
        sb.append(")=");
        sb.append(string);
        return sb.toString();
    }
}
