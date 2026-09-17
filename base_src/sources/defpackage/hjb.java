package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hjb extends hja {
    private final hip a;
    private final fjw b;
    private final ljf i;
    private final hiq j;

    public hjb(hin hinVar, Executor executor, hil hilVar, hip hipVar, hsa hsaVar, hiq hiqVar, fjw fjwVar, ljf ljfVar) {
        super(hinVar, executor, hilVar, 1, hsaVar);
        this.a = hipVar;
        this.j = hiqVar;
        this.b = fjwVar;
        this.i = ljfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.e("LuckyShot");
        poy poyVarM = pct.d.m();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pct pctVar = (pct) poyVarM.b;
        pctVar.a |= 1;
        pctVar.b = jElapsedRealtimeNanos;
        hiq hiqVar = this.j;
        hin hinVar = this.f;
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        hiqVar.b.e("LuckyShotScore");
        mad madVar = hinVar.a;
        mac macVar = (mac) madVar.g().get(0);
        double dMeasureSharpnessOnEdgeGivenCropNative = ImgUtilNative.measureSharpnessOnEdgeGivenCropNative(madVar.c(), madVar.b(), macVar.getBuffer(), macVar.getPixelStride(), macVar.getRowStride(), hinVar.e.left, hinVar.e.top, hinVar.e.right, hinVar.e.bottom);
        hiqVar.b.f();
        if (dMeasureSharpnessOnEdgeGivenCropNative <= 0.0d) {
            ((oug) ((oug) hiq.a.c()).G((char) 2492)).o("invalid metric value from LS metric calculation.");
        }
        ojc ojcVarI = ojc.i(new fju(fjv.LUCKY_SHOT_DEFAULT_METRIC, (float) dMeasureSharpnessOnEdgeGivenCropNative, SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2));
        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pct pctVar2 = (pct) poyVarM.b;
        pctVar2.a |= 2;
        pctVar2.c = jElapsedRealtimeNanos3;
        fjw fjwVar = this.b;
        pct pctVar3 = (pct) poyVarM.j();
        synchronized (fjwVar.a) {
            if (fjwVar.f == null) {
                fjwVar.f = new ArrayList();
            }
            fjwVar.f.add(pctVar3);
        }
        hin hinVarD = this.a.d(this.f, dMeasureSharpnessOnEdgeGivenCropNative);
        fjw fjwVar2 = this.b;
        fju fjuVar = (fju) ((ojj) ojcVarI).a;
        poy poyVarM2 = pcr.g.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pcr pcrVar = (pcr) poyVarM2.b;
        int i = pcrVar.a | 1;
        pcrVar.a = i;
        pcrVar.b = -1;
        float f = fjuVar.b;
        int i2 = i | 2;
        pcrVar.a = i2;
        pcrVar.c = f;
        int i3 = i2 | 4;
        pcrVar.a = i3;
        pcrVar.d = 0.0f;
        int i4 = i3 | 8;
        pcrVar.a = i4;
        pcrVar.e = 0.0f;
        long j = fjuVar.c;
        pcrVar.a = i4 | 16;
        pcrVar.f = j;
        pcr pcrVar2 = (pcr) poyVarM2.j();
        fjv fjvVar = fjuVar.a;
        synchronized (fjwVar2.a) {
            fjwVar2.b.add(pcrVar2);
            fjwVar2.c.add(fjvVar);
        }
        if (hinVarD != null) {
            this.c.b(hinVarD.a, this.d);
        }
        this.i.f();
    }
}
