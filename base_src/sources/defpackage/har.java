package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class har implements goy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleHdrPlusImageCaptureCommand");
    private final lnc b;
    private final lco c;
    private final hen d;
    private final hbb e;
    private final ljf f;
    private final giq g;
    private final gyg h;
    private final lap i;

    public har(lnc lncVar, lco lcoVar, hen henVar, ljf ljfVar, hbb hbbVar, giq giqVar, gyg gygVar, lap lapVar) {
        this.b = lncVar;
        this.c = lcoVar;
        this.d = henVar;
        this.f = ljfVar;
        this.e = hbbVar;
        this.g = giqVar;
        this.h = gygVar;
        this.i = lapVar;
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.c;
    }

    @Override // defpackage.goy
    public final lco b() {
        return lcv.g(fcy.l());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) throws Throwable {
        hsa hsaVar;
        dmd dmdVar;
        hsa hsaVar2;
        dmb dmbVar;
        this.f.e("pckSingleHdr#acquiringFrame");
        hem hemVarA = this.d.a();
        this.h.b(gogVar.b);
        Throwable e = null;
        try {
            hev hevVar = new hev(ope.H(new hfb(CaptureResult.SENSOR_TIMESTAMP, this.g.h() - 1000000000)));
            lmr lmrVarE = this.d.e();
            lqd lqdVarL = this.d.l();
            hemVarA.a();
            boolean z = true;
            if (lmrVarE != null) {
                gogVar.b.D(true);
            }
            if (lmrVarE == null || !hevVar.a(lmrVarE)) {
                if (lmrVarE != null) {
                    lmrVarE.close();
                }
                ((oug) ((oug) a.c()).G(2268)).r("ZSL frame not available, submitting request to %s", lqdVarL);
                lmrVarE = this.b.q(lqdVarL);
                mip.bh(lmrVarE);
            }
            if (lmrVarE.b() == null || !lmrVarE.g()) {
                z = false;
            } else {
                oom oomVarM = oom.m(lmrVarE);
                gogVar.c.e().g();
                this.f.g("pckSingleHdr#process");
                this.e.g(oomVarM, goxVar, gogVar);
            }
            goxVar.close();
            hemVarA.a();
            if (z) {
                return;
            }
            gogVar.c.f();
            hsaVar2 = gogVar.b;
            dmbVar = new dmb((Throwable) null);
            hsaVar2.w(dmbVar);
        } catch (dmd e2) {
            goxVar.close();
            hemVarA.a();
            gogVar.c.f();
            hsaVar2 = gogVar.b;
            if (!this.i.a()) {
                hsaVar2.C(jmq.a, new dmd(e2));
                return;
            }
            dmbVar = new dmb(e2);
        } catch (InterruptedException e3) {
            e = e3;
            try {
                throw e;
            } catch (Throwable th) {
                th = th;
                goxVar.close();
                hemVarA.a();
                gogVar.c.f();
                hsaVar = gogVar.b;
                if (this.i.a()) {
                    hsaVar.w(new dmb(e));
                } else {
                    if (e != null) {
                        dmdVar = new dmd(e);
                    } else {
                        dmdVar = new dmd("Image capture failed. Aborting capture!");
                    }
                    hsaVar.C(jmq.a, dmdVar);
                }
                throw th;
            }
        } catch (RuntimeException e4) {
            e = e4;
            throw e;
        } catch (Throwable th2) {
            th = th2;
            goxVar.close();
            hemVarA.a();
            gogVar.c.f();
            hsaVar = gogVar.b;
            if (this.i.a()) {
                if (e != null) {
                    dmdVar = new dmd(e);
                } else {
                    dmdVar = new dmd("Image capture failed. Aborting capture!");
                }
                hsaVar.C(jmq.a, dmdVar);
            } else {
                hsaVar.w(new dmb(e));
            }
            throw th;
        }
    }
}
