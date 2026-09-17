package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum ldw {
    AAC(3, ldy.AAC),
    AAC_ELD(5, ldy.AAC),
    HE_AAC(4, ldy.AAC),
    AMR_NB(1, ldy.AMR_NB),
    AMR_WB(2, ldy.AMR_WB),
    VORBIS(6, ldy.VORBIS);

    private static final Map i = new HashMap();
    public final int g;
    public final ldy h;

    static {
        for (ldw ldwVar : values()) {
            i.put(Integer.valueOf(ldwVar.g), ldwVar);
        }
    }

    ldw(int i2, ldy ldyVar) {
        this.g = i2;
        this.h = ldyVar;
    }

    public static ldw a(int i2) {
        ldw ldwVar = (ldw) i.get(Integer.valueOf(i2));
        if (ldwVar != null) {
            return ldwVar;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("unknown CamcorderProfile value: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
