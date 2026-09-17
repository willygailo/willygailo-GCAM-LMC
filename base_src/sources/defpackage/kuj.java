package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kuj implements kid {
    public static final kuj a = new kuj();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final String f = null;
    private final String g = null;
    private final Long i = null;
    private final Long j = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kuj)) {
            return false;
        }
        kuj kujVar = (kuj) obj;
        boolean z = kujVar.b;
        boolean z2 = kujVar.c;
        String str = kujVar.d;
        if (mip.dx(null, null)) {
            boolean z3 = kujVar.e;
            boolean z4 = kujVar.h;
            String str2 = kujVar.f;
            if (mip.dx(null, null)) {
                String str3 = kujVar.g;
                if (mip.dx(null, null)) {
                    Long l = kujVar.i;
                    if (mip.dx(null, null)) {
                        Long l2 = kujVar.j;
                        if (mip.dx(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
