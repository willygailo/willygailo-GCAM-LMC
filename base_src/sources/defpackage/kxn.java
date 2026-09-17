package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kxn implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public kxn(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strCY = null;
        String strCY2 = null;
        kyz kyzVar = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strCY3 = null;
        kxp kxpVar = null;
        ArrayList arrayListDa = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String strCY4 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        ParcelFileDescriptor parcelFileDescriptor3 = null;
        kxf kxfVar = null;
        ArrayList arrayListDa2 = null;
        Uri uri = null;
        int iCR = 0;
        switch (this.a) {
            case 0:
                int iCT = mip.cT(parcel);
                int iCR2 = 0;
                boolean zDe = false;
                boolean zDe2 = false;
                boolean zDe3 = false;
                boolean zDe4 = false;
                while (parcel.dataPosition() < iCT) {
                    int i = parcel.readInt();
                    switch (mip.cP(i)) {
                        case 1:
                            iCR2 = mip.cR(parcel, i);
                            break;
                        case 2:
                            zDe = mip.de(parcel, i);
                            break;
                        case 3:
                            zDe2 = mip.de(parcel, i);
                            break;
                        case 4:
                            zDe3 = mip.de(parcel, i);
                            break;
                        case 5:
                            zDe4 = mip.de(parcel, i);
                            break;
                        default:
                            mip.dd(parcel, i);
                            break;
                    }
                }
                mip.db(parcel, iCT);
                return new kxm(iCR2, zDe, zDe2, zDe3, zDe4);
            case 1:
                int iCT2 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT2) {
                    int i2 = parcel.readInt();
                    switch (mip.cP(i2)) {
                        case 2:
                            iCR = mip.cR(parcel, i2);
                            break;
                        default:
                            mip.dd(parcel, i2);
                            break;
                    }
                }
                mip.db(parcel, iCT2);
                return new kxl(iCR);
            case 2:
                int iCT3 = mip.cT(parcel);
                String strCY5 = null;
                while (parcel.dataPosition() < iCT3) {
                    int i3 = parcel.readInt();
                    switch (mip.cP(i3)) {
                        case 2:
                            strCY = mip.cY(parcel, i3);
                            break;
                        case 3:
                            strCY5 = mip.cY(parcel, i3);
                            break;
                        default:
                            mip.dd(parcel, i3);
                            break;
                    }
                }
                mip.db(parcel, iCT3);
                return new DataItemAssetParcelable(strCY, strCY5);
            case 3:
                int iCT4 = mip.cT(parcel);
                Bundle bundleCV = null;
                byte[] bArrDf = null;
                while (parcel.dataPosition() < iCT4) {
                    int i4 = parcel.readInt();
                    switch (mip.cP(i4)) {
                        case 2:
                            uri = (Uri) mip.cX(parcel, i4, Uri.CREATOR);
                            break;
                        case 3:
                        default:
                            mip.dd(parcel, i4);
                            break;
                        case 4:
                            bundleCV = mip.cV(parcel, i4);
                            break;
                        case 5:
                            bArrDf = mip.df(parcel, i4);
                            break;
                    }
                }
                mip.db(parcel, iCT4);
                return new kxp(uri, bundleCV, bArrDf);
            case 4:
                int iCT5 = mip.cT(parcel);
                int iCR3 = 0;
                while (parcel.dataPosition() < iCT5) {
                    int i5 = parcel.readInt();
                    switch (mip.cP(i5)) {
                        case 2:
                            iCR = mip.cR(parcel, i5);
                            break;
                        case 3:
                            iCR3 = mip.cR(parcel, i5);
                            break;
                        default:
                            mip.dd(parcel, i5);
                            break;
                    }
                }
                mip.db(parcel, iCT5);
                return new kxr(iCR, iCR3);
            case 5:
                int iCT6 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT6) {
                    int i6 = parcel.readInt();
                    switch (mip.cP(i6)) {
                        case 2:
                            iCR = mip.cR(parcel, i6);
                            break;
                        case 3:
                            arrayListDa2 = mip.da(parcel, i6, kxf.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i6);
                            break;
                    }
                }
                mip.db(parcel, iCT6);
                return new kxs(iCR, arrayListDa2);
            case 6:
                int iCT7 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT7) {
                    int i7 = parcel.readInt();
                    switch (mip.cP(i7)) {
                        case 2:
                            iCR = mip.cR(parcel, i7);
                            break;
                        case 3:
                            kxfVar = (kxf) mip.cX(parcel, i7, kxf.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i7);
                            break;
                    }
                }
                mip.db(parcel, iCT7);
                return new kxt(iCR, kxfVar);
            case 7:
                int iCT8 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT8) {
                    int i8 = parcel.readInt();
                    switch (mip.cP(i8)) {
                        case 2:
                            iCR = mip.cR(parcel, i8);
                            break;
                        case 3:
                            parcelFileDescriptor3 = (ParcelFileDescriptor) mip.cX(parcel, i8, ParcelFileDescriptor.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i8);
                            break;
                    }
                }
                mip.db(parcel, iCT8);
                return new kxu(iCR, parcelFileDescriptor3);
            case 8:
                int iCT9 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT9) {
                    int i9 = parcel.readInt();
                    switch (mip.cP(i9)) {
                        case 2:
                            iCR = mip.cR(parcel, i9);
                            break;
                        case 3:
                            parcelFileDescriptor2 = (ParcelFileDescriptor) mip.cX(parcel, i9, ParcelFileDescriptor.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i9);
                            break;
                    }
                }
                mip.db(parcel, iCT9);
                return new kxv(iCR, parcelFileDescriptor2);
            case 9:
                int iCT10 = mip.cT(parcel);
                boolean zDe5 = false;
                while (parcel.dataPosition() < iCT10) {
                    int i10 = parcel.readInt();
                    switch (mip.cP(i10)) {
                        case 2:
                            iCR = mip.cR(parcel, i10);
                            break;
                        case 3:
                            zDe5 = mip.de(parcel, i10);
                            break;
                        default:
                            mip.dd(parcel, i10);
                            break;
                    }
                }
                mip.db(parcel, iCT10);
                return new kxw(iCR, zDe5);
            case 10:
                int iCT11 = mip.cT(parcel);
                boolean zDe6 = false;
                boolean zDe7 = false;
                while (parcel.dataPosition() < iCT11) {
                    int i11 = parcel.readInt();
                    switch (mip.cP(i11)) {
                        case 2:
                            iCR = mip.cR(parcel, i11);
                            break;
                        case 3:
                            zDe6 = mip.de(parcel, i11);
                            break;
                        case 4:
                            zDe7 = mip.de(parcel, i11);
                            break;
                        default:
                            mip.dd(parcel, i11);
                            break;
                    }
                }
                mip.db(parcel, iCT11);
                return new kxx(iCR, zDe6, zDe7);
            case 11:
                int iCT12 = mip.cT(parcel);
                boolean zDe8 = false;
                while (parcel.dataPosition() < iCT12) {
                    int i12 = parcel.readInt();
                    switch (mip.cP(i12)) {
                        case 2:
                            iCR = mip.cR(parcel, i12);
                            break;
                        case 3:
                            zDe8 = mip.de(parcel, i12);
                            break;
                        default:
                            mip.dd(parcel, i12);
                            break;
                    }
                }
                mip.db(parcel, iCT12);
                return new kxy(iCR, zDe8);
            case 12:
                int iCT13 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT13) {
                    int i13 = parcel.readInt();
                    switch (mip.cP(i13)) {
                        case 2:
                            iCR = mip.cR(parcel, i13);
                            break;
                        case 3:
                            strCY4 = mip.cY(parcel, i13);
                            break;
                        default:
                            mip.dd(parcel, i13);
                            break;
                    }
                }
                mip.db(parcel, iCT13);
                return new kxz(iCR, strCY4);
            case 13:
                int iCT14 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT14) {
                    int i14 = parcel.readInt();
                    switch (mip.cP(i14)) {
                        case 2:
                            iCR = mip.cR(parcel, i14);
                            break;
                        case 3:
                            connectionConfiguration = (ConnectionConfiguration) mip.cX(parcel, i14, ConnectionConfiguration.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i14);
                            break;
                    }
                }
                mip.db(parcel, iCT14);
                return new kya(iCR, connectionConfiguration);
            case 14:
                int iCT15 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT15) {
                    int i15 = parcel.readInt();
                    switch (mip.cP(i15)) {
                        case 2:
                            iCR = mip.cR(parcel, i15);
                            break;
                        case 3:
                            connectionConfigurationArr = (ConnectionConfiguration[]) mip.dh(parcel, i15, ConnectionConfiguration.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i15);
                            break;
                    }
                }
                mip.db(parcel, iCT15);
                return new kyb(iCR, connectionConfigurationArr);
            case 15:
                int iCT16 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT16) {
                    int i16 = parcel.readInt();
                    switch (mip.cP(i16)) {
                        case 2:
                            iCR = mip.cR(parcel, i16);
                            break;
                        case 3:
                            arrayListDa = mip.da(parcel, i16, kyz.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i16);
                            break;
                    }
                }
                mip.db(parcel, iCT16);
                return new kyc(iCR, arrayListDa);
            case 16:
                int iCT17 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT17) {
                    int i17 = parcel.readInt();
                    switch (mip.cP(i17)) {
                        case 2:
                            iCR = mip.cR(parcel, i17);
                            break;
                        case 3:
                            kxpVar = (kxp) mip.cX(parcel, i17, kxp.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i17);
                            break;
                    }
                }
                mip.db(parcel, iCT17);
                return new kyd(iCR, kxpVar);
            case 17:
                int iCT18 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT18) {
                    int i18 = parcel.readInt();
                    switch (mip.cP(i18)) {
                        case 2:
                            iCR = mip.cR(parcel, i18);
                            break;
                        case 3:
                            strCY3 = mip.cY(parcel, i18);
                            break;
                        default:
                            mip.dd(parcel, i18);
                            break;
                    }
                }
                mip.db(parcel, iCT18);
                return new kye(iCR, strCY3);
            case 18:
                int iCT19 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT19) {
                    int i19 = parcel.readInt();
                    switch (mip.cP(i19)) {
                        case 2:
                            iCR = mip.cR(parcel, i19);
                            break;
                        case 3:
                            parcelFileDescriptor = (ParcelFileDescriptor) mip.cX(parcel, i19, ParcelFileDescriptor.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i19);
                            break;
                    }
                }
                mip.db(parcel, iCT19);
                return new kyf(iCR, parcelFileDescriptor);
            case 19:
                int iCT20 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT20) {
                    int i20 = parcel.readInt();
                    switch (mip.cP(i20)) {
                        case 2:
                            iCR = mip.cR(parcel, i20);
                            break;
                        case 3:
                            kyzVar = (kyz) mip.cX(parcel, i20, kyz.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i20);
                            break;
                    }
                }
                mip.db(parcel, iCT20);
                return new kyg(iCR, kyzVar);
            default:
                int iCT21 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT21) {
                    int i21 = parcel.readInt();
                    switch (mip.cP(i21)) {
                        case 2:
                            iCR = mip.cR(parcel, i21);
                            break;
                        case 3:
                            strCY2 = mip.cY(parcel, i21);
                            break;
                        default:
                            mip.dd(parcel, i21);
                            break;
                    }
                }
                mip.db(parcel, iCT21);
                return new kyh(iCR, strCY2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kxm[i];
            case 1:
                return new kxl[i];
            case 2:
                return new DataItemAssetParcelable[i];
            case 3:
                return new kxp[i];
            case 4:
                return new kxr[i];
            case 5:
                return new kxs[i];
            case 6:
                return new kxt[i];
            case 7:
                return new kxu[i];
            case 8:
                return new kxv[i];
            case 9:
                return new kxw[i];
            case 10:
                return new kxx[i];
            case 11:
                return new kxy[i];
            case 12:
                return new kxz[i];
            case 13:
                return new kya[i];
            case 14:
                return new kyb[i];
            case 15:
                return new kyc[i];
            case 16:
                return new kyd[i];
            case 17:
                return new kye[i];
            case 18:
                return new kyf[i];
            case 19:
                return new kyg[i];
            default:
                return new kyh[i];
        }
    }
}
