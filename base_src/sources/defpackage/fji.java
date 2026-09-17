package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fji {
    public static int a = 0;

    public static synchronized void a(ddf ddfVar) {
        int iIntValue = ((Integer) ddfVar.a(ddl.l).c()).intValue();
        a = iIntValue;
        obr.aK(iIntValue >= 0, "Key %s must be set to a value >=0", ddl.l);
    }
}
