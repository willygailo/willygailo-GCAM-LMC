package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nkz extends Exception {
    public final int a;

    private nkz(int i, String str) {
        super(str);
        this.a = i;
    }

    public static nkz a(int i, String str, Object... objArr) {
        String str2;
        Object[] objArr2 = new Object[2];
        switch (i) {
            case 1:
                str2 = "SSID_LENGTH_INVALID";
                break;
            case 2:
                str2 = "OPEN_NETWORK_HAS_PASSWORD";
                break;
            case 3:
                str2 = "SECURE_NETWORK_BUT_MISSING_PASSWORD";
                break;
            default:
                str2 = "PASSWORD_LENGTH_INVALID";
                break;
        }
        objArr2[0] = str2;
        objArr2[1] = String.format(str, objArr);
        return new nkz(i, String.format("Reason: %s. Additional details: %s", objArr2));
    }
}
