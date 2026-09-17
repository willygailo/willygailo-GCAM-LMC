package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxr extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(4);
    public final int a;
    public final int b;

    public kxr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cA(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
