package defpackage;

import android.graphics.Rect;
import android.util.SizeF;

/* JADX INFO: loaded from: classes2.dex */
public final class iqv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final Rect g;
    public final Rect h;
    private final SizeF i;

    public iqv() {
    }

    public iqv(long j, long j2, long j3, long j4, float f, float f2, Rect rect, Rect rect2, SizeF sizeF) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = f;
        this.f = f2;
        this.g = rect;
        this.h = rect2;
        this.i = sizeF;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqv) {
            iqv iqvVar = (iqv) obj;
            if (this.a == iqvVar.a && this.b == iqvVar.b && this.c == iqvVar.c && this.d == iqvVar.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(iqvVar.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(iqvVar.f) && this.g.equals(iqvVar.g) && this.h.equals(iqvVar.h) && this.i.equals(iqvVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        return this.i.hashCode() ^ ((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "frameTimestampNs=" + this.a + ", exposureTimeNs=" + this.b + ", oisTimestampNs=" + this.c + ", rollingShutterTimeNs=" + this.d + ", digitalZoomRatio=" + this.e + ", fieldOfView=" + this.f + ", fullImageSize=" + this.g + ", sensorSize=" + this.i;
    }
}
