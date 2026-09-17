package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nhx {
    public static final nhx a;
    public final boolean b;
    public final boolean c;
    public final oom d;

    static {
        nhw nhwVarA = a();
        nhwVarA.b();
        a = nhwVarA.a();
        nhw nhwVarA2 = a();
        obr.aR(nhwVarA2.b == null, "A SourcePolicy can only set internal() or external() once.");
        nhwVarA2.b = true;
        nhwVarA2.a();
    }

    public nhx(boolean z, boolean z2, oom oomVar) {
        this.b = z;
        this.c = z2;
        this.d = oomVar;
    }

    public static nhw a() {
        return new nhw();
    }
}
