package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class fa implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ba(15);
    ez a;

    public fa(Parcel parcel) {
        ez exVar;
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            exVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            exVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ez)) ? new ex(strongBinder) : (ez) iInterfaceQueryLocalInterface;
        }
        this.a = exVar;
    }

    protected void a() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new ey(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
