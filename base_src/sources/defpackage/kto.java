package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kto extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(18);
    public final String a;
    public final byte[] b;
    public final String c;
    public final ktn[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public kto(String str, String str2, ktn[] ktnVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = ktnVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (ktn ktnVar : ktnVarArr) {
            this.e.put(Integer.valueOf(ktnVar.a), ktnVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kto) {
            kto ktoVar = (kto) obj;
            if (mip.ce(this.a, ktoVar.a) && mip.ce(this.c, ktoVar.c) && this.e.equals(ktoVar.e) && this.f == ktoVar.f && Arrays.equals(this.b, ktoVar.b) && this.g == ktoVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((ktn) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cI(parcel, 3, this.c);
        mip.cL(parcel, 4, this.d, i);
        mip.cw(parcel, 5, this.f);
        mip.cD(parcel, 6, this.b);
        mip.cB(parcel, 7, this.g);
        mip.cv(parcel, iCt);
    }
}
