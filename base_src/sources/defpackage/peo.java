package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum peo implements ppg {
    NO_STABILIZATION(0),
    STEADY_FACE(1),
    STANDARD(2),
    CINEMATIC(3),
    LOCKED(4),
    ACTIVE(5);

    public final int g;

    peo(int i) {
        this.g = i;
    }

    public static peo b(int i) {
        switch (i) {
            case 0:
                return NO_STABILIZATION;
            case 1:
                return STEADY_FACE;
            case 2:
                return STANDARD;
            case 3:
                return CINEMATIC;
            case 4:
                return LOCKED;
            case 5:
                return ACTIVE;
            default:
                return null;
        }
    }

    public static ppi c() {
        return pdq.u;
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
