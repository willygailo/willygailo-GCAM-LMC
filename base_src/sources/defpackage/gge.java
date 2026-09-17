package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gge implements lij {
    private final lce a = new lce(ggh.a(ggd.b(), ggd.b()));
    private ggd b = ggd.b();

    @Override // defpackage.lij
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void fB(ggd ggdVar) {
        if (ggdVar.equals(this.b)) {
            return;
        }
        this.a.fB(ggh.a(this.b, ggdVar));
        this.b = ggdVar;
    }
}
