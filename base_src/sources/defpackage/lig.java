package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lig implements Serializable {
    public final int a;
    public final int b;
    private volatile lig c;

    public lig(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    private lig(int i, int i2, lig ligVar) {
        this.a = i;
        this.b = i2;
        this.c = ligVar;
    }

    public static lig f(Point point) {
        return new lig(point.x, point.y);
    }

    public static lig g(Rect rect) {
        return new lig(rect.width(), rect.height());
    }

    public static lig h(int i, int i2) {
        return new lig(i, i2);
    }

    public final float a() {
        return this.a / this.b;
    }

    public final long b() {
        return ((long) this.a) * ((long) this.b);
    }

    public final Size c() {
        return new Size(this.a, this.b);
    }

    public final lig d() {
        return k() ? this : j();
    }

    public final lig e() {
        return this.b >= this.a ? this : j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lig ligVar = (lig) obj;
            if (this.a == ligVar.a && this.b == ligVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final lig i(lic licVar) {
        lic licVar2 = lic.CLOCKWISE_0;
        switch (licVar.ordinal()) {
            case 1:
            case 3:
                return j();
            case 2:
            default:
                return this;
        }
    }

    public final lig j() {
        lig ligVar = this.c;
        if (ligVar != null) {
            return ligVar;
        }
        lig ligVar2 = new lig(this.b, this.a, this);
        this.c = ligVar2;
        return ligVar2;
    }

    public final boolean k() {
        return this.a >= this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
