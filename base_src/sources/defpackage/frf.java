package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class frf {
    public long d = 0;
    public long c = 0;
    public int b = 0;
    public int a = 0;

    public final frf a() {
        frf frfVar;
        synchronized (this) {
            frfVar = new frf();
            frfVar.a = this.a;
            frfVar.b = this.b;
            frfVar.c = this.c;
            frfVar.d = this.d;
        }
        return frfVar;
    }
}
