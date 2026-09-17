package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gej implements gey {
    private final lis a;
    private final ddf b;
    private final gey c;
    private final gey d;
    private final gey e;
    private final hcg f;

    public gej(lis lisVar, ddf ddfVar, gcl gclVar, gay gayVar, gas gasVar, hcg hcgVar) {
        this.a = lisVar.a("SwitcherHdrPlus");
        this.b = ddfVar;
        this.c = gclVar;
        this.d = gayVar;
        this.e = gasVar;
        this.f = hcgVar;
    }

    @Override // defpackage.gey
    public final int a() {
        this.b.k(dds.q);
        return 1;
    }

    @Override // defpackage.gey
    public final void b(lmr lmrVar, gfs gfsVar, gfi gfiVar, gex gexVar) {
        gey geyVar;
        if (gfsVar.i && this.b.k(dds.V) && this.b.k(ddr.l)) {
            geyVar = this.e;
        } else {
            geyVar = this.b.k(dds.q) ? this.d : this.c;
        }
        if (!geyVar.c(lmrVar, this.f)) {
            geyVar = this.c;
        }
        if (this.b.k(dds.q) && this.b.k(dds.S) && geyVar == this.c) {
            gexVar.a();
            return;
        }
        if (geyVar.c(lmrVar, this.f)) {
            lis lisVar = this.a;
            String strValueOf = String.valueOf(geyVar.getClass().getSimpleName());
            lisVar.b(strValueOf.length() != 0 ? "Processing frames with ".concat(strValueOf) : new String("Processing frames with "));
            geyVar.b(lmrVar, gfsVar, gfiVar, gexVar);
            return;
        }
        String strValueOf2 = String.valueOf(lmrVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 49);
        sb.append("Cannot find an HdrPlusLauncher to process frame ");
        sb.append(strValueOf2);
        sb.append("!");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.gey
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        return true;
    }
}
