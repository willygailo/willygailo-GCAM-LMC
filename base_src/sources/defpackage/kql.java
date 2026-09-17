package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kql extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(8);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public kql(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kql)) {
            return false;
        }
        kql kqlVar = (kql) obj;
        return this.a == kqlVar.a && this.b == kqlVar.b && this.c == kqlVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cw(parcel, 1, this.a);
        mip.cw(parcel, 2, this.b);
        mip.cw(parcel, 3, this.c);
        mip.cv(parcel, iCt);
    }
}
