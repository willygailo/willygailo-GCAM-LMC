package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.kpg;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class ND4CSettings extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kpg(3);
    boolean a;
    String b;

    public ND4CSettings() {
        this(true, "");
    }

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cw(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
