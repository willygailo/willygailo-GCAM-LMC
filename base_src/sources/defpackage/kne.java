package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kne extends kno {
    public static final Parcelable.Creator CREATOR = new sk(14);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public kne(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cA(parcel, 2, this.b);
        mip.cA(parcel, 3, this.c);
        mip.cB(parcel, 4, this.d);
        mip.cB(parcel, 5, this.e);
        mip.cI(parcel, 6, this.f);
        mip.cI(parcel, 7, this.g);
        mip.cA(parcel, 8, this.h);
        mip.cA(parcel, 9, this.i);
        mip.cv(parcel, iCt);
    }
}
