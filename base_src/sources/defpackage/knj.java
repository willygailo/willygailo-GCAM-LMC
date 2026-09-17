package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class knj extends kno {
    public static final Parcelable.Creator CREATOR = new sk(16);
    final int a;
    final IBinder b;
    public final khi c;
    public final boolean d;
    public final boolean e;

    public knj(int i, IBinder iBinder, khi khiVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = khiVar;
        this.d = z;
        this.e = z2;
    }

    public final kmy a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof kmy ? (kmy) iInterfaceQueryLocalInterface : new kmy(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knj)) {
            return false;
        }
        knj knjVar = (knj) obj;
        return this.c.equals(knjVar.c) && mip.dx(a(), knjVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cF(parcel, 2, this.b);
        mip.cH(parcel, 3, this.c, i);
        mip.cw(parcel, 4, this.d);
        mip.cw(parcel, 5, this.e);
        mip.cv(parcel, iCt);
    }
}
