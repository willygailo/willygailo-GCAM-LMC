package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kqa extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(5);
    final int a;
    final String b;
    final Intent c;

    public kqa(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cH(parcel, 4, this.c, i);
        mip.cv(parcel, iCt);
    }
}
