package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum hkc {
    OFF(0),
    AUTO(1),
    MACRO(2),
    CONTINUOUS_VIDEO(3),
    CONTINUOUS_PICTURE(4),
    EDOF(5);

    public static final Map g = new HashMap();
    public final int h;

    static {
        for (hkc hkcVar : values()) {
            g.put(Integer.valueOf(hkcVar.h), hkcVar);
        }
    }

    hkc(int i2) {
        this.h = i2;
    }
}
