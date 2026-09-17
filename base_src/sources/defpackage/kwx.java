package defpackage;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kwx extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(12);
    public final kyn a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public kwx(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.a = iInterfaceQueryLocalInterface instanceof kyn ? (kyn) iInterfaceQueryLocalInterface : new kyl(iBinder);
        } else {
            this.a = null;
        }
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    public kwx(kzs kzsVar) {
        this.a = kzsVar;
        this.b = kzsVar.b;
        this.c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        kyn kynVar = this.a;
        mip.cF(parcel, 2, kynVar == null ? null : kynVar.asBinder());
        mip.cL(parcel, 3, this.b, i);
        mip.cI(parcel, 4, this.c);
        mip.cI(parcel, 5, this.d);
        mip.cv(parcel, iCt);
    }
}
