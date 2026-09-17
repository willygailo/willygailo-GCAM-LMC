package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum hte {
    ON(0),
    ON_LOCKED(1),
    OFF_NEAR(2),
    OFF_FAR(3),
    OFF_INFINITY(4);

    public final int f;

    hte(int i) {
        this.f = i;
    }

    public static hte a(int i) {
        switch (i) {
            case 1:
                return ON_LOCKED;
            case 2:
                return OFF_NEAR;
            case 3:
                return OFF_FAR;
            case 4:
                return OFF_INFINITY;
            default:
                return ON;
        }
    }

    public final int b() {
        leb lebVar = leb.RES_UNKNOWN;
        switch (this) {
            case ON:
                return 2;
            case ON_LOCKED:
                return 3;
            case OFF_NEAR:
                return 4;
            case OFF_FAR:
                return 5;
            case OFF_INFINITY:
                return 6;
            default:
                return 1;
        }
    }
}
