package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kza implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public kza(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jCU = 0;
        int iCR = 0;
        String strCY = null;
        ArrayList arrayListDa = null;
        byte[] bArrDf = null;
        IBinder iBinderCW = null;
        kxp kxpVar = null;
        String strCY2 = null;
        String strCY3 = null;
        kxi kxiVar = null;
        String strCY4 = null;
        switch (this.a) {
            case 0:
                int iCT = mip.cT(parcel);
                String strCY5 = null;
                boolean zDe = false;
                while (parcel.dataPosition() < iCT) {
                    int i = parcel.readInt();
                    switch (mip.cP(i)) {
                        case 2:
                            strCY = mip.cY(parcel, i);
                            break;
                        case 3:
                            strCY5 = mip.cY(parcel, i);
                            break;
                        case 4:
                            iCR = mip.cR(parcel, i);
                            break;
                        case 5:
                            zDe = mip.de(parcel, i);
                            break;
                        default:
                            mip.dd(parcel, i);
                            break;
                    }
                }
                mip.db(parcel, iCT);
                return new kyz(strCY, strCY5, iCR, zDe);
            case 1:
                int iCT2 = mip.cT(parcel);
                byte[] bArrDf2 = null;
                String strCY6 = null;
                while (parcel.dataPosition() < iCT2) {
                    int i2 = parcel.readInt();
                    switch (mip.cP(i2)) {
                        case 2:
                            iCR = mip.cR(parcel, i2);
                            break;
                        case 3:
                            strCY4 = mip.cY(parcel, i2);
                            break;
                        case 4:
                            bArrDf2 = mip.df(parcel, i2);
                            break;
                        case 5:
                            strCY6 = mip.cY(parcel, i2);
                            break;
                        default:
                            mip.dd(parcel, i2);
                            break;
                    }
                }
                mip.db(parcel, iCT2);
                return new kyw(iCR, strCY4, bArrDf2, strCY6);
            case 2:
                int iCT3 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT3) {
                    int i3 = parcel.readInt();
                    switch (mip.cP(i3)) {
                        case 2:
                            iCR = mip.cR(parcel, i3);
                            break;
                        case 3:
                            kxiVar = (kxi) mip.cX(parcel, i3, kxi.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i3);
                            break;
                    }
                }
                mip.db(parcel, iCT3);
                return new kzb(iCR, kxiVar);
            case 3:
                int iCT4 = mip.cT(parcel);
                String strCY7 = null;
                while (parcel.dataPosition() < iCT4) {
                    int i4 = parcel.readInt();
                    switch (mip.cP(i4)) {
                        case 2:
                            strCY3 = mip.cY(parcel, i4);
                            break;
                        case 3:
                            strCY7 = mip.cY(parcel, i4);
                            break;
                        case 4:
                            jCU = mip.cU(parcel, i4);
                            break;
                        default:
                            mip.dd(parcel, i4);
                            break;
                    }
                }
                mip.db(parcel, iCT4);
                return new kzc(strCY3, strCY7, jCU);
            case 4:
                int iCT5 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT5) {
                    int i5 = parcel.readInt();
                    switch (mip.cP(i5)) {
                        case 2:
                            iCR = mip.cR(parcel, i5);
                            break;
                        case 3:
                            strCY2 = mip.cY(parcel, i5);
                            break;
                        default:
                            mip.dd(parcel, i5);
                            break;
                    }
                }
                mip.db(parcel, iCT5);
                return new kzd(iCR, strCY2);
            case 5:
                int iCT6 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT6) {
                    int i6 = parcel.readInt();
                    switch (mip.cP(i6)) {
                        case 2:
                            iCR = mip.cR(parcel, i6);
                            break;
                        case 3:
                            kxpVar = (kxp) mip.cX(parcel, i6, kxp.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i6);
                            break;
                    }
                }
                mip.db(parcel, iCT6);
                return new kze(iCR, kxpVar);
            case 6:
                int iCT7 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT7) {
                    int i7 = parcel.readInt();
                    switch (mip.cP(i7)) {
                        case 1:
                            iCR = mip.cR(parcel, i7);
                            break;
                        case 2:
                            iBinderCW = mip.cW(parcel, i7);
                            break;
                        default:
                            mip.dd(parcel, i7);
                            break;
                    }
                }
                mip.db(parcel, iCT7);
                return new kzf(iCR, iBinderCW);
            case 7:
                int iCT8 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT8) {
                    int i8 = parcel.readInt();
                    switch (mip.cP(i8)) {
                        case 2:
                            iCR = mip.cR(parcel, i8);
                            break;
                        default:
                            mip.dd(parcel, i8);
                            break;
                    }
                }
                mip.db(parcel, iCT8);
                return new kzg(iCR);
            case 8:
                int iCT9 = mip.cT(parcel);
                int iCR2 = 0;
                while (parcel.dataPosition() < iCT9) {
                    int i9 = parcel.readInt();
                    switch (mip.cP(i9)) {
                        case 1:
                            iCR = mip.cR(parcel, i9);
                            break;
                        case 2:
                            iCR2 = mip.cR(parcel, i9);
                            break;
                        case 3:
                            bArrDf = mip.df(parcel, i9);
                            break;
                        default:
                            mip.dd(parcel, i9);
                            break;
                    }
                }
                mip.db(parcel, iCT9);
                return new kzh(iCR, iCR2, bArrDf);
            case 9:
                int iCT10 = mip.cT(parcel);
                int iCR3 = 0;
                while (parcel.dataPosition() < iCT10) {
                    int i10 = parcel.readInt();
                    switch (mip.cP(i10)) {
                        case 2:
                            iCR = mip.cR(parcel, i10);
                            break;
                        case 3:
                            iCR3 = mip.cR(parcel, i10);
                            break;
                        default:
                            mip.dd(parcel, i10);
                            break;
                    }
                }
                mip.db(parcel, iCT10);
                return new kzi(iCR, iCR3);
            case 10:
                int iCT11 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT11) {
                    int i11 = parcel.readInt();
                    switch (mip.cP(i11)) {
                        case 2:
                            iCR = mip.cR(parcel, i11);
                            break;
                        case 3:
                            jCU = mip.cU(parcel, i11);
                            break;
                        case 4:
                            arrayListDa = mip.da(parcel, i11, kzc.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i11);
                            break;
                    }
                }
                mip.db(parcel, iCT11);
                return new kzj(iCR, jCU, arrayListDa);
            case 11:
                return new Barcode(parcel);
            case 12:
                return new Barcode.Address(parcel);
            case 13:
                return new Barcode.BoardingPass(parcel);
            case 14:
                return new Barcode.CalendarDateTime(parcel);
            case 15:
                return new Barcode.CalendarEvent(parcel);
            case 16:
                return new Barcode.ContactInfo(parcel);
            case 17:
                return new Barcode.DriverLicense(parcel);
            case 18:
                return new Barcode.Email(parcel);
            case 19:
                return new Barcode.FlightSegment(parcel);
            default:
                return new Barcode.GeoPoint(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kyz[i];
            case 1:
                return new kyw[i];
            case 2:
                return new kzb[i];
            case 3:
                return new kzc[i];
            case 4:
                return new kzd[i];
            case 5:
                return new kze[i];
            case 6:
                return new kzf[i];
            case 7:
                return new kzg[i];
            case 8:
                return new kzh[i];
            case 9:
                return new kzi[i];
            case 10:
                return new kzj[i];
            case 11:
                return new Barcode[i];
            case 12:
                return new Barcode.Address[i];
            case 13:
                return new Barcode.BoardingPass[i];
            case 14:
                return new Barcode.CalendarDateTime[i];
            case 15:
                return new Barcode.CalendarEvent[i];
            case 16:
                return new Barcode.ContactInfo[i];
            case 17:
                return new Barcode.DriverLicense[i];
            case 18:
                return new Barcode.Email[i];
            case 19:
                return new Barcode.FlightSegment[i];
            default:
                return new Barcode.GeoPoint[i];
        }
    }
}
