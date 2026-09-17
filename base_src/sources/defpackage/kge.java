package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kge extends kno {
    public static final Parcelable.Creator CREATOR = new si(18);
    final int a;
    public final int b;
    public final Bundle c;

    public kge(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cA(parcel, 2, this.b);
        mip.cC(parcel, 3, this.c);
        mip.cv(parcel, iCt);
    }
}
