package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bfm {
    final Class a;
    final bfh b;
    private final Class c;

    public bfm(Class cls, Class cls2, bfh bfhVar) {
        this.c = cls;
        this.a = cls2;
        this.b = bfhVar;
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }
}
