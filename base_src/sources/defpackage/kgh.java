package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class kgh extends bmo implements IInterface {
    public kgh() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public void b(GoogleSignInAccount googleSignInAccount, Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                b((GoogleSignInAccount) bmp.a(parcel, GoogleSignInAccount.CREATOR), (Status) bmp.a(parcel, Status.CREATOR));
                break;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                c((Status) bmp.a(parcel, Status.CREATOR));
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                d((Status) bmp.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
