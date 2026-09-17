package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class imk implements pys {
    private final qkg a;
    private final qkg b;

    public imk(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final imj get() {
        return new imj((lar) this.a.get(), ((emg) this.b).get());
    }
}
