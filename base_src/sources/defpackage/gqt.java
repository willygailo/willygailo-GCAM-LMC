package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum gqt {
    AUTO("auto", 2),
    OFF("off", 1),
    ON("on", 3);

    public final String d;
    public final int e;

    gqt(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public static gqt a(String str, gqt gqtVar) {
        str.getClass();
        gqt gqtVar2 = AUTO;
        if (gqtVar2.d.equals(str)) {
            return gqtVar2;
        }
        gqt gqtVar3 = OFF;
        if (gqtVar3.d.equals(str)) {
            return gqtVar3;
        }
        gqt gqtVar4 = ON;
        return gqtVar4.d.equals(str) ? gqtVar4 : gqtVar;
    }
}
