package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kmi extends kno {
    public static final Parcelable.Creator CREATOR = new sk(12);
    public final knl a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public kmi(knl knlVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = knlVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 1, this.a, i);
        mip.cw(parcel, 2, this.b);
        mip.cw(parcel, 3, this.c);
        mip.cG(parcel, 4, this.d);
        mip.cA(parcel, 5, this.e);
        mip.cG(parcel, 6, this.f);
        mip.cv(parcel, iCt);
    }
}
