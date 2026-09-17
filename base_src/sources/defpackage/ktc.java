package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ktc extends kno {
    final ksh c;
    final List d;
    final String e;
    public static final List a = Collections.emptyList();
    public static final ksh b = new ksh(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    public static final Parcelable.Creator CREATOR = new kpg(12);

    public ktc(ksh kshVar, List list, String str) {
        this.c = kshVar;
        this.d = list;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ktc)) {
            return false;
        }
        ktc ktcVar = (ktc) obj;
        return mip.dx(this.c, ktcVar.c) && mip.dx(this.d, ktcVar.d) && mip.dx(this.e, ktcVar.e);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(strValueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(strValueOf);
        sb.append(", clients=");
        sb.append(strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 1, this.c, i);
        mip.cM(parcel, 2, this.d);
        mip.cI(parcel, 3, this.e);
        mip.cv(parcel, iCt);
    }
}
