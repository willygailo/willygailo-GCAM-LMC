package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class mcc {
    public final Context a;
    public final ContentResolver b;
    public final Uri c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;

    public mcc() {
    }

    public mcc(Context context, ContentResolver contentResolver, Uri uri, Uri uri2, String str, String str2, String str3, int i, int i2, String str4, String str5, int i3, int i4) {
        this.a = context;
        this.b = contentResolver;
        this.c = uri;
        this.d = uri2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.j = str4;
        this.k = str5;
        this.l = i3;
        this.m = i4;
    }

    public static mcb a(Context context) {
        mcb mcbVar = new mcb();
        mcbVar.a = context;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            throw new NullPointerException("Null contentResolver");
        }
        mcbVar.b = contentResolver;
        mcbVar.e = 0;
        mcbVar.d = 1;
        return mcbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcc) {
            mcc mccVar = (mcc) obj;
            if (this.a.equals(mccVar.a) && this.b.equals(mccVar.b) && this.c.equals(mccVar.c) && this.d.equals(mccVar.d) && this.e.equals(mccVar.e) && this.f.equals(mccVar.f) && this.g.equals(mccVar.g) && this.h == mccVar.h && this.i == mccVar.i && this.j.equals(mccVar.j) && this.k.equals(mccVar.k) && this.l == mccVar.l && this.m == mccVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        int i = this.h;
        int i2 = this.i;
        String str4 = this.j;
        String str5 = this.k;
        int i3 = this.l;
        int i4 = this.m;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(str2).length();
        int length7 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 305 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("ContentResolverApi{context=");
        sb.append(strValueOf);
        sb.append(", contentResolver=");
        sb.append(strValueOf2);
        sb.append(", photoInsertUri=");
        sb.append(strValueOf3);
        sb.append(", videoInsertUri=");
        sb.append(strValueOf4);
        sb.append(", displayNameColumnName=");
        sb.append(str);
        sb.append(", mimeTypeColumnName=");
        sb.append(str2);
        sb.append(", isPendingColumnName=");
        sb.append(str3);
        sb.append(", isPendingTrue=");
        sb.append(i);
        sb.append(", isPendingFalse=");
        sb.append(i2);
        sb.append(", relativePathColumnName=");
        sb.append(str4);
        sb.append(", mediaTypeColumnName=");
        sb.append(str5);
        sb.append(", mediaTypeImage=");
        sb.append(i3);
        sb.append(", mediaTypeVideo=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
