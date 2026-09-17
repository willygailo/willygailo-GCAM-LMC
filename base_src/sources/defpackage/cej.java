package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class cej {
    public final String a;
    public final boolean b;
    private final Uri c;

    public cej() {
    }

    public cej(Uri uri, String str, boolean z) {
        this.c = uri;
        this.a = str;
        this.b = z;
    }

    public static cei a() {
        return new cei();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cej) {
            cej cejVar = (cej) obj;
            if (this.c.equals(cejVar.c) && this.a.equals(cejVar.a) && this.b == cejVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48 + String.valueOf(str).length());
        sb.append("MediaRecordInfo{uri=");
        sb.append(strValueOf);
        sb.append(", mediaId=");
        sb.append(str);
        sb.append(", isDeleted=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
