package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pbq implements ppg {
    UNKNOWN_STATUS(0),
    NOT_HEEDED(2),
    HEEDED(1);

    public final int d;

    pbq(int i) {
        this.d = i;
    }

    public static pbq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return HEEDED;
            case 2:
                return NOT_HEEDED;
            default:
                return null;
        }
    }

    public static ppi c() {
        return pbp.c;
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
