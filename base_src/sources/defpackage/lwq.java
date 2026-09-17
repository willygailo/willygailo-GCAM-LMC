package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lwq extends maa {
    final /* synthetic */ lwr a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwq(lwr lwrVar, mad madVar) {
        super(madVar);
        this.a = lwrVar;
        this.b = false;
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this.a.a) {
            z = true;
            if (this.b) {
                z = false;
            } else {
                this.b = true;
            }
        }
        if (z) {
            super.close();
            synchronized (this.a.a) {
                this.a.b--;
            }
        }
    }
}
