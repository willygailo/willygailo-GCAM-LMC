package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eti implements pys {
    private final ete a;

    public eti(ete eteVar) {
        this.a = eteVar;
    }

    public static eti a(ete eteVar) {
        return new eti(eteVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final emb get() {
        return new emb(this.a.a);
    }
}
