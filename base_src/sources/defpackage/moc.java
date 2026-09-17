package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class moc {
    private final int a;
    private final int[] b;
    private final int[] c = new int[2];
    private final mod d;
    private final boolean e;

    public moc(mod modVar, int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
        this.d = modVar;
        boolean z = false;
        if ((i & 7) == 0) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (iArr[i2] % 8 == 0) {
                }
            }
            z = true;
        }
        this.e = z;
        Arrays.fill(this.c, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moc)) {
            return false;
        }
        moc mocVar = (moc) obj;
        return this.a == mocVar.a && this.e == mocVar.e && Arrays.equals(this.b, mocVar.b) && Arrays.equals(this.c, mocVar.c) && Objects.equals(this.d, mocVar.d);
    }

    public final int hashCode() {
        return (((((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + (this.e ? 1 : 0);
    }

    public final String toString() {
        return "Channel[Norm8]";
    }
}
