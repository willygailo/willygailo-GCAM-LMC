package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lif implements Comparable {
    public static final lif a = e(100);
    public static final lif b = c(0);
    public static final lif c = new lif(-1);
    public static final lif d = c(32);
    public final int e;

    public lif() {
    }

    public lif(int i) {
        this.e = i;
    }

    public static lif b(float f) {
        return c((int) (f * 100.0f));
    }

    public static lif c(int i) {
        if (i > 99) {
            i = 99;
        }
        return e(i);
    }

    private static lif e(int i) {
        obr.aI(i >= 0, "Percentages must be between [0,100] inclusive: %s", i);
        return new lif(i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lif lifVar) {
        int i = this.e;
        int i2 = lifVar.e;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public final boolean d() {
        return this.e >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lif) && this.e == ((lif) obj).e;
    }

    public final int hashCode() {
        return this.e ^ 1000003;
    }

    public final String toString() {
        int i = this.e;
        StringBuilder sb = new StringBuilder(12);
        sb.append(i);
        sb.append("%");
        return sb.toString();
    }
}
