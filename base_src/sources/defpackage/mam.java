package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mam {
    public final long a;
    public final long b;
    public final String c;
    public final mcj d;
    public final mce e;

    public mam() {
    }

    public mam(long j, long j2, String str, mcj mcjVar, mce mceVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = mcjVar;
        this.e = mceVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mam) {
            mam mamVar = (mam) obj;
            if (this.a == mamVar.a && this.b == mamVar.b && this.c.equals(mamVar.c) && this.d.equals(mamVar.d) && this.e.equals(mamVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.e.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String str = this.c;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + String.valueOf(strValueOf2).length());
        sb.append("MediaFileInfo{timestampNs=");
        sb.append(j);
        sb.append(", utcTimestampMs=");
        sb.append(j2);
        sb.append(", tag=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(strValueOf);
        sb.append(", fileObject=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
