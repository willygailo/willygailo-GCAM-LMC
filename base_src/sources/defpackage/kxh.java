package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class kxh extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(17);
    final kxi a;
    final int b;
    final int c;
    final int d;

    public kxh(kxi kxiVar, int i, int i2, int i3) {
        this.a = kxiVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(kwh kwhVar) {
        int i = this.b;
        switch (i) {
            case 1:
                kwhVar.b(this.a);
                break;
            case 2:
                kwhVar.c(this.a);
                break;
            case 3:
                kwhVar.d(this.a);
                break;
            case 4:
                kwhVar.e(this.a);
                break;
            default:
                StringBuilder sb = new StringBuilder(25);
                sb.append("Unknown type: ");
                sb.append(i);
                Log.w("ChannelEventParcelable", sb.toString());
                break;
        }
    }

    public final String toString() {
        String string;
        String string2;
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        switch (i) {
            case 1:
                string = "CHANNEL_OPENED";
                break;
            case 2:
                string = "CHANNEL_CLOSED";
                break;
            case 3:
                string = "INPUT_CLOSED";
                break;
            case 4:
                string = "OUTPUT_CLOSED";
                break;
            default:
                string = Integer.toString(i);
                break;
        }
        int i2 = this.c;
        switch (i2) {
            case 0:
                string2 = "CLOSE_REASON_NORMAL";
                break;
            case 1:
                string2 = "CLOSE_REASON_DISCONNECTED";
                break;
            case 2:
                string2 = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            case 3:
                string2 = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            default:
                string2 = Integer.toString(i2);
                break;
        }
        int i3 = this.d;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(strValueOf);
        sb.append(", type=");
        sb.append(string);
        sb.append(", closeReason=");
        sb.append(string2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 2, this.a, i);
        mip.cA(parcel, 3, this.b);
        mip.cA(parcel, 4, this.c);
        mip.cA(parcel, 5, this.d);
        mip.cv(parcel, iCt);
    }
}
