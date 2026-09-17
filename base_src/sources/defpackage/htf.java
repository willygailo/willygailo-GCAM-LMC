package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum htf {
    OFF(0),
    ON_LIGHT(1),
    ON_STRONG(2),
    DEBUG_MAX(3),
    ON_ADAPTIVE(4);

    public final int f;

    htf(int i) {
        this.f = i;
    }

    public static htf a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return ON_LIGHT;
            case 2:
                return ON_STRONG;
            case 3:
                return DEBUG_MAX;
            case 4:
                return ON_ADAPTIVE;
            default:
                throw new IllegalArgumentException("Unknown beautification level");
        }
    }

    public final boolean b() {
        return this != OFF;
    }
}
