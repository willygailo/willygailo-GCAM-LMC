package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kpf extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(0);
    public int a;
    int b;

    public kpf() {
        this(3, 0);
    }

    public kpf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cA(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
