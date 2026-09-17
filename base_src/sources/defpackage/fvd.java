package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fvd implements fvh {
    final /* synthetic */ float a;

    public fvd(float f) {
        this.a = f;
    }

    @Override // defpackage.fvh
    public final fuz a() {
        return fuz.TOTAL_SENSITIVITY;
    }

    @Override // defpackage.fvh
    public final boolean b(hjz hjzVar, hjz hjzVar2) {
        if (hjzVar.t == 1 && hjzVar.u == 0) {
            return false;
        }
        long j = ((((long) hjzVar2.e) * hjzVar2.c) * ((long) hjzVar2.f)) / 100;
        return ((float) Math.abs((((((long) hjzVar.e) * hjzVar.c) * ((long) hjzVar.f)) / 100) - j)) > ((float) j) * this.a;
    }
}
