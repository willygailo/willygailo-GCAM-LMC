package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bmj implements fc {
    private final bmi a;
    private final bml b;
    private final fc c;

    public bmj(fc fcVar, bmi bmiVar, bml bmlVar) {
        this.c = fcVar;
        this.a = bmiVar;
        this.b = bmlVar;
    }

    @Override // defpackage.fc
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
        }
        if (objA instanceof bmk) {
            ((bmk) objA).f().a = false;
        }
        return objA;
    }

    @Override // defpackage.fc
    public final boolean b(Object obj) {
        if (obj instanceof bmk) {
            ((bmk) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
