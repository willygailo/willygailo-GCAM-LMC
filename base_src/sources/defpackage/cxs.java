package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxs {
    public final cxy a;
    public int b;
    public int c;
    public int d;

    public cxs(cxy cxyVar) {
        this.a = cxyVar;
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("Reason", this.a);
        ojbVarAZ.e("Impressions before reboot", this.b);
        ojbVarAZ.e("Impressions after reboot", this.c);
        ojbVarAZ.e("Reboot count", this.d);
        return ojbVarAZ.toString();
    }
}
