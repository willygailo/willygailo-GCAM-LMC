package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxa extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(15);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final String k;
    private final String l;

    public kxa(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.l = str6;
        this.g = b;
        this.h = b2;
        this.i = b3;
        this.j = b4;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kxa kxaVar = (kxa) obj;
        if (this.a != kxaVar.a || this.g != kxaVar.g || this.h != kxaVar.h || this.i != kxaVar.i || this.j != kxaVar.j || !this.b.equals(kxaVar.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? kxaVar.c != null : !str.equals(kxaVar.c)) {
            return false;
        }
        if (!this.d.equals(kxaVar.d) || !this.e.equals(kxaVar.e) || !this.f.equals(kxaVar.f)) {
            return false;
        }
        String str2 = this.l;
        if (str2 == null ? kxaVar.l != null : !str2.equals(kxaVar.l)) {
            return false;
        }
        String str3 = this.k;
        if (str3 != null) {
            return str3.equals(kxaVar.k);
        }
        return kxaVar.k == null;
    }

    public final int hashCode() {
        int iHashCode = (((this.a + 31) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str2 = this.l;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str3 = this.k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.l;
        byte b = this.g;
        byte b2 = this.h;
        byte b3 = this.i;
        byte b4 = this.j;
        String str7 = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append("', dateTime='");
        sb.append(str2);
        sb.append("', notificationText='");
        sb.append(str3);
        sb.append("', title='");
        sb.append(str4);
        sb.append("', subtitle='");
        sb.append(str5);
        sb.append("', displayName='");
        sb.append(str6);
        sb.append("', eventId=");
        sb.append((int) b);
        sb.append(", eventFlags=");
        sb.append((int) b2);
        sb.append(", categoryId=");
        sb.append((int) b3);
        sb.append(", categoryCount=");
        sb.append((int) b4);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cI(parcel, 4, this.c);
        mip.cI(parcel, 5, this.d);
        mip.cI(parcel, 6, this.e);
        mip.cI(parcel, 7, this.f);
        String str = this.l;
        if (str == null) {
            str = this.b;
        }
        mip.cI(parcel, 8, str);
        mip.cx(parcel, 9, this.g);
        mip.cx(parcel, 10, this.h);
        mip.cx(parcel, 11, this.i);
        mip.cx(parcel, 12, this.j);
        mip.cI(parcel, 13, this.k);
        mip.cv(parcel, iCt);
    }
}
