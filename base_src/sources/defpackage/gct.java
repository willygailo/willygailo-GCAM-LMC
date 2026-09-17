package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gct implements Runnable {
    public final /* synthetic */ gdj a;
    public final /* synthetic */ gew b;
    public final /* synthetic */ gog c;
    private final /* synthetic */ int d;

    public /* synthetic */ gct(gdj gdjVar, gew gewVar, gog gogVar, int i) {
        this.d = i;
        this.a = gdjVar;
        this.b = gewVar;
        this.c = gogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.a.l(this.b, this.c);
                break;
            default:
                this.a.j(this.b, this.c);
                break;
        }
    }
}
