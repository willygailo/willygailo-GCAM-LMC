package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class gtl {
    public final gtv a;
    public final int b;
    private final int c;
    private final int d;
    private final String e;
    private final String f;

    public gtl(gtv gtvVar, int i, int i2, int i3) {
        this.a = gtvVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = "";
        this.f = "";
    }

    public gtl(gtv gtvVar, String str, String str2) {
        this.a = gtvVar;
        this.b = R.drawable.gm_filled_bluetooth_connected_white_24;
        this.c = 0;
        this.d = 0;
        this.e = str;
        this.f = str2;
    }

    public final String a(Resources resources) {
        return !this.f.isEmpty() ? this.f : resources.getString(this.d);
    }

    public final String b(Resources resources) {
        return !this.e.isEmpty() ? this.e : resources.getString(this.c);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof gtl) && this.a == ((gtl) obj).a;
    }

    public final int hashCode() {
        return this.b;
    }
}
