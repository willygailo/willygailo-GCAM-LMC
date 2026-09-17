package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class el {
    public static final el a = new el(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private el(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static el b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i2 != 0) {
                i = 0;
            } else if (i3 != 0) {
                i = 0;
                i2 = 0;
            } else {
                if (i4 == 0) {
                    return a;
                }
                i = 0;
                i2 = 0;
                i3 = 0;
            }
        }
        return new el(i, i2, i3, i4);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        el elVar = (el) obj;
        return this.e == elVar.e && this.b == elVar.b && this.d == elVar.d && this.c == elVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
