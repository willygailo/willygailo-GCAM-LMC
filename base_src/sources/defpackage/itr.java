package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum itr {
    UNKNOWN,
    OPTICAL_FLOW,
    GYRO,
    GPU_TEMPLATE,
    ML,
    HYBRID;

    public static itr a(int i) {
        switch (i) {
            case 1:
                return OPTICAL_FLOW;
            case 2:
                return GYRO;
            case 3:
                return GPU_TEMPLATE;
            case 4:
                return ML;
            case 5:
                return HYBRID;
            default:
                return UNKNOWN;
        }
    }
}
