package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ktl extends kno {
    final LocationRequest b;
    final List c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final String h;
    final boolean i;
    final boolean j;
    public String k;
    final long l;
    public static final List a = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new kpg(15);

    public ktl(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = str3;
        this.l = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ktl) {
            ktl ktlVar = (ktl) obj;
            if (mip.dx(this.b, ktlVar.b) && mip.dx(this.c, ktlVar.c) && mip.dx(this.d, ktlVar.d) && this.e == ktlVar.e && this.f == ktlVar.f && this.g == ktlVar.g && mip.dx(this.h, ktlVar.h) && this.i == ktlVar.i && this.j == ktlVar.j && mip.dx(this.k, ktlVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=");
            sb.append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 1, this.b, i);
        mip.cM(parcel, 5, this.c);
        mip.cI(parcel, 6, this.d);
        mip.cw(parcel, 7, this.e);
        mip.cw(parcel, 8, this.f);
        mip.cw(parcel, 9, this.g);
        mip.cI(parcel, 10, this.h);
        mip.cw(parcel, 11, this.i);
        mip.cw(parcel, 12, this.j);
        mip.cI(parcel, 13, this.k);
        mip.cB(parcel, 14, this.l);
        mip.cv(parcel, iCt);
    }
}
