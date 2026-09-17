package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class epz {
    public esj a;
    public final /* synthetic */ eqa b;
    private final pih c;

    public epz(eqa eqaVar, pih pihVar) {
        this.b = eqaVar;
        this.c = pihVar;
    }

    public final void a() {
        this.c.o(true);
        synchronized (this.b) {
            this.b.h = false;
            esj esjVar = this.a;
            if (esjVar != null) {
                esjVar.d(false);
                this.b.k = null;
            }
        }
    }
}
