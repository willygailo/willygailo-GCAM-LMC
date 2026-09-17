package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class kyb extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(14);
    public final int a;
    public final ConnectionConfiguration[] b;

    public kyb(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cL(parcel, 3, this.b, i);
        mip.cv(parcel, iCt);
    }
}
