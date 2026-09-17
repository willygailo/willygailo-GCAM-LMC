package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ktv extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(2);
    public final List a;

    public ktv(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ktv) {
            return this.a.equals(((ktv) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (ktt kttVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            kttVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cM(parcel, 2, this.a);
        mip.cv(parcel, iCt);
    }
}
