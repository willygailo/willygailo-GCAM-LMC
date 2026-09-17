package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class gyb implements gxl {
    private static final ouj b = ouj.h("com/google/android/apps/camera/pixelcamerakit/aaa/illumination/SelfieFlashIlluminationController");
    public final hpb a;
    private final lar c;
    private final gxt d;
    private final boolean e;
    private int f;
    private final Object g = new Object();

    public gyb(hpb hpbVar, lar larVar, gxt gxtVar, ddf ddfVar) {
        this.a = hpbVar;
        this.c = larVar;
        this.d = gxtVar;
        this.e = ddfVar.j(ddl.ag);
    }

    @Override // defpackage.gxl
    public final gxk a(lng lngVar) {
        gya gyaVar = new gya(0);
        try {
            synchronized (this.g) {
                int i = this.f + 1;
                this.f = i;
                if (i == 1) {
                    lmp lmpVarA = lngVar.a();
                    ((lrs) lmpVarA).c = 5;
                    ((lrs) lmpVarA).e = Integer.valueOf(true != this.e ? 0 : 2);
                    pht phtVarB = lngVar.b(((lrs) lmpVarA).d());
                    final pih pihVarF = pih.f();
                    this.c.execute(new Runnable() { // from class: gxx
                        @Override // java.lang.Runnable
                        public final void run() {
                            plk.af(this.a.a.b(), new gxz(pihVarF), pgr.INSTANCE);
                        }
                    });
                    plk.S(phtVarB, pihVarF).get();
                    kfm kfmVar = (kfm) pihVarF.get();
                    final gxt gxtVar = this.d;
                    gsj gsjVar = new gsj(kfmVar.a);
                    final gxs gxsVar = new gxs(gsjVar);
                    gxtVar.a.n(gxsVar);
                    try {
                        gsjVar.a.d(new Runnable() { // from class: gxr
                            @Override // java.lang.Runnable
                            public final void run() {
                                gxt gxtVar2 = gxtVar;
                                gxtVar2.a.o(gxsVar);
                            }
                        }, pgr.INSTANCE);
                        ((Boolean) gsjVar.a.get()).booleanValue();
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (CancellationException | ExecutionException | llv e2) {
            ((oug) ((oug) ((oug) b.b()).h(e2)).G((char) 2188)).o("Couldn't turn on selfie flash");
        }
        return gyaVar;
    }

    @Override // defpackage.gxl
    public final void b() {
        synchronized (this.g) {
            int i = this.f;
            if (i > 0) {
                int i2 = i - 1;
                this.f = i2;
                if (i2 == 0) {
                    this.c.execute(new Runnable() { // from class: gxw
                        @Override // java.lang.Runnable
                        public final void run() {
                            plk.af(this.a.a.a(), new gxy(0), pgr.INSTANCE);
                        }
                    });
                }
            }
        }
    }
}
