package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qyd implements ppg {
    UNKNOWN(0),
    CREDENTIAL_ENCRYPTED(1),
    DEVICE_ENCRYPTED(2);

    public final int d;

    qyd(int i) {
        this.d = i;
    }

    public static qyd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CREDENTIAL_ENCRYPTED;
            case 2:
                return DEVICE_ENCRYPTED;
            default:
                return null;
        }
    }

    public static ppi c() {
        return qxm.f;
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
