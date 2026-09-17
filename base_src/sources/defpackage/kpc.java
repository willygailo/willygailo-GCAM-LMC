package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kpc implements Parcelable.Creator {
    public static void a(kpb kpbVar, Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, kpbVar.a);
        mip.cC(parcel, 3, kpbVar.b);
        mip.cI(parcel, 5, kpbVar.c);
        mip.cH(parcel, 6, kpbVar.d, i);
        mip.cI(parcel, 7, kpbVar.e);
        mip.cH(parcel, 8, kpbVar.f, i);
        mip.cI(parcel, 9, kpbVar.g);
        mip.cM(parcel, 10, kpbVar.h);
        mip.cw(parcel, 11, kpbVar.i);
        mip.cH(parcel, 12, kpbVar.j, i);
        mip.cH(parcel, 13, kpbVar.k, i);
        mip.cw(parcel, 14, kpbVar.l);
        mip.cH(parcel, 15, kpbVar.m, i);
        mip.cI(parcel, 16, kpbVar.n);
        mip.cw(parcel, 17, kpbVar.o);
        mip.cB(parcel, 18, kpbVar.p);
        mip.cv(parcel, iCt);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iCT = mip.cT(parcel);
        String strCY = null;
        Bundle bundleCV = null;
        String strCY2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strCY3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strCY4 = null;
        ArrayList arrayListDa = null;
        kpf kpfVar = null;
        kpe kpeVar = null;
        Bitmap bitmap = null;
        String strCY5 = null;
        long jCU = 0;
        boolean zDe = false;
        boolean zDe2 = false;
        boolean zDe3 = false;
        while (parcel.dataPosition() < iCT) {
            int i = parcel.readInt();
            switch (mip.cP(i)) {
                case 2:
                    strCY = mip.cY(parcel, i);
                    break;
                case 3:
                    bundleCV = mip.cV(parcel, i);
                    break;
                case 4:
                default:
                    mip.dd(parcel, i);
                    break;
                case 5:
                    strCY2 = mip.cY(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) mip.cX(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strCY3 = mip.cY(parcel, i);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) mip.cX(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    strCY4 = mip.cY(parcel, i);
                    break;
                case 10:
                    arrayListDa = mip.da(parcel, i, kpd.CREATOR);
                    break;
                case 11:
                    zDe = mip.de(parcel, i);
                    break;
                case 12:
                    kpfVar = (kpf) mip.cX(parcel, i, kpf.CREATOR);
                    break;
                case 13:
                    kpeVar = (kpe) mip.cX(parcel, i, kpe.CREATOR);
                    break;
                case 14:
                    zDe2 = mip.de(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) mip.cX(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strCY5 = mip.cY(parcel, i);
                    break;
                case 17:
                    zDe3 = mip.de(parcel, i);
                    break;
                case 18:
                    jCU = mip.cU(parcel, i);
                    break;
            }
        }
        mip.db(parcel, iCT);
        return new kpb(strCY, bundleCV, strCY2, applicationErrorReport, strCY3, bitmapTeleporter, strCY4, arrayListDa, zDe, kpfVar, kpeVar, zDe2, bitmap, strCY5, zDe3, jCU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kpb[i];
    }
}
