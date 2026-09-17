package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gym implements goy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckConvergedCaptureCommand");
    private final lnc b;
    private final lnx c;
    private final gmu d;
    private final int e;
    private final gxl f;
    private final gwi g;
    private final lnv h;
    private final ljf i;
    private final lco j;
    private final lqd k;

    public gym(lnc lncVar, lnx lnxVar, lqd lqdVar, gmu gmuVar, int i, gxl gxlVar, gwi gwiVar, lnv lnvVar, ljf ljfVar) {
        this.b = lncVar;
        this.c = lnxVar;
        this.k = lqdVar;
        this.d = gmuVar;
        this.e = i;
        this.f = gxlVar;
        this.g = gwiVar;
        this.h = lnvVar;
        this.i = ljfVar;
        this.j = lcv.e(lqdVar.a(), 1);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.j;
    }

    @Override // defpackage.goy
    public final lco b() {
        return lcv.g(fcy.l());
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) throws llv {
        if (this.b == null || this.k == null) {
            goxVar.close();
            throw new llv("FrameServer is not available");
        }
        this.i.e("PckConvergedCaptureCommand");
        this.i.e("AcquireFrameServerSession");
        try {
            lng lngVarC = this.b.c();
            try {
                gxk gxkVarA = this.f.a(lngVarC);
                try {
                    ggx ggxVarA = this.g.a(lngVarC, this.h);
                    try {
                        lpc lpcVarI = lngVarC.i();
                        lpcVarI.f(this.k);
                        gogVar.a.g.fB(Boolean.valueOf(this.f instanceof gyb));
                        this.i.g("AcquireImageSaverSession");
                        gmt gmtVarA = this.d.a(gogVar);
                        try {
                            this.i.g("BuildingFrameRequests");
                            ArrayList arrayList = new ArrayList();
                            int iMax = Math.max(1, Math.min(this.e, ((Integer) this.k.a().fA()).intValue()));
                            for (int i = 0; i < iMax; i++) {
                                lpc lpcVarA = lpc.a(lpcVarI);
                                if (i <= 0) {
                                    lpcVarA.g(new gyk(gogVar));
                                }
                                arrayList.add(lpcVarA.b());
                            }
                            this.i.g("SubmittingFrameRequests");
                            arrayList.size();
                            List<lqa> listC = lngVarC.c(arrayList);
                            obr.aQ(!listC.isEmpty());
                            gxkVarA.close();
                            ggxVarA.close();
                            lngVarC.close();
                            this.i.g("RetrievingImages");
                            listC.size();
                            for (lqa lqaVar : listC) {
                                this.i.e("GettingImageFromFrame");
                                lmr lmrVarA = lqaVar.a(this.k);
                                if (lmrVarA != null) {
                                    lnx lnxVar = this.c;
                                    pih pihVarF = pih.f();
                                    lmrVarA.j(new gyl(lmrVarA, pihVarF));
                                    gjs gjsVar = null;
                                    try {
                                        try {
                                            if (!lmrVarA.e() && !lmrVarA.g() && !lmrVarA.f()) {
                                                lnj lnjVar = new lnj();
                                                lmrVarA.j(lnjVar);
                                                lnjVar.w();
                                            }
                                            mad madVarD = lmrVarA.d(lnxVar);
                                            if (madVarD == null) {
                                                ((oug) ((oug) a.c()).G(2197)).y("Failed to get image from %s for frame %s", lnxVar, lmrVarA);
                                                lmrVarA.close();
                                            } else {
                                                gjs gjsVar2 = new gjs(madVarD, pihVarF);
                                                lmrVarA.close();
                                                gjsVar = gjsVar2;
                                            }
                                        } catch (InterruptedException e) {
                                            Thread.currentThread().interrupt();
                                        }
                                        if (gjsVar != null) {
                                            pht phtVarK = gjsVar.k();
                                            phtVarK.getClass();
                                            this.i.g("AddingImageToImageSaver");
                                            gjsVar.d();
                                            gmtVarA.a(gjsVar, phtVarK);
                                        }
                                        lmrVarA.close();
                                    } catch (Throwable th) {
                                        lmrVarA.close();
                                        throw th;
                                    }
                                }
                                lqaVar.close();
                                this.i.f();
                            }
                            goxVar.close();
                            if (gmtVarA != null) {
                                gmtVarA.close();
                            }
                            ggxVarA.close();
                            if (gxkVarA != null) {
                                gxkVarA.close();
                            }
                            lngVarC.close();
                            this.i.f();
                            this.i.f();
                            this.f.b();
                            goxVar.close();
                        } catch (Throwable th2) {
                            if (gmtVarA != null) {
                                try {
                                    gmtVarA.close();
                                } catch (Throwable th3) {
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            ggxVarA.close();
                        } catch (Throwable th5) {
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    if (gxkVarA != null) {
                        try {
                            gxkVarA.close();
                        } catch (Throwable th7) {
                        }
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    lngVarC.close();
                } catch (Throwable th9) {
                }
                throw th8;
            }
        } catch (Throwable th10) {
            this.i.f();
            this.i.f();
            this.f.b();
            goxVar.close();
            throw th10;
        }
    }
}
