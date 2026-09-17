package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kuq extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(7);
    final int a;
    public final khi b;
    public final knj c;

    public kuq(int i, khi khiVar, knj knjVar) {
        this.a = i;
        this.b = khiVar;
        this.c = knjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cH(parcel, 2, this.b, i);
        mip.cH(parcel, 3, this.c, i);
        mip.cv(parcel, iCt);
    }
}
