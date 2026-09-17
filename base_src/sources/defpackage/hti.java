package defpackage;

import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public enum hti {
    OFF(0),
    THREE(3),
    TEN(10),
    AUTO(-1);

    public final int g;
    public static final hti e = OFF;
    public static final int[] f = new int[values().length];

    static {
        int i = 0;
        hti[] htiVarArrValues = values();
        int length = htiVarArrValues.length;
        int i2 = 0;
        while (i < length) {
            f[i2] = htiVarArrValues[i].g;
            i++;
            i2++;
        }
    }

    hti(int i) {
        this.g = i;
    }

    public static hti a(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return AUTO;
            case 0:
                return OFF;
            case 3:
                return THREE;
            case 10:
                return TEN;
            default:
                return e;
        }
    }
}
