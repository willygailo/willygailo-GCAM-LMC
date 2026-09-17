package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fvg implements fvh {
    private hjz a = null;
    private final fua b;

    public fvg(fua fuaVar) {
        this.b = fuaVar;
    }

    @Override // defpackage.fvh
    public final fuz a() {
        return fuz.MOTION_BLUR;
    }

    @Override // defpackage.fvh
    public final synchronized boolean b(hjz hjzVar, hjz hjzVar2) {
        hjz hjzVar3 = this.a;
        if (hjzVar3 != null && Math.abs(hjzVar.b - hjzVar3.b) <= 100000000) {
            float fA = this.b.a(hjzVar, hjzVar3);
            long j = hjzVar.c;
            this.a = hjzVar;
            if (fA * j <= 1.0E9f) {
                return false;
            }
            this.a = null;
            return true;
        }
        this.a = hjzVar;
        return false;
    }
}
