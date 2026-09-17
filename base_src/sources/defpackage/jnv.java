package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jnv implements pys {
    private final jnu a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public jnv(jnu jnuVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = jnuVar;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
    }

    @Override // defpackage.qkg
    public final /* bridge */ /* synthetic */ Object get() {
        final jnu jnuVar = this.a;
        final ih ihVar = ((emi) this.b).get();
        lar larVar = (lar) this.c.get();
        final ljf ljfVar = (ljf) this.d.get();
        final pih pihVarF = pih.f();
        larVar.c(new Runnable() { // from class: jnt
            @Override // java.lang.Runnable
            public final void run() {
                jnu jnuVar2 = jnuVar;
                ih ihVar2 = ihVar;
                ljf ljfVar2 = ljfVar;
                pih pihVar = pihVarF;
                if (ihVar2.isDestroyed()) {
                    ((oug) ((oug) jnu.a.b()).G((char) 3456)).o("Error at inflateCameraActivityUi: activity is destroyed");
                }
                ljfVar2.e("CameraActivityUi#mainInflate");
                jnuVar2.b.a.inflate();
                jnuVar2.b.b.inflate();
                pihVar.o(new jnr(jnuVar2.b.k));
                ljfVar2.f();
            }
        });
        jnr jnrVar = (jnr) plk.ae(pihVarF);
        qmd.ae(jnrVar);
        return jnrVar;
    }
}
