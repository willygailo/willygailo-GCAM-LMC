package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dob implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;

    public dob(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    public static dob a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new dob(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Runnable get() {
        boolean zBooleanValue = ((Boolean) this.a.get()).booleanValue();
        final dom domVar = (dom) this.b.get();
        final boolean zBooleanValue2 = ((Boolean) this.c.get()).booleanValue();
        final qkg qkgVar = this.d;
        final boolean zBooleanValue3 = ((Boolean) this.e.get()).booleanValue();
        final qkg qkgVar2 = this.f;
        final ghx ghxVar = ((gjo) this.g).get();
        return !zBooleanValue ? pid.a : new Runnable() { // from class: dnz
            @Override // java.lang.Runnable
            public final void run() {
                ghx ghxVar2 = ghxVar;
                dom domVar2 = domVar;
                boolean z = zBooleanValue2;
                qkg qkgVar3 = qkgVar;
                boolean z2 = zBooleanValue3;
                qkg qkgVar4 = qkgVar2;
                lwd lwdVarK = ghxVar2.k();
                domVar2.f(lwdVarK);
                if (z) {
                    ((dom) qkgVar3.get()).f(lwdVarK);
                }
                if (z2) {
                    ((dom) qkgVar4.get()).f(lwdVarK);
                }
            }
        };
    }
}
