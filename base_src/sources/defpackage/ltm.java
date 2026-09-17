package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ltm {
    public final int a;
    public final Set b;
    public final Set c;
    public final Set d;
    private final int e;

    public ltm(int i, Set set, Set set2, Set set3) {
        int i2;
        this.a = i;
        this.b = ope.F(set);
        this.d = ope.F(set2);
        this.c = ope.F(set3);
        synchronized (lrv.class) {
            i2 = lrv.f;
            lrv.f = i2 + 1;
        }
        this.e = i2;
    }

    public final String toString() {
        int i = this.e;
        StringBuilder sb = new StringBuilder(19);
        sb.append("Request-");
        sb.append(i);
        return sb.toString();
    }
}
