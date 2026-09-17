package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.bottombar.R;
import com.google.lens.sdk.LensApi;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class khi extends kno {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final khi a = new khi(0);
    public static final Parcelable.Creator CREATOR = new sk(4);

    public khi(int i) {
        this(i, null, null);
    }

    public khi(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public khi(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public khi(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String a(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 22:
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            case 23:
                return "API_DISABLED";
            case 24:
                return "API_DISABLED_FOR_CONNECTION";
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                StringBuilder sb = new StringBuilder(31);
                sb.append("UNKNOWN_ERROR_CODE(");
                sb.append(i);
                sb.append(")");
                return sb.toString();
        }
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof khi)) {
            return false;
        }
        khi khiVar = (khi) obj;
        return this.c == khiVar.c && mip.dx(this.d, khiVar.d) && mip.dx(this.e, khiVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mip.dz("statusCode", a(this.c), arrayList);
        mip.dz("resolution", this.d, arrayList);
        mip.dz("message", this.e, arrayList);
        return mip.dy(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.b);
        mip.cA(parcel, 2, this.c);
        mip.cH(parcel, 3, this.d, i);
        mip.cI(parcel, 4, this.e);
        mip.cv(parcel, iCt);
    }
}
