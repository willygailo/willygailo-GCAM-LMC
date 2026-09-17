package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bjh {
    final Class a;
    public final Class b;
    public final bjg c;

    public bjh(Class cls, Class cls2, bjg bjgVar) {
        this.a = cls;
        this.b = cls2;
        this.c = bjgVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
    }
}
