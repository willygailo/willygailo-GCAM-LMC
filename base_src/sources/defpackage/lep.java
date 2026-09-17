package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum lep {
    QUALITY_QCIF(2, leb.RES_QCIF),
    QUALITY_QVGA(7, leb.RES_QVGA),
    QUALITY_CIF(3, leb.RES_CIF),
    QUALITY_480P_4X3(4, leb.RES_480P_4X3),
    QUALITY_480P(4, leb.RES_480P),
    QUALITY_720P(5, leb.RES_720P),
    QUALITY_1080P(6, leb.RES_1080P),
    QUALITY_1080P_3X4(6, leb.RES_1080P_3X4),
    QUALITY_2160P(8, leb.RES_2160P),
    QUALITY_2160P_3X4(8, leb.RES_2160P_3X4);

    private static final Map m = new HashMap();
    private static final Map n = new HashMap();
    public final int k;
    public final leb l;

    static {
        for (lep lepVar : values()) {
            m.put(lepVar.l, lepVar);
            n.put(Integer.valueOf(lepVar.k), lepVar);
        }
    }

    lep(int i, leb lebVar) {
        this.k = i;
        this.l = lebVar;
    }

    public static lep a(leb lebVar) {
        return (lep) m.get(lebVar);
    }
}
