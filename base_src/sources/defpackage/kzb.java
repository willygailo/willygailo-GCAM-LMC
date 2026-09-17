package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kzb extends kno {
    public static final Parcelable.Creator CREATOR = new kza(2);
    public final int a;
    public final kxi b;

    public kzb(int i, kxi kxiVar) {
        this.a = i;
        this.b = kxiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cH(parcel, 3, this.b, i);
        mip.cv(parcel, iCt);
    }
}
