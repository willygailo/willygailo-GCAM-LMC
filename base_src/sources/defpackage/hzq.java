package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzq {
    public static final ouj a = ouj.h("com/google/android/apps/camera/smarts/SmartsHighResBitmapProviderImpl");
    public final geq b;
    private final hxj c;

    public hzq(hxj hxjVar, geq geqVar) {
        this.c = hxjVar;
        this.b = geqVar;
    }

    public final void a(iar iarVar) {
        ojc ojcVarB = this.c.b();
        ojc ojcVarC = this.c.c();
        if (!ojcVarB.g() || !ojcVarC.g()) {
            ((oug) ((oug) a.c()).G((char) 2744)).o("No frame provider.");
            iarVar.a(null);
            return;
        }
        hxq hxqVar = (hxq) ojcVarB.c();
        try {
            lmr lmrVarC = hxqVar.a.c();
            if (lmrVarC == null) {
                ((oug) ((oug) hxr.a.b()).G((char) 2727)).o("Requesting high resolution image failed, frame is null.");
                mip.eT(null, null, this, ojcVarC, iarVar);
                return;
            }
            lzv lzvVarC = lmrVarC.c();
            if (lzvVarC == null) {
                ((oug) ((oug) hxr.a.b()).G((char) 2726)).o("Image metadata is null.");
                mip.eT(null, null, this, ojcVarC, iarVar);
                return;
            }
            mad madVarE = hxqVar.c.a(lmrVarC).e();
            if (madVarE != null) {
                mip.eT(madVarE, lzvVarC, this, ojcVarC, iarVar);
            } else {
                mip.eT(null, null, this, ojcVarC, iarVar);
            }
        } catch (InterruptedException e) {
            ((oug) ((oug) ((oug) hxr.a.b()).h(e)).G((char) 2728)).o("Requesting high resolution image failed.");
            mip.eT(null, null, this, ojcVarC, iarVar);
        }
    }
}
