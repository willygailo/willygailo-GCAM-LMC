package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ktn extends kno implements Comparable {
    public static final Parcelable.Creator CREATOR = new kpg(17);
    public final int a;
    public final kts[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public ktn(int i, kts[] ktsVarArr, String[] strArr) {
        this.a = i;
        this.b = ktsVarArr;
        for (kts ktsVar : ktsVarArr) {
            this.d.put(ktsVar.a, ktsVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((ktn) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ktn) {
            ktn ktnVar = (ktn) obj;
            if (this.a == ktnVar.a && mip.ce(this.d, ktnVar.d) && Arrays.equals(this.c, ktnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((kts) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 2, this.a);
        mip.cL(parcel, 3, this.b, i);
        mip.cJ(parcel, 4, this.c);
        mip.cv(parcel, iCt);
    }
}
