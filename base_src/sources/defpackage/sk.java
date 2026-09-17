package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.wearable.complications.rendering.ComplicationDrawable;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.feedback.ErrorReport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public sk(int i) {
        this.a = i;
    }

    public static void a(kmm kmmVar, Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, kmmVar.a);
        mip.cA(parcel, 2, kmmVar.b);
        mip.cA(parcel, 3, kmmVar.c);
        mip.cI(parcel, 4, kmmVar.d);
        mip.cF(parcel, 5, kmmVar.e);
        mip.cL(parcel, 6, kmmVar.f, i);
        mip.cC(parcel, 7, kmmVar.g);
        mip.cH(parcel, 8, kmmVar.h, i);
        mip.cL(parcel, 10, kmmVar.i, i);
        mip.cL(parcel, 11, kmmVar.j, i);
        mip.cw(parcel, 12, kmmVar.k);
        mip.cA(parcel, 13, kmmVar.l);
        mip.cw(parcel, 14, kmmVar.m);
        mip.cI(parcel, 15, kmmVar.n);
        mip.cv(parcel, iCt);
    }

    public static final ErrorReport b(Parcel parcel) {
        int iCT = mip.cT(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strCY = null;
        String strCY2 = null;
        String strCY3 = null;
        String strCY4 = null;
        String strCY5 = null;
        String strCY6 = null;
        String strCY7 = null;
        String strCY8 = null;
        String strCY9 = null;
        String strCY10 = null;
        String strCY11 = null;
        String strCY12 = null;
        String strCY13 = null;
        String[] strArrDi = null;
        String[] strArrDi2 = null;
        String[] strArrDi3 = null;
        String strCY14 = null;
        String strCY15 = null;
        byte[] bArrDf = null;
        String strCY16 = null;
        String strCY17 = null;
        String strCY18 = null;
        Bundle bundleCV = null;
        String strCY19 = null;
        String strCY20 = null;
        String strCY21 = null;
        String strCY22 = null;
        String strCY23 = null;
        String strCY24 = null;
        String strCY25 = null;
        String strCY26 = null;
        String strCY27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strCY28 = null;
        kpd[] kpdVarArr = null;
        String[] strArrDi4 = null;
        String strCY29 = null;
        kpf kpfVar = null;
        kpe kpeVar = null;
        String strCY30 = null;
        Bundle bundleCV2 = null;
        ArrayList arrayListDa = null;
        Bitmap bitmap = null;
        String strCY31 = null;
        ArrayList arrayListCZ = null;
        int iCR = 0;
        int iCR2 = 0;
        int iCR3 = 0;
        int iCR4 = 0;
        int iCR5 = 0;
        int iCR6 = 0;
        boolean zDe = false;
        int iCR7 = 0;
        int iCR8 = 0;
        boolean zDe2 = false;
        int iCR9 = 0;
        boolean zDe3 = false;
        boolean zDe4 = false;
        boolean zDe5 = false;
        int iCR10 = 0;
        while (parcel.dataPosition() < iCT) {
            int iCQ = mip.cQ(parcel);
            switch (mip.cP(iCQ)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) mip.cX(parcel, iCQ, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strCY = mip.cY(parcel, iCQ);
                    break;
                case 4:
                    iCR = mip.cR(parcel, iCQ);
                    break;
                case 5:
                    strCY2 = mip.cY(parcel, iCQ);
                    break;
                case 6:
                    strCY3 = mip.cY(parcel, iCQ);
                    break;
                case 7:
                    strCY4 = mip.cY(parcel, iCQ);
                    break;
                case 8:
                    strCY5 = mip.cY(parcel, iCQ);
                    break;
                case 9:
                    strCY6 = mip.cY(parcel, iCQ);
                    break;
                case 10:
                    strCY7 = mip.cY(parcel, iCQ);
                    break;
                case 11:
                    strCY8 = mip.cY(parcel, iCQ);
                    break;
                case 12:
                    iCR2 = mip.cR(parcel, iCQ);
                    break;
                case 13:
                    strCY9 = mip.cY(parcel, iCQ);
                    break;
                case 14:
                    strCY10 = mip.cY(parcel, iCQ);
                    break;
                case 15:
                    strCY11 = mip.cY(parcel, iCQ);
                    break;
                case 16:
                    strCY12 = mip.cY(parcel, iCQ);
                    break;
                case 17:
                    strCY13 = mip.cY(parcel, iCQ);
                    break;
                case 18:
                    strArrDi = mip.di(parcel, iCQ);
                    break;
                case 19:
                    strArrDi2 = mip.di(parcel, iCQ);
                    break;
                case 20:
                    strArrDi3 = mip.di(parcel, iCQ);
                    break;
                case 21:
                    strCY14 = mip.cY(parcel, iCQ);
                    break;
                case 22:
                    strCY15 = mip.cY(parcel, iCQ);
                    break;
                case 23:
                    bArrDf = mip.df(parcel, iCQ);
                    break;
                case 24:
                    iCR3 = mip.cR(parcel, iCQ);
                    break;
                case 25:
                    iCR4 = mip.cR(parcel, iCQ);
                    break;
                case 26:
                    iCR5 = mip.cR(parcel, iCQ);
                    break;
                case 27:
                    iCR6 = mip.cR(parcel, iCQ);
                    break;
                case 28:
                    strCY16 = mip.cY(parcel, iCQ);
                    break;
                case 29:
                    strCY17 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    strCY18 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    bundleCV = mip.cV(parcel, iCQ);
                    break;
                case 32:
                    zDe = mip.de(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iCR7 = mip.cR(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iCR8 = mip.cR(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    zDe2 = mip.de(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    strCY19 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    strCY20 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    iCR9 = mip.cR(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    strCY21 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    strCY22 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    strCY23 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    strCY24 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    strCY25 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    strCY26 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    strCY27 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    bitmapTeleporter = (BitmapTeleporter) mip.cX(parcel, iCQ, BitmapTeleporter.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    strCY28 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    kpdVarArr = (kpd[]) mip.dh(parcel, iCQ, kpd.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    strArrDi4 = mip.di(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zDe3 = mip.de(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    strCY29 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    kpfVar = (kpf) mip.cX(parcel, iCQ, kpf.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    kpeVar = (kpe) mip.cX(parcel, iCQ, kpe.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    strCY30 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    zDe4 = mip.de(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    bundleCV2 = mip.cV(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    arrayListDa = mip.da(parcel, iCQ, RectF.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    zDe5 = mip.de(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    bitmap = (Bitmap) mip.cX(parcel, iCQ, Bitmap.CREATOR);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    strCY31 = mip.cY(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    arrayListCZ = mip.cZ(parcel, iCQ);
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    iCR10 = mip.cR(parcel, iCQ);
                    break;
                default:
                    mip.dd(parcel, iCQ);
                    break;
            }
        }
        mip.db(parcel, iCT);
        return new ErrorReport(applicationErrorReport, strCY, iCR, strCY2, strCY3, strCY4, strCY5, strCY6, strCY7, strCY8, iCR2, strCY9, strCY10, strCY11, strCY12, strCY13, strArrDi, strArrDi2, strArrDi3, strCY14, strCY15, bArrDf, iCR3, iCR4, iCR5, iCR6, strCY16, strCY17, strCY18, bundleCV, zDe, iCR7, iCR8, zDe2, strCY19, strCY20, iCR9, strCY21, strCY22, strCY23, strCY24, strCY25, strCY26, strCY27, bitmapTeleporter, strCY28, kpdVarArr, strArrDi4, zDe3, strCY29, kpfVar, kpeVar, strCY30, zDe4, bundleCV2, arrayListDa, zDe5, bitmap, strCY31, arrayListCZ, iCR10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [sk] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iCR = 0;
        String strCY = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListDa = null;
        Account account = null;
        Bundle bundleCV = null;
        String strCY2 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String strCY3 = null;
        String strCY4 = null;
        PendingIntent pendingIntent = null;
        switch (this.a) {
            case 0:
                return new ComplicationDrawable(parcel, strCY);
            case 1:
                int iCT = mip.cT(parcel);
                int iCR2 = 0;
                while (parcel.dataPosition() < iCT) {
                    int i = parcel.readInt();
                    switch (mip.cP(i)) {
                        case 1:
                            strCY = mip.cY(parcel, i);
                            break;
                        case 2:
                            iCR = mip.cR(parcel, i);
                            break;
                        case 3:
                            iCR2 = mip.cR(parcel, i);
                            break;
                        default:
                            mip.dd(parcel, i);
                            break;
                    }
                }
                mip.db(parcel, iCT);
                return new kgv(strCY, iCR, iCR2);
            case 2:
                int iCT2 = mip.cT(parcel);
                khg khgVar = null;
                byte[] bArrDf = null;
                int[] iArrDg = null;
                String[] strArrDi = null;
                int[] iArrDg2 = null;
                byte[][] bArrDj = null;
                ktq[] ktqVarArr = null;
                boolean zDe = true;
                while (parcel.dataPosition() < iCT2) {
                    int i2 = parcel.readInt();
                    switch (mip.cP(i2)) {
                        case 2:
                            khgVar = (khg) mip.cX(parcel, i2, khg.CREATOR);
                            break;
                        case 3:
                            bArrDf = mip.df(parcel, i2);
                            break;
                        case 4:
                            iArrDg = mip.dg(parcel, i2);
                            break;
                        case 5:
                            strArrDi = mip.di(parcel, i2);
                            break;
                        case 6:
                            iArrDg2 = mip.dg(parcel, i2);
                            break;
                        case 7:
                            bArrDj = mip.dj(parcel, i2);
                            break;
                        case 8:
                            zDe = mip.de(parcel, i2);
                            break;
                        case 9:
                            ktqVarArr = (ktq[]) mip.dh(parcel, i2, ktq.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i2);
                            break;
                    }
                }
                mip.db(parcel, iCT2);
                return new kgw(khgVar, bArrDf, iArrDg, strArrDi, iArrDg2, bArrDj, zDe, ktqVarArr);
            case 3:
                int iCT3 = mip.cT(parcel);
                String strCY5 = null;
                String strCY6 = null;
                String strCY7 = null;
                String strCY8 = null;
                Integer numValueOf = null;
                int iCR3 = 0;
                int iCR4 = 0;
                boolean zDe2 = true;
                boolean zDe3 = false;
                int iCR5 = 0;
                boolean zDe4 = false;
                int iCR6 = 0;
                while (parcel.dataPosition() < iCT3) {
                    int i3 = parcel.readInt();
                    switch (mip.cP(i3)) {
                        case 2:
                            strCY5 = mip.cY(parcel, i3);
                            break;
                        case 3:
                            iCR3 = mip.cR(parcel, i3);
                            break;
                        case 4:
                            iCR4 = mip.cR(parcel, i3);
                            break;
                        case 5:
                            strCY6 = mip.cY(parcel, i3);
                            break;
                        case 6:
                            strCY7 = mip.cY(parcel, i3);
                            break;
                        case 7:
                            zDe2 = mip.de(parcel, i3);
                            break;
                        case 8:
                            strCY8 = mip.cY(parcel, i3);
                            break;
                        case 9:
                            zDe3 = mip.de(parcel, i3);
                            break;
                        case 10:
                            iCR5 = mip.cR(parcel, i3);
                            break;
                        case 11:
                            int iCS = mip.cS(parcel, i3);
                            if (iCS == 0) {
                                numValueOf = null;
                            } else {
                                if (iCS != 4) {
                                    String hexString = Integer.toHexString(iCS);
                                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
                                    sb.append("Expected size 4 got ");
                                    sb.append(iCS);
                                    sb.append(" (0x");
                                    sb.append(hexString);
                                    sb.append(")");
                                    throw new knp(sb.toString(), parcel);
                                }
                                numValueOf = Integer.valueOf(parcel.readInt());
                            }
                            break;
                        case 12:
                            zDe4 = mip.de(parcel, i3);
                            break;
                        case 13:
                            iCR6 = mip.cR(parcel, i3);
                            break;
                        default:
                            mip.dd(parcel, i3);
                            break;
                    }
                }
                mip.db(parcel, iCT3);
                return new khg(strCY5, iCR3, iCR4, strCY6, strCY7, zDe2, strCY8, zDe3, iCR5, numValueOf, zDe4, iCR6);
            case 4:
                int iCT4 = mip.cT(parcel);
                String strCY9 = null;
                int iCR7 = 0;
                while (parcel.dataPosition() < iCT4) {
                    int i4 = parcel.readInt();
                    switch (mip.cP(i4)) {
                        case 1:
                            iCR = mip.cR(parcel, i4);
                            break;
                        case 2:
                            iCR7 = mip.cR(parcel, i4);
                            break;
                        case 3:
                            pendingIntent = (PendingIntent) mip.cX(parcel, i4, PendingIntent.CREATOR);
                            break;
                        case 4:
                            strCY9 = mip.cY(parcel, i4);
                            break;
                        default:
                            mip.dd(parcel, i4);
                            break;
                    }
                }
                mip.db(parcel, iCT4);
                return new khi(iCR, iCR7, pendingIntent, strCY9);
            case 5:
                int iCT5 = mip.cT(parcel);
                long jCU = -1;
                while (parcel.dataPosition() < iCT5) {
                    int i5 = parcel.readInt();
                    switch (mip.cP(i5)) {
                        case 1:
                            strCY4 = mip.cY(parcel, i5);
                            break;
                        case 2:
                            iCR = mip.cR(parcel, i5);
                            break;
                        case 3:
                            jCU = mip.cU(parcel, i5);
                            break;
                        default:
                            mip.dd(parcel, i5);
                            break;
                    }
                }
                mip.db(parcel, iCT5);
                return new khk(strCY4, iCR, jCU);
            case 6:
                int iCT6 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT6) {
                    int i6 = parcel.readInt();
                    switch (mip.cP(i6)) {
                        case 1:
                            iCR = mip.cR(parcel, i6);
                            break;
                        case 2:
                            strCY3 = mip.cY(parcel, i6);
                            break;
                        default:
                            mip.dd(parcel, i6);
                            break;
                    }
                }
                mip.db(parcel, iCT6);
                return new Scope(iCR, strCY3);
            case 7:
                int iCT7 = mip.cT(parcel);
                String strCY10 = null;
                PendingIntent pendingIntent2 = null;
                khi khiVar = null;
                int iCR8 = 0;
                int iCR9 = 0;
                while (parcel.dataPosition() < iCT7) {
                    int i7 = parcel.readInt();
                    switch (mip.cP(i7)) {
                        case 1:
                            iCR9 = mip.cR(parcel, i7);
                            break;
                        case 2:
                            strCY10 = mip.cY(parcel, i7);
                            break;
                        case 3:
                            pendingIntent2 = (PendingIntent) mip.cX(parcel, i7, PendingIntent.CREATOR);
                            break;
                        case 4:
                            khiVar = (khi) mip.cX(parcel, i7, khi.CREATOR);
                            break;
                        case 1000:
                            iCR8 = mip.cR(parcel, i7);
                            break;
                        default:
                            mip.dd(parcel, i7);
                            break;
                    }
                }
                mip.db(parcel, iCT7);
                return new Status(iCR8, iCR9, strCY10, pendingIntent2, khiVar);
            case 8:
                int iCT8 = mip.cT(parcel);
                int iCR10 = 0;
                while (parcel.dataPosition() < iCT8) {
                    int i8 = parcel.readInt();
                    switch (mip.cP(i8)) {
                        case 1:
                            iCR = mip.cR(parcel, i8);
                            break;
                        case 2:
                            parcelFileDescriptor2 = (ParcelFileDescriptor) mip.cX(parcel, i8, ParcelFileDescriptor.CREATOR);
                            break;
                        case 3:
                            iCR10 = mip.cR(parcel, i8);
                            break;
                        default:
                            mip.dd(parcel, i8);
                            break;
                    }
                }
                mip.db(parcel, iCT8);
                return new BitmapTeleporter(iCR, parcelFileDescriptor2, iCR10);
            case 9:
                int iCT9 = mip.cT(parcel);
                String[] strArrDi2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleCV2 = null;
                int iCR11 = 0;
                int iCR12 = 0;
                while (parcel.dataPosition() < iCT9) {
                    int i9 = parcel.readInt();
                    switch (mip.cP(i9)) {
                        case 1:
                            strArrDi2 = mip.di(parcel, i9);
                            break;
                        case 2:
                            cursorWindowArr = (CursorWindow[]) mip.dh(parcel, i9, CursorWindow.CREATOR);
                            break;
                        case 3:
                            iCR12 = mip.cR(parcel, i9);
                            break;
                        case 4:
                            bundleCV2 = mip.cV(parcel, i9);
                            break;
                        case 1000:
                            iCR11 = mip.cR(parcel, i9);
                            break;
                        default:
                            mip.dd(parcel, i9);
                            break;
                    }
                }
                mip.db(parcel, iCT9);
                DataHolder dataHolder = new DataHolder(iCR11, strArrDi2, cursorWindowArr, iCR12, bundleCV2);
                dataHolder.c = new Bundle();
                int i10 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i10 < strArr.length) {
                        dataHolder.c.putInt(strArr[i10], i10);
                        i10++;
                    } else {
                        dataHolder.g = new int[dataHolder.d.length];
                        int numRows = 0;
                        while (true) {
                            CursorWindow[] cursorWindowArr2 = dataHolder.d;
                            if (iCR >= cursorWindowArr2.length) {
                                dataHolder.h = numRows;
                                return dataHolder;
                            }
                            dataHolder.g[iCR] = numRows;
                            numRows += dataHolder.d[iCR].getNumRows() - (numRows - cursorWindowArr2[iCR].getStartPosition());
                            iCR++;
                        }
                    }
                }
                break;
            case 10:
                int iCT10 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT10) {
                    int i11 = parcel.readInt();
                    switch (mip.cP(i11)) {
                        case 1:
                            iCR = mip.cR(parcel, i11);
                            break;
                        case 2:
                            strCY2 = mip.cY(parcel, i11);
                            break;
                        default:
                            mip.dd(parcel, i11);
                            break;
                    }
                }
                mip.db(parcel, iCT10);
                return new kmc(iCR, strCY2);
            case 11:
                int iCT11 = mip.cT(parcel);
                khk[] khkVarArr = null;
                kmi kmiVar = null;
                while (parcel.dataPosition() < iCT11) {
                    int i12 = parcel.readInt();
                    switch (mip.cP(i12)) {
                        case 1:
                            bundleCV = mip.cV(parcel, i12);
                            break;
                        case 2:
                            khkVarArr = (khk[]) mip.dh(parcel, i12, khk.CREATOR);
                            break;
                        case 3:
                            iCR = mip.cR(parcel, i12);
                            break;
                        case 4:
                            kmiVar = (kmi) mip.cX(parcel, i12, kmi.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i12);
                            break;
                    }
                }
                mip.db(parcel, iCT11);
                return new kmh(bundleCV, khkVarArr, iCR, kmiVar);
            case 12:
                int iCT12 = mip.cT(parcel);
                knl knlVar = null;
                int[] iArrDg3 = null;
                int[] iArrDg4 = null;
                boolean zDe5 = false;
                boolean zDe6 = false;
                int iCR13 = 0;
                while (parcel.dataPosition() < iCT12) {
                    int i13 = parcel.readInt();
                    switch (mip.cP(i13)) {
                        case 1:
                            knlVar = (knl) mip.cX(parcel, i13, knl.CREATOR);
                            break;
                        case 2:
                            zDe5 = mip.de(parcel, i13);
                            break;
                        case 3:
                            zDe6 = mip.de(parcel, i13);
                            break;
                        case 4:
                            iArrDg3 = mip.dg(parcel, i13);
                            break;
                        case 5:
                            iCR13 = mip.cR(parcel, i13);
                            break;
                        case 6:
                            iArrDg4 = mip.dg(parcel, i13);
                            break;
                        default:
                            mip.dd(parcel, i13);
                            break;
                    }
                }
                mip.db(parcel, iCT12);
                return new kmi(knlVar, zDe5, zDe6, iArrDg3, iCR13, iArrDg4);
            case 13:
                int iCT13 = mip.cT(parcel);
                String strCY11 = null;
                IBinder iBinderCW = null;
                Scope[] scopeArr = null;
                Bundle bundleCV3 = null;
                Account account2 = null;
                khk[] khkVarArr2 = null;
                khk[] khkVarArr3 = null;
                String strCY12 = null;
                int iCR14 = 0;
                int iCR15 = 0;
                int iCR16 = 0;
                boolean zDe7 = false;
                int iCR17 = 0;
                boolean zDe8 = false;
                while (parcel.dataPosition() < iCT13) {
                    int i14 = parcel.readInt();
                    switch (mip.cP(i14)) {
                        case 1:
                            iCR14 = mip.cR(parcel, i14);
                            break;
                        case 2:
                            iCR15 = mip.cR(parcel, i14);
                            break;
                        case 3:
                            iCR16 = mip.cR(parcel, i14);
                            break;
                        case 4:
                            strCY11 = mip.cY(parcel, i14);
                            break;
                        case 5:
                            iBinderCW = mip.cW(parcel, i14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) mip.dh(parcel, i14, Scope.CREATOR);
                            break;
                        case 7:
                            bundleCV3 = mip.cV(parcel, i14);
                            break;
                        case 8:
                            account2 = (Account) mip.cX(parcel, i14, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            mip.dd(parcel, i14);
                            break;
                        case 10:
                            khkVarArr2 = (khk[]) mip.dh(parcel, i14, khk.CREATOR);
                            break;
                        case 11:
                            khkVarArr3 = (khk[]) mip.dh(parcel, i14, khk.CREATOR);
                            break;
                        case 12:
                            zDe7 = mip.de(parcel, i14);
                            break;
                        case 13:
                            iCR17 = mip.cR(parcel, i14);
                            break;
                        case 14:
                            zDe8 = mip.de(parcel, i14);
                            break;
                        case 15:
                            strCY12 = mip.cY(parcel, i14);
                            break;
                    }
                }
                mip.db(parcel, iCT13);
                return new kmm(iCR14, iCR15, iCR16, strCY11, iBinderCW, scopeArr, bundleCV3, account2, khkVarArr2, khkVarArr3, zDe7, iCR17, zDe8, strCY12);
            case 14:
                int iCT14 = mip.cT(parcel);
                String strCY13 = null;
                String strCY14 = null;
                long jCU2 = 0;
                long jCU3 = 0;
                int iCR18 = 0;
                int iCR19 = 0;
                int iCR20 = 0;
                int iCR21 = 0;
                int iCR22 = -1;
                while (parcel.dataPosition() < iCT14) {
                    int i15 = parcel.readInt();
                    switch (mip.cP(i15)) {
                        case 1:
                            iCR18 = mip.cR(parcel, i15);
                            break;
                        case 2:
                            iCR19 = mip.cR(parcel, i15);
                            break;
                        case 3:
                            iCR20 = mip.cR(parcel, i15);
                            break;
                        case 4:
                            jCU2 = mip.cU(parcel, i15);
                            break;
                        case 5:
                            jCU3 = mip.cU(parcel, i15);
                            break;
                        case 6:
                            strCY13 = mip.cY(parcel, i15);
                            break;
                        case 7:
                            strCY14 = mip.cY(parcel, i15);
                            break;
                        case 8:
                            iCR21 = mip.cR(parcel, i15);
                            break;
                        case 9:
                            iCR22 = mip.cR(parcel, i15);
                            break;
                        default:
                            mip.dd(parcel, i15);
                            break;
                    }
                }
                mip.db(parcel, iCT14);
                return new kne(iCR18, iCR19, iCR20, jCU2, jCU3, strCY13, strCY14, iCR21, iCR22);
            case 15:
                int iCT15 = mip.cT(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iCR23 = 0;
                while (parcel.dataPosition() < iCT15) {
                    int i16 = parcel.readInt();
                    switch (mip.cP(i16)) {
                        case 1:
                            iCR = mip.cR(parcel, i16);
                            break;
                        case 2:
                            account = (Account) mip.cX(parcel, i16, Account.CREATOR);
                            break;
                        case 3:
                            iCR23 = mip.cR(parcel, i16);
                            break;
                        case 4:
                            googleSignInAccount = (GoogleSignInAccount) mip.cX(parcel, i16, GoogleSignInAccount.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i16);
                            break;
                    }
                }
                mip.db(parcel, iCT15);
                return new kni(iCR, account, iCR23, googleSignInAccount);
            case 16:
                int iCT16 = mip.cT(parcel);
                IBinder iBinderCW2 = null;
                khi khiVar2 = null;
                int iCR24 = 0;
                boolean zDe9 = false;
                boolean zDe10 = false;
                while (parcel.dataPosition() < iCT16) {
                    int i17 = parcel.readInt();
                    switch (mip.cP(i17)) {
                        case 1:
                            iCR24 = mip.cR(parcel, i17);
                            break;
                        case 2:
                            iBinderCW2 = mip.cW(parcel, i17);
                            break;
                        case 3:
                            khiVar2 = (khi) mip.cX(parcel, i17, khi.CREATOR);
                            break;
                        case 4:
                            zDe9 = mip.de(parcel, i17);
                            break;
                        case 5:
                            zDe10 = mip.de(parcel, i17);
                            break;
                        default:
                            mip.dd(parcel, i17);
                            break;
                    }
                }
                mip.db(parcel, iCT16);
                return new knj(iCR24, iBinderCW2, khiVar2, zDe9, zDe10);
            case 17:
                int iCT17 = mip.cT(parcel);
                int iCR25 = 0;
                boolean zDe11 = false;
                boolean zDe12 = false;
                int iCR26 = 0;
                int iCR27 = 0;
                while (parcel.dataPosition() < iCT17) {
                    int i18 = parcel.readInt();
                    switch (mip.cP(i18)) {
                        case 1:
                            iCR25 = mip.cR(parcel, i18);
                            break;
                        case 2:
                            zDe11 = mip.de(parcel, i18);
                            break;
                        case 3:
                            zDe12 = mip.de(parcel, i18);
                            break;
                        case 4:
                            iCR26 = mip.cR(parcel, i18);
                            break;
                        case 5:
                            iCR27 = mip.cR(parcel, i18);
                            break;
                        default:
                            mip.dd(parcel, i18);
                            break;
                    }
                }
                mip.db(parcel, iCT17);
                return new knl(iCR25, zDe11, zDe12, iCR26, iCR27);
            case 18:
                int iCT18 = mip.cT(parcel);
                while (parcel.dataPosition() < iCT18) {
                    int i19 = parcel.readInt();
                    switch (mip.cP(i19)) {
                        case 1:
                            iCR = mip.cR(parcel, i19);
                            break;
                        case 2:
                            arrayListDa = mip.da(parcel, i19, kne.CREATOR);
                            break;
                        default:
                            mip.dd(parcel, i19);
                            break;
                    }
                }
                mip.db(parcel, iCT18);
                return new knm(iCR, arrayListDa);
            case 19:
                return b(parcel);
            default:
                int iCT19 = mip.cT(parcel);
                String strCY15 = null;
                String strCY16 = null;
                while (parcel.dataPosition() < iCT19) {
                    int i20 = parcel.readInt();
                    switch (mip.cP(i20)) {
                        case 2:
                            parcelFileDescriptor = (ParcelFileDescriptor) mip.cX(parcel, i20, ParcelFileDescriptor.CREATOR);
                            break;
                        case 3:
                            strCY15 = mip.cY(parcel, i20);
                            break;
                        case 4:
                            strCY16 = mip.cY(parcel, i20);
                            break;
                        default:
                            mip.dd(parcel, i20);
                            break;
                    }
                }
                mip.db(parcel, iCT19);
                return new kpd(parcelFileDescriptor, strCY15, strCY16);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ComplicationDrawable[i];
            case 1:
                return new kgv[i];
            case 2:
                return new kgw[i];
            case 3:
                return new khg[i];
            case 4:
                return new khi[i];
            case 5:
                return new khk[i];
            case 6:
                return new Scope[i];
            case 7:
                return new Status[i];
            case 8:
                return new BitmapTeleporter[i];
            case 9:
                return new DataHolder[i];
            case 10:
                return new kmc[i];
            case 11:
                return new kmh[i];
            case 12:
                return new kmi[i];
            case 13:
                return new kmm[i];
            case 14:
                return new kne[i];
            case 15:
                return new kni[i];
            case 16:
                return new knj[i];
            case 17:
                return new knl[i];
            case 18:
                return new knm[i];
            case 19:
                return new ErrorReport[i];
            default:
                return new kpd[i];
        }
    }
}
