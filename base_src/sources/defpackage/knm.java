package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class knm extends kno {
    public static final Parcelable.Creator CREATOR = new sk(18);
    public final int a;
    public List b;

    public knm(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cM(parcel, 2, this.b);
        mip.cv(parcel, iCt);
    }
}
