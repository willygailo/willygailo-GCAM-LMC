package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ksh extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(10);
    boolean a;
    long b;
    float c;
    long d;
    int e;

    public ksh() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public ksh(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksh)) {
            return false;
        }
        ksh kshVar = (ksh) obj;
        return this.a == kshVar.a && this.b == kshVar.b && Float.compare(this.c, kshVar.c) == 0 && this.d == kshVar.d && this.e == kshVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cw(parcel, 1, this.a);
        mip.cB(parcel, 2, this.b);
        mip.cy(parcel, 3, this.c);
        mip.cB(parcel, 4, this.d);
        mip.cA(parcel, 5, this.e);
        mip.cv(parcel, iCt);
    }
}
