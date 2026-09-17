package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final class ui implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akr(1);
    public final int a;
    public final Intent b;

    public ui(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public ui(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        int i = this.a;
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                strValueOf = "RESULT_OK";
                break;
            case 0:
                strValueOf = "RESULT_CANCELED";
                break;
            default:
                strValueOf = String.valueOf(i);
                break;
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b == null ? 0 : 1);
        Intent intent = this.b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
