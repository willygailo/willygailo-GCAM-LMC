package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kvz extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(10);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public kvz(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cw(parcel, 3, this.b);
        mip.cK(parcel, 4, this.c);
        mip.cA(parcel, 5, this.d);
        mip.cI(parcel, 6, this.e);
        mip.cw(parcel, 7, this.f);
        mip.cv(parcel, iCt);
    }
}
