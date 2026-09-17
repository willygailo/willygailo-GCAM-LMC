package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fvf implements fvh {
    private volatile float a = Float.MAX_VALUE;
    private volatile float b;
    private final fua c;
    private final hkm d;

    public fvf(fua fuaVar, hkm hkmVar, byte[] bArr, byte[] bArr2) {
        this.d = hkmVar;
        this.c = fuaVar;
        this.b = hkmVar.a;
    }

    @Override // defpackage.fvh
    public final fuz a() {
        return fuz.ADAPTIVE_DISTANCE;
    }

    @Override // defpackage.fvh
    public final boolean b(hjz hjzVar, hjz hjzVar2) {
        float f;
        float fA = this.c.a(hjzVar, hjzVar2);
        long jAbs = Math.abs(hjzVar2.b - hjzVar.b);
        if (jAbs <= 200000000) {
            float f2 = this.a;
            double d = fA;
            Double.isNaN(d);
            double d2 = jAbs;
            Double.isNaN(d2);
            this.a = Math.min(f2, (float) ((d * 1.0E9d) / d2));
            float f3 = this.a;
            hkm hkmVar = this.d;
            if (f3 > 1000.0f) {
                f = 0.0f;
            } else if (f3 < 150.0f) {
                f = hkmVar.b;
            } else if (f3 > 200.0f) {
                f = hkmVar.a;
            } else {
                float f4 = hkmVar.b;
                f = (((f3 - 150.0f) * (hkmVar.a - f4)) / 50.0f) + f4;
            }
            this.b = f;
        }
        return fA > this.b;
    }
}
