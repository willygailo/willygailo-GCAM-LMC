package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class atn {
    public final /* synthetic */ String a;
    final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ att d;

    public atn(String str, String str2, String str3, att attVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = attVar;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.a;
        String strValueOf = String.valueOf(this.d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 14 + length2 + str3.length() + String.valueOf(strValueOf).length());
        sb.append(str);
        sb.append(str2);
        sb.append(" NS(");
        sb.append(str3);
        sb.append("), FORM (");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
