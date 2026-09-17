package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class lka extends Exception {
    public final lju a;
    public final lvs b;
    public final boolean c;

    public lka(lvs lvsVar, lju ljuVar, boolean z) {
        String str = lvsVar.a;
        String str2 = true != z ? "before opening: " : "after open: ";
        String strC = ljuVar.c();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + str2.length() + String.valueOf(strC).length());
        sb.append("Camera ");
        sb.append(str);
        sb.append(" encountered a fatal error ");
        sb.append(str2);
        sb.append(strC);
        super(sb.toString());
        this.b = lvsVar;
        this.a = ljuVar;
        this.c = z;
    }
}
