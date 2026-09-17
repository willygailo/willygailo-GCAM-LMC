package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class otn {
    public static final otn a = new otl(pfc.a);
    protected final pfc b;

    protected otn(pfc pfcVar) {
        this.b = pfcVar;
    }

    public static otn b(pfc pfcVar) {
        obr.aK(pfcVar.c == 1, "Expected seq of length 1, found ", pfcVar);
        return new otm(pfcVar);
    }

    public abstract int a(pfc pfcVar, int i);
}
