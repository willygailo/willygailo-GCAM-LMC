package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kjg {
    public final kif a;
    private final int b;
    private final kid c;
    private final String d;

    public kjg(kif kifVar, kid kidVar, String str) {
        this.a = kifVar;
        this.c = kidVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{kifVar, kidVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kjg)) {
            return false;
        }
        kjg kjgVar = (kjg) obj;
        return mip.dx(this.a, kjgVar.a) && mip.dx(this.c, kjgVar.c) && mip.dx(this.d, kjgVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
