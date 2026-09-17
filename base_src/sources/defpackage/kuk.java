package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kuk extends kno implements kiv {
    public static final Parcelable.Creator CREATOR = new ktu(4);
    final int a;
    public int b;
    public Intent c;

    public kuk() {
        this(2, 0, null);
    }

    public kuk(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cA(parcel, 2, this.b);
        mip.cH(parcel, 3, this.c, i);
        mip.cv(parcel, iCt);
    }
}
