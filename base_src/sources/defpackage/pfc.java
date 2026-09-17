package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pfc implements Serializable {
    public static final pfc a = new pfc(new int[0]);
    public final int[] b;
    public final int c;

    public pfc(int[] iArr) {
        this(iArr, iArr.length);
    }

    public pfc(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    public static pfb b() {
        return new pfb(10);
    }

    public static pfb c(int i) {
        obr.aI(i >= 0, "Invalid initialCapacity: %s", i);
        return new pfb(i);
    }

    public final int a(int i) {
        obr.aX(i, this.c);
        return this.b[i];
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final int[] e() {
        return Arrays.copyOfRange(this.b, 0, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pfc)) {
            return false;
        }
        pfc pfcVar = (pfc) obj;
        if (this.c != pfcVar.c) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            if (a(i) != pfcVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    Object readResolve() {
        return d() ? a : this;
    }

    public final String toString() {
        if (d()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.c * 5);
        sb.append('[');
        sb.append(this.b[0]);
        for (int i = 1; i < this.c; i++) {
            sb.append(", ");
            sb.append(this.b[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        return this.c < this.b.length ? new pfc(e()) : this;
    }
}
