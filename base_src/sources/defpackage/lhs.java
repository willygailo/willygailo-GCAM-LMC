package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lhs {
    public static final lhs a = i(4, 3);
    public static final lhs b = i(16, 9);
    public static final lhs c = i(3, 4);
    public final int d;
    public final int e;

    static {
        i(9, 16);
    }

    private lhs(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public static lhs e(lig ligVar) {
        return ligVar.k() ? i(ligVar.a, ligVar.b) : i(ligVar.b, ligVar.a);
    }

    public static lhs g(Size size) {
        return i(size.getWidth(), size.getHeight());
    }

    public static lhs h(lig ligVar) {
        return i(ligVar.a, ligVar.b);
    }

    public static lhs i(int i, int i2) {
        int iIntValue = BigInteger.valueOf(i).gcd(BigInteger.valueOf(i2)).intValue();
        if (iIntValue != 0) {
            i /= iIntValue;
        }
        if (iIntValue != 0) {
            i2 /= iIntValue;
        }
        return new lhs(i, i2);
    }

    public final float a(float f) {
        return (f * this.e) / this.d;
    }

    public final float b() {
        return this.d / this.e;
    }

    public final Rect c(Rect rect) {
        if (l(i(rect.width(), rect.height()))) {
            int iWidth = (rect.width() * this.e) / this.d;
            int iHeight = rect.top + ((rect.height() - iWidth) / 2);
            return new Rect(rect.left, iHeight, rect.left + rect.width(), iWidth + iHeight);
        }
        int iHeight2 = (rect.height() * this.d) / this.e;
        int iWidth2 = rect.left + ((rect.width() - iHeight2) / 2);
        return new Rect(iWidth2, rect.top, iHeight2 + iWidth2, rect.top + rect.height());
    }

    public final lhs d() {
        return this.d >= this.e ? this : j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhs)) {
            return false;
        }
        lhs lhsVar = (lhs) obj;
        return this.e == lhsVar.e && this.d == lhsVar.d;
    }

    public final lhs f() {
        return this.d <= this.e ? this : j();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final lhs j() {
        return i(this.e, this.d);
    }

    public final boolean k(lhs lhsVar) {
        return ((double) Math.abs(b() - lhsVar.b())) < 0.025d;
    }

    public final boolean l(lhs lhsVar) {
        return this.d * lhsVar.e > lhsVar.d * this.e;
    }

    public final String toString() {
        return String.format(null, "AspectRatio[%d:%d]", Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
