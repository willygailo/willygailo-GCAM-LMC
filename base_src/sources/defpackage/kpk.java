package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kpk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iCT = mip.cT(parcel);
        String strCY = null;
        Account account = null;
        Bundle bundleCV = null;
        String strCY2 = null;
        String strCY3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListCZ = null;
        Bundle bundleCV2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrDf = null;
        String strCY4 = null;
        Uri uri = null;
        ArrayList arrayListDa = null;
        kpf kpfVar = null;
        ArrayList arrayListDa2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strCY5 = null;
        String strCY6 = null;
        ND4CSettings nD4CSettings = null;
        int iCR = 0;
        boolean zDe = false;
        boolean zDe2 = false;
        int iCR2 = 0;
        int iCR3 = 0;
        int iCR4 = 0;
        boolean zDe3 = false;
        int iCR5 = 0;
        int iCR6 = 0;
        boolean zDe4 = false;
        boolean zDe5 = false;
        int iCR7 = 0;
        boolean zDe6 = false;
        boolean zDe7 = false;
        while (parcel.dataPosition() < iCT) {
            int i = parcel.readInt();
            switch (mip.cP(i)) {
                case 1:
                    iCR = mip.cR(parcel, i);
                    break;
                case 2:
                    strCY = mip.cY(parcel, i);
                    break;
                case 3:
                    account = (Account) mip.cX(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleCV = mip.cV(parcel, i);
                    break;
                case 5:
                    zDe = mip.de(parcel, i);
                    break;
                case 6:
                    zDe2 = mip.de(parcel, i);
                    break;
                case 7:
                    arrayListCZ = mip.cZ(parcel, i);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                default:
                    mip.dd(parcel, i);
                    break;
                case 10:
                    bundleCV2 = mip.cV(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) mip.cX(parcel, i, Bitmap.CREATOR);
                    break;
                case 14:
                    strCY4 = mip.cY(parcel, i);
                    break;
                case 15:
                    uri = (Uri) mip.cX(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListDa = mip.da(parcel, i, kqa.CREATOR);
                    break;
                case 17:
                    iCR4 = mip.cR(parcel, i);
                    break;
                case 18:
                    arrayListDa2 = mip.da(parcel, i, kpr.CREATOR);
                    break;
                case 19:
                    bArrDf = mip.df(parcel, i);
                    break;
                case 20:
                    iCR2 = mip.cR(parcel, i);
                    break;
                case 21:
                    iCR3 = mip.cR(parcel, i);
                    break;
                case 22:
                    zDe3 = mip.de(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) mip.cX(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    kpfVar = (kpf) mip.cX(parcel, i, kpf.CREATOR);
                    break;
                case 28:
                    strCY2 = mip.cY(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    togglingData = (TogglingData) mip.cX(parcel, i, TogglingData.CREATOR);
                    break;
                case 32:
                    iCR5 = mip.cR(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    pendingIntent = (PendingIntent) mip.cX(parcel, i, PendingIntent.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    strCY3 = mip.cY(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    bitmap = (Bitmap) mip.cX(parcel, i, Bitmap.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    iCR6 = mip.cR(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    zDe4 = mip.de(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    zDe5 = mip.de(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    iCR7 = mip.cR(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    strCY5 = mip.cY(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    zDe6 = mip.de(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    strCY6 = mip.cY(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    zDe7 = mip.de(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    nD4CSettings = (ND4CSettings) mip.cX(parcel, i, ND4CSettings.CREATOR);
                    break;
            }
        }
        mip.db(parcel, iCT);
        return new GoogleHelp(iCR, strCY, account, bundleCV, strCY2, strCY3, bitmap, zDe, zDe2, arrayListCZ, bundleCV2, bitmap2, bArrDf, iCR2, iCR3, strCY4, uri, arrayListDa, iCR4, kpfVar, arrayListDa2, zDe3, errorReport, togglingData, iCR5, pendingIntent, iCR6, zDe4, zDe5, iCR7, strCY5, zDe6, strCY6, zDe7, nD4CSettings);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
