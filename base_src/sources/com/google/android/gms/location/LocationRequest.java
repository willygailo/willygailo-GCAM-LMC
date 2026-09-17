package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.kpg;
import defpackage.mip;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kpg(11);
    public int a;
    public long b;
    public long c;
    public boolean d;
    public long e;
    int f;
    float g;
    long h;
    boolean i;

    @Deprecated
    public LocationRequest() {
        this(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, false);
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
        this.i = z2;
    }

    public final long a() {
        long j = this.h;
        long j2 = this.b;
        return j < j2 ? j2 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && a() == locationRequest.a() && this.i == locationRequest.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        switch (this.a) {
            case R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            default:
                str = "???";
                break;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                str = "PRIORITY_LOW_POWER";
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                str = "PRIORITY_NO_POWER";
                break;
        }
        sb.append(str);
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h);
            sb.append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g);
            sb.append("m");
        }
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cB(parcel, 2, this.b);
        mip.cB(parcel, 3, this.c);
        mip.cw(parcel, 4, this.d);
        mip.cB(parcel, 5, this.e);
        mip.cA(parcel, 6, this.f);
        mip.cy(parcel, 7, this.g);
        mip.cB(parcel, 8, this.h);
        mip.cw(parcel, 9, this.i);
        mip.cv(parcel, iCt);
    }
}
