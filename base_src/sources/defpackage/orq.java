package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class orq extends oob {
    static final orq a = new orq();
    final transient Object[] b;
    public final transient orq c;
    private final transient Object d;
    private final transient int e;
    private final transient int f;

    private orq() {
        this.d = null;
        this.b = new Object[0];
        this.e = 0;
        this.f = 0;
        this.c = this;
    }

    private orq(Object obj, Object[] objArr, int i, orq orqVar) {
        this.d = obj;
        this.b = objArr;
        this.e = 1;
        this.f = i;
        this.c = orqVar;
    }

    public orq(Object[] objArr, int i) {
        this.b = objArr;
        this.f = i;
        this.e = 0;
        int iB = i >= 2 ? ope.B(i) : 0;
        this.d = orw.f(objArr, i, iB, 0);
        this.c = new orq(orw.f(objArr, i, iB, 1), objArr, i, this);
    }

    @Override // defpackage.oob
    public final oob b() {
        return this.c;
    }

    @Override // defpackage.oob, defpackage.olt
    public final /* synthetic */ olt e() {
        return this.c;
    }

    @Override // defpackage.oor
    public final ope gJ() {
        return new ort(this, this.b, this.e, this.f);
    }

    @Override // defpackage.oor
    public final ope gK() {
        return new oru(this, new orv(this.b, this.e, this.f));
    }

    @Override // defpackage.oor
    public final boolean gM() {
        return false;
    }

    @Override // defpackage.oor, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object objG = orw.g(this.d, this.b, this.f, this.e, obj);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.f;
    }
}
