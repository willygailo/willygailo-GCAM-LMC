package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.mip;
import defpackage.sk;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new sk(6);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        mip.dt(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cI(parcel, 2, this.b);
        mip.cv(parcel, iCt);
    }
}
