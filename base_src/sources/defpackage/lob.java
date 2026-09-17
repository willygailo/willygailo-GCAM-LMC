package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lob implements Runnable {
    public final /* synthetic */ loi a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ lob(loi loiVar, long j, int i, int i2) {
        this.d = i2;
        this.a = loiVar;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                loi loiVar = this.a;
                loiVar.a.m(this.b, this.c);
                break;
            default:
                loi loiVar2 = this.a;
                loiVar2.a.fI(this.b, this.c);
                break;
        }
    }
}
