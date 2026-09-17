package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gvd implements Runnable {
    public final /* synthetic */ lzb a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvd(lzb lzbVar, int i) {
        this.b = i;
        this.a = lzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                lzb lzbVar = this.a;
                synchronized (lzbVar.c) {
                    lzbVar.h++;
                    lzbVar.d.enable();
                    break;
                }
                return;
            default:
                lzb lzbVar2 = this.a;
                synchronized (lzbVar2.c) {
                    int i = lzbVar2.h;
                    if (i > 0) {
                        i--;
                        lzbVar2.h = i;
                    }
                    if (i == 0) {
                        lzbVar2.d.disable();
                    }
                    break;
                }
                return;
        }
    }
}
