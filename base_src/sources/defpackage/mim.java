package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum mim implements ppg {
    UNKNOWN(0),
    OPEN(1),
    WPA(2),
    WEP(3),
    UNRECOGNIZED(-1);

    private final int f;

    mim(int i) {
        this.f = i;
    }

    public static mim b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OPEN;
            case 2:
                return WPA;
            case 3:
                return WEP;
            default:
                return null;
        }
    }

    @Override // defpackage.ppg
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
