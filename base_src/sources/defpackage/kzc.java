package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kzc extends kno {
    public static final Parcelable.Creator CREATOR = new kza(3);
    public final String a;
    public final String b;
    public final long c;

    public kzc(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cB(parcel, 4, this.c);
        mip.cv(parcel, iCt);
    }
}
