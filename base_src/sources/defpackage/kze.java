package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kze extends kno {
    public static final Parcelable.Creator CREATOR = new kza(5);
    public final int a;
    public final kxp b;

    public kze(int i, kxp kxpVar) {
        this.a = i;
        this.b = kxpVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cH(parcel, 3, this.b, i);
        mip.cv(parcel, iCt);
    }
}
