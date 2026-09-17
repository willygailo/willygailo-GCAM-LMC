package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pef implements ppg {
    UNKNOWN(0),
    SLOWEST(1),
    SLOW(2),
    LITTLE_FAST(3),
    FAST(4),
    FASTEST(5);

    public final int g;

    pef(int i) {
        this.g = i;
    }

    public static pef b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SLOWEST;
            case 2:
                return SLOW;
            case 3:
                return LITTLE_FAST;
            case 4:
                return FAST;
            case 5:
                return FASTEST;
            default:
                return null;
        }
    }

    public static ppi c() {
        return pdq.p;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
