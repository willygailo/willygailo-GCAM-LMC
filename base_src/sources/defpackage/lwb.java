package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lwb implements pys {
    private final qkg a;
    private final qkg b;

    public lwb(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lwa get() {
        return new lwa(((emu) this.a).get(), ((liq) this.b).get());
    }
}
