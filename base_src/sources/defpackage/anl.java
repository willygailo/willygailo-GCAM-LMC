package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class anl implements ana {
    private final aen d = new aen();
    public final asl c = asl.h();

    public anl() {
        a(ana.b);
    }

    public final void a(gf gfVar) {
        this.d.h(gfVar);
        if (gfVar instanceof amz) {
            this.c.e((amz) gfVar);
        } else if (gfVar instanceof amx) {
            this.c.f(((amx) gfVar).a);
        }
    }
}
