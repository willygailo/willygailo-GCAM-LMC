package defpackage;

import android.graphics.RectF;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* JADX INFO: loaded from: classes2.dex */
public final class itz {
    public final itr a;
    public final RectF b;
    public final float c;
    public final int d;
    public final long e;
    public final int f;

    public itz() {
    }

    public itz(int i, itr itrVar, RectF rectF, float f, int i2, long j) {
        this.f = i;
        this.a = itrVar;
        this.b = rectF;
        this.c = f;
        this.d = i2;
        this.e = j;
    }

    public static ity a() {
        ity ityVar = new ity();
        ityVar.a = 1;
        ityVar.f(itr.UNKNOWN);
        ityVar.d(new RectF(-1.0f, -1.0f, -1.0f, -1.0f));
        ityVar.b(0.0f);
        ityVar.c(0);
        ityVar.e(0L);
        return ityVar;
    }

    public static itz b() {
        return a().a();
    }

    public final boolean c() {
        return this.b.centerX() >= 0.0f && this.b.centerY() >= 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof itz)) {
            return false;
        }
        itz itzVar = (itz) obj;
        int i = this.f;
        int i2 = itzVar.f;
        if (i != 0) {
            return i == i2 && this.a.equals(itzVar.a) && this.b.equals(itzVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(itzVar.c) && this.d == itzVar.d && this.e == itzVar.e;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            throw null;
        }
        int iHashCode = this.a.hashCode();
        int iHashCode2 = this.b.hashCode();
        int iFloatToIntBits = Float.floatToIntBits(this.c);
        int i2 = this.d;
        long j = this.e;
        return ((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iFloatToIntBits) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        switch (this.f) {
            case 1:
                str = "OFF";
                break;
            case 2:
                str = "ON";
                break;
            default:
                str = "null";
                break;
        }
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        float f = this.c;
        int i = this.d;
        long j = this.e;
        int length = str.length();
        int length2 = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + ScriptIntrinsicBLAS.RIGHT + length2 + String.valueOf(strValueOf2).length());
        sb.append("TrackingRoi{status=");
        sb.append(str);
        sb.append(", trackerType=");
        sb.append(strValueOf);
        sb.append(", roi=");
        sb.append(strValueOf2);
        sb.append(", confidence=");
        sb.append(f);
        sb.append(", numberOfRefresherCalls=");
        sb.append(i);
        sb.append(", trackedLengthMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
