package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class mdo {
    public final Context a;
    public final ojc b;
    public final boolean c;
    private final ojc d;

    public mdo() {
    }

    public mdo(Context context, ojc ojcVar, ojc ojcVar2, boolean z) {
        this.a = context;
        this.d = ojcVar;
        this.b = ojcVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mdo) {
            mdo mdoVar = (mdo) obj;
            if (this.a.equals(mdoVar.a) && this.d.equals(mdoVar.d) && this.b.equals(mdoVar.b) && this.c == mdoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        boolean z = this.c;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("CollectionBasisContext{context=");
        sb.append(strValueOf);
        sb.append(", accountNames=");
        sb.append(strValueOf2);
        sb.append(", stacktrace=");
        sb.append(strValueOf3);
        sb.append(", googlerOverridesCheckbox=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
