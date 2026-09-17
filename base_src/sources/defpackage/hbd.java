package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hbd implements goy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslImageCaptureCommandBase");
    private final hen b;
    private final goy c;
    private final Set d;
    private final ljf e;
    private final gyg f;

    public hbd(hen henVar, goy goyVar, Set set, ljf ljfVar, gyg gygVar) {
        this.b = henVar;
        this.c = goyVar;
        this.d = set;
        this.e = ljfVar;
        this.f = gygVar;
    }

    protected static final void e(List list) {
        otj it = ((oom) list).iterator();
        while (it.hasNext()) {
            ((lmr) it.next()).close();
        }
    }

    private static final void f(goy goyVar, List list, gox goxVar, gog gogVar) {
        e(list);
        gogVar.b.k().g();
        gogVar.c.g();
        goyVar.c(goxVar, gogVar);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.c.a();
    }

    @Override // defpackage.goy
    public final lco b() {
        return lcv.g(fcy.j(obr.ah(this.d)));
    }

    @Override // defpackage.goy
    public void c(gox goxVar, gog gogVar) {
        goy goyVar;
        this.e.e("pckZsl#lockBuffer");
        hem hemVarA = this.b.a();
        try {
            this.e.g("pckZsl#getFrames");
            List listI = this.b.i();
            hemVarA.a();
            this.e.f();
            boolean z = true;
            gogVar.b.D(true);
            if (((orr) listI).c <= 0) {
                ((oug) ((oug) a.b()).G(2304)).o("Can't execute command, not enough ZSL images");
                f(this.c, listI, goxVar, gogVar);
            } else {
                this.e.e("pckHdrZsl#captureIndicator");
                if (gogVar.c.d() == null) {
                    gogVar.c.c().g();
                }
                this.e.g("pckZsl#afMetadata");
                this.f.b(gogVar.b);
                this.e.g("pckZsl#filterFrames");
                oom oomVarH = this.b.h(listI);
                this.e.f();
                try {
                    try {
                        this.e.e("pckZsl#processZslFrames");
                        boolean zD = d(oomVarH, goxVar, gogVar);
                        this.e.f();
                        if (!zD) {
                            goyVar = this.c;
                            f(goyVar, oomVarH, goxVar, gogVar);
                        }
                    } catch (dmd e) {
                        if (e instanceof dma) {
                            ((oug) ((oug) ((oug) a.b()).h(e)).G(2303)).o("Aborted main ZSL shot, not executing fallback");
                            z = false;
                        } else {
                            ((oug) ((oug) ((oug) a.b()).h(e)).G(2302)).o("Error executing main ZSL command, executing fallback");
                        }
                        this.e.f();
                        if (z) {
                            goyVar = this.c;
                            f(goyVar, oomVarH, goxVar, gogVar);
                        } else {
                            gogVar.c.f();
                            gogVar.b.C(jmq.a, e);
                        }
                    }
                } catch (Throwable th) {
                    this.e.f();
                    f(this.c, oomVarH, goxVar, gogVar);
                    throw th;
                }
            }
            hemVarA.a();
        } catch (Throwable th2) {
            hemVarA.a();
            throw th2;
        }
    }

    protected abstract boolean d(List list, gox goxVar, gog gogVar);
}
