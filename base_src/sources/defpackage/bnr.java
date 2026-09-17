package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class bnr extends mip {
    public final lwd a;
    public final bnq b;
    public float c = 0.0f;
    public hte d = hte.ON;
    private final lis g;
    private final lda h;
    private final bns i;

    public bnr(lis lisVar, lap lapVar, ghx ghxVar, dyx dyxVar, lda ldaVar, lda ldaVar2, final fjs fjsVar, ddf ddfVar) {
        lis lisVarA = lisVar.a("LowLightAfLock");
        this.g = lisVarA;
        lwd lwdVarK = ghxVar.k();
        this.a = lwdVarK;
        ldaVar = lwdVarK == lwd.FRONT ? ldaVar2 : ldaVar;
        this.h = ldaVar;
        this.b = new bnq(ddq.b(ddfVar, lwdVarK));
        String strValueOf = String.valueOf(lwdVarK.name());
        bns bnsVar = new bns(ghxVar, dyxVar, lisVarA, strValueOf.length() != 0 ? "cuttlef-af-".concat(strValueOf) : new String("cuttlef-af-"));
        lapVar.c(bnsVar);
        this.i = bnsVar;
        bnsVar.b();
        lapVar.c(ldaVar.a(new lij() { // from class: bnp
            @Override // defpackage.lij
            public final void fB(Object obj) {
                bnr bnrVar = this.a;
                fjs fjsVar2 = fjsVar;
                hte hteVarA = hte.a(((Integer) obj).intValue());
                hte hteVar = bnrVar.d;
                if (hteVarA == hteVar) {
                    return;
                }
                fjsVar2.am(hteVar.b(), hteVarA.b(), bnrVar.c, bnrVar.b.b, bnrVar.a);
                bnrVar.d = hteVarA;
            }
        }, pgr.INSTANCE));
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) throws Throwable {
        Float f = (Float) lzvVar.d(CaptureResult.LENS_FOCUS_DISTANCE);
        obr.ao(f);
        this.c = f.floatValue();
        this.i.a(lzvVar);
        bnq bnqVar = this.b;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        obr.ao(l);
        long jLongValue = l.longValue();
        Integer num = (Integer) lzvVar.d(CaptureResult.SENSOR_SENSITIVITY);
        obr.ao(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) lzvVar.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        obr.ao(num2);
        float fIntValue = jLongValue * 1.0E-6f * iIntValue * num2.intValue();
        bnqVar.b = fIntValue;
        if (fIntValue < bnqVar.a) {
            bnqVar.c = 0;
        } else {
            int iMin = Math.min(bnqVar.c + 1, 5);
            bnqVar.c = iMin;
            if (iMin >= 5 && !this.i.c()) {
                if (((Integer) this.h.fA()).intValue() == hte.ON.f) {
                    Integer num3 = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE);
                    obr.ao(num3);
                    if (hkd.a(num3.intValue()) == hkd.PASSIVE_UNFOCUSED) {
                        this.g.f("Locking AF");
                        this.h.fB(Integer.valueOf(hte.ON_LOCKED.f));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (((Integer) this.h.fA()).intValue() == hte.ON_LOCKED.f) {
            this.g.f("Unlocking AF");
            this.h.fB(Integer.valueOf(hte.ON.f));
        }
    }
}
