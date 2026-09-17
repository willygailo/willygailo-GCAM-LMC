package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cry {
    private final pyn a;
    private final pyn b;
    private final pyn c;

    public cry(pyn pynVar, pyn pynVar2, pyn pynVar3) {
        this.a = pynVar;
        this.b = pynVar2;
        this.c = pynVar3;
    }

    public final crx a(jrl jrlVar) {
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar.ordinal()) {
            case 5:
                return (crx) this.a.get();
            case 8:
                return (crx) this.c.get();
            default:
                return (crx) this.b.get();
        }
    }
}
