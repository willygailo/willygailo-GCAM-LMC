package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum hth {
    PHONE(0),
    EXT_WIRED(1),
    EXT_BLUETOOTH(2);

    public final int d;

    hth(int i) {
        this.d = i;
    }

    public static hth a(int i) {
        switch (i) {
            case 1:
                return EXT_WIRED;
            case 2:
                return EXT_BLUETOOTH;
            default:
                return PHONE;
        }
    }
}
