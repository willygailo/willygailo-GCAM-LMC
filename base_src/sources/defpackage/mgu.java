package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mgu {
    public final mhe a;
    public final List b;
    public final mgw c;

    public mgu() {
    }

    public mgu(mhe mheVar, List list, mgw mgwVar) {
        this.a = mheVar;
        this.b = list;
        this.c = mgwVar;
    }

    public static mgt a() {
        mgt mgtVar = new mgt();
        mgtVar.c(mgw.b);
        return mgtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgu) {
            mgu mguVar = (mgu) obj;
            if (this.a.equals(mguVar.a) && this.b.equals(mguVar.b) && this.c.equals(mguVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        mhe mheVar = this.a;
        int iB = mheVar.aD;
        if (iB == 0) {
            iB = pqu.a.b(mheVar).b(mheVar);
            mheVar.aD = iB;
        }
        int iHashCode = (((iB ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        mgw mgwVar = this.c;
        int iB2 = mgwVar.aD;
        if (iB2 == 0) {
            iB2 = pqu.a.b(mgwVar).b(mgwVar);
            mgwVar.aD = iB2;
        }
        return iHashCode ^ iB2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("LinkPresentationResult{linkDataResult=");
        sb.append(strValueOf);
        sb.append(", linkChipResult=");
        sb.append(strValueOf2);
        sb.append(", linkChipResultMetadata=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
