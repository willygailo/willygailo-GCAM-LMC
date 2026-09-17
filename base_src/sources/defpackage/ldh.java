package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ldh implements Runnable {
    public final /* synthetic */ ldi a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldh(ldi ldiVar, int i) {
        this.b = i;
        this.a = ldiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ldi ldiVar = this.a;
                int i = ldiVar.a - 1;
                ldiVar.a = i;
                if (i == 0 && ldiVar.e != null) {
                    ldiVar.c(ldiVar.e);
                    ldiVar.e = null;
                    break;
                }
                break;
            default:
                this.a.a++;
                break;
        }
    }
}
