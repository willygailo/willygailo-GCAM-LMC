package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hav extends hbd {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslBurstImageCaptureCommand");
    private final gze b;
    private final gmu c;
    private final int d;

    public hav(gze gzeVar, goy goyVar, Set set, gmu gmuVar, int i, ljf ljfVar, gyg gygVar) {
        super(gzeVar, goyVar, set, ljfVar, gygVar);
        this.b = gzeVar;
        this.c = gmuVar;
        this.d = i;
    }

    @Override // defpackage.hbd
    protected final boolean d(List list, gox goxVar, gog gogVar) {
        try {
            gmt gmtVarB = this.c.b(gogVar);
            try {
                if (gmtVarB == null) {
                    ((oug) ((oug) a.b()).G(2280)).o("Cannot acquire image saver session.");
                } else {
                    goxVar.close();
                    int i = ((orr) list).c;
                    otj it = ((oom) list).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        lmr lmrVar = (lmr) it.next();
                        try {
                            Set<lnx> setB = this.b.b.b(Integer.valueOf(this.d));
                            ooh oohVarE = oom.e();
                            if (!setB.isEmpty()) {
                                try {
                                    mip.bh(lmrVar);
                                    for (lnx lnxVar : setB) {
                                        mad madVarD = lmrVar.d(lnxVar);
                                        if (madVarD != null) {
                                            lnxVar.c();
                                            oohVarE.g(new maa(madVarD));
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    ((oug) ((oug) gze.a.b()).G((char) 2223)).r("Error retrieving the images from Frame %s", lmrVar.b());
                                }
                            }
                            oom oomVarF = oohVarE.f();
                            lzv lzvVarC = lmrVar.c();
                            if (!oomVarF.isEmpty() && lzvVarC != null) {
                                gmtVarB.a((mad) oomVarF.get(0), plk.V(lzvVarC));
                                z = true;
                            }
                            lmrVar.close();
                        } catch (Throwable th) {
                            lmrVar.close();
                            throw th;
                        }
                    }
                    if (z) {
                        gmtVarB.close();
                        goxVar.close();
                        e(list);
                        return true;
                    }
                    ((oug) ((oug) a.b()).G(2279)).o("No images found.");
                    gmtVarB.close();
                }
                goxVar.close();
                e(list);
                return false;
            } catch (Throwable th2) {
                if (gmtVarB != null) {
                    try {
                        gmtVarB.close();
                    } catch (Throwable th3) {
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            goxVar.close();
            e(list);
            throw th4;
        }
    }
}
