package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class pxc {
    public static final pxc a = a("1.218.0");
    public static final pxc b = a("1.81.0");
    public final int c;
    public final int d;
    public final int e;

    public pxc(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static pxc a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(str);
        if (matcher.matches()) {
            return new pxc(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
        }
        Log.w("Version", str.length() != 0 ? "Failed to parse version from: ".concat(str) : new String("Failed to parse version from: "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pxc)) {
            return false;
        }
        pxc pxcVar = (pxc) obj;
        return this.c == pxcVar.c && this.d == pxcVar.d && this.e == pxcVar.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        return String.format("%d.%d.%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
