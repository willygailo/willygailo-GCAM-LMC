package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ozz implements ppg {
    UNKNOWN_CAMERA_DIRECTION(0),
    FRONT(1),
    BACK(2);

    public final int d;

    ozz(int i) {
        this.d = i;
    }

    public static ozz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CAMERA_DIRECTION;
            case 1:
                return FRONT;
            case 2:
                return BACK;
            default:
                return null;
        }
    }

    public static ppi c() {
        return mfw.q;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
