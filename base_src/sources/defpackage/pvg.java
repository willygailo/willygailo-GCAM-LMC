package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class pvg {
    public final int a;
    public final pvf b;
    public final InputStream c;

    public pvg(int i, pvf pvfVar, InputStream inputStream) {
        this.a = i;
        this.b = pvfVar;
        this.c = inputStream;
    }

    public final String a() {
        String strConcat;
        String strA = this.b.a("X-GUploader-UploadID");
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        if (strA == null) {
            strConcat = "\n No upload id.";
        } else {
            strConcat = strA.length() != 0 ? "\n Upload id: ".concat(strA) : new String("\n Upload id: ");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30 + String.valueOf(strConcat).length());
        sb.append("HttpResponse:\n   ");
        sb.append(i);
        sb.append("  ");
        sb.append(strValueOf);
        sb.append(strConcat);
        return sb.toString();
    }
}
