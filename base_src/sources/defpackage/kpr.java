package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kpr extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(4);
    final String a;
    final String b;
    final String c;
    final String d;

    public kpr(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cI(parcel, 4, this.c);
        mip.cI(parcel, 5, this.d);
        mip.cv(parcel, iCt);
    }
}
