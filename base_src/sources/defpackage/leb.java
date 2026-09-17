package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum leb {
    RES_UNKNOWN(-1, -1),
    RES_QCIF(176, 144),
    RES_QVGA(320, 240),
    RES_CIF(352, 288),
    RES_480P_4X3(640, 480),
    RES_480P(720, 480),
    RES_720P(1280, 720),
    RES_1080P(1920, 1080),
    RES_1080P_3X4(1080, 1440),
    RES_2160P(3840, 2160),
    RES_2160P_3X4(2272, 3024);

    public static final Map l = new HashMap();
    private final int n;
    private final int o;

    static {
        for (leb lebVar : values()) {
            l.put(new lig(lebVar.n, lebVar.o), lebVar);
        }
    }

    leb(int i, int i2) {
        this.n = i;
        this.o = i2;
    }

    public static Comparator d() {
        return new yc(9);
    }

    public final long a() {
        return ((long) this.n) * ((long) this.o);
    }

    public final lig c() {
        return new lig(this.n, this.o);
    }

    public final boolean e() {
        return this == RES_2160P;
    }
}
