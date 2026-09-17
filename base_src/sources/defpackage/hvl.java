package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvl {
    public lig a;
    public lig b;
    public lig c;

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("SelectedPictureSizes: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(strValueOf3);
        return sb.toString();
    }
}
