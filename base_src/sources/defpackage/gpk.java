package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gpk implements lco, lij {
    private final lis a;
    private final lce b;
    private int c;
    private final ghx d;

    public gpk(lir lirVar, ghx ghxVar, gqs gqsVar) {
        this.a = lirVar.a("AutoFlashIndicator");
        this.d = ghxVar;
        boolean z = false;
        if (((gqt) gqsVar.fA()).equals(gqt.ON) && ghxVar.H()) {
            z = true;
        }
        this.b = new lce(Boolean.valueOf(z));
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.b.a(lijVar, executor);
    }

    @Override // defpackage.lco
    public final /* bridge */ /* synthetic */ Object fA() {
        return (Boolean) this.b.d;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        Integer num;
        lzv lzvVar = (lzv) obj;
        if (this.d.H() && (num = (Integer) lzvVar.d(CaptureResult.CONTROL_AE_STATE)) != null) {
            if (obr.bc(num, 4)) {
                if (!((Boolean) this.b.d).booleanValue()) {
                    this.a.b("Flash required");
                }
                this.c = 0;
                this.b.fB(true);
                return;
            }
            if (obr.bc(num, 2) || obr.bc(num, 3)) {
                if (((Boolean) this.b.d).booleanValue()) {
                    this.a.b("Flash not required");
                }
                this.c = 0;
                this.b.fB(false);
                return;
            }
            int i = this.c + 1;
            this.c = i;
            if (i <= 30 || ((Boolean) this.b.d).booleanValue()) {
                return;
            }
            this.a.h(mip.bp("No converged AE result for %d frames,falling back to single-image auto-flash photo", Integer.valueOf(this.c)));
            this.b.fB(true);
        }
    }
}
