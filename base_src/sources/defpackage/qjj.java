package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qjj extends qjh {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final qym b;
    protected Object c;

    public qjj(qym qymVar) {
        this.b = qymVar;
    }

    @Override // defpackage.qdl
    public final void c() {
        lazySet(32);
        this.c = null;
    }

    public void g() {
        set(4);
        this.c = null;
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        Object obj;
        if (qjn.d(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.c) == null) {
                        return;
                    }
                    this.c = null;
                    qym qymVar = this.b;
                    qymVar.e(obj);
                    if (get() != 4) {
                        qymVar.gO();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // defpackage.qdl
    public final Object gS() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return get() != 16;
    }

    @Override // defpackage.qdh
    public final int k() {
        lazySet(8);
        return 2;
    }
}
