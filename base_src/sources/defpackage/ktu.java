package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ktu implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ktu(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zDe = false;
        int iCR = 0;
        int iCR2 = 0;
        int iCR3 = 0;
        byte bCN = 0;
        int iCR4 = 0;
        boolean zDe2 = false;
        int iCR5 = 0;
        int iCR6 = 0;
        int iCR7 = 0;
        int iCR8 = 0;
        String strCY = null;
        String strCY2 = null;
        String strCY3 = null;
        IBinder iBinderCW = null;
        khi khiVar = null;
        kni kniVar = null;
        ArrayList arrayListCZ = null;
        ArrayList arrayListDa = null;
        switch (this.a) {
            case 0:
                int iCT = mip.cT(parcel);
                String strCY4 = null;
                kts ktsVar = null;
                while (parcel.dataPosition() < iCT) {
                    int i = parcel.readInt();
                    switch (mip.cP(i)) {
                        case 2:
                            strCY = mip.cY(parcel, i);
                            break;
                        case 3:
                            strCY4 = mip.cY(parcel, i);
                            break;
                        case 4:
                            ktsVar = (kts) mip.cX(parcel, i, kts.CREATOR);
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
                return new ktt(strCY, strCY4, ktsVar, zDe);
            case 1:
                int iCT2 = mip.cT(parcel);
                String strCY5 = null;
                String strCY6 = null;
                byte[] bArrDf = null;
                long jCU = 0;
                double d = 0.0d;
                boolean zDe3 = false;
                int iCR9 = 0;
                int iCR10 = 0;
                while (parcel.dataPosition() < iCT2) {
                    int i2 = parcel.readInt();
                    switch (mip.cP(i2)) {
                        case 2:
                            strCY5 = mip.cY(parcel, i2);
                            break;
                        case 3:
                            jCU = mip.cU(parcel, i2);
                            break;
                        case 4:
                            zDe3 = mip.de(parcel, i2);
                            break;
                        case 5:
                            mip.dc(parcel, i2, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strCY6 = mip.cY(parcel, i2);
                            break;
                        case 7:
                            bArrDf = mip.df(parcel, i2);
                            break;
                        case 8:
                            iCR9 = mip.cR(parcel, i2);
                            break;
                        case 9:
                            iCR10 = mip.cR(parcel, i2);
                            break;
                        default:
                            mip.dd(parcel, i2);
                            break;
                    }
                }
                mip.db(parcel, iCT2);
                return new kts(strCY5, jCU, zDe3, d, strCY6, bArrDf, iCR9, iCR10);
            case 2:
                int iCT3 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT3) {
                    int i3 = parcel.readInt();
                    switch (mip.cP(i3)) {
                        case 2:
                            arrayListDa = mip.da(parcel, i3, ktt.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i3);
                            break;
                    }
                }
                mip.db(parcel, iCT3);
                return new ktv(arrayListDa);
            case 3:
                int iCT4 = mip.cT(parcel);
                int iCR11 = 0;
                while (parcel.dataPosition() < iCT4) {
                    int i4 = parcel.readInt();
                    switch (mip.cP(i4)) {
                        case 1:
                            iCR8 = mip.cR(parcel, i4);
                            break;
                        case 2:
                            iCR11 = mip.cR(parcel, i4);
                            break;
                        default:
                            mip.dd(parcel, i4);
                            break;
                    }
                }
                mip.db(parcel, iCT4);
                return new ktw(iCR8, iCR11);
            case 4:
                int iCT5 = mip.cT(parcel);
                Intent intent = null;
                int iCR12 = 0;
                while (parcel.dataPosition() < iCT5) {
                    int i5 = parcel.readInt();
                    switch (mip.cP(i5)) {
                        case 1:
                            iCR7 = mip.cR(parcel, i5);
                            break;
                        case 2:
                            iCR12 = mip.cR(parcel, i5);
                            break;
                        case 3:
                            intent = (Intent) mip.cX(parcel, i5, Intent.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i5);
                            break;
                    }
                }
                mip.db(parcel, iCT5);
                return new kuk(iCR7, iCR12, intent);
            case 5:
                int iCT6 = mip.cT(parcel);
                String strCY7 = null;
                while (parcel.dataPosition() < iCT6) {
                    int i6 = parcel.readInt();
                    switch (mip.cP(i6)) {
                        case 1:
                            arrayListCZ = mip.cZ(parcel, i6);
                            break;
                        case 2:
                            strCY7 = mip.cY(parcel, i6);
                            break;
                        default:
                            mip.dd(parcel, i6);
                            break;
                    }
                }
                mip.db(parcel, iCT6);
                return new kun(arrayListCZ, strCY7);
            case 6:
                int iCT7 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT7) {
                    int i7 = parcel.readInt();
                    switch (mip.cP(i7)) {
                        case 1:
                            iCR6 = mip.cR(parcel, i7);
                            break;
                        case 2:
                            kniVar = (kni) mip.cX(parcel, i7, kni.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i7);
                            break;
                    }
                }
                mip.db(parcel, iCT7);
                return new kup(iCR6, kniVar);
            case 7:
                int iCT8 = mip.cT(parcel);
                knj knjVar = null;
                while (parcel.dataPosition() < iCT8) {
                    int i8 = parcel.readInt();
                    switch (mip.cP(i8)) {
                        case 1:
                            iCR5 = mip.cR(parcel, i8);
                            break;
                        case 2:
                            khiVar = (khi) mip.cX(parcel, i8, khi.CREATOR);
                            break;
                        case 3:
                            knjVar = (knj) mip.cX(parcel, i8, knj.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i8);
                            break;
                    }
                }
                mip.db(parcel, iCT8);
                return new kuq(iCR5, khiVar, knjVar);
            case 8:
                int iCT9 = mip.cT(parcel);
                String strCY8 = null;
                byte[] bArrDf2 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < iCT9) {
                    int i9 = parcel.readInt();
                    switch (mip.cP(i9)) {
                        case 1:
                            strCY8 = mip.cY(parcel, i9);
                            break;
                        case 2:
                            bArrDf2 = mip.df(parcel, i9);
                            break;
                        case 3:
                            int iCS = mip.cS(parcel, i9);
                            int iDataPosition = parcel.dataPosition();
                            if (iCS == 0) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                int i10 = parcel.readInt();
                                for (int i11 = 0; i11 < i10; i11++) {
                                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(iDataPosition + iCS);
                                arrayList = arrayList2;
                            }
                            break;
                        default:
                            mip.dd(parcel, i9);
                            break;
                    }
                }
                mip.db(parcel, iCT9);
                return new kvr(strCY8, bArrDf2, arrayList);
            case 9:
                int iCT10 = mip.cT(parcel);
                ArrayList arrayListDa2 = null;
                boolean zDe4 = false;
                while (parcel.dataPosition() < iCT10) {
                    int i12 = parcel.readInt();
                    switch (mip.cP(i12)) {
                        case 1:
                            arrayListDa2 = mip.da(parcel, i12, kvr.CREATOR);
                            break;
                        case 2:
                            zDe2 = mip.de(parcel, i12);
                            break;
                        case 3:
                            zDe4 = mip.de(parcel, i12);
                            break;
                        default:
                            mip.dd(parcel, i12);
                            break;
                    }
                }
                mip.db(parcel, iCT10);
                return new kvs(arrayListDa2, zDe2, zDe4);
            case 10:
                int iCT11 = mip.cT(parcel);
                ArrayList arrayListCZ2 = null;
                String strCY9 = null;
                int iCR13 = 0;
                boolean zDe5 = false;
                int iCR14 = 0;
                boolean zDe6 = false;
                while (parcel.dataPosition() < iCT11) {
                    int i13 = parcel.readInt();
                    switch (mip.cP(i13)) {
                        case 2:
                            iCR13 = mip.cR(parcel, i13);
                            break;
                        case 3:
                            zDe5 = mip.de(parcel, i13);
                            break;
                        case 4:
                            arrayListCZ2 = mip.cZ(parcel, i13);
                            break;
                        case 5:
                            iCR14 = mip.cR(parcel, i13);
                            break;
                        case 6:
                            strCY9 = mip.cY(parcel, i13);
                            break;
                        case 7:
                            zDe6 = mip.de(parcel, i13);
                            break;
                        default:
                            mip.dd(parcel, i13);
                            break;
                    }
                }
                mip.db(parcel, iCT11);
                return new kvz(iCR13, zDe5, arrayListCZ2, iCR14, strCY9, zDe6);
            case 11:
                int iCT12 = mip.cT(parcel);
                String strCY10 = null;
                String strCY11 = null;
                String strCY12 = null;
                String strCY13 = null;
                String strCY14 = null;
                int iCR15 = 0;
                int iCR16 = 0;
                boolean zDe7 = false;
                boolean zDe8 = false;
                boolean zDe9 = false;
                while (parcel.dataPosition() < iCT12) {
                    int i14 = parcel.readInt();
                    switch (mip.cP(i14)) {
                        case 2:
                            strCY10 = mip.cY(parcel, i14);
                            break;
                        case 3:
                            strCY11 = mip.cY(parcel, i14);
                            break;
                        case 4:
                            iCR15 = mip.cR(parcel, i14);
                            break;
                        case 5:
                            iCR16 = mip.cR(parcel, i14);
                            break;
                        case 6:
                            zDe7 = mip.de(parcel, i14);
                            break;
                        case 7:
                            zDe8 = mip.de(parcel, i14);
                            break;
                        case 8:
                            strCY12 = mip.cY(parcel, i14);
                            break;
                        case 9:
                            zDe9 = mip.de(parcel, i14);
                            break;
                        case 10:
                            strCY13 = mip.cY(parcel, i14);
                            break;
                        case 11:
                            strCY14 = mip.cY(parcel, i14);
                            break;
                        default:
                            mip.dd(parcel, i14);
                            break;
                    }
                }
                mip.db(parcel, iCT12);
                return new ConnectionConfiguration(strCY10, strCY11, iCR15, iCR16, zDe7, zDe8, strCY12, zDe9, strCY13, strCY14);
            case 12:
                int iCT13 = mip.cT(parcel);
                IntentFilter[] intentFilterArr = null;
                String strCY15 = null;
                String strCY16 = null;
                while (parcel.dataPosition() < iCT13) {
                    int i15 = parcel.readInt();
                    switch (mip.cP(i15)) {
                        case 2:
                            iBinderCW = mip.cW(parcel, i15);
                            break;
                        case 3:
                            intentFilterArr = (IntentFilter[]) mip.dh(parcel, i15, IntentFilter.CREATOR);
                            break;
                        case 4:
                            strCY15 = mip.cY(parcel, i15);
                            break;
                        case 5:
                            strCY16 = mip.cY(parcel, i15);
                            break;
                        default:
                            mip.dd(parcel, i15);
                            break;
                    }
                }
                mip.db(parcel, iCT13);
                return new kwx(iBinderCW, intentFilterArr, strCY15, strCY16);
            case 13:
                int iCT14 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT14) {
                    int i16 = parcel.readInt();
                    switch (mip.cP(i16)) {
                        case 2:
                            iCR4 = mip.cR(parcel, i16);
                            break;
                        default:
                            mip.dd(parcel, i16);
                            break;
                    }
                }
                mip.db(parcel, iCT14);
                return new kwy(iCR4);
            case 14:
                int iCT15 = mip.cT(parcel);
                String strCY17 = null;
                byte bCN2 = 0;
                while (parcel.dataPosition() < iCT15) {
                    int i17 = parcel.readInt();
                    switch (mip.cP(i17)) {
                        case 2:
                            bCN = mip.cN(parcel, i17);
                            break;
                        case 3:
                            bCN2 = mip.cN(parcel, i17);
                            break;
                        case 4:
                            strCY17 = mip.cY(parcel, i17);
                            break;
                        default:
                            mip.dd(parcel, i17);
                            break;
                    }
                }
                mip.db(parcel, iCT15);
                return new kwz(bCN, bCN2, strCY17);
            case 15:
                int iCT16 = mip.cT(parcel);
                String strCY18 = null;
                String strCY19 = null;
                String strCY20 = null;
                String strCY21 = null;
                String strCY22 = null;
                String strCY23 = null;
                String strCY24 = null;
                int iCR17 = 0;
                byte bCN3 = 0;
                byte bCN4 = 0;
                byte bCN5 = 0;
                byte bCN6 = 0;
                while (parcel.dataPosition() < iCT16) {
                    int i18 = parcel.readInt();
                    switch (mip.cP(i18)) {
                        case 2:
                            iCR17 = mip.cR(parcel, i18);
                            break;
                        case 3:
                            strCY18 = mip.cY(parcel, i18);
                            break;
                        case 4:
                            strCY19 = mip.cY(parcel, i18);
                            break;
                        case 5:
                            strCY20 = mip.cY(parcel, i18);
                            break;
                        case 6:
                            strCY21 = mip.cY(parcel, i18);
                            break;
                        case 7:
                            strCY22 = mip.cY(parcel, i18);
                            break;
                        case 8:
                            strCY23 = mip.cY(parcel, i18);
                            break;
                        case 9:
                            bCN3 = mip.cN(parcel, i18);
                            break;
                        case 10:
                            bCN4 = mip.cN(parcel, i18);
                            break;
                        case 11:
                            bCN5 = mip.cN(parcel, i18);
                            break;
                        case 12:
                            bCN6 = mip.cN(parcel, i18);
                            break;
                        case 13:
                            strCY24 = mip.cY(parcel, i18);
                            break;
                        default:
                            mip.dd(parcel, i18);
                            break;
                    }
                }
                mip.db(parcel, iCT16);
                return new kxa(iCR17, strCY18, strCY19, strCY20, strCY21, strCY22, strCY23, bCN3, bCN4, bCN5, bCN6, strCY24);
            case 16:
                int iCT17 = mip.cT(parcel);
                ArrayList arrayListDa3 = null;
                while (parcel.dataPosition() < iCT17) {
                    int i19 = parcel.readInt();
                    switch (mip.cP(i19)) {
                        case 2:
                            strCY3 = mip.cY(parcel, i19);
                            break;
                        case 3:
                            arrayListDa3 = mip.da(parcel, i19, kyz.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i19);
                            break;
                    }
                }
                mip.db(parcel, iCT17);
                return new kxf(strCY3, arrayListDa3);
            case 17:
                int iCT18 = mip.cT(parcel);
                kxi kxiVar = null;
                int iCR18 = 0;
                int iCR19 = 0;
                while (parcel.dataPosition() < iCT18) {
                    int i20 = parcel.readInt();
                    switch (mip.cP(i20)) {
                        case 2:
                            kxiVar = (kxi) mip.cX(parcel, i20, kxi.CREATOR);
                            break;
                        case 3:
                            iCR3 = mip.cR(parcel, i20);
                            break;
                        case 4:
                            iCR18 = mip.cR(parcel, i20);
                            break;
                        case 5:
                            iCR19 = mip.cR(parcel, i20);
                            break;
                        default:
                            mip.dd(parcel, i20);
                            break;
                    }
                }
                mip.db(parcel, iCT18);
                return new kxh(kxiVar, iCR3, iCR18, iCR19);
            case 18:
                int iCT19 = mip.cT(parcel);
                String strCY25 = null;
                String strCY26 = null;
                while (parcel.dataPosition() < iCT19) {
                    int i21 = parcel.readInt();
                    switch (mip.cP(i21)) {
                        case 2:
                            strCY2 = mip.cY(parcel, i21);
                            break;
                        case 3:
                            strCY25 = mip.cY(parcel, i21);
                            break;
                        case 4:
                            strCY26 = mip.cY(parcel, i21);
                            break;
                        default:
                            mip.dd(parcel, i21);
                            break;
                    }
                }
                mip.db(parcel, iCT19);
                return new kxi(strCY2, strCY25, strCY26);
            case 19:
                int iCT20 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT20) {
                    int i22 = parcel.readInt();
                    switch (mip.cP(i22)) {
                        case 2:
                            iCR2 = mip.cR(parcel, i22);
                            break;
                        default:
                            mip.dd(parcel, i22);
                            break;
                    }
                }
                mip.db(parcel, iCT20);
                return new kxj(iCR2);
            default:
                int iCT21 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT21) {
                    int i23 = parcel.readInt();
                    switch (mip.cP(i23)) {
                        case 2:
                            iCR = mip.cR(parcel, i23);
                            break;
                        default:
                            mip.dd(parcel, i23);
                            break;
                    }
                }
                mip.db(parcel, iCT21);
                return new kxk(iCR);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ktt[i];
            case 1:
                return new kts[i];
            case 2:
                return new ktv[i];
            case 3:
                return new ktw[i];
            case 4:
                return new kuk[i];
            case 5:
                return new kun[i];
            case 6:
                return new kup[i];
            case 7:
                return new kuq[i];
            case 8:
                return new kvr[i];
            case 9:
                return new kvs[i];
            case 10:
                return new kvz[i];
            case 11:
                return new ConnectionConfiguration[i];
            case 12:
                return new kwx[i];
            case 13:
                return new kwy[i];
            case 14:
                return new kwz[i];
            case 15:
                return new kxa[i];
            case 16:
                return new kxf[i];
            case 17:
                return new kxh[i];
            case 18:
                return new kxi[i];
            case 19:
                return new kxj[i];
            default:
                return new kxk[i];
        }
    }
}
