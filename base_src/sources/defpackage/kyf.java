package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kyf extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(18);
    public final int a;
    public final ParcelFileDescriptor b;

    public kyf(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cH(parcel, 3, this.b, i | 1);
        mip.cv(parcel, iCt);
    }
}
