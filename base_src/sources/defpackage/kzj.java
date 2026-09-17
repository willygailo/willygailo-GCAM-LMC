package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kzj extends kno {
    public static final Parcelable.Creator CREATOR = new kza(10);
    public final int a;
    public final long b;
    public final List c;

    public kzj(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cB(parcel, 3, this.b);
        mip.cM(parcel, 4, this.c);
        mip.cv(parcel, iCt);
    }
}
