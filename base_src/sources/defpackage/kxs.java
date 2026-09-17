package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kxs extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(5);
    public final int a;
    public final List b;

    public kxs(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cM(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
