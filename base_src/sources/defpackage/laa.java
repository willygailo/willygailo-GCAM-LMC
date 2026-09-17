package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* JADX INFO: loaded from: classes2.dex */
public final class laa implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public laa(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        pxs pxsVar;
        pxr pxrVar;
        switch (this.a) {
            case 0:
                return new Barcode.Phone(parcel);
            case 1:
                return new Barcode.PersonName(parcel);
            case 2:
                return new Barcode.Sms(parcel);
            case 3:
                return new Barcode.UrlBookmark(parcel);
            case 4:
                return new Barcode.WiFi(parcel);
            case 5:
                return new nic(parcel);
            case 6:
                return new pxn(parcel);
            case 7:
                return new pxo(parcel);
            case 8:
                return new pxp(parcel);
            case 9:
                synchronized (pxs.k) {
                    pxsVar = pxs.j.isEmpty() ? new pxs() : (pxs) pxs.j.remove();
                    break;
                }
                pxsVar.c(parcel);
                return pxsVar;
            case 10:
                synchronized (pxr.b) {
                    pxrVar = pxr.a.isEmpty() ? new pxr() : (pxr) pxr.a.remove();
                    break;
                }
                pxrVar.c(parcel);
                return pxrVar;
            case 11:
                return new pxt(parcel);
            case 12:
                return new pxu(parcel);
            case 13:
                return new pxv(parcel);
            case 14:
                return new pxw(parcel);
            case 15:
                return new pxx(parcel);
            case 16:
                return new pyb(parcel);
            default:
                return new pyc(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Barcode.Phone[i];
            case 1:
                return new Barcode.PersonName[i];
            case 2:
                return new Barcode.Sms[i];
            case 3:
                return new Barcode.UrlBookmark[i];
            case 4:
                return new Barcode.WiFi[i];
            case 5:
                return new nic[i];
            case 6:
                return new pxn[i];
            case 7:
                return new pxo[i];
            case 8:
                return new pxp[i];
            case 9:
                return new pxs[i];
            case 10:
                return new pxr[i];
            case 11:
                return new pxt[i];
            case 12:
                return new pxu[i];
            case 13:
                return new pxv[i];
            case 14:
                return new pxw[i];
            case 15:
                return new pxx[i];
            case 16:
                return new pyb[i];
            default:
                return new pyc[i];
        }
    }
}
