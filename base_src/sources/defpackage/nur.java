package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nur {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;

    public nur() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public nur(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = ((f5 % 360.0f) + 360.0f) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nur) {
            nur nurVar = (nur) obj;
            if (naq.i(this.a, nurVar.a) && naq.i(this.b, nurVar.b) && naq.i(this.c, nurVar.c) && naq.i(this.d, nurVar.d) && naq.i(this.e, nurVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e));
    }

    public final String toString() {
        return String.format("RotatedBox(x=%s, y=%s, width=%s, height=%s, cwRotationDegrees=%s)", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e));
    }
}
