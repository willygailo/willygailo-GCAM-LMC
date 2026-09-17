package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lpd {
    public final Set a;
    public final Set b;
    public final Set c;
    private final int d;

    public lpd(Set set, Set set2, Set set3) {
        int i;
        this.a = set;
        this.b = set2;
        this.c = set3;
        synchronized (lrv.class) {
            i = lrv.e;
            lrv.e = i + 1;
        }
        this.d = i;
    }

    public final Set a() {
        return ope.F(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lpd)) {
            return false;
        }
        lpd lpdVar = (lpd) obj;
        return obr.bc(this.a, lpdVar.a) && obr.bc(this.c, lpdVar.c) && obr.bc(this.b, lpdVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        int i = this.d;
        StringBuilder sb = new StringBuilder(24);
        sb.append("FrameRequest-");
        sb.append(i);
        return sb.toString();
    }
}
