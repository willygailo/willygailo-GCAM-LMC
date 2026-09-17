package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxt extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(6);
    public final int a;
    public final kxf b;

    public kxt(int i, kxf kxfVar) {
        this.a = i;
        this.b = kxfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cH(parcel, 3, this.b, i);
        mip.cv(parcel, iCt);
    }
}
