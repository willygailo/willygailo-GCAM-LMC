package defpackage;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class edm extends lce {
    public final lce a;

    public edm(final eaa eaaVar) {
        super(new gjs(new lwj(0L), null));
        this.a = new lce(edl.UNKNOWN);
        a(new lij() { // from class: edk
            /* JADX WARN: Code duplicated, block: B:34:0x00ac A[Catch: all -> 0x00b5, InterruptedException | ExecutionException -> 0x00b7, InterruptedException -> 0x00b9, TryCatch #1 {all -> 0x00b5, blocks: (B:4:0x000c, B:5:0x0015, B:7:0x002d, B:10:0x0033, B:12:0x003f, B:14:0x0049, B:16:0x004e, B:18:0x0059, B:33:0x00a9, B:35:0x00ae, B:24:0x006b, B:26:0x0084, B:28:0x0092, B:30:0x009c, B:34:0x00ac, B:43:0x00ba), top: B:48:0x000a }] */
            @Override // defpackage.lij
            public final void fB(Object obj) {
                edl edlVar;
                float[] fArr;
                edm edmVar = this.a;
                eaa eaaVar2 = eaaVar;
                gjs gjsVar = (gjs) obj;
                pht phtVarK = gjsVar.k();
                try {
                    try {
                        if (phtVarK == null) {
                            edmVar.a.fB(edl.UNKNOWN);
                        } else {
                            lce lceVar = edmVar.a;
                            lzv lzvVar = (lzv) phtVarK.get();
                            gqx gqxVar = (gqx) eaaVar2.c.fA();
                            if (eaaVar2.a.a() || gqxVar == gqx.OFF) {
                                edlVar = edl.OFF;
                            } else if (kdb.b == null || (fArr = (float[]) lzvVar.d(kdb.b)) == null || fArr.length < 13) {
                                ecc eccVarC = eaaVar2.b.c(gjsVar, lzvVar, new lig(gjsVar.c(), gjsVar.b()));
                                if (eccVarC.e >= 140.0f) {
                                    AeResults aeResultsH = eaaVar2.b.h(eccVarC);
                                    if (GcamModuleJNI.AeResults_Check(aeResultsH.a, aeResultsH)) {
                                        float fAeResults_LogSceneBrightness = GcamModuleJNI.AeResults_LogSceneBrightness(aeResultsH.a, aeResultsH);
                                        if (fAeResults_LogSceneBrightness != -999.0f) {
                                            eaaVar2.d.fB(Float.valueOf(fAeResults_LogSceneBrightness));
                                        }
                                        if (fAeResults_LogSceneBrightness < -2.86f) {
                                            edlVar = edl.ON;
                                        }
                                    }
                                }
                                edlVar = edl.OFF;
                            } else {
                                float f = fArr[12];
                                float f2 = fArr[6];
                                if (f2 != -999.0f) {
                                    eaaVar2.d.fB(Float.valueOf(f2));
                                }
                                if (f <= 140.0f || f2 >= -2.86f) {
                                    edlVar = edl.OFF;
                                } else {
                                    edlVar = edl.ON;
                                }
                            }
                            lceVar.fB(edlVar);
                        }
                    } catch (Throwable th) {
                        gjsVar.close();
                        throw th;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    edmVar.a.fB(edl.UNKNOWN);
                }
                gjsVar.close();
            }
        }, pgr.INSTANCE);
    }
}
