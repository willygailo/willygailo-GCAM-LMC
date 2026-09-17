package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kmq {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    private final ComponentName f;

    public kmq(String str, String str2, boolean z) {
        mip.ds(str);
        this.b = str;
        mip.ds(str2);
        this.c = str2;
        this.f = null;
        this.d = 4225;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmq)) {
            return false;
        }
        kmq kmqVar = (kmq) obj;
        if (mip.dx(this.b, kmqVar.b) && mip.dx(this.c, kmqVar.c)) {
            ComponentName componentName = kmqVar.f;
            if (mip.dx(null, null)) {
                int i = kmqVar.d;
                if (this.e == kmqVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, 4225, Boolean.valueOf(this.e)});
    }

    public final String toString() {
        return this.b;
    }
}
