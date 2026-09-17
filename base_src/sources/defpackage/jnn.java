package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class jnn implements fik, fii {
    public final lce a = new lce(Boolean.FALSE);
    public final lce b = new lce(0);
    public final lce c = new lce(Float.valueOf(1.0f));
    public final lce d = new lce(Float.valueOf(0.0f));
    public final float e;
    public long f;
    public long g;
    private final Interpolator h;
    private final long i;
    private final int j;
    private final float k;
    private final float l;

    public jnn(long j, int i, float f, float f2, float f3, Interpolator interpolator) {
        obr.aF(j > 0);
        obr.aF(i > 0);
        obr.aF(f > 1.0f);
        this.i = j;
        this.j = i;
        this.k = f;
        this.l = f2;
        this.e = f3;
        this.h = interpolator;
        this.f = 0L;
        this.g = j;
    }

    public final void a() {
        obr.aQ(this.f <= this.g);
        long j = this.g;
        long j2 = this.f;
        long j3 = this.i;
        float f = j >= j2 + j3 ? 1.0f : (j - j2) / j3;
        float interpolation = 1.0f - this.h.getInterpolation(f);
        this.b.fB(Integer.valueOf((int) (this.j * interpolation)));
        this.c.fB(Float.valueOf((interpolation * (this.k - 1.0f)) + 1.0f));
        lce lceVar = this.d;
        float f2 = this.l;
        lceVar.fB(Float.valueOf(f2 + ((1.0f - f2) * f)));
        this.a.fB(Boolean.valueOf(f < 1.0f));
    }

    @Override // defpackage.fii
    public final void fW() {
        this.f = 0L;
        this.g = 0L;
        a();
    }
}
