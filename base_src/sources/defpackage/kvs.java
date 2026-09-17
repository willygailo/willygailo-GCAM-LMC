package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kvs extends kno {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new kvs(null, false, false);
        CREATOR = new ktu(9);
    }

    public kvs(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvs)) {
            return false;
        }
        kvs kvsVar = (kvs) obj;
        return mip.dx(this.c, kvsVar.c) && mip.dx(Boolean.valueOf(this.a), Boolean.valueOf(kvsVar.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cM(parcel, 1, new ArrayList(this.c));
        mip.cw(parcel, 2, this.a);
        mip.cw(parcel, 3, this.b);
        mip.cv(parcel, iCt);
    }
}
