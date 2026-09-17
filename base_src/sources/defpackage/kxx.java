package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxx extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(10);
    public final int a;
    public final boolean b;
    public final boolean c;

    public kxx(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cw(parcel, 3, this.b);
        mip.cw(parcel, 4, this.c);
        mip.cv(parcel, iCt);
    }
}
