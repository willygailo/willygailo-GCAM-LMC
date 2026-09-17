package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ktd extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(13);
    final int a;
    final ktc b;
    final kss c;
    final kth d;

    public ktd(int i, ktc ktcVar, IBinder iBinder, IBinder iBinder2) {
        kss ksqVar;
        this.a = i;
        this.b = ktcVar;
        kth ktfVar = null;
        if (iBinder == null) {
            ksqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            ksqVar = iInterfaceQueryLocalInterface instanceof kss ? (kss) iInterfaceQueryLocalInterface : new ksq(iBinder);
        }
        this.c = ksqVar;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            ktfVar = iInterfaceQueryLocalInterface2 instanceof kth ? (kth) iInterfaceQueryLocalInterface2 : new ktf(iBinder2);
        }
        this.d = ktfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cH(parcel, 2, this.b, i);
        kss kssVar = this.c;
        mip.cF(parcel, 3, kssVar == null ? null : kssVar.asBinder());
        kth kthVar = this.d;
        mip.cF(parcel, 4, kthVar != null ? kthVar.asBinder() : null);
        mip.cv(parcel, iCt);
    }
}
