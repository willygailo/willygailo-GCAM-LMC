package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggo implements lij {
    public final lce a = new lce(new ggp(ggn.a(), ggn.a()));
    private ggn b = ggn.a();
    private final boolean c;

    public ggo(boolean z) {
        this.c = z;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        ggn ggnVar = (ggn) obj;
        boolean z = ggnVar.d;
        ggn ggnVar2 = this.b;
        boolean z2 = ggnVar2.d;
        if (!ggnVar.equals(ggnVar2) || this.c) {
            this.a.fB(new ggp(this.b, ggnVar));
            this.b = ggnVar;
        }
    }
}
