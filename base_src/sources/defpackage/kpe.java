package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kpe extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(1);
    final String a;
    final boolean b;

    public kpe(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cw(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
