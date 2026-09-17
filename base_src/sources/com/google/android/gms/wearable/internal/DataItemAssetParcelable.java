package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.kwi;
import defpackage.kxn;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class DataItemAssetParcelable extends kno implements ReflectedParcelable, kwi {
    public static final Parcelable.Creator CREATOR = new kxn(2);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public DataItemAssetParcelable(kwi kwiVar) {
        String strD = kwiVar.d();
        mip.dk(strD);
        this.a = strD;
        String strC = kwiVar.c();
        mip.dk(strC);
        this.b = strC;
    }

    @Override // defpackage.kwi
    public final String c() {
        return this.b;
    }

    @Override // defpackage.kwi
    public final String d() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
