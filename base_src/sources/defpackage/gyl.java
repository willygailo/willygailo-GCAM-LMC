package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gyl extends mip {
    final /* synthetic */ lmr a;
    final /* synthetic */ pih b;

    public gyl(lmr lmrVar, pih pihVar) {
        this.a = lmrVar;
        this.b = pihVar;
    }

    @Override // defpackage.mip
    public final void fG(lzv lzvVar) {
        if (lzvVar != null) {
            this.b.o(lzvVar);
        } else {
            ((oug) ((oug) gym.a.c()).G(2196)).r("Failed to get metadata for frame %s", this.a);
            this.b.a(new llv());
        }
    }
}
