package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kym extends bmo implements kyn {
    public kym() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        kyi kyiVar;
        switch (i) {
            case 1:
                c((DataHolder) bmp.a(parcel, DataHolder.CREATOR));
                return true;
            case 2:
                d((kyw) bmp.a(parcel, kyw.CREATOR));
                return true;
            case 3:
                j();
                return true;
            case 4:
                k();
                return true;
            case 5:
                parcel.createTypedArrayList(kyz.CREATOR);
                g();
                return true;
            case 6:
                i();
                return true;
            case 7:
                b((kxh) bmp.a(parcel, kxh.CREATOR));
                return true;
            case 8:
                f();
                return true;
            case 9:
                h();
                return true;
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 13:
                kyw kywVar = (kyw) bmp.a(parcel, kyw.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    kyiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    kyiVar = iInterfaceQueryLocalInterface instanceof kyi ? (kyi) iInterfaceQueryLocalInterface : new kyi(strongBinder);
                }
                e(kywVar, kyiVar);
                return true;
            case 14:
                return true;
        }
    }
}
