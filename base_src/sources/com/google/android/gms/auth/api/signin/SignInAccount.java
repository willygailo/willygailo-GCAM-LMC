package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.mip;
import defpackage.si;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new si(17);

    @Deprecated
    String a;
    public GoogleSignInAccount b;

    @Deprecated
    String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        mip.dt(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        mip.dt(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 4, this.a);
        mip.cH(parcel, 7, this.b, i);
        mip.cI(parcel, 8, this.c);
        mip.cv(parcel, iCt);
    }
}
