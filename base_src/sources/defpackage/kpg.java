package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kpg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public kpg(int i) {
        this.a = i;
    }

    public static void a(kpq kpqVar, Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 1, kpqVar.a, i);
        mip.cI(parcel, 2, kpqVar.b);
        mip.cI(parcel, 3, kpqVar.c);
        mip.cA(parcel, 4, kpqVar.d);
        mip.cI(parcel, 5, kpqVar.e);
        mip.cA(parcel, 6, kpqVar.f);
        mip.cv(parcel, iCt);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iCR = 1;
        long jCU = 0;
        int iCR2 = 0;
        int iCR3 = 0;
        int iCR4 = 0;
        boolean zDe = false;
        int iCR5 = 0;
        boolean zDe2 = false;
        boolean zDe3 = false;
        String strCY = null;
        byte[] bArrDf = null;
        kts[] ktsVarArr = null;
        Status status = null;
        ktc ktcVar = null;
        String strCY2 = null;
        String strCY3 = null;
        String strCY4 = null;
        String strCY5 = null;
        String strCY6 = null;
        switch (this.a) {
            case 0:
                int iCT = mip.cT(parcel);
                int iCR6 = 0;
                while (parcel.dataPosition() < iCT) {
                    int i = parcel.readInt();
                    switch (mip.cP(i)) {
                        case 2:
                            iCR2 = mip.cR(parcel, i);
                            break;
                        case 3:
                            iCR6 = mip.cR(parcel, i);
                            break;
                        default:
                            mip.dd(parcel, i);
                            break;
                    }
                }
                mip.db(parcel, iCT);
                return new kpf(iCR2, iCR6);
            case 1:
                int iCT2 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT2) {
                    int i2 = parcel.readInt();
                    switch (mip.cP(i2)) {
                        case 2:
                            strCY = mip.cY(parcel, i2);
                            break;
                        case 3:
                            zDe3 = mip.de(parcel, i2);
                            break;
                        default:
                            mip.dd(parcel, i2);
                            break;
                    }
                }
                mip.db(parcel, iCT2);
                return new kpe(strCY, zDe3);
            case 2:
                int iCT3 = mip.cT(parcel);
                GoogleHelp googleHelp = null;
                String strCY7 = null;
                String strCY8 = null;
                String strCY9 = null;
                int iCR7 = 0;
                int iCR8 = 0;
                while (parcel.dataPosition() < iCT3) {
                    int i3 = parcel.readInt();
                    switch (mip.cP(i3)) {
                        case 1:
                            googleHelp = (GoogleHelp) mip.cX(parcel, i3, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strCY7 = mip.cY(parcel, i3);
                            break;
                        case 3:
                            strCY8 = mip.cY(parcel, i3);
                            break;
                        case 4:
                            iCR7 = mip.cR(parcel, i3);
                            break;
                        case 5:
                            strCY9 = mip.cY(parcel, i3);
                            break;
                        case 6:
                            iCR8 = mip.cR(parcel, i3);
                            break;
                        default:
                            mip.dd(parcel, i3);
                            break;
                    }
                }
                mip.db(parcel, iCT3);
                return new kpq(googleHelp, strCY7, strCY8, iCR7, strCY9, iCR8);
            case 3:
                int iCT4 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT4) {
                    int i4 = parcel.readInt();
                    switch (mip.cP(i4)) {
                        case 2:
                            zDe2 = mip.de(parcel, i4);
                            break;
                        case 3:
                            strCY6 = mip.cY(parcel, i4);
                            break;
                        default:
                            mip.dd(parcel, i4);
                            break;
                    }
                }
                mip.db(parcel, iCT4);
                return new ND4CSettings(zDe2, strCY6);
            case 4:
                int iCT5 = mip.cT(parcel);
                String strCY10 = null;
                String strCY11 = null;
                String strCY12 = null;
                while (parcel.dataPosition() < iCT5) {
                    int i5 = parcel.readInt();
                    switch (mip.cP(i5)) {
                        case 2:
                            strCY5 = mip.cY(parcel, i5);
                            break;
                        case 3:
                            strCY10 = mip.cY(parcel, i5);
                            break;
                        case 4:
                            strCY12 = mip.cY(parcel, i5);
                            break;
                        case 5:
                            strCY11 = mip.cY(parcel, i5);
                            break;
                        default:
                            mip.dd(parcel, i5);
                            break;
                    }
                }
                mip.db(parcel, iCT5);
                return new kpr(strCY5, strCY10, strCY11, strCY12);
            case 5:
                int iCT6 = mip.cT(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iCT6) {
                    int i6 = parcel.readInt();
                    switch (mip.cP(i6)) {
                        case 2:
                            iCR5 = mip.cR(parcel, i6);
                            break;
                        case 3:
                            strCY4 = mip.cY(parcel, i6);
                            break;
                        case 4:
                            intent = (Intent) mip.cX(parcel, i6, Intent.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i6);
                            break;
                    }
                }
                mip.db(parcel, iCT6);
                return new kqa(iCR5, strCY4, intent);
            case 6:
                int iCT7 = mip.cT(parcel);
                String strCY13 = null;
                String strCY14 = null;
                while (parcel.dataPosition() < iCT7) {
                    int i7 = parcel.readInt();
                    switch (mip.cP(i7)) {
                        case 2:
                            strCY3 = mip.cY(parcel, i7);
                            break;
                        case 3:
                            strCY13 = mip.cY(parcel, i7);
                            break;
                        case 4:
                            strCY14 = mip.cY(parcel, i7);
                            break;
                        default:
                            mip.dd(parcel, i7);
                            break;
                    }
                }
                mip.db(parcel, iCT7);
                return new TogglingData(strCY3, strCY13, strCY14);
            case 7:
                int iCT8 = mip.cT(parcel);
                long jCU2 = 0;
                String strCY15 = null;
                String strCY16 = null;
                Uri uri = null;
                kql kqlVar = null;
                Uri uri2 = null;
                kqm kqmVar = null;
                byte[] bArrDf2 = null;
                Uri uri3 = null;
                int iCR9 = 0;
                boolean zDe4 = false;
                int iCR10 = 0;
                while (parcel.dataPosition() < iCT8) {
                    int i8 = parcel.readInt();
                    switch (mip.cP(i8)) {
                        case 1:
                            strCY15 = mip.cY(parcel, i8);
                            break;
                        case 2:
                            iCR9 = mip.cR(parcel, i8);
                            break;
                        case 3:
                            zDe4 = mip.de(parcel, i8);
                            break;
                        case 4:
                            strCY16 = mip.cY(parcel, i8);
                            break;
                        case 5:
                            iCR10 = mip.cR(parcel, i8);
                            break;
                        case 6:
                            uri = (Uri) mip.cX(parcel, i8, Uri.CREATOR);
                            break;
                        case 7:
                        case 8:
                        default:
                            mip.dd(parcel, i8);
                            break;
                        case 9:
                            kqlVar = (kql) mip.cX(parcel, i8, kql.CREATOR);
                            break;
                        case 10:
                            jCU2 = mip.cU(parcel, i8);
                            break;
                        case 11:
                            uri2 = (Uri) mip.cX(parcel, i8, Uri.CREATOR);
                            break;
                        case 12:
                            kqmVar = (kqm) mip.cX(parcel, i8, kqm.CREATOR);
                            break;
                        case 13:
                            bArrDf2 = mip.df(parcel, i8);
                            break;
                        case 14:
                            uri3 = (Uri) mip.cX(parcel, i8, Uri.CREATOR);
                            break;
                    }
                }
                mip.db(parcel, iCT8);
                return new kqk(strCY15, iCR9, zDe4, strCY16, iCR10, uri, kqlVar, jCU2, uri2, kqmVar, bArrDf2, uri3);
            case 8:
                int iCT9 = mip.cT(parcel);
                boolean zDe5 = false;
                boolean zDe6 = false;
                while (parcel.dataPosition() < iCT9) {
                    int i9 = parcel.readInt();
                    switch (mip.cP(i9)) {
                        case 1:
                            zDe = mip.de(parcel, i9);
                            break;
                        case 2:
                            zDe5 = mip.de(parcel, i9);
                            break;
                        case 3:
                            zDe6 = mip.de(parcel, i9);
                            break;
                        default:
                            mip.dd(parcel, i9);
                            break;
                    }
                }
                mip.db(parcel, iCT9);
                return new kql(zDe, zDe5, zDe6);
            case 9:
                int iCT10 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT10) {
                    int i10 = parcel.readInt();
                    switch (mip.cP(i10)) {
                        case 1:
                            iCR4 = mip.cR(parcel, i10);
                            break;
                        case 2:
                            jCU = mip.cU(parcel, i10);
                            break;
                        default:
                            mip.dd(parcel, i10);
                            break;
                    }
                }
                mip.db(parcel, iCT10);
                return new kqm(iCR4, jCU);
            case 10:
                int iCT11 = mip.cT(parcel);
                long jCU3 = Long.MAX_VALUE;
                long jCU4 = 50;
                boolean zDe7 = true;
                float fCO = 0.0f;
                int iCR11 = Integer.MAX_VALUE;
                while (parcel.dataPosition() < iCT11) {
                    int i11 = parcel.readInt();
                    switch (mip.cP(i11)) {
                        case 1:
                            zDe7 = mip.de(parcel, i11);
                            break;
                        case 2:
                            jCU4 = mip.cU(parcel, i11);
                            break;
                        case 3:
                            fCO = mip.cO(parcel, i11);
                            break;
                        case 4:
                            jCU3 = mip.cU(parcel, i11);
                            break;
                        case 5:
                            iCR11 = mip.cR(parcel, i11);
                            break;
                        default:
                            mip.dd(parcel, i11);
                            break;
                    }
                }
                mip.db(parcel, iCT11);
                return new ksh(zDe7, jCU4, fCO, jCU3, iCR11);
            case 11:
                int iCT12 = mip.cT(parcel);
                long jCU5 = Long.MAX_VALUE;
                long jCU6 = 0;
                long jCU7 = 3600000;
                long jCU8 = 600000;
                int iCR12 = R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
                boolean zDe8 = false;
                int iCR13 = Integer.MAX_VALUE;
                float fCO2 = 0.0f;
                boolean zDe9 = false;
                while (parcel.dataPosition() < iCT12) {
                    int i12 = parcel.readInt();
                    switch (mip.cP(i12)) {
                        case 1:
                            iCR12 = mip.cR(parcel, i12);
                            break;
                        case 2:
                            jCU7 = mip.cU(parcel, i12);
                            break;
                        case 3:
                            jCU8 = mip.cU(parcel, i12);
                            break;
                        case 4:
                            zDe8 = mip.de(parcel, i12);
                            break;
                        case 5:
                            jCU5 = mip.cU(parcel, i12);
                            break;
                        case 6:
                            iCR13 = mip.cR(parcel, i12);
                            break;
                        case 7:
                            fCO2 = mip.cO(parcel, i12);
                            break;
                        case 8:
                            jCU6 = mip.cU(parcel, i12);
                            break;
                        case 9:
                            zDe9 = mip.de(parcel, i12);
                            break;
                        default:
                            mip.dd(parcel, i12);
                            break;
                    }
                }
                mip.db(parcel, iCT12);
                return new LocationRequest(iCR12, jCU7, jCU8, zDe8, jCU5, iCR13, fCO2, jCU6, zDe9);
            case 12:
                int iCT13 = mip.cT(parcel);
                ksh kshVar = ktc.b;
                List listDa = ktc.a;
                while (parcel.dataPosition() < iCT13) {
                    int i13 = parcel.readInt();
                    switch (mip.cP(i13)) {
                        case 1:
                            kshVar = (ksh) mip.cX(parcel, i13, ksh.CREATOR);
                            break;
                        case 2:
                            listDa = mip.da(parcel, i13, kmc.CREATOR);
                            break;
                        case 3:
                            strCY2 = mip.cY(parcel, i13);
                            break;
                        default:
                            mip.dd(parcel, i13);
                            break;
                    }
                }
                mip.db(parcel, iCT13);
                return new ktc(kshVar, listDa, strCY2);
            case 13:
                int iCT14 = mip.cT(parcel);
                IBinder iBinderCW = null;
                IBinder iBinderCW2 = null;
                while (parcel.dataPosition() < iCT14) {
                    int i14 = parcel.readInt();
                    switch (mip.cP(i14)) {
                        case 1:
                            iCR = mip.cR(parcel, i14);
                            break;
                        case 2:
                            ktcVar = (ktc) mip.cX(parcel, i14, ktc.CREATOR);
                            break;
                        case 3:
                            iBinderCW = mip.cW(parcel, i14);
                            break;
                        case 4:
                            iBinderCW2 = mip.cW(parcel, i14);
                            break;
                        default:
                            mip.dd(parcel, i14);
                            break;
                    }
                }
                mip.db(parcel, iCT14);
                return new ktd(iCR, ktcVar, iBinderCW, iBinderCW2);
            case 14:
                int iCT15 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT15) {
                    int i15 = parcel.readInt();
                    switch (mip.cP(i15)) {
                        case 1:
                            status = (Status) mip.cX(parcel, i15, Status.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i15);
                            break;
                    }
                }
                mip.db(parcel, iCT15);
                return new kte(status);
            case 15:
                int iCT16 = mip.cT(parcel);
                List listDa2 = ktl.a;
                long jCU9 = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                String strCY17 = null;
                String strCY18 = null;
                String strCY19 = null;
                boolean zDe10 = false;
                boolean zDe11 = false;
                boolean zDe12 = false;
                boolean zDe13 = false;
                boolean zDe14 = false;
                while (parcel.dataPosition() < iCT16) {
                    int i16 = parcel.readInt();
                    switch (mip.cP(i16)) {
                        case 1:
                            locationRequest = (LocationRequest) mip.cX(parcel, i16, LocationRequest.CREATOR);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        default:
                            mip.dd(parcel, i16);
                            break;
                        case 5:
                            listDa2 = mip.da(parcel, i16, kmc.CREATOR);
                            break;
                        case 6:
                            strCY17 = mip.cY(parcel, i16);
                            break;
                        case 7:
                            zDe10 = mip.de(parcel, i16);
                            break;
                        case 8:
                            zDe11 = mip.de(parcel, i16);
                            break;
                        case 9:
                            zDe12 = mip.de(parcel, i16);
                            break;
                        case 10:
                            strCY18 = mip.cY(parcel, i16);
                            break;
                        case 11:
                            zDe13 = mip.de(parcel, i16);
                            break;
                        case 12:
                            zDe14 = mip.de(parcel, i16);
                            break;
                        case 13:
                            strCY19 = mip.cY(parcel, i16);
                            break;
                        case 14:
                            jCU9 = mip.cU(parcel, i16);
                            break;
                    }
                }
                mip.db(parcel, iCT16);
                return new ktl(locationRequest, listDa2, strCY17, zDe10, zDe11, zDe12, strCY18, zDe13, zDe14, strCY19, jCU9);
            case 16:
                int iCT17 = mip.cT(parcel);
                ktl ktlVar = null;
                IBinder iBinderCW3 = null;
                IBinder iBinderCW4 = null;
                PendingIntent pendingIntent = null;
                IBinder iBinderCW5 = null;
                String strCY20 = null;
                int iCR14 = 0;
                while (parcel.dataPosition() < iCT17) {
                    int i17 = parcel.readInt();
                    switch (mip.cP(i17)) {
                        case 1:
                            iCR14 = mip.cR(parcel, i17);
                            break;
                        case 2:
                            ktlVar = (ktl) mip.cX(parcel, i17, ktl.CREATOR);
                            break;
                        case 3:
                            iBinderCW3 = mip.cW(parcel, i17);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) mip.cX(parcel, i17, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderCW4 = mip.cW(parcel, i17);
                            break;
                        case 6:
                            iBinderCW5 = mip.cW(parcel, i17);
                            break;
                        case 7:
                        default:
                            mip.dd(parcel, i17);
                            break;
                        case 8:
                            strCY20 = mip.cY(parcel, i17);
                            break;
                    }
                }
                mip.db(parcel, iCT17);
                return new ktm(iCR14, ktlVar, iBinderCW3, iBinderCW4, pendingIntent, iBinderCW5, strCY20);
            case 17:
                int iCT18 = mip.cT(parcel);
                String[] strArrDi = null;
                while (parcel.dataPosition() < iCT18) {
                    int i18 = parcel.readInt();
                    switch (mip.cP(i18)) {
                        case 2:
                            iCR3 = mip.cR(parcel, i18);
                            break;
                        case 3:
                            ktsVarArr = (kts[]) mip.dh(parcel, i18, kts.CREATOR);
                            break;
                        case 4:
                            strArrDi = mip.di(parcel, i18);
                            break;
                        default:
                            mip.dd(parcel, i18);
                            break;
                    }
                }
                mip.db(parcel, iCT18);
                return new ktn(iCR3, ktsVarArr, strArrDi);
            case 18:
                int iCT19 = mip.cT(parcel);
                long jCU10 = 0;
                String strCY21 = null;
                String strCY22 = null;
                ktn[] ktnVarArr = null;
                byte[] bArrDf3 = null;
                boolean zDe15 = false;
                while (parcel.dataPosition() < iCT19) {
                    int i19 = parcel.readInt();
                    switch (mip.cP(i19)) {
                        case 2:
                            strCY21 = mip.cY(parcel, i19);
                            break;
                        case 3:
                            strCY22 = mip.cY(parcel, i19);
                            break;
                        case 4:
                            ktnVarArr = (ktn[]) mip.dh(parcel, i19, ktn.CREATOR);
                            break;
                        case 5:
                            zDe15 = mip.de(parcel, i19);
                            break;
                        case 6:
                            bArrDf3 = mip.df(parcel, i19);
                            break;
                        case 7:
                            jCU10 = mip.cU(parcel, i19);
                            break;
                        default:
                            mip.dd(parcel, i19);
                            break;
                    }
                }
                mip.db(parcel, iCT19);
                return new kto(strCY21, strCY22, ktnVarArr, zDe15, bArrDf3, jCU10);
            case 19:
                int iCT20 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT20) {
                    int i20 = parcel.readInt();
                    switch (mip.cP(i20)) {
                        case 2:
                            bArrDf = mip.df(parcel, i20);
                            break;
                        default:
                            mip.dd(parcel, i20);
                            break;
                    }
                }
                mip.db(parcel, iCT20);
                return new ktp(bArrDf);
            default:
                int iCT21 = mip.cT(parcel);
                String strCY23 = null;
                byte[] bArrDf4 = null;
                byte[][] bArrDj = null;
                byte[][] bArrDj2 = null;
                byte[][] bArrDj3 = null;
                byte[][] bArrDj4 = null;
                int[] iArrDg = null;
                byte[][] bArrDj5 = null;
                int[] iArrDg2 = null;
                while (parcel.dataPosition() < iCT21) {
                    int i21 = parcel.readInt();
                    switch (mip.cP(i21)) {
                        case 2:
                            strCY23 = mip.cY(parcel, i21);
                            break;
                        case 3:
                            bArrDf4 = mip.df(parcel, i21);
                            break;
                        case 4:
                            bArrDj = mip.dj(parcel, i21);
                            break;
                        case 5:
                            bArrDj2 = mip.dj(parcel, i21);
                            break;
                        case 6:
                            bArrDj3 = mip.dj(parcel, i21);
                            break;
                        case 7:
                            bArrDj4 = mip.dj(parcel, i21);
                            break;
                        case 8:
                            iArrDg = mip.dg(parcel, i21);
                            break;
                        case 9:
                            bArrDj5 = mip.dj(parcel, i21);
                            break;
                        case 10:
                            iArrDg2 = mip.dg(parcel, i21);
                            break;
                        default:
                            mip.dd(parcel, i21);
                            break;
                    }
                }
                mip.db(parcel, iCT21);
                return new ktq(strCY23, bArrDf4, bArrDj, bArrDj2, bArrDj3, bArrDj4, iArrDg, bArrDj5, iArrDg2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kpf[i];
            case 1:
                return new kpe[i];
            case 2:
                return new kpq[i];
            case 3:
                return new ND4CSettings[i];
            case 4:
                return new kpr[i];
            case 5:
                return new kqa[i];
            case 6:
                return new TogglingData[i];
            case 7:
                return new kqk[i];
            case 8:
                return new kql[i];
            case 9:
                return new kqm[i];
            case 10:
                return new ksh[i];
            case 11:
                return new LocationRequest[i];
            case 12:
                return new ktc[i];
            case 13:
                return new ktd[i];
            case 14:
                return new kte[i];
            case 15:
                return new ktl[i];
            case 16:
                return new ktm[i];
            case 17:
                return new ktn[i];
            case 18:
                return new kto[i];
            case 19:
                return new ktp[i];
            default:
                return new ktq[i];
        }
    }
}
