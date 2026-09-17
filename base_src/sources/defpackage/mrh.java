package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mrh implements Comparable {
    public static final mrh a = new mrh(3, 0);
    public final int b;
    public final int c;

    public mrh(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mrh mrhVar) {
        int i = this.b;
        int i2 = mrhVar.b;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.c - mrhVar.c;
    }

    public final boolean b(mrh mrhVar) {
        return compareTo(mrhVar) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrh)) {
            return false;
        }
        mrh mrhVar = (mrh) obj;
        return this.b == mrhVar.b && this.c == mrhVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        return sb.toString();
    }
}
