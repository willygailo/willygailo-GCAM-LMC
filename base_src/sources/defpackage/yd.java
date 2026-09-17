package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class yd {
    yf a;
    final /* synthetic */ ye b;

    public yd(ye yeVar) {
        this.b = yeVar;
    }

    public final String toString() {
        String string = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                String strValueOf = String.valueOf(string);
                float f = this.a.i[i];
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
                sb.append(strValueOf);
                sb.append(f);
                sb.append(" ");
                string = sb.toString();
            }
        }
        String strValueOf2 = String.valueOf(string);
        String strValueOf3 = String.valueOf(this.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 2 + String.valueOf(strValueOf3).length());
        sb2.append(strValueOf2);
        sb2.append("] ");
        sb2.append(strValueOf3);
        return sb2.toString();
    }
}
