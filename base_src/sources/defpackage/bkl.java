package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bkl {
    final Class a;
    final azv b;
    private final Class c;

    public bkl(Class cls, Class cls2, azv azvVar) {
        this.c = cls;
        this.a = cls2;
        this.b = azvVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
