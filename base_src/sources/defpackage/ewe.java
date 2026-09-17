package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ewe implements iho {
    public final pyn a;
    private final pyn b;
    private final pih c;
    private final pyn d;
    private final pyn e;
    private final jng f;
    private final lda g;
    private final lar h;
    private final ljf i;
    private final emb j;

    public ewe(emb embVar, pih pihVar, pyn pynVar, jng jngVar, pyn pynVar2, pyn pynVar3, pyn pynVar4, lda ldaVar, lar larVar, ljf ljfVar, byte[] bArr, byte[] bArr2) {
        this.j = embVar;
        this.b = pynVar;
        this.c = pihVar;
        this.d = pynVar3;
        this.e = pynVar4;
        this.f = jngVar;
        this.a = pynVar2;
        this.g = ldaVar;
        this.h = larVar;
        this.i = ljfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.e("EssentialUiInit#start");
        this.g.fB(hti.e);
        if (bqe.m(this.j.a())) {
            ((cvo) this.b.get()).g(lwd.FRONT);
        }
        this.c.o(this.f);
        this.i.g("EssentialUiInit#prewarm");
        this.e.get();
        this.d.get();
        this.i.f();
        this.h.execute(this.i.c("EssentialUiInit#wire", new Runnable() { // from class: ewd
            @Override // java.lang.Runnable
            public final void run() {
                ((jqn) this.a.a.get()).a();
            }
        }));
    }
}
