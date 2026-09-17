package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bms implements Runnable {
    public final /* synthetic */ bmt a;
    private final /* synthetic */ int b;

    public /* synthetic */ bms(bmt bmtVar, int i) {
        this.b = i;
        this.a = bmtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bmt bmtVar = this.a;
                bmtVar.a.h();
                bmtVar.c.c();
                break;
            default:
                bmt bmtVar2 = this.a;
                bnl bnlVar = bmtVar2.a;
                ddf ddfVar = bmtVar2.b;
                ddg ddgVar = dde.a;
                ddfVar.b();
                bnlVar.o();
                break;
        }
    }
}
