package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ljr implements Runnable {
    public final /* synthetic */ ljs a;
    public final /* synthetic */ llg b;
    private final /* synthetic */ int c;

    public /* synthetic */ ljr(ljs ljsVar, llg llgVar, int i) {
        this.c = i;
        this.a = ljsVar;
        this.b = llgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ljs ljsVar = this.a;
                ljsVar.b.remove(this.b);
                break;
            default:
                ljs ljsVar2 = this.a;
                llg llgVar = this.b;
                ljsVar2.b.add(llgVar);
                llgVar.a(ljsVar2.c);
                break;
        }
    }
}
