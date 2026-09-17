package defpackage;

/* JADX INFO: renamed from: new, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class Cnew extends RuntimeException {
    public final int a;

    public Cnew(int i, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 13);
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }
}
