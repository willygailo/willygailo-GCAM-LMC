package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lwc {
    EXTENDED(128),
    FULL(2),
    SIMPLE(1),
    NONE(0);

    public final int e;

    lwc(int i) {
        this.e = i;
    }

    public static lwc a(int i) {
        switch (i) {
            case 1:
                return SIMPLE;
            case 2:
                return FULL;
            case 128:
                return EXTENDED;
            default:
                return NONE;
        }
    }
}
