package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum esn {
    AUTO,
    LANDSCAPE,
    ACTION;

    public static esn a(int i) {
        switch (i) {
            case 1:
                return LANDSCAPE;
            case 2:
                return ACTION;
            default:
                return AUTO;
        }
    }
}
