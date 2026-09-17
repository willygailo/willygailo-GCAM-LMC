package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kyg extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(19);
    public final int a;
    public final kyz b;

    public kyg(int i, kyz kyzVar) {
        this.a = i;
        this.b = kyzVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cH(parcel, 3, this.b, i);
        mip.cv(parcel, iCt);
    }
}
