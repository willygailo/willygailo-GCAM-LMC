package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum mhy implements ppg {
    UNKNOWN_DYNAMIC_LOADING_MODE(0),
    ENABLED(1),
    DISABLED(2),
    ARCORE_ONLY(3),
    PLAYGROUND_ONLY(4);

    public final int f;

    mhy(int i) {
        this.f = i;
    }

    public static mhy b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DYNAMIC_LOADING_MODE;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return ARCORE_ONLY;
            case 4:
                return PLAYGROUND_ONLY;
            default:
                return null;
        }
    }

    public static ppi c() {
        return mfw.e;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
