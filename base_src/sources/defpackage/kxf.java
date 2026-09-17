package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kxf extends kno implements kwg {
    public static final Parcelable.Creator CREATOR = new ktu(16);
    public final String a;
    public final List b;
    private final Object c = new Object();
    private Set d = null;

    public kxf(String str, List list) {
        this.a = str;
        this.b = list;
        mip.dk(str);
        mip.dk(list);
    }

    @Override // defpackage.kwg
    public final Set a() {
        Set set;
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new HashSet(this.b);
            }
            set = this.d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kxf kxfVar = (kxf) obj;
        String str = this.a;
        if (str == null ? kxfVar.a != null : !str.equals(kxfVar.a)) {
            return false;
        }
        List list = this.b;
        return list == null ? kxfVar.b == null : list.equals(kxfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(strValueOf).length());
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cM(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
