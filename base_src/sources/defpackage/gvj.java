package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gvj implements Runnable {
    public final /* synthetic */ gvk a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvj(gvk gvkVar, int i) {
        this.b = i;
        this.a = gvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                final gvk gvkVar = this.a;
                gvh.c(gvkVar.a);
                gvkVar.c.a(new bur() { // from class: gvi
                    @Override // defpackage.bur
                    public final void a(Throwable th) {
                        gvkVar.a();
                    }
                });
                enl.e(gvkVar.d, gvkVar.b, gvkVar);
                break;
            default:
                gvh.a(this.a.a);
                break;
        }
    }
}
