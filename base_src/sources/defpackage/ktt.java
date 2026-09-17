package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ktt extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(0);
    public final String a;
    public final String b;
    public final kts c;
    public final boolean d;

    public ktt(String str, String str2, kts ktsVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = ktsVar;
        this.d = z;
    }

    public final String a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktt)) {
            return false;
        }
        ktt kttVar = (ktt) obj;
        return mip.ce(this.a, kttVar.a) && mip.ce(this.b, kttVar.b) && mip.ce(this.c, kttVar.c) && this.d == kttVar.d;
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cH(parcel, 4, this.c, i);
        mip.cw(parcel, 5, this.d);
        mip.cv(parcel, iCt);
    }
}
