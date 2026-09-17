package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kmh extends kno {
    public static final Parcelable.Creator CREATOR = new sk(11);
    Bundle a;
    khk[] b;
    int c;
    public kmi d;

    public kmh() {
    }

    public kmh(Bundle bundle, khk[] khkVarArr, int i, kmi kmiVar) {
        this.a = bundle;
        this.b = khkVarArr;
        this.c = i;
        this.d = kmiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cC(parcel, 1, this.a);
        mip.cL(parcel, 2, this.b, i);
        mip.cA(parcel, 3, this.c);
        mip.cH(parcel, 4, this.d, i);
        mip.cv(parcel, iCt);
    }
}
