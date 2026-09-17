package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qdo implements qdg {
    public final qbq a;
    public final Object[] b;
    int c;
    public boolean d;
    public volatile boolean e;

    public qdo() {
    }

    public qdo(qbq qbqVar, Object[] objArr) {
        this.a = qbqVar;
        this.b = objArr;
    }

    @Override // defpackage.qdl
    public final void c() {
        this.c = 2;
    }

    @Override // defpackage.qdl
    public final Object gS() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == 2) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        qmd.W(obj, "The array element is null");
        return obj;
    }

    @Override // defpackage.qbz
    public final void gT() {
        this.e = true;
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.c == 2;
    }

    @Override // defpackage.qdh
    public final int k() {
        this.d = true;
        return 1;
    }
}
