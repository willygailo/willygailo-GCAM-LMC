package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hky {
    private static final ouj a = ouj.h("com/google/android/apps/camera/qualityscore/GlobalMotionSharpnessFrameQualityScorer");
    private hjz b;
    private final fua c;

    public hky(fua fuaVar) {
        this.c = fuaVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    private final synchronized boolean b(long j) {
        boolean z;
        hjz hjzVar = this.b;
        if (hjzVar != null) {
            long j2 = hjzVar.b;
            if (j2 >= j || j2 < j - 99999999) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized float a(hjz hjzVar) {
        float fExp;
        if (b(hjzVar.b)) {
            fExp = (float) Math.exp((this.c.a(this.b, hjzVar) / (hjzVar.b - this.b.b)) * (-0.05f) * hjzVar.c);
        } else {
            ((oug) ((oug) a.c()).G(2517)).q("Could not find previous metadata for frame at %d", hjzVar.b);
            fExp = 0.0f;
        }
        this.b = hjzVar;
        return fExp;
    }
}
