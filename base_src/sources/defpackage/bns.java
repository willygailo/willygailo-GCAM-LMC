package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bns implements lie {
    private static final long a = TimeUnit.MILLISECONDS.toNanos(500);
    private final Rect b;
    private final oom c;
    private final dyx d;
    private final lis e;
    private final String f;
    private final float g;
    private long h;
    private float i;

    public bns(ghx ghxVar, dyx dyxVar, lis lisVar, String str) {
        this(ghxVar, dyxVar, lisVar, str, 300.0f);
    }

    public bns(ghx ghxVar, dyx dyxVar, lis lisVar, String str, float f) {
        this.h = 0L;
        this.i = 0.0f;
        Rect rectH = ghxVar.h();
        this.b = rectH;
        this.c = oom.p(new float[]{0.0f, 0.0f}, new float[]{0.0f, rectH.height()}, new float[]{rectH.width(), 0.0f}, new float[]{rectH.width(), rectH.height()});
        this.d = dyxVar;
        this.e = lisVar;
        this.f = str;
        this.g = f;
    }

    public final void a(lzv lzvVar) throws Throwable {
        if (this.d.e()) {
            hjz hjzVar = new hjz(lzvVar, 0, this.b);
            long j = hjzVar.b;
            if (j - this.h < a) {
                return;
            }
            this.h = j;
            List listB = this.d.b(j, hjzVar);
            float fMax = 0.0f;
            if (listB.isEmpty()) {
                this.e.d("Motion estimator returned empty homography list. Assuming zero motion.");
                this.i = 0.0f;
                return;
            }
            mou mouVar = (mou) listB.get(0);
            oom oomVar = this.c;
            int i = ((orr) oomVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                float[] fArr = (float[]) oomVar.get(i2);
                float[] fArrE = mouVar.e(fArr);
                fMax = Math.max(fMax, (float) Math.hypot(fArrE[0] - fArr[0], fArrE[1] - fArr[1]));
            }
            this.i = fMax;
            lis lisVar = this.e;
            StringBuilder sb = new StringBuilder(42);
            sb.append("Current motion magnitude = ");
            sb.append(fMax);
            lisVar.g(sb.toString());
        }
    }

    public final void b() {
        this.e.b("Starting MotionSampler");
        this.d.f(new lig(this.b.width(), this.b.height()), this.f);
    }

    public final boolean c() {
        return this.d.e() && this.i > this.g;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.e.b("Closing MotionSampler");
        if (this.d.e()) {
            this.d.c();
        }
    }
}
