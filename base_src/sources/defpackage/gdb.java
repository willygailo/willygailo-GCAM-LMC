package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gdb implements Runnable {
    public final /* synthetic */ gdd a;
    public final /* synthetic */ gdh b;
    private final /* synthetic */ int c;

    public /* synthetic */ gdb(gdd gddVar, gdh gdhVar, int i) {
        this.c = i;
        this.a = gddVar;
        this.b = gdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                gdd gddVar = this.a;
                gdh gdhVar = this.b;
                synchronized (gddVar.b) {
                    gdhVar.a = false;
                    gddVar.b.r();
                    break;
                }
                return;
            default:
                gdd gddVar2 = this.a;
                gdh gdhVar2 = this.b;
                synchronized (gddVar2.b) {
                    gddVar2.b.e.remove(gdhVar2);
                    gddVar2.b.d(gdhVar2.c);
                    gddVar2.b.r();
                    break;
                }
                return;
        }
    }
}
