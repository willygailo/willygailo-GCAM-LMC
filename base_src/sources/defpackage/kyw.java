package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kyw extends kno {
    public static final Parcelable.Creator CREATOR = new kza(1);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public kyw(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        byte[] bArr = this.c;
        String strValueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(strValueOf).length());
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        sb.append(", size=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cD(parcel, 4, this.c);
        mip.cI(parcel, 5, this.d);
        mip.cv(parcel, iCt);
    }
}
