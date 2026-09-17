package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum jbp {
    OFF(0),
    THREE_BY_THREE(1),
    FOUR_BY_FOUR(2),
    GOLDEN_RATIO(3);

    public final int e;

    jbp(int i) {
        this.e = i;
    }

    public static jbp a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return THREE_BY_THREE;
            case 2:
                return FOUR_BY_FOUR;
            case 3:
                return GOLDEN_RATIO;
            default:
                return OFF;
        }
    }
}
