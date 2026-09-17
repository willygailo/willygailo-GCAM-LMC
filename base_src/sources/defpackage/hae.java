package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hae {
    private final ely a;
    private final ely b;
    private final pyn c;
    private final boolean d;

    public hae(pyn pynVar, pyn pynVar2, pyn pynVar3, ojc ojcVar) {
        this.a = ely.a(pynVar);
        this.b = ely.a(pynVar2);
        this.c = pynVar3;
        this.d = ((Boolean) ojcVar.e(false)).booleanValue();
    }

    public final goy a(goy goyVar) {
        return !this.d ? goyVar : new haf(goyVar, this.a, this.b, (hen) this.c.get());
    }
}
