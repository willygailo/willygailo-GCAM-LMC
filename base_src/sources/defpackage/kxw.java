package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxw extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(9);
    public final int a;
    public final boolean b;

    public kxw(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cw(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
