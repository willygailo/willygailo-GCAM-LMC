package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lyu extends lyw {
    public double a = 1.0d;
    public double b;
    public double c;
    public double d;
    public double e;

    public lyu(double d) {
        this.b = d;
        this.c = d;
        this.d = d;
        this.e = d;
    }

    @Override // defpackage.lyw
    public final lyw a() {
        lyu lyuVar = new lyu(this.e);
        lyuVar.a = this.a;
        lyuVar.b = this.b;
        lyuVar.c = this.c;
        lyuVar.d = this.d;
        lyuVar.e = this.e;
        return lyuVar;
    }
}
