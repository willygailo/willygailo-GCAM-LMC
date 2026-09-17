package defpackage;

import com.google.android.libraries.vision.visionkit.pipeline.NativePipelineImpl;

/* JADX INFO: loaded from: classes2.dex */
public class nvf implements nvg, nvj {
    private final nvb a;
    public final nvd b;
    public long c;
    private final long d;
    private final long e;
    private final long f;

    public nvf(nvh nvhVar) {
        pos posVarB = pos.b();
        posVarB = posVarB == null ? pos.a() : posVarB;
        if (nvhVar.b == 5 && ((Boolean) nvhVar.c).booleanValue()) {
            this.b = new nve();
        } else if (nvhVar.b == 6 && ((Boolean) nvhVar.c).booleanValue()) {
            this.b = new NativePipelineImpl(this, this, posVarB);
        } else {
            this.b = new NativePipelineImpl(this, this, posVarB, null);
        }
        if ((nvhVar.a & 128) != 0) {
            int i = nvhVar.f;
            this.a = new nvb();
        } else {
            this.a = new nvb();
        }
        long jInitializeFrameManager = this.b.initializeFrameManager();
        this.d = jInitializeFrameManager;
        long jInitializeFrameBufferReleaseCallback = this.b.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
        this.e = jInitializeFrameBufferReleaseCallback;
        long jInitializeResultsCallback = this.b.initializeResultsCallback();
        this.f = jInitializeResultsCallback;
        this.c = this.b.initialize(nvhVar.g(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, null, 0L);
    }

    @Override // defpackage.nvg
    public void a(long j) {
        this.a.a(j);
    }

    public void b(nvk nvkVar) {
        nmk nmkVar = nmk.a;
        String strValueOf = String.valueOf(nvkVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Pipeline received results: ");
        sb.append(strValueOf);
        String string = sb.toString();
        Object[] objArr = new Object[0];
        if (nmkVar.e(4)) {
            nmkVar.b(this, string, objArr);
        }
    }

    public final synchronized void c() {
        long j = this.c;
        if (j != 0) {
            this.b.stop(j);
            this.b.close(this.c, this.d, this.e, this.f);
            this.c = 0L;
            this.b.a();
        }
    }
}
