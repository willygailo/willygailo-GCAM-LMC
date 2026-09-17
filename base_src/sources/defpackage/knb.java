package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class knb extends bmo implements IInterface {
    private kmb a;
    private final int b;

    public knb() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public knb(kmb kmbVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = kmbVar;
        this.b = i;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        mip.du(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.x(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                b(parcel.readInt(), parcel.readStrongBinder(), (Bundle) bmp.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                parcel.readInt();
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                break;
            case 3:
                int i2 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                kmh kmhVar = (kmh) bmp.a(parcel, kmh.CREATOR);
                kmb kmbVar = this.a;
                mip.du(kmbVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                mip.dk(kmhVar);
                kmbVar.n = kmhVar;
                if (kmbVar.C()) {
                    kmi kmiVar = kmhVar.d;
                    knk.a().b(kmiVar == null ? null : kmiVar.a);
                }
                b(i2, strongBinder, kmhVar.a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
