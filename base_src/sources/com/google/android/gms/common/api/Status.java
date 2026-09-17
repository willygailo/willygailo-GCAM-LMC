package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.khi;
import defpackage.kiv;
import defpackage.kno;
import defpackage.mip;
import defpackage.sk;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends kno implements ReflectedParcelable, kiv {
    final int f;
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final khi j;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Parcelable.Creator CREATOR = new sk(7);

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, khi khiVar) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = pendingIntent;
        this.j = khiVar;
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, byte[] bArr) {
        this(1, i, str, null, null);
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && this.g == status.g && mip.dx(this.h, status.h) && mip.dx(this.i, status.i) && mip.dx(this.j, status.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String strDF = this.h;
        if (strDF == null) {
            strDF = mip.dF(this.g);
        }
        mip.dz("statusCode", strDF, arrayList);
        mip.dz("resolution", this.i, arrayList);
        return mip.dy(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.g);
        mip.cI(parcel, 2, this.h);
        mip.cH(parcel, 3, this.i, i);
        mip.cH(parcel, 4, this.j, i);
        mip.cA(parcel, 1000, this.f);
        mip.cv(parcel, iCt);
    }
}
