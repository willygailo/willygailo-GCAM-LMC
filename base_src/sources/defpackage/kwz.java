package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kwz extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(14);
    public final byte a;
    public final byte b;
    public final String c;

    public kwz(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kwz kwzVar = (kwz) obj;
        return this.a == kwzVar.a && this.b == kwzVar.b && this.c.equals(kwzVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        byte b = this.a;
        byte b2 = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append((int) b);
        sb.append(", mAttributeId=");
        sb.append((int) b2);
        sb.append(", mValue='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cx(parcel, 2, this.a);
        mip.cx(parcel, 3, this.b);
        mip.cI(parcel, 4, this.c);
        mip.cv(parcel, iCt);
    }
}
