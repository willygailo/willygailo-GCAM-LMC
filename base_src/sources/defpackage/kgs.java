package defpackage;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes2.dex */
public enum kgs {
    ZWIEBACK(2),
    ANDROID_ID(4),
    GAIA(8),
    ACCOUNT_NAME(16);

    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public final int h;

    static {
        kgs kgsVar = ZWIEBACK;
        e = EnumSet.allOf(kgs.class);
        f = EnumSet.noneOf(kgs.class);
        g = EnumSet.of(kgsVar);
    }

    kgs(int i2) {
        this.h = i2;
    }
}
