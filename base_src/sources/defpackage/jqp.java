package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jqp implements pys {
    private final qkg a;
    private final qkg b;

    public jqp(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jqo get() {
        return new jqo((jqn) this.a.get(), (jqn) this.b.get());
    }
}
