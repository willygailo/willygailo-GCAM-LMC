package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gph implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public gph(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static gph b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gph(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final goy get() {
        lir lirVar = ((dgb) this.a).get();
        lap lapVar = (lap) this.b.get();
        final goy goyVar = (goy) this.c.get();
        lce lceVar = (lce) this.d.get();
        lapVar.c(lcv.l(goyVar.b(), lceVar));
        lceVar.fB((gjm) goyVar.b().fA());
        final lis lisVarA = lirVar.a("ImgCptrCmdReady");
        lapVar.c(lcv.l(goyVar.a(), new lij() { // from class: gpe
            @Override // defpackage.lij
            public final void fB(Object obj) {
                lis lisVar = lisVarA;
                goy goyVar2 = goyVar;
                String strValueOf = String.valueOf((Boolean) obj);
                String strValueOf2 = String.valueOf(goyVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47 + String.valueOf(strValueOf2).length());
                sb.append("ImageCaptureCommand: availability=");
                sb.append(strValueOf);
                sb.append(" rootCommand=");
                sb.append(strValueOf2);
                lisVar.b(sb.toString());
            }
        }));
        qmd.ae(goyVar);
        return goyVar;
    }
}
