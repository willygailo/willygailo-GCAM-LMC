package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class kul extends bmo implements IInterface {
    public kul() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void c(kuq kuqVar) {
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                c((kuq) bmp.a(parcel, kuq.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
