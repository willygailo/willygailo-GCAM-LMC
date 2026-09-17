package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.mip;
import defpackage.sk;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new sk(8);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            mip.dk(null);
            throw null;
        }
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cH(parcel, 2, this.b, i | 1);
        mip.cA(parcel, 3, this.c);
        mip.cv(parcel, iCt);
        this.b = null;
    }
}
