package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qgd extends qdm {
    final qco e;

    public qgd(qbq qbqVar, qco qcoVar) {
        super(qbqVar);
        this.e = qcoVar;
    }

    @Override // defpackage.qbq
    public final void e(Object obj) {
        if (this.d) {
            return;
        }
        try {
            this.a.e(this.e.a(obj));
        } catch (Throwable th) {
            f(th);
        }
    }

    @Override // defpackage.qdl
    public final Object gS() {
        Object objGS = this.c.gS();
        if (objGS != null) {
            return this.e.a(objGS);
        }
        return null;
    }

    @Override // defpackage.qdh
    public final int k() {
        return 0;
    }
}
