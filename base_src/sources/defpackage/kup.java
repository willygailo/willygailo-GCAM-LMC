package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kup extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(6);
    final int a;
    final kni b;

    public kup(int i, kni kniVar) {
        this.a = i;
        this.b = kniVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cH(parcel, 2, this.b, i);
        mip.cv(parcel, iCt);
    }
}
