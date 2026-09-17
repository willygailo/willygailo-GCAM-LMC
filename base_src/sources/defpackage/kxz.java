package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxz extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(12);
    public final int a;
    public final String b;

    public kxz(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
