package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class khg extends kno {
    public static final Parcelable.Creator CREATOR = new sk(3);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;
    public final Integer j;
    public final boolean k;
    public final int l;

    public khg(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i3;
        this.j = num;
        this.k = z3;
        this.l = i4;
    }

    @Deprecated
    public khg(String str, int i, String str2, String str3, int i2, EnumSet enumSet) {
        mip.dk(str);
        this.a = str;
        this.b = i;
        this.c = -1;
        this.g = str2;
        this.d = true != enumSet.contains(kgs.ACCOUNT_NAME) ? null : str3;
        this.e = null;
        this.f = enumSet.contains(kgs.ANDROID_ID);
        this.h = enumSet.equals(kgs.f);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        this.i = i3;
        this.j = null;
        int i4 = 0;
        this.k = false;
        if (!enumSet.equals(kgs.e)) {
            Iterator it = enumSet.iterator();
            int i5 = -1;
            while (it.hasNext()) {
                i5 &= ((kgs) it.next()).h ^ (-1);
            }
            i4 = i5;
        }
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof khg) {
            khg khgVar = (khg) obj;
            if (mip.dx(this.a, khgVar.a) && this.b == khgVar.b && this.c == khgVar.c && mip.dx(this.g, khgVar.g) && mip.dx(this.d, khgVar.d) && mip.dx(this.e, khgVar.e) && this.f == khgVar.f && this.h == khgVar.h && this.i == khgVar.i && mip.dx(this.j, khgVar.j) && this.k == khgVar.k && this.l == khgVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), Integer.valueOf(this.l)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.g + ",uploadAccount=" + this.d + ",loggingId=" + this.e + ",logAndroidId=" + this.f + ",isAnonymous=" + this.h + ",qosTier=" + this.i + ",appMobilespecId=" + this.j + ",scrubMccMnc=" + this.k + "piiLevelset=" + this.l + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cA(parcel, 3, this.b);
        mip.cA(parcel, 4, this.c);
        mip.cI(parcel, 5, this.d);
        mip.cI(parcel, 6, this.e);
        mip.cw(parcel, 7, this.f);
        mip.cI(parcel, 8, this.g);
        mip.cw(parcel, 9, this.h);
        mip.cA(parcel, 10, this.i);
        Integer num = this.j;
        if (num != null) {
            mip.cz(parcel, 11, 4);
            parcel.writeInt(num.intValue());
        }
        mip.cw(parcel, 12, this.k);
        mip.cA(parcel, 13, this.l);
        mip.cv(parcel, iCt);
    }
}
