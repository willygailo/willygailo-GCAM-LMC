package defpackage;

import android.os.Parcel;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class kyj extends bmo implements kyk {
    public kyj() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public void b(kxt kxtVar) {
        throw new UnsupportedOperationException();
    }

    public void c(kyc kycVar) {
        throw new UnsupportedOperationException();
    }

    public void d(kzi kziVar) {
        throw new UnsupportedOperationException();
    }

    public void e(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                d((kzi) bmp.a(parcel, kzi.CREATOR));
                break;
            case 8:
                throw new UnsupportedOperationException();
            case 9:
                throw new UnsupportedOperationException();
            case 10:
                c((kyc) bmp.a(parcel, kyc.CREATOR));
                break;
            case 11:
                e((Status) bmp.a(parcel, Status.CREATOR));
                break;
            case 12:
                throw new UnsupportedOperationException();
            case 13:
                throw new UnsupportedOperationException();
            case 14:
                throw new UnsupportedOperationException();
            case 15:
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                throw new UnsupportedOperationException();
            case 18:
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            case 20:
                throw new UnsupportedOperationException();
            case 21:
            case 24:
            case 25:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            default:
                return false;
            case 22:
                b((kxt) bmp.a(parcel, kxt.CREATOR));
                break;
            case 23:
                throw new UnsupportedOperationException();
            case 26:
                throw new UnsupportedOperationException();
            case 27:
                throw new UnsupportedOperationException();
            case 28:
                throw new UnsupportedOperationException();
            case 29:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                throw new UnsupportedOperationException();
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                throw new UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }
}
