package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ngy extends Exception {
    public final int a;
    private final String b;

    public ngy(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Error type: ");
        switch (this.a) {
            case 1:
                str = "INVALID_COUNTRY_CODE";
                break;
            case 2:
                str = "NOT_A_NUMBER";
                break;
            case 3:
                str = "TOO_SHORT_AFTER_IDD";
                break;
            case 4:
                str = "TOO_SHORT_NSN";
                break;
            case 5:
                str = "TOO_LONG";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append(". ");
        sb.append(this.b);
        return sb.toString();
    }
}
