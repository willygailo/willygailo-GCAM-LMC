package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gro extends ldl {
    private final boolean a;
    private final boolean b;

    public gro(ghx ghxVar, gqs gqsVar, lco lcoVar, lco lcoVar2, lco lcoVar3, edm edmVar) {
        super(lcv.b(gqsVar, lcoVar, lcoVar2, lcoVar3, edmVar.a));
        this.a = ghxVar.I();
        this.b = ghxVar.k() == lwd.FRONT;
    }

    private static gjk d(ilf ilfVar, boolean z) {
        if (!ilfVar.c && !ilfVar.f) {
            return ilfVar.e ? gjk.HDR_PLUS : gjk.NORMAL;
        }
        if (z) {
            return ilfVar.e ? gjk.HDR_PLUS_WITH_TORCH : gjk.NORMAL_WITH_FLASH;
        }
        return ilfVar.e ? gjk.HDR_PLUS : gjk.NORMAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r7.e != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (r7.e == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (r7.d != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        if (r13 != defpackage.gjk.NORMAL) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f4, code lost:
    
        if (r13 != defpackage.gjk.NORMAL) goto L68;
     */
    @Override // defpackage.ldl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gro.c(java.lang.Object):java.lang.Object");
    }
}
