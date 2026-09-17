package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class v implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final p b;
    public final s c;
    public final s d;

    public v(String str, p pVar, s sVar, s sVar2) {
        this.a = str;
        this.b = pVar;
        this.c = sVar;
        this.d = sVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String strConcat;
        String str = this.a;
        String string = this.b.toString();
        s sVar = this.c;
        String strConcat2 = "";
        if (sVar == null) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(sVar.toString());
            strConcat = strValueOf.length() != 0 ? " ".concat(strValueOf) : new String(" ");
        }
        s sVar2 = this.d;
        if (sVar2 != null) {
            String strValueOf2 = String.valueOf(sVar2.toString());
            strConcat2 = strValueOf2.length() != 0 ? " ".concat(strValueOf2) : new String(" ");
        }
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(string).length() + String.valueOf(strConcat).length() + String.valueOf(strConcat2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        sb.append(strConcat);
        sb.append(strConcat2);
        return sb.toString();
    }
}
