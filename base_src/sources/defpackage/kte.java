package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kte extends kno implements kiv {
    public static final Parcelable.Creator CREATOR = new kpg(14);
    public final Status a;

    public kte(Status status) {
        this.a = status;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 1, this.a, i);
        mip.cv(parcel, iCt);
    }
}
