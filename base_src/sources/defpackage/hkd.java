package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum hkd {
    INACTIVE(0),
    PASSIVE_SCAN(1),
    PASSIVE_FOCUSED(2),
    ACTIVE_SCAN(3),
    FOCUSED_LOCKED(4),
    NOT_FOCUSED_LOCKED(5),
    PASSIVE_UNFOCUSED(6);

    private static final Map i = new HashMap();
    public final int h;

    static {
        for (hkd hkdVar : values()) {
            i.put(Integer.valueOf(hkdVar.h), hkdVar);
        }
    }

    hkd(int i2) {
        this.h = i2;
    }

    public static hkd a(int i2) {
        hkd hkdVar = (hkd) i.get(Integer.valueOf(i2));
        if (hkdVar != null) {
            return hkdVar;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("unknown metadata value: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean b() {
        return this == PASSIVE_FOCUSED || this == PASSIVE_UNFOCUSED || this == FOCUSED_LOCKED || this == NOT_FOCUSED_LOCKED || this == INACTIVE;
    }
}
