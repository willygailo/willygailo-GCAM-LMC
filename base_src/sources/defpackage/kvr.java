package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kvr extends kno {
    public static final Parcelable.Creator CREATOR = new ktu(8);
    public final String a;
    public final byte[] b;
    public final List c;

    public kvr(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvr)) {
            return false;
        }
        kvr kvrVar = (kvr) obj;
        return mip.dx(this.a, kvrVar.a) && mip.dx(this.b, kvrVar.b) && mip.dx(this.c, kvrVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 1, this.a);
        mip.cD(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int iCu = mip.cu(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        mip.cv(parcel, iCu);
        mip.cv(parcel, iCt);
    }
}
