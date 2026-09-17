package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kzf extends kno {
    public static final Parcelable.Creator CREATOR = new kza(6);
    final int a;
    public final kyn b;

    public kzf(int i, IBinder iBinder) {
        kyn kylVar;
        this.a = i;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            kylVar = iInterfaceQueryLocalInterface instanceof kyn ? (kyn) iInterfaceQueryLocalInterface : new kyl(iBinder);
        } else {
            kylVar = null;
        }
        this.b = kylVar;
    }

    public kzf(kyn kynVar) {
        this.a = 1;
        this.b = kynVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        kyn kynVar = this.b;
        mip.cF(parcel, 2, kynVar == null ? null : kynVar.asBinder());
        mip.cv(parcel, iCt);
    }
}
