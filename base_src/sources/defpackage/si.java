package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.TimeDifferenceText;
import android.support.wearable.complications.TimeFormatText;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import j$.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class si implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public si(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iCR = 0;
        ArrayList arrayListDa = null;
        ArrayList arrayListDa2 = null;
        String strCY = null;
        switch (this.a) {
            case 0:
                return new ComplicationText(parcel);
            case 1:
                return new ComplicationData(parcel);
            case 2:
                return new TimeDifferenceText(parcel);
            case 3:
                return new TimeFormatText(parcel);
            case 4:
                return new ComplicationStyle$Builder(parcel);
            case 5:
                return new uo(parcel);
            case 6:
                return new afy(parcel);
            case 7:
                return new agc(parcel);
            case 8:
                return new agg(parcel);
            case 9:
                return new agk(parcel);
            case 10:
                return new aha(parcel);
            case 11:
                return new ahq(parcel);
            case 12:
                return new aht(parcel);
            case 13:
                return new dez(parcel.readLong(), (hsp) parcel.readParcelable(dfo.class.getClassLoader()), oom.j(parcel.readArrayList(Long.class.getClassLoader())), parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Uri) parcel.readParcelable(dfo.class.getClassLoader()), parcel.readInt() == 1, (lig) parcel.readSerializable(), parcel.readInt());
            case 14:
                return new hso(parcel.readInt());
            case 15:
                int iCT = mip.cT(parcel);
                String strCY2 = null;
                String strCY3 = null;
                String strCY4 = null;
                String strCY5 = null;
                Uri uri = null;
                String strCY6 = null;
                String strCY7 = null;
                ArrayList arrayListDa3 = null;
                String strCY8 = null;
                String strCY9 = null;
                long jCU = 0;
                int iCR2 = 0;
                while (parcel.dataPosition() < iCT) {
                    int i = parcel.readInt();
                    switch (mip.cP(i)) {
                        case 1:
                            iCR2 = mip.cR(parcel, i);
                            break;
                        case 2:
                            strCY2 = mip.cY(parcel, i);
                            break;
                        case 3:
                            strCY3 = mip.cY(parcel, i);
                            break;
                        case 4:
                            strCY4 = mip.cY(parcel, i);
                            break;
                        case 5:
                            strCY5 = mip.cY(parcel, i);
                            break;
                        case 6:
                            uri = (Uri) mip.cX(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strCY6 = mip.cY(parcel, i);
                            break;
                        case 8:
                            jCU = mip.cU(parcel, i);
                            break;
                        case 9:
                            strCY7 = mip.cY(parcel, i);
                            break;
                        case 10:
                            arrayListDa3 = mip.da(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strCY8 = mip.cY(parcel, i);
                            break;
                        case 12:
                            strCY9 = mip.cY(parcel, i);
                            break;
                        default:
                            mip.dd(parcel, i);
                            break;
                    }
                }
                mip.db(parcel, iCT);
                return new GoogleSignInAccount(iCR2, strCY2, strCY3, strCY4, strCY5, uri, strCY6, jCU, strCY7, arrayListDa3, strCY8, strCY9);
            case 16:
                int iCT2 = mip.cT(parcel);
                ArrayList arrayListDa4 = null;
                Account account = null;
                String strCY10 = null;
                String strCY11 = null;
                String strCY12 = null;
                int iCR3 = 0;
                boolean zDe = false;
                boolean zDe2 = false;
                boolean zDe3 = false;
                while (parcel.dataPosition() < iCT2) {
                    int i2 = parcel.readInt();
                    switch (mip.cP(i2)) {
                        case 1:
                            iCR3 = mip.cR(parcel, i2);
                            break;
                        case 2:
                            arrayListDa4 = mip.da(parcel, i2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) mip.cX(parcel, i2, Account.CREATOR);
                            break;
                        case 4:
                            zDe = mip.de(parcel, i2);
                            break;
                        case 5:
                            zDe2 = mip.de(parcel, i2);
                            break;
                        case 6:
                            zDe3 = mip.de(parcel, i2);
                            break;
                        case 7:
                            strCY10 = mip.cY(parcel, i2);
                            break;
                        case 8:
                            strCY11 = mip.cY(parcel, i2);
                            break;
                        case 9:
                            arrayListDa = mip.da(parcel, i2, kge.CREATOR);
                            break;
                        case 10:
                            strCY12 = mip.cY(parcel, i2);
                            break;
                        default:
                            mip.dd(parcel, i2);
                            break;
                    }
                }
                mip.db(parcel, iCT2);
                return new GoogleSignInOptions(iCR3, arrayListDa4, account, zDe, zDe2, zDe3, strCY10, strCY11, GoogleSignInOptions.c(arrayListDa), strCY12);
            case 17:
                int iCT3 = mip.cT(parcel);
                String strCY13 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strCY14 = "";
                while (parcel.dataPosition() < iCT3) {
                    int i3 = parcel.readInt();
                    switch (mip.cP(i3)) {
                        case 4:
                            strCY13 = mip.cY(parcel, i3);
                            break;
                        case 5:
                        case 6:
                        default:
                            mip.dd(parcel, i3);
                            break;
                        case 7:
                            googleSignInAccount = (GoogleSignInAccount) mip.cX(parcel, i3, GoogleSignInAccount.CREATOR);
                            break;
                        case 8:
                            strCY14 = mip.cY(parcel, i3);
                            break;
                    }
                }
                mip.db(parcel, iCT3);
                return new SignInAccount(strCY13, googleSignInAccount, strCY14);
            case 18:
                int iCT4 = mip.cT(parcel);
                Bundle bundleCV = null;
                int iCR4 = 0;
                while (parcel.dataPosition() < iCT4) {
                    int i4 = parcel.readInt();
                    switch (mip.cP(i4)) {
                        case 1:
                            iCR = mip.cR(parcel, i4);
                            break;
                        case 2:
                            iCR4 = mip.cR(parcel, i4);
                            break;
                        case 3:
                            bundleCV = mip.cV(parcel, i4);
                            break;
                        default:
                            mip.dd(parcel, i4);
                            break;
                    }
                }
                mip.db(parcel, iCT4);
                return new kge(iCR, iCR4, bundleCV);
            case 19:
                int iCT5 = mip.cT(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iCT5) {
                    int i5 = parcel.readInt();
                    switch (mip.cP(i5)) {
                        case 2:
                            strCY = mip.cY(parcel, i5);
                            break;
                        case 5:
                            googleSignInOptions = (GoogleSignInOptions) mip.cX(parcel, i5, GoogleSignInOptions.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i5);
                            break;
                    }
                }
                mip.db(parcel, iCT5);
                return new SignInConfiguration(strCY, googleSignInOptions);
            default:
                int iCT6 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT6) {
                    int i6 = parcel.readInt();
                    switch (mip.cP(i6)) {
                        case 1:
                            arrayListDa2 = mip.da(parcel, i6, kgv.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i6);
                            break;
                    }
                }
                mip.db(parcel, iCT6);
                return new kgl(arrayListDa2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ComplicationText[i];
            case 1:
                return new ComplicationData[i];
            case 2:
                return new TimeDifferenceText[i];
            case 3:
                return new TimeFormatText[i];
            case 4:
                return new ComplicationStyle$Builder[i];
            case 5:
                return new uo[i];
            case 6:
                return new afy[i];
            case 7:
                return new agc[i];
            case 8:
                return new agg[i];
            case 9:
                return new agk[i];
            case 10:
                return new aha[i];
            case 11:
                return new ahq[i];
            case 12:
                return new aht[i];
            case 13:
                return new dez[i];
            case 14:
                return new hso[i];
            case 15:
                return new GoogleSignInAccount[i];
            case 16:
                return new GoogleSignInOptions[i];
            case 17:
                return new SignInAccount[i];
            case 18:
                return new kge[i];
            case 19:
                return new SignInConfiguration[i];
            default:
                return new kgl[i];
        }
    }
}
