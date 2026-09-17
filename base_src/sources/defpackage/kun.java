package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kun extends kno implements kiv {
    public static final Parcelable.Creator CREATOR = new ktu(5);
    public final List a;
    public final String b;

    public kun(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cK(parcel, 1, this.a);
        mip.cI(parcel, 2, this.b);
        mip.cv(parcel, iCt);
    }
}
