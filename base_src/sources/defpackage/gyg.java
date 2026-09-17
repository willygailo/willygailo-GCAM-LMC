package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gyg {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/AfDebugMetadataFetcherShutterAsap");
    public final lnc b;
    public final ljf c;
    private final boolean d;
    private final Executor e;

    public gyg(lnc lncVar, ddf ddfVar, ljf ljfVar, Executor executor) {
        this.b = lncVar;
        this.c = ljfVar;
        this.e = executor;
        ojc ojcVarA = ddfVar.a(ddm.a);
        this.d = ojcVarA.g() ? ((Integer) ojcVarA.c()).equals(3) : false;
    }

    public static void c(lng lngVar, hsa hsaVar) {
        int i = hsaVar.h().a;
        ((lqb) lngVar).a.n(ope.H(mip.be(kda.g, 2)), new gyf(hsaVar));
    }

    private final boolean d() {
        return this.d && kda.g != null;
    }

    public final void a(lng lngVar, hsa hsaVar) {
        ljf ljfVar;
        if (d()) {
            this.c.e("AfDebugFetch#request");
            try {
                try {
                    c(lngVar, hsaVar);
                    ljfVar = this.c;
                } catch (llv e) {
                    ((oug) ((oug) ((oug) a.b()).h(e)).G(2194)).o("Error submitting 3A debug metadata request.");
                    ljfVar = this.c;
                }
                ljfVar.f();
            } catch (Throwable th) {
                this.c.f();
                throw th;
            }
        }
    }

    public final void b(final hsa hsaVar) {
        if (d()) {
            this.e.execute(new Runnable() { // from class: gye
                @Override // java.lang.Runnable
                public final void run() {
                    ljf ljfVar;
                    gyg gygVar = this.a;
                    hsa hsaVar2 = hsaVar;
                    gygVar.c.e("AfDebugFetch#request");
                    try {
                        try {
                            lng lngVarC = gygVar.b.c();
                            try {
                                gyg.c(lngVarC, hsaVar2);
                                lngVarC.close();
                                ljfVar = gygVar.c;
                            } catch (Throwable th) {
                                try {
                                    lngVarC.close();
                                } catch (Throwable th2) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            gygVar.c.f();
                            throw th3;
                        }
                    } catch (InterruptedException | llv e) {
                        ((oug) ((oug) ((oug) gyg.a.b()).h(e)).G(2193)).o("Error submitting 3A debug metadata request.");
                        ljfVar = gygVar.c;
                    }
                    ljfVar.f();
                }
            });
        }
    }
}
