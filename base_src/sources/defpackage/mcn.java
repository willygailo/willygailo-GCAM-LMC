package defpackage;

import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mcn {
    public final mcf a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public mcn() {
    }

    public mcn(mcf mcfVar, String str, String str2, String str3, String str4) {
        if (mcfVar == null) {
            throw new NullPointerException("Null directory");
        }
        this.a = mcfVar;
        if (str == null) {
            throw new NullPointerException("Null subpath");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null extension");
        }
        this.d = str3;
        this.e = str4;
    }

    public static mcn a(mcf mcfVar, String str, String str2, String str3, String str4) {
        boolean z = false;
        if (oje.d(str4) || "text/plain".equals(str4) || "application/octet-stream".equals(str4)) {
            z = true;
        } else {
            String strJ = mip.J(str3);
            if (strJ != null && strJ.equals(str4)) {
                z = true;
            }
        }
        obr.aF(z);
        obr.aN(mcfVar.c(str4), "Cannot publish %s to %s", str4, mcfVar);
        return new mcn(mcfVar, str, str2, str3, str4);
    }

    final File b(mcc mccVar) {
        File fileA = this.a.a(mccVar.a);
        if (!oje.d(this.b)) {
            fileA = new File(fileA, this.b);
        }
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return new File(fileA, sb.toString());
    }

    public final String c() {
        String strConcat = oje.d(this.b) ? "" : this.b.concat("/");
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(strConcat).length() + 1 + str.length() + str2.length());
        sb.append(strConcat);
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    final boolean d() {
        return this.a.b() && this.a.c(this.e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcn) {
            mcn mcnVar = (mcn) obj;
            if (this.a.equals(mcnVar.a) && this.b.equals(mcnVar.b) && this.c.equals(mcnVar.c) && this.d.equals(mcnVar.d) && this.e.equals(mcnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[5];
        objArr[0] = this.a.toString();
        objArr[1] = oje.d(this.b) ? "" : this.b.concat("/");
        objArr[2] = this.c;
        objArr[3] = this.d;
        objArr[4] = this.e;
        return String.format(locale, "%s/%s%s.%s (%s)", objArr);
    }
}
