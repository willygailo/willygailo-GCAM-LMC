package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kxk extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(20);
    public final int a;

    public kxk(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cv(parcel, iCt);
    }
}
