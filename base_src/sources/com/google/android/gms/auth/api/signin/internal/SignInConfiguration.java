package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.kus;
import defpackage.mip;
import defpackage.si;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new si(19);
    public final String a;
    public GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        mip.ds(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = this.b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        kus kusVar = new kus((byte[]) null);
        kusVar.b(this.a);
        kusVar.b(this.b);
        return kusVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cH(parcel, 5, this.b, i);
        mip.cv(parcel, iCt);
    }
}
