package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hal {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckShastaZslController");
    public final lnc b;
    public final hcs c;
    public final hen d;
    public final hcg e;
    public final hbb f;
    public final eao g;
    public final ljf h;
    public final gyg i;
    public final hex j;
    public final hes k;
    public final Executor l;
    private final ebe m;
    private final gzu n;

    public hal(ebe ebeVar, lnc lncVar, hcs hcsVar, gzu gzuVar, hcg hcgVar, hen henVar, hbb hbbVar, eao eaoVar, ljf ljfVar, gyg gygVar, hex hexVar, hes hesVar, Executor executor) {
        this.m = ebeVar;
        this.b = lncVar;
        this.n = gzuVar;
        this.c = hcsVar;
        this.d = henVar;
        this.e = hcgVar;
        this.f = hbbVar;
        this.g = eaoVar;
        this.h = ljfVar;
        this.i = gygVar;
        this.j = hexVar;
        this.k = hesVar;
        this.l = executor;
    }

    public final List a(edd eddVar, lzv lzvVar, hcf hcfVar, lqd lqdVar, lng lngVar) {
        ljf ljfVar;
        ljf ljfVar2;
        this.h.e("ShastaZslController#getPslFrames");
        List arrayList = new ArrayList();
        if (((Integer) lqdVar.a().fA()).intValue() > 0) {
            try {
                try {
                    mad madVarE = hcfVar.e();
                    BurstSpec burstSpecJ = null;
                    if (madVarE != null) {
                        try {
                            try {
                                this.h.e("PckShastaZslController#buildBurstSpec");
                                burstSpecJ = this.m.j(eddVar, madVarE, lzvVar, true, null);
                                madVarE.close();
                                ljfVar2 = this.h;
                            } catch (llv e) {
                                ((oug) ((oug) a.b()).G(2241)).r("Unable to build payloadBurstSpec %s", e);
                                madVarE.close();
                                ljfVar2 = this.h;
                            }
                            ljfVar2.f();
                        } catch (Throwable th) {
                            madVarE.close();
                            this.h.f();
                            throw th;
                        }
                    }
                    if (burstSpecJ != null && !burstSpecJ.b().d()) {
                        if (burstSpecJ.b().a() > ((Integer) lqdVar.a().fA()).intValue()) {
                            ((oug) ((oug) a.c()).G(2246)).v("Not enough available capacity for PSL request (%s required, %s available)", burstSpecJ.b().a(), lqdVar.a().fA());
                        } else {
                            this.h.e("buildRequest");
                            lpc lpcVarI = lngVar.i();
                            lpcVarI.c();
                            FrameRequestVector frameRequestVectorB = burstSpecJ.b();
                            int iA = (int) frameRequestVectorB.a();
                            this.h.g("buildPayload");
                            gzu gzuVar = this.n;
                            goc gocVar = new goc();
                            lpc lpcVarA = lpc.a(lpcVarI);
                            gzuVar.c(lpcVarA, gocVar, lqdVar, iA, 0, true);
                            List list = (List) Collection.EL.stream(gzuVar.b(lpcVarA, frameRequestVectorB, lzvVar, iA)).map(cgw.t).collect(Collectors.toList());
                            this.h.g("submitRequests");
                            list.size();
                            List listC = lngVar.c(list);
                            try {
                                this.h.f();
                                arrayList = listC;
                            } catch (llv e2) {
                                arrayList = listC;
                                ljfVar = this.h;
                            }
                        }
                    }
                    ljfVar = this.h;
                } catch (Throwable th2) {
                    this.h.f();
                    throw th2;
                }
            } catch (llv e3) {
            }
            ljfVar.f();
        } else {
            ((oug) ((oug) a.c()).G((char) 2243)).o("No available capacity for PSL request");
        }
        return arrayList;
    }
}
