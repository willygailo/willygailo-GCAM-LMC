package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum len {
    QUALITY_480P(2002, leb.RES_480P),
    QUALITY_720P(2003, leb.RES_720P),
    QUALITY_1080P(2004, leb.RES_1080P),
    QUALITY_2160P(2005, leb.RES_2160P);

    private static final Map f = new HashMap();
    private static final Map g = new HashMap();
    public final int e;
    private final leb i;

    static {
        for (len lenVar : values()) {
            f.put(lenVar.i, lenVar);
            g.put(Integer.valueOf(lenVar.e), lenVar);
        }
    }

    len(int i, leb lebVar) {
        this.e = i;
        this.i = lebVar;
    }

    public static len a(leb lebVar) {
        return (len) f.get(lebVar);
    }
}
