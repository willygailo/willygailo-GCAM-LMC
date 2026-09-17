package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class khk extends kno {
    public static final Parcelable.Creator CREATOR = new sk(5);
    public final String a;

    @Deprecated
    public final int b;
    private final long c;

    public khk(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public khk(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof khk) {
            khk khkVar = (khk) obj;
            String str = this.a;
            if (((str != null && str.equals(khkVar.a)) || (this.a == null && khkVar.a == null)) && a() == khkVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mip.dz("name", this.a, arrayList);
        mip.dz("version", Long.valueOf(a()), arrayList);
        return mip.dy(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 1, this.a);
        mip.cA(parcel, 2, this.b);
        mip.cB(parcel, 3, a());
        mip.cv(parcel, iCt);
    }
}
