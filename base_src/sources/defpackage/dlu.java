package defpackage;

import j$.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class dlu extends Exception {
    public final lju a;
    public final lvs b;
    public final long c;

    public dlu(lvs lvsVar, lju ljuVar, long j) {
        String string;
        String str = lvsVar.a;
        if (j == 0) {
            string = "before opening: ";
        } else {
            long millis = Duration.ofNanos(j).toMillis();
            StringBuilder sb = new StringBuilder(57);
            sb.append("after being open for ");
            sb.append(millis);
            sb.append(" milli seconds: ");
            string = sb.toString();
        }
        String strC = ljuVar.c();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(string).length() + String.valueOf(strC).length());
        sb2.append("Camera ");
        sb2.append(str);
        sb2.append(" encountered a fatal error ");
        sb2.append(string);
        sb2.append(strC);
        super(sb2.toString());
        this.b = lvsVar;
        this.a = ljuVar;
        this.c = j;
    }
}
