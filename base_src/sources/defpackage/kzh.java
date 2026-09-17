package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kzh extends kno {
    public static final Parcelable.Creator CREATOR = new kza(8);
    public final int a;
    public final int b;
    public final byte[] c;

    public kzh(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cA(parcel, 2, this.b);
        mip.cD(parcel, 3, this.c);
        mip.cv(parcel, iCt);
    }
}
